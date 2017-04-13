package br.com.drools.pricing;

import org.drools.core.event.DebugAgendaEventListener;
import org.junit.Assert;
import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
import org.kie.api.runtime.KieSession;

import br.com.drools.pricing.drools.KieSessionFactory;

public class PricingG3Test {
	
	//@Test
	public void loadPricingG3(){
		KieSessionFactory kieSessionFactory = new KieSessionFactory();
		KieSession session;
		try {
			session = kieSessionFactory.getSession("Pricing_G3_KS");
			
			session.addEventListener( new DebugAgendaEventListener() );
	        session.addEventListener( new DebugRuleRuntimeEventListener() );
	        
//			session.insert(customer);
	        
	        session.fireAllRules();
	        
//	        System.out.println(customer);
			
			Assert.assertNotNull(session);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void oneWayFlightPricing(){
		
	}
	
	

}
