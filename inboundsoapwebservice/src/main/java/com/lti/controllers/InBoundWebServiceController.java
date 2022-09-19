package com.lti.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InBoundWebServiceController {
	private static final Logger logger = LoggerFactory.getLogger(InBoundWebServiceController.class);

	@PostMapping(path = "/invokeInbound")
	public String invokeInboundService(@RequestBody String xmlRequest) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("integration.xml");
		RequestGateway requestGateway =  context.getBean("requestGateway", RequestGateway.class);
		String reply = requestGateway.message(xmlRequest);
		logger.info("\n\n++++++++++++ Replied with: " + reply + " ++++++++++++\n");
		context.close();
		return reply;
	}
}
