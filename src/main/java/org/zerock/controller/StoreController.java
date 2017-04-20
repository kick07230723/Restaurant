package org.zerock.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.Criteria;
import org.zerock.domain.StoreVO;
import org.zerock.domain.PageMaker;
import org.zerock.service.StoreService;

@Controller
@RequestMapping("/store/*")
@WebAppConfiguration
public class StoreController {
	
	private static final Logger logger= Logger.getLogger(StoreController.class);
	
	@Autowired
	StoreService service;
	
	@GetMapping("/list")
	public void list(@ModelAttribute("cri") Criteria cri, Model model)throws Exception{
		List<StoreVO> list= service.getList(cri);
		
		logger.info(cri);

		logger.info(list);
		model.addAttribute("list", list);
		model.addAttribute("pageMaker",new PageMaker(cri,123));	
		}
	
	
} 
