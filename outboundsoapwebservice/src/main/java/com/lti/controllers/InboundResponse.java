package com.lti.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class InboundResponse {
	private static final Logger logger = LoggerFactory.getLogger(InboundResponse.class);	
	public String invokeInboundResponseService(String xmlRequest) {
		logger.info("Request  -----> "+xmlRequest);
		logger.info("Response  -----> \"<echoResponse xmlns=\"http://www.springframework.org/spring-ws/samples/echo\">" +
				 "</echoResponse>");
		String xml="<echoResponse xmlns=\"http://www.springframework.org/spring-ws/samples/echo\">"+
				 "</echoResponse>";
		
		return xml;
	}
}
