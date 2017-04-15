package br.com.drools.pricing.application;

import java.io.InputStream;

import org.drools.decisiontable.SpreadsheetCompiler;
import org.junit.Test;
import org.kie.api.io.ResourceType;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;

import junit.framework.Assert;

public class LoadDrlFromXLS {

	public static void main(String[] args) {

		new LoadDrlFromXLS().loadDrls();

		// KnowledgeBase kbase = KnowledgeBaseFactory.

	}
	@Test
	public void loadDrls() {

		final SpreadsheetCompiler converter = new SpreadsheetCompiler();

		final InputStream stream  = this.getClass().getResourceAsStream("/br/com/drools/pricing/g3/flight_g3_milesConverter.xlsx");
		
		String drl1 = converter.compile(stream, "Sheet3");
		
		
		System.out.println(drl1);
		

		Assert.assertNotNull(drl1);
		
	}

}
