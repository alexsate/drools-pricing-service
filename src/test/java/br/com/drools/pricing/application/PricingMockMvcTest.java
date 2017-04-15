package br.com.drools.pricing.application;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.nio.charset.Charset;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

/*@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
//@WebAppConfiguration
@ContextConfiguration(loader = AnnotationConfigContextLoader.class)

//@ContextConfiguration(locations={"classpath:applicationContext.xml"})
//@ContextConfiguration("/applicationContext.xml")
@AutoConfigureMockMvc
//@WebMvcTest

@WebAppConfiguration*/
public class PricingMockMvcTest {

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

//	@Autowired
    private MockMvc mockMvc;

	
	@Autowired
    private WebApplicationContext webApplicationContext;

	private Object flightG3;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	//@Test
	public void flight() throws Exception {

		String strJson = "{ " + "    \"origin\" : \"CHG\", " + "    \"destination\" : \"SDU\", "
				+ "    \"cabine\" : \"Economica\", " + "    \"productClass\" : \"PD\", " + "    \"advp\" : \"5\", "
				+ "    \"valorTarifa\" : \"100" + "}";

		// String bookmarkJson = json(new FlightG3(this.flightG3,

		//restTemplate.postForObject(urlPost, request, Boolean.class);
		
		this.mockMvc.perform(post("/").contentType(contentType).content(strJson)).andExpect(status().isCreated());
	}
	
	//@Test
	public void getTest() throws Exception {


		 mockMvc.perform(get("/"))
	                .andExpect(status().isOk());
	}

}
