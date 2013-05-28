package com.virtusa.icd.portlet;

import java.util.SortedSet;

import com.liferay.portal.kernel.exception.SystemException;
import com.virtusa.icd.domain.EntityType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtusa.icd.service.EnrollmentService;
import com.virtusa.icd.util.Utils;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;


@Controller
@RequestMapping({ "VIEW" })
public class EnrollmentController {

	private static final String REF_HEALTHPLANS = "healthplans";

	private static final String REF_CLEARINGHOUSES = "clearinghouses";

	private static final String REF_EHRBILLINGVENDORS = "ehrAndBillingVendors";

	private static final String REF_REVCYCLEVENDORS = "revCycleVendors";
	
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

	@ModelAttribute("top5byrev")
	public SortedSet getTopFiveByRev() {
		return Utils.getReferences(REF_HEALTHPLANS);
	}

	@ModelAttribute("clearinghouses")
	public SortedSet getClearingHouses() {
		return Utils.getReferences(REF_CLEARINGHOUSES);
	}

	@ModelAttribute("ehrAndBillingVendors")
	public SortedSet getEhrAndBillingVendors() {
		return Utils.getReferences(REF_EHRBILLINGVENDORS);
	}
	
	@ModelAttribute("revCycleVendors")
	public SortedSet getRevenueCycleVendors() {
		return Utils.getReferences(REF_REVCYCLEVENDORS);
	}
	
	@RequestMapping
	public String showEnrollment() {
		return "enrollment";
	}

	@RequestMapping(params = "submit")
	public String handleSubmit(PortletRequest request, PortletResponse response)
			throws SystemException {
		String selectedEntityType = request.getParameter("selectedEntityType");
		String organizationNPINum = request.getParameter("organizationNPINum");
		String organizationName = request.getParameter("organizationName");
		service.addEnrollment(selectedEntityType, organizationNPINum,
				organizationName);
		return "enrollment";
	}

}