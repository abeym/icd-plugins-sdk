package com.virtusa.icd.portlet;


import java.util.SortedSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtusa.icd.service.ReportingService;

@Controller
@RequestMapping({ "VIEW" })
public class ReportingController {
	
	private ReportingService service;

	public ReportingService getService() {
		return service;
	}


	public void setService(ReportingService service) {
		this.service = service;
	}


	@ModelAttribute("entityTypes")
	public SortedSet getEntityTypes() {
		return this.service.getEntityTypes();
	}


	@RequestMapping
	public String show() {
		return "reporting";
	}
}