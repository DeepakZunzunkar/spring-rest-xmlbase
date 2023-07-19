package com.dz.app.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class AppUtility {

	public static List<Customer> customers = null;
	public static List<String> list = null;
	public static Map<Integer, String> map = null;

	static {

		customers = new ArrayList<Customer>();
		map = new HashMap<Integer, String>();
		list = new ArrayList<String>();

		list.add("INDIA");
		list.add("RASSIA");
		list.add("USA");
		list.add("JAPAN");
		list.add("CHINA");
		list.add("UKREN");

		map.put(1, "India");
		map.put(2, "Rassia");
		map.put(3, "Usa");
		map.put(4, "Japan");
		map.put(5, "China");
		map.put(6, "Ukren");
	}

}
