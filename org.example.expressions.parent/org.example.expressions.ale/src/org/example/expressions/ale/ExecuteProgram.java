package org.example.expressions.ale;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.example.expressions.ExpressionsStandaloneSetup;

import com.google.inject.Injector;

import expressions.interpreter.expressions.ExpressionsModel;
import expressions.interpreter.expressions.ExpressionsPackage;

public class ExecuteProgram {
	public static void main(String[] args) {
		final String file = "/udd/gjouneau/eclipse-workspace/packtpub-xtext-book-2nd-examples/org.example.expressions.parent/org.example.expressions.tests/programs/test.expressions";

		EPackage.Registry.INSTANCE.put("http://www.example.org/expressions/Expressions", ExpressionsPackage.eINSTANCE);

		final ExpressionsModel result = loadFromXtext(file);

		result.main();

	}

	private static ExpressionsModel loadFromXtext(String file) {
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new ExpressionsStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createURI(file), true);
		ExpressionsModel model = (ExpressionsModel) resource.getContents().get(0);
		return model;
	}

	private static ExpressionsModel loadFromXMI(final String file) {
		final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		final Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		final ResourceSetImpl resSet = new ResourceSetImpl();
		final URI createFileURI = URI.createFileURI(file);
		final Resource resource = resSet.getResource(createFileURI, true);
		final ExpressionsModel result = (ExpressionsModel) resource.getContents().get(0);
		return result;
	}
}
