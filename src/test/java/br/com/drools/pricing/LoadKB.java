package br.com.drools.pricing;

import java.io.IOException;
import java.io.InputStream;

import org.drools.decisiontable.ExternalSpreadsheetCompiler;
import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;
import org.junit.Assert;
import org.junit.Test;
import org.kie.api.io.ResourceType;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.builder.DecisionTableConfiguration;
import org.kie.internal.builder.DecisionTableInputType;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderConfiguration;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;

public class LoadKB {

	public static void main(String[] args) {

		new LoadKB().loadDrls();

		// KnowledgeBase kbase = KnowledgeBaseFactory.

	}
	@Test
	public void loadDrls() {

		final SpreadsheetCompiler converter = new SpreadsheetCompiler();

		final InputStream stream  = this.getClass().getResourceAsStream("/flight_g3_milesConverter.xlsx");
		
		String drl1 = converter.compile(stream, "Sheet3");
		
		final SpreadsheetCompiler converter2 = new SpreadsheetCompiler();
		
		
		// todo:
		final InputStream stream2  = this.getClass().getResourceAsStream("/flight_g3_milesConverter.xlsx");
		
		String drl2 = converter2.compile(stream2, "Sheet4");
		
		System.out.println(drl2);
		
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

		kbuilder.add(ResourceFactory.newByteArrayResource(drl2.getBytes()), ResourceType.DRL);
		
		//.assertNotNull(kbuilder);
	}

}
