package br.com.drools.pricing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Message;
import org.kie.api.builder.Results;
import org.kie.api.runtime.KieContainer;

public class LoadDecisionTable {

	public static void main(String[] args) throws FileNotFoundException {

		KieServices kieServices = KieServices.Factory.get();
		KieFileSystem kfs = kieServices.newKieFileSystem();
		FileInputStream fis = new FileInputStream("C:/source/drools-pricing-service/src/main/resources/br/com/drools/pricing/g3/flight_g3_milesConverter.xlsx");
		kfs.write("simple.drl", kieServices.getResources().newInputStreamResource(fis));

		KieBuilder kieBuilder = kieServices.newKieBuilder(kfs).buildAll();

		Results results = kieBuilder.getResults();
		if (results.hasMessages(Message.Level.ERROR)) {
			System.out.println(results.getMessages());
			throw new IllegalStateException("### errors ###");
		}

		/*KieContainer kieContainer = kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());
		KieBase kieBase = kieContainer.getKieBase();*/

	}

}
