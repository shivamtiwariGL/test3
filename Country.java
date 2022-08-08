package com.Assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Country {
	private HashMap<String, String> M1;
	
	public Country() {
		M1 = new HashMap<String, String>();
	}
	
	public HashMap<String, String> saveCountryCapital(String countryName, String countryCapital){
		M1.put(countryName, countryCapital);
		return M1;
		
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> m1 = itr.next();
			
			if(m1.getValue().equals(capitalName)) {
				return m1.getKey();
			}
		}
		return null;
	}
	
	public HashMap<String, String> swapKeyValue(){
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> m1 = itr.next();
			M2.put(m1.getValue(), m1.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList(){
		ArrayList<String> arrList = new ArrayList<String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> m1 = itr.next();
			arrList.add(m1.getKey());
		}
		
		return arrList;
	}

}
