package com.virtusa.icd.portlet;

import java.util.SortedSet;

import com.liferay.portal.kernel.exception.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.*;
import org.springframework.web.multipart.*;
import org.springframework.web.portlet.bind.annotation.*;
import org.springframework.web.portlet.mvc.*;

import com.virtusa.icd.service.EnrollmentService;
import com.virtusa.icd.domain.*;
import com.virtusa.icd.util.Utils;

import javax.portlet.*;


@Controller
@RequestMapping({ "VIEW" })
public class EnrollmentController extends SimpleFormController{

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
	public void handleSubmit(ActionRequest request, ActionResponse response)
			throws SystemException {
		String selectedEntityType = request.getParameter("selectedEntityType");
		String organizationNPINum = request.getParameter("organizationNPINum");
		String organizationName = request.getParameter("organizationName");
		service.addEnrollment(selectedEntityType, organizationNPINum,
				organizationName);
		//return "enrollment";
	}

	@ActionMapping(params = "action=upload") 
	public String handleUploadAction(ActionRequest request, ActionResponse response) throws SystemException {
		String selectedEntityType = request.getParameter("selectedEntityType");
		String organizationNPINum = request.getParameter("organizationNPINum");
		String organizationName = request.getParameter("organizationName");
		service.addEnrollment(selectedEntityType, organizationNPINum, organizationName);
		return "enrollment";
	}


    public void onSubmitAction(ActionRequest request, ActionResponse response,
            Object command, BindException errors) throws Exception {

        // cast the bean
        FileUploadBean bean = (FileUploadBean) command;

        // let's see if there's content there
        MultipartFile file = bean.getFile();
        if (file == null) {
            // hmm, that's strange, the user did not upload anything
        }

        // do something with the file here
    }
}