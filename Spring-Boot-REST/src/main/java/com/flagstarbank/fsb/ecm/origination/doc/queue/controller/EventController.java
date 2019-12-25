package com.flagstarbank.fsb.ecm.origination.doc.queue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EventController {

	
	@RequestMapping("/")
	public String healthCheck() {
		
		return "OK";
	}
	
	@RequestMapping("/event/get")
	public @ResponseBody Event getDummyEvent() {
	
		Event emp = new Event();
		emp.setNotificationId("123456789");
		emp.setEventName("DOCUMENT_FILED");
		emp.setLoanNumber("123456789");
		EventDetails eventDetails = new EventDetails();
		eventDetails.setDocumentType("APPLICATION");
		eventDetails.setTimestamp("2017-07-25 12:45:21");
		eventDetails.setDocumentIntent("UNDERWRITING");
		eventDetails.setDocId("{xxxx-xxxx-xxx-xx-xxxxxxxxxxxx}");
		
		return emp;
	}
	

}
