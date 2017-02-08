package com.clientConfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {
	
	@Value("${rate}")
	String rate;
	
	@Value("${lanecount}")
	String laneCount;
	
	@Value("${tollstart}")
	String tollStart;
	
	@Value("${key}")
	String key;
	
	@RequestMapping("/rate")
	public String getRate(Model model){
		
		model.addAttribute("rateAmount", rate);
		model.addAttribute("laneCount", laneCount);
		model.addAttribute("tollStart", tollStart);
		model.addAttribute("key", key);
		
		return "rateview";
	}
}
