package com.virtusa.icd.portlet;


import java.util.SortedSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtusa.icd.service.PortalManagementService;

@Controller
@RequestMapping({ "VIEW" })
public class PortalManagementController {
	
	private PortalManagementService service;

	public PortalManagementService getService() {
		return service;
	}


	public void setService(PortalManagementService service) {
		this.service = service;
	}


	@ModelAttribute("entityTypes")
	public SortedSet getEntityTypes() {
		return this.service.getEntityTypes();
	}


	@RequestMapping
	public String show() {
		return "portalmanagement";
	}
}