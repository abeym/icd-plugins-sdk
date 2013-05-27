package com.virtusa.icd.portlet;

import java.util.SortedSet;
import java.util.TreeSet;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liferay.portal.kernel.exception.SystemException;
import com.virtusa.icd.domain.EntityType;
import com.virtusa.icd.service.EnrollmentService;
import com.virtusa.icd.service.builder.service.ReferencesLocalServiceUtil;
import java.util.List;
import com.virtusa.icd.service.builder.model.References;

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

	@ModelAttribute("top5byrev")
	public SortedSet getTopFiveByRev() {
		try {
			List<References> list = ReferencesLocalServiceUtil.getService()
					.getReferencesByName("healthplans");
			SortedSet<References> set = new TreeSet<References>();
			for (References ref : list) {
				set.add(ref);
			}
			return set;
		} catch (Exception e) {
			return null;
		}
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