package com.virtusa.icd.portlet;


import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtusa.icd.service.EnrollmentService;

@Controller
@RequestMapping({ "VIEW" })
public class EnrollmentController {
	
	private EnrollmentService service;

	public EnrollmentService getService() {
		return service;
	}


	public void setService(EnrollmentService service) {
		this.service = service;
	}


	@ModelAttribute("entityTypes")
	public SortedSet getEntityTypes() {
		return this.service.getEntityTypes();
	}


	@RequestMapping
	public String showEnrollment() {
		return "enrollment";
	}
}