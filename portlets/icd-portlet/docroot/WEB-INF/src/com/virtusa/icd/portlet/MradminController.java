package com.virtusa.icd.portlet;

import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtusa.icd.service.MradminService;
import com.virtusa.icd.service.builder.model.References;
import com.virtusa.icd.service.builder.model.impl.ReferencesImpl;
import com.virtusa.icd.util.Utils;

@Controller
@RequestMapping({ "VIEW" })
public class MradminController {

	private static final String REF_MSDRG = "msDrg";
	private static final String REF_PATIENTTYPES = "patientTypes";
	private static final int AGE_RANGE_START = 1;
	private static final int AGE_RANGE_END = 100;
	private static final String REF_LOS = "los";
	private static final String REF_AHRQCATCODE = "ahrqCategoryCode";
	private static final String REF_AHRQSUBCATCODE = "ahrqSubCategoryCode";

	private static final String REF_ICDNINEADMITTINGDX = "icd9AdmittingDx";
	private static final String REF_ICDNINEPRINCIPALDX = "icd9PrincipalDx";
	private static final String REF_ICDNINEPRINCIPALPROCEDURE = "icd9PrincipalProcedure";
	private static final String REF_OTHERICDNINEDX = "otherIcd9Dx";
	private static final String REF_OTHERICDNINEPCS = "otherIcd9Pcs";

	private static final String REF_ICDTENADMITTINGDX = "icd10AdmittingDx";
	private static final String REF_ICDTENPRINCIPALDX = "icd10PrincipalDx";
	private static final String REF_ICDTENPRINCIPALPROCEDURE = "icd10PrincipalProcedure";
	private static final String REF_OTHERICDTENDX = "otherIcd10Dx";
	private static final String REF_OTHERICDTENPCS = "otherIcd10Pcs";

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

	@ModelAttribute("msDrg")
	public SortedSet getMsDrg() {
		return Utils.getReferences(REF_MSDRG);
	}

	@ModelAttribute("patientType")
	public SortedSet getPatientTypes() {
		return Utils.getReferences(REF_PATIENTTYPES);
	}

	@ModelAttribute("patientAge")
	public SortedSet getPatientAge() {
		SortedSet set = new TreeSet<References>();

		References ref;
		for (int i = AGE_RANGE_START; i < AGE_RANGE_END; i++) {
			ref = new ReferencesImpl();
			ref.setKey(i + "");
			ref.setValue(i + "");
			set.add(ref);
		}
		return set;
	}

	@ModelAttribute("los")
	public SortedSet getLos() {
		return Utils.getReferences(REF_LOS);
	}

	@ModelAttribute("ahrqCategoryCode")
	public SortedSet getAhrgCategoryCode() {
		return Utils.getReferences(REF_AHRQCATCODE);
	}

	@ModelAttribute("ahrqSubCategoryCode")
	public SortedSet getAhrqSubCategoryCode() {
		return Utils.getReferences(REF_AHRQSUBCATCODE);
	}

	@ModelAttribute("icd9AdmittingDx")
	public SortedSet getIcd9AdmittingDx() {
		return Utils.getReferences(REF_ICDNINEADMITTINGDX);
	}

	@ModelAttribute("icd9PrincipalDx")
	public SortedSet getIcd9PrincipalDx() {
		return Utils.getReferences(REF_ICDNINEPRINCIPALDX);
	}

	@ModelAttribute("icd9PrincipalProcedure")
	public SortedSet getIcd9PrincipalProcedure() {
		return Utils.getReferences(REF_ICDNINEPRINCIPALPROCEDURE);
	}

	@ModelAttribute("otherIcd9Dx")
	public SortedSet getOtherIcd9Dx() {
		return Utils.getReferences(REF_OTHERICDNINEDX);
	}

	@ModelAttribute("otherIcd9Pcs")
	public SortedSet getOtherIcd9Pcs() {
		return Utils.getReferences(REF_OTHERICDNINEPCS);
	}

	@ModelAttribute("icd10AdmittingDx")
	public SortedSet getIcd10AdmittingDx() {
		return Utils.getReferences(REF_ICDTENADMITTINGDX);
	}

	@ModelAttribute("icd10PrincipalDx")
	public SortedSet getIcd10PrincipalDx() {
		return Utils.getReferences(REF_ICDTENPRINCIPALDX);
	}

	@ModelAttribute("icd10PrincipalProcedure")
	public SortedSet getIcd10PrincipalProcedure() {
		return Utils.getReferences(REF_ICDTENPRINCIPALPROCEDURE);
	}

	@ModelAttribute("otherIcd10Dx")
	public SortedSet getOtherIcd10Dx() {
		return Utils.getReferences(REF_OTHERICDTENDX);
	}

	@ModelAttribute("otherIcd10Pcs")
	public SortedSet getOtherIcd10Pcs() {
		return Utils.getReferences(REF_OTHERICDTENPCS);
	}

	@RequestMapping
	public String showMradmin() {
		return "mradmin";
	}
}