package com.virtusa.icd.portlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtusa.icd.service.HealthPlanService;

@Controller
@RequestMapping({ "VIEW" })
public class HealthPlanController {

	private HealthPlanService service;

	public HealthPlanService getService() {
		return service;
	}

	public void setService(HealthPlanService service) {
		this.service = service;
	}

	@RequestMapping
	public String showHealthPlan() {
		return "healthplan";
	}
}
