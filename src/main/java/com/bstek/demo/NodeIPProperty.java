package com.bstek.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Component;

import ch.qos.logback.core.PropertyDefinerBase;

@Component
public class NodeIPProperty extends PropertyDefinerBase {
	private static String nodeIP;

	static {
		try {
			nodeIP = InetAddress.getLocalHost().getHostAddress();
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getPropertyValue() {
		return NodeIPProperty.nodeIP;
	}

}
