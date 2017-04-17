package br.com.drools.pricing.service.impl;

import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import br.com.drools.pricing.model.FlightG3;
import br.com.drools.pricing.service.PricingG3Service;

@Service
public class PricingG3ServiceImpl implements PricingG3Service{

	@KSession("Pricing_G3_KS")
	private KieSession session;
	
	private static final Logger logger = LoggerFactory.getLogger(PricingG3ServiceImpl.class);

	@Override
	public void flight(FlightG3 flightG3) {
		logger.debug("Flight received: " + flightG3);

		// put the fact on working memory, but save the handle to remove the fact after fire All Rules
		FactHandle handle = session.insert(flightG3);
		
		session.getAgenda().getAgendaGroup("Agenda01").setFocus();
		session.fireAllRules();
		session.getAgenda().getAgendaGroup("Agenda02").setFocus();
		session.fireAllRules();
		session.getAgenda().getAgendaGroup("Agenda03").setFocus();
		session.fireAllRules();
		session.getAgenda().getAgendaGroup("Agenda04").setFocus();
		session.fireAllRules();
		
		// use the handle to remove the fact at working memory
		session.delete(handle);
		
		logger.debug("Flight post fire: " + flightG3);
	}
}
