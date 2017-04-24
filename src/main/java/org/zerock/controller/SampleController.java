package org.zerock.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.MessageVO;

@RestController
@RequestMapping("/s2")
public class SampleController {
	
	@GetMapping
	public String doA(){
		return "hello";
	}
	@GetMapping("doB")
	public Map<String, String> doB(){
		
		Map<String, String> map = new HashMap<>();
		map.put("uid","aaa");
		map.put("upw","bbb");
		return map;
		
	}

	@GetMapping("/doC/{cat}/{item}")
	public void doC(@PathVariable("cat") String cat, @PathVariable("item") String item){
		
		System.out.println("cat  "+cat);
		System.out.println("item  "+ item);		
	}
	
	@PostMapping("/msg")
	public MessageVO doD(@RequestBody MessageVO vo){
		System.out.println(vo);
		return vo;
	}
	
	
	
	

}
