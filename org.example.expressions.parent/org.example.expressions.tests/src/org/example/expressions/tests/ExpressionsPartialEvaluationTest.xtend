/*
 * generated by Xtext 2.10.0
 */
package org.example.expressions.tests

import com.google.inject.Inject
import expressions.ExpressionsModel
import org.eclipse.xtext.serializer.impl.Serializer
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.example.expressions.interpreter.ExpressionsInterpreter
import org.example.expressions.interpreter.PartialEvaluator
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(ExpressionsInjectorProvider)
class ExpressionsPartialEvaluationTest {

	@Inject extension ParseHelper<ExpressionsModel>
	@Inject extension ValidationTestHelper
	@Inject extension ExpressionsInterpreter
	@Inject extension PartialEvaluator
	@Inject Serializer serializer

	@Test def void intConstant() { "eval 1".assertInterpret(1) }

	@Test def void boolConstant() { "eval true".assertInterpret(true) }

	@Test def void stringConstant() { "eval 'abc'".assertInterpret("abc") }

	@Test def void multi() { "eval 5 * 3".assertInterpret(15) }

	@Test def void div() { "eval 6 / 3".assertInterpret(2) }

	@Test def void minus() { "eval 6 - 2".assertInterpret(4) }

	@Test def void intPlus() { "eval 6 + 2".assertInterpret(8) }

	@Test def void stringPlus() { "eval 'a' + 'b'".assertInterpret('ab') }

	@Test def void intStringPlus() { "eval 'a' + 1".assertInterpret('a1') }

	@Test def void boolStringPlus() { "eval 'a' + true".assertInterpret('atrue') }

	@Test def void lessThanInt() { "eval 1 < 2".assertInterpret(true) }

	@Test def void lessEqualsThanInt() { "eval 2 <= 2".assertInterpret(true) }

	@Test def void greaterThanInt() { "eval 1 > 2".assertInterpret(false) }

	@Test def void greaterEqualsThanInt() { "eval 2 >= 1".assertInterpret(true) }

	@Test def void lessThanString() { "eval 'a' < 'b'".assertInterpret(true) }

	@Test def void lessEqualsThanString() { "eval 'a' <= 'ab'".assertInterpret(true) }

	@Test def void greaterThanString() { "eval 'ab' > 'a'".assertInterpret(true) }

	@Test def void greaterEqualsThanString() { "eval 'a' >= 'ab'".assertInterpret(false) }

	@Test def void equalsString() { "eval 'a' == 'a'".assertInterpret(true) }

	@Test def void notEqualsString() { "eval 'a' != 'b'".assertInterpret(true) }

	@Test def void equalsInt() { "eval 1 == 1".assertInterpret(true) }

	@Test def void notEqualsInt() { "eval 0 != 1".assertInterpret(true) }

	@Test def void equalsBool() { "eval true == true".assertInterpret(true) }

	@Test def void notEqualsBool() { "eval true != false".assertInterpret(true) }

	@Test def void and() { "eval true && !false".assertInterpret(true) }

	@Test def void or() { "eval false || true".assertInterpret(true) }

	@Test def void varRef() { "var i = 1 var j = i + 2 eval j+1".assertInterpret(4) }

	@Test def void varSameVarRef() { "var i = 1 eval i+i".assertInterpret(2) }

	@Test def void function() { "let inc(int i) => i+1 eval inc(3)".assertInterpret(4) }

	@Test def void functionWithVar() { "let inc(int i) => i+1 var j = 3*4 eval inc(j)".assertInterpret(13) }

	@Test def void functionSameParamNameAsVar() { "let inc(int i) => i+1 var i = 42 eval inc(i)".assertInterpret(43) }

	@Test def void functionComplex() {
		'''
			let isRectangle(int a, int b, int c){ 
				var aLong = a*a == b*b + c*c 
				var bLong = b*b == a*a + c*c 
				var cLong = c*c == b*b + a*a 
				eval aLong||bLong||cLong
			} 
			eval isRectangle(3,4,5)
		'''.assertInterpret(true)
	}
	
	@Test def void functionRecursive() {
		'''
			let fib(int x){
				var ret = 1
				if x > 2 {
					var ret = fib(x-1) + fib(x-2)
				} 
				eval ret
			}
			eval fib(12)
		'''.assertInterpret(144)
	}
	
	@Test def void functionComplexInInline() {
		'''
			let add(int x, int add){
				var ret = x
				var x = x + add 
				eval ret
			}
			let inc(int x) => add(:x,1)
			var after = 5
			var before = inc(:after)
			eval after - before
			
		'''.assertInterpret(1)
	}

	@Test def void functionWithCapture() {
		'''
			let addNminus(int a, int b, int minus) { 
				var minus = a - b 
				eval a + b
			} 
			var sideEffect = 0
			eval addNminus(4,2,:sideEffect)
			eval sideEffect
			
		'''.assertInterpret(2)
	}

	@Test def void functionWithCaptureRecursive() {
		'''
			let factN(int n, int fact) { 
				if n > 0 {
					eval factN(n-1,:fact)
					var fact = fact * n
				}
				eval fact
			} 
			var sideEffect = 1
			eval factN(5,:sideEffect)
			eval sideEffect
			
		'''.assertInterpret(120)
	}

	@Test def void ifElseStatment() {
		'''
			var a = 0
			if true {
				var a = 144
			} else {
				var a = 1
			}
			
			if false {
				var a = a / 12
			} else {
				var a = a - 102
			}
			eval a
		'''.assertInterpret(42)
	}

	@Test def void ifOnlyStatment() {
		'''
			var a = 0
			if true {
				var a = 42
			}
			
			if false {
				var a = a / 12
			}
			eval a
		'''.assertInterpret(42)
	}

	@Test def void loopStatment() {
		'''
			var count = 0
			loop count < 6 {
				var count = count + 2
			}
			eval count
		'''.assertInterpret(6)
	}

	@Test def void complex() { "eval ((5 * 3)+1) / (7 + 1)".assertInterpret(2) }

	def assertInterpret(CharSequence input, Object expected) {
		input.parse => [
			assertNoErrors
			val tmp = partialEvaluation(newArrayList)
			
			val res = tmp.interpret(newHashMap)
			try {
				expected.assertEquals(res)
			} catch (AssertionError e) {
				println('------------------------------------------------------')
				println('BEFORE')
				println(input)
				println('AFTER')
				println(serializer.serialize(tmp))
				println('------------------------------------------------------')
				throw e	
			}

		]
	}

}