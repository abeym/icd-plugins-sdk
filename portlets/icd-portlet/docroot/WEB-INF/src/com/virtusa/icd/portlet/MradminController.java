package com.virtusa.icd.portlet;


import java.util.SortedSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtusa.icd.service.MradminService;

@Controller
@RequestMapping({ "VIEW" })
public class MradminController {
	
	private MradminService service;

	public MradminService getService() {
		return service;
	}


	public void setService(MradminService service) {
		this.service = service;
	}


	@ModelAttribute("entityTypes")
	public SortedSet getEntityTypes() {
		return this.service.getEntityTypes();
	}


	@RequestMapping
	public String showMradmin() {
		return "mradmin";
	}
}