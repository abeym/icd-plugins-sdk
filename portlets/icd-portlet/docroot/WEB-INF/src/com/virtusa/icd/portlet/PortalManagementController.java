package com.virtusa.icd.portlet;

import java.util.SortedSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtusa.icd.service.PortalManagementService;
import com.virtusa.icd.util.Utils;

@Controller
@RequestMapping({ "VIEW" })
public class PortalManagementController {

	private static final String REF_TESTINGSTATES = "testingStates";

	private static final String REF_ICD_NINE_ADMITTING_DX_CONTROL = "icd9AdmittingDxControl";

	private static final String REF_ICD_NINE_PRINCIPAL_DX_CONTROL = "icd9PrincipalDxControl";
	private static final String REF_ICD_NINE_PRINCIPAL_PCS_CONTROL = "icd9PrincipalPcsControl";

	private static final String REF_ICD_TEN_ADMITTING_DX_PATTERN_1 = "icd10AdmittingDxPattern1";
	private static final String REF_ICD_TEN_ADMITTING_DX_PATTERN_2 = "icd10AdmittingDxPattern2";
	private static final String REF_ICD_TEN_ADMITTING_DX_PATTERN_3 = "icd10AdmittingDxPattern3";

	private static final String REF_ICD_TEN_PRINCIPAL_DX_PATTERN_1 = "icd10PrincipalDxPattern1";
	private static final String REF_ICD_TEN_PRINCIPAL_DX_PATTERN_2 = "icd10PrincipalDxPattern2";
	private static final String REF_ICD_TEN_PRINCIPAL_DX_PATTERN_3 = "icd10PrincipalDxPattern3";

	private static final String REF_ICD_NINE_PRINCIPAL_PCS_PATTERN_1 = "icd9PrincipalPcsPattern1";
	private static final String REF_ICD_NINE_PRINCIPAL_PCS_PATTERN_2 = "icd9PrincipalPcsPattern2";
	private static final String REF_ICD_NINE_PRINCIPAL_PCS_PATTERN_3 = "icd9PrincipalPcsPattern3";

	private static final String REF_CODING_ACCURACY = "codingAccuracy";

	private static final String REF_CODING_PROFICIENCY = "codingProficiency";

	private static final String REF_CLEARINGHOUSE_ACCURACY = "clearinghouseAccuracy";

	private static final String REF_ADJUDICATION_RATE = "adjudicationRate";

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

	@ModelAttribute("testingStates")
	public SortedSet getTestingStates() {
		return Utils.getReferences(REF_TESTINGSTATES);
	}

	@ModelAttribute("icd9AdmittingDxControl")
	public SortedSet getIcd9AdmittingDxControl() {
		return Utils.getReferences(REF_ICD_NINE_ADMITTING_DX_CONTROL);
	}

	@ModelAttribute("icd9PrincipalDxControl")
	public SortedSet getIcd9PrincipalDxControl() {
		return Utils.getReferences(REF_ICD_NINE_PRINCIPAL_DX_CONTROL);
	}

	@ModelAttribute("icd9PrincipalPcsControl")
	public SortedSet getIcd9PrincipalPcsControl() {
		return Utils.getReferences(REF_ICD_NINE_PRINCIPAL_PCS_CONTROL);
	}

	@ModelAttribute("icd10AdmittingDxPattern1")
	public SortedSet getIcd10AdmittingDxPattern1() {
		return Utils.getReferences(REF_ICD_TEN_ADMITTING_DX_PATTERN_1);
	}

	@ModelAttribute("icd10AdmittingDxPattern2")
	public SortedSet getIcd10AdmittingDxPattern2() {
		return Utils.getReferences(REF_ICD_TEN_ADMITTING_DX_PATTERN_2);
	}

	@ModelAttribute("icd10AdmittingDxPattern3")
	public SortedSet getIcd10AdmittingDxPattern3() {
		return Utils.getReferences(REF_ICD_TEN_ADMITTING_DX_PATTERN_3);
	}

	@ModelAttribute("icd10PrincipalDxPattern1")
	public SortedSet getIcd10PrincipalDxPattern1() {
		return Utils.getReferences(REF_ICD_TEN_PRINCIPAL_DX_PATTERN_1);
	}

	@ModelAttribute("icd10PrincipalDxPattern2")
	public SortedSet getIcd10PrincipalDxPattern2() {
		return Utils.getReferences(REF_ICD_TEN_PRINCIPAL_DX_PATTERN_2);
	}

	@ModelAttribute("icd10PrincipalDxPattern3")
	public SortedSet getIcd10PrincipalDxPattern3() {
		return Utils.getReferences(REF_ICD_TEN_PRINCIPAL_DX_PATTERN_3);
	}

	@ModelAttribute("icd9PrincipalPcsPattern1")
	public SortedSet getIcd9PrincipalPcsPattern1() {
		return Utils.getReferences(REF_ICD_NINE_PRINCIPAL_PCS_PATTERN_1);
	}

	@ModelAttribute("icd9PrincipalPcsPattern2")
	public SortedSet getIcd9PrincipalPcsPattern2() {
		return Utils.getReferences(REF_ICD_NINE_PRINCIPAL_PCS_PATTERN_2);
	}

	@ModelAttribute("icd10PrincipalDxPattern3")
	public SortedSet getIcd9PrincipalPcsPattern3() {
		return Utils.getReferences(REF_ICD_NINE_PRINCIPAL_PCS_PATTERN_3);
	}

	@ModelAttribute("codingAccuracy")
	public SortedSet getCodingAccuracy() {
		return Utils.getReferences(REF_CODING_ACCURACY);
	}

	@ModelAttribute("codingProficiency")
	public SortedSet getCodingProficiency() {
		return Utils.getReferences(REF_CODING_PROFICIENCY);
	}

	@ModelAttribute("clearingHouseAccuracy")
	public SortedSet getClearingHouseAccuracy() {
		return Utils.getReferences(REF_CLEARINGHOUSE_ACCURACY);
	}

	@ModelAttribute("adjudicationRate")
	public SortedSet getAdjudicationRate() {
		return Utils.getReferences(REF_ADJUDICATION_RATE);
	}

	@RequestMapping
	public String show() {
		return "portalmanagement";
	}
}