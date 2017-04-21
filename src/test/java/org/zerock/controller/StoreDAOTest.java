package org.zerock.controller;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.StoreVO;
import org.zerock.persistence.StoreDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class StoreDAOTest {

	Logger logger = Logger.getLogger(StoreDAOTest.class);
	
	@Inject
	StoreDAO dao;
	
	@Test
	public void test1(){
		logger.info("1111!!!!!!!!!!!!!!!"+dao);
		logger.info(dao.getTime());
		
	}

	@Test
	public void testCreate(){
		StoreVO vo=new StoreVO();
		vo.setSname("강남불백");
		vo.setLat(37.492155);
		vo.setLng(127.0335444);
		vo.setInfo("ㅈㅇㄹㅈㄹ");	
	}
	
	@Test
	public void testList(){
		Criteria cri = new Criteria();
		cri.setType("c");
		cri.setKeyword("33");
		
		dao.list(cri
//				new Criteria().settingPage(2).settingSize(5)
				)
		.forEach(store->logger.info(store));
	}
	
	
	
}
