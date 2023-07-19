package com.dz.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dz.app.model.AppUtility;

//@RestController
@Controller
public class HomeController {

	
//	List<String> list = null;
//	if we want send response as a text then we have to use @ResponseBody on handler method.
	
	
//	@RestController = @Controller + @ResponseBody
	
	@RequestMapping(value = "/country1",method=RequestMethod.GET)
	@ResponseBody
	public List<String> getCountries(){
		
/*		list=new ArrayList<String>();
		
		list.add("INDIA");
		list.add("RASSIA");
		list.add("USA");
		list.add("JAPAN");
		list.add("CHINA");
		list.add("UKREN");

		return list;*/
		
		return AppUtility.list;
	}

	@RequestMapping(value = "/country",method=RequestMethod.GET)
	@ResponseBody
	public Map<Integer, String> getCountyList(){
		return AppUtility.map;
	}
	
}
