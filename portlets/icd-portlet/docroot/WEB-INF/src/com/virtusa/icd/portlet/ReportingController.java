package com.virtusa.icd.portlet;

import java.util.SortedSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtusa.icd.service.ReportingService;
import com.virtusa.icd.util.Utils;

@Controller
@RequestMapping({ "VIEW" })
public class ReportingController {

	private static final String REF_CODING_ACCURACY_BY_AHRQ_CAT_CODE = "codingAccuracyByAhrqCatCode";
	private static final String REF_CODING_ACCURACY_BY_AHRQ_SUBCAT_CODE = "codingAccuracyByAhrqSubCatCode";

	private static final String REF_CODING_PATTERNS_BY_AHRQ_CAT_CODE = "codingPatternsByAhrqCatCode";
	private static final String REF_CODING_PATTERNS_BY_AHRQ_SUBCAT_CODE = "codingPatternsByAhrqSubCatCode";
	private static final String REF_TEST_ACCURACY_BY_MEDSPEC = "testAccuracyByMedSpeciality";
	private static final String REF_ICD10_COLLAB_TESTMETRICS = "icd10CollabTestMetrics";
	private static final String REF_USERDEFINED_REPORT = "userDefinedReport";
	private static final String REF_CODING_PATTERNS_BY_DRG = "codingPatternsByDrg";
	private static final String REF_CODING_ACCURACY_BY_DRG = "codingAccuracyByDrg";

	private ReportingService service;

	public ReportingService getService() {
		return service;
	}

	public void setService(ReportingService service) {
		this.service = service;
	}

	@ModelAttribute("entityTypes")
	public SortedSet getEntityTypes() {
		return this.service.getEntityTypes();
	}

	@ModelAttribute("codingAccuracyByAhrqCatCode")
	public SortedSet getCodingAccuracyByAhrqCatCode() {
		return Utils.getReferences(REF_CODING_ACCURACY_BY_AHRQ_CAT_CODE);
	}

	@ModelAttribute("codingAccuracyByAhrqSubCatCode")
	public SortedSet getCodingAccuracyByAhrqSubCatCode() {
		return Utils.getReferences(REF_CODING_ACCURACY_BY_AHRQ_SUBCAT_CODE);
	}

	@ModelAttribute("codingPatternsByAhrqCatCode")
	public SortedSet getCodingPatternsByAhrqCatCode() {
		return Utils.getReferences(REF_CODING_PATTERNS_BY_AHRQ_CAT_CODE);
	}

	@ModelAttribute("codingPatternsByAhrqSubCatCode")
	public SortedSet getCodingPatternsByAhrqSubCatCode() {
		return Utils.getReferences(REF_CODING_PATTERNS_BY_AHRQ_SUBCAT_CODE);
	}

	@ModelAttribute("userDefinedReport")
	public SortedSet getUserDefinedReport() {
		return Utils.getReferences(REF_USERDEFINED_REPORT);
	}

	@ModelAttribute("testAccuracyByMedSpeciality")
	public SortedSet getTestAccuracyByMedSpeciality() {
		return Utils.getReferences(REF_TEST_ACCURACY_BY_MEDSPEC);
	}

	@ModelAttribute("icd10CollabTestMetrics")
	public SortedSet getIcd10CollabTestMetrics() {
		return Utils.getReferences(REF_ICD10_COLLAB_TESTMETRICS);
	}
	
	@ModelAttribute("codingPatternsByDrg")
	public SortedSet getCodingPatternsByDrg() {
		return Utils.getReferences(REF_CODING_PATTERNS_BY_DRG);
	}

	@ModelAttribute("codingAccuracyByDrg")
	public SortedSet getCodingAccuracyByDrg() {
		return Utils.getReferences(REF_CODING_ACCURACY_BY_DRG);
	}
	
	@RequestMapping
	public String show() {
		return "reporting";
	}
}