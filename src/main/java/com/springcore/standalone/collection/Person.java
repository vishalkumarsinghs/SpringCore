package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String>frinds;
	private Map<String, Integer> feestructure;
	private Properties properties;
	

	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}

	public List<String> getFrinds() {
		return frinds;
	}

	public void setFrinds(List<String> frinds) {
		this.frinds = frinds;
	}
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [frinds=" + frinds + ", feestructure=" + feestructure + ", properties=" + properties + "]";
	}

	
	
}
