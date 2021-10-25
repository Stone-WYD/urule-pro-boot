package com.bstek.demo;

import org.springframework.stereotype.Component;

import ch.qos.logback.core.PropertyDefinerBase;

@Component
public class HomeProperty extends PropertyDefinerBase {
	
	@Override
	public String getPropertyValue() {
		return com.bstek.urule.console.config.HomeLocator.getHomePath()+"/logs";
	}

}
