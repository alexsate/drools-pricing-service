package br.com.drools.pricing.application;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import br.com.drools.pricing.controller.PricingG3Controller;
import br.com.drools.pricing.model.FlightG3;

@TestPropertySource(locations = { "classpath:application.properties" })
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
// @ContextConfiguration (locations = "classpath:applicationContext.xml")
// @ContextConfiguration({"classpath:applicationContext.xml",
// "classpath:drools-context.xml"})
@DirtiesContext
public class PricingControllerTest {

	@Autowired
	private PricingG3Controller controller;

	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	
	@Test
	public void firstWorkSheetTest() throws Exception {
		FlightG3 flightG3 = new FlightG3();
		flightG3.setOrigin("CHG");
		flightG3.setCabine("Economica2");
	/*
	  	flightG3.setDestination("SDU");
		flightG3.setProductClass("PD");
		flightG3.setAdvp("5");*/
		//flightG3.setValorTarifa(BigDecimal.valueOf(100));
		
	/*	{
		    "origin" : "CHG",
		    "destination" : "SDU",
		    "cabine" : "Economica",
		    "productClass" : "PD",
		    "advp" : "5",
		    "valorTarifa" : "100"
		}*/
		
		controller.flight(flightG3);
		
		assertThat(flightG3.getPrecoMilhas() != null);
		Assert.assertTrue("Preco em milhas is 333", flightG3.getPrecoMilhas() == 333);
		
	}
	
	@Test
	public void firstWorkSheetSecondTableTest() throws Exception {
		FlightG3 flightG3 = new FlightG3();
		flightG3.setOrigin("CHG");
		flightG3.setCabine("Economica1");
	
		controller.flight(flightG3);
		
		assertThat(flightG3.getPrecoMilhas() != null);
		Assert.assertTrue("Preco em milhas is 222", flightG3.getPrecoMilhas() == 222);
		
	}
	
	@Test
	public void secondWorkSheetTest() throws Exception {
		FlightG3 flightG3 = new FlightG3();
		flightG3.setOrigin("CHG");
		flightG3.setCabine("Economica3");
	
		controller.flight(flightG3);
		
		assertThat(flightG3.getPrecoMilhas() != null);
		Assert.assertTrue("Preco em milhas is 444", flightG3.getPrecoMilhas() == 444);
		
	}
	
	@Test
	public void thirdWorkSheetTest() throws Exception {
		FlightG3 flightG3 = new FlightG3();
		flightG3.setOrigin("CHG");
		flightG3.setCabine("Economica4");
	
		controller.flight(flightG3);
		
		assertThat(flightG3.getPrecoMilhas() != null);
		Assert.assertTrue("Preco em milhas is 444", flightG3.getPrecoMilhas() == 444);
		
	}
	
	

}
