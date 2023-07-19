package com.dz.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dz.app.model.AppUtility;

@RestController
public class HomeController {

	
//	List<String> list = null;
	
	
	
//	@RestController = @Controller + @ResponseBody
	
	@RequestMapping(value = "/country1",method=RequestMethod.GET)
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
	public Map<Integer, String> getCountyList(){
		return AppUtility.map;
	}
	
}
