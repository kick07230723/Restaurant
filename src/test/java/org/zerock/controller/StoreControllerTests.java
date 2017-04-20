package org.zerock.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.Map;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
@WebAppConfiguration //AppContext 부분을 로딩시켜오는 듯함.
public class StoreControllerTests {
	
	

	@Inject
	WebApplicationContext ctx;
	
	MockMvc mockMvc; //가짜 웹 appcontext
	
	@Before
	public void setup(){
		mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build(); //가짜 MVC
	}
	
	
	@Test
	public void testList()throws Exception{
		Map<String, Object> map = mockMvc.perform(get("/store/list")).andReturn().getModelAndView().getModel();

	
	
	}

}
