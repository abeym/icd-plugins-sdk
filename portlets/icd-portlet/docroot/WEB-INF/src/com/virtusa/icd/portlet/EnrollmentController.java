package com.virtusa.icd.portlet;


import java.util.SortedSet;
import java.util.TreeSet;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liferay.portal.kernel.exception.SystemException;
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

	@RequestMapping(params="submit")
	public String handleSubmit(PortletRequest request, PortletResponse response) throws SystemException {
		String selectedEntityType = request.getParameter("selectedEntityType");
		String organizationNPINum = request.getParameter("organizationNPINum");
		String organizationName = request.getParameter("organizationName");
		service.addEnrollment(selectedEntityType, organizationNPINum, organizationName);
		return "enrollment";
	}
}