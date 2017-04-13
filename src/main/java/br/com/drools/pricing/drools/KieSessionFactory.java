package br.com.drools.pricing.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Component;

@Component
public class KieSessionFactory {
	
	public KieSession getSession(String name) throws Exception{
		
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kieContainer = kieServices.getKieClasspathContainer();
		
		KieSession kieSession = kieContainer.newKieSession(name);
		return kieSession; 
	}
}
