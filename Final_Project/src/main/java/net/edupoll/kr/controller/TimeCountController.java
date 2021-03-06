package net.edupoll.kr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import net.edupoll.kr.service.TimeCountService;

@RequestMapping("statistics")
@Controller
public class TimeCountController {
	@Autowired
	TimeCountService timeCountService;
	
	@RequestMapping("/message/data")
	@ResponseBody
	public List<Object[]> timeCountHandler() {
		List<Object[]> ret = timeCountService.getTimeCount(); 
		
		Gson gson = new Gson();
		System.out.println(gson.toJson(ret));
		return ret;
	}
	
	@RequestMapping("message")
	public String messageHandle() {
		return "statistics/message";
	}
}




