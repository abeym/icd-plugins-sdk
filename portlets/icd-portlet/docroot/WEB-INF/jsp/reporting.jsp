<%@ include file="/WEB-INF/jsp/include.jsp"%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">

<link href="<%=request.getContextPath()%>/css/main.css" rel="stylesheet"
	type="text/css">

<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.2.6/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.labelify.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(":text").labelify();
	});
</script>

</head>
<body>

	<div id="page_container">
		<form method="post" action="<portlet:actionURL/>"
			enctype="multipart/form-data">
			<h1>
				<spring:message code="portalmanagement.title" />
			</h1>
			<div class="section">
				<div class="ex_medium_col">
					<h2>Welcome "User ID Organization Name"</h2>
				</div>
				<div class="small_col">
					<input type="text" name="searchMedicalRecords"
						title="search Medical Records" size="27" class="input_box search"
						value="Search Medical Records">
				</div>
			</div>
			<div class="section">
				<div class="small_col">
					<select name="selectedEntityType" class="select_box">
						<c:forEach items="${entityTypes}" var="entityType">
							<option value="<c:out value="${entityType.key}"/>">
								<c:out value="${entityType.value} " />
							</option>
						</c:forEach>
					</select> <label for="enrollmentReport"> <spring:message
							code="reporting.enrollmentReport" var="venrollmentReport" /> <input
						type="checkbox" name="enrollmentReport" value="checkbox"
						id="CheckboxGroup1_0" title="${venrollmentReport}"> <spring:message
							code="reporting.enrollmentReport" /> </label><br> <label
						for="mrStatus"> <spring:message code="reporting.mrStatus"
							var="vmrStatus" /> <input type="checkbox" name="mrStatus"
						value="checkbox" id="CheckboxGroup1_1" title="${vmrStatus}">
						<spring:message code="reporting.mrStatus" /> </label> <br> <label
						for="icd10CodingAccuracy"> <spring:message
							code="reporting.icd10CodingAccuracy" var="vicd10CodingAccuracy" />
						<input type="checkbox" name="icd10CodingAccuracy" value="checkbox"
						id="CheckboxGroup1_2" title="${vicd10CodingAccuracy}"> <spring:message
							code="reporting.icd10CodingAccuracy" /> </label> <br> <label
						for="icd10CodingPatterns"> <spring:message
							code="reporting.icd10CodingPatterns" var="vicd10CodingPatterns" />
						<input type="checkbox" name="icd10CodingPatterns" value="checkbox"
						id="CheckboxGroup1_3" title="${vicd10CodingPatterns}"> <spring:message
							code="reporting.icd10CodingPatterns" /> </label> <br>

				</div>


				<div class="small_col">


					<select name="selectedEntity" class="select_box">
						<option>Select Entity</option>
					</select> <label for="testingStatus"> <spring:message
							code="reporting.testingStatus" var="vtestingStatus" /> <input
						type="checkbox" name="testingStatus" value="checkbox"
						id="CheckboxGroup1_0" title="${vtestingStatus}"> <spring:message
							code="reporting.testingStatus" /> </label> <br> <label
						for="5010Compliance"> <spring:message
							code="reporting.5010Compliance" var="v5010Compliance" /> <input
						type="checkbox" name="5010Compliance" value="checkbox"
						id="CheckboxGroup1_1" title="${v5010Compliance}"> <spring:message
							code="reporting.5010Compliance" />
					</label> <br> <label for="adjudicationRate"> <spring:message
							code="reporting.adjudicationRate" var="vadjudicationRate" /> <input
						type="checkbox" name="adjudicationRate" value="checkbox"
						id="CheckboxGroup1_2" title="${vadjudicationRate}"> <spring:message
							code="reporting.adjudicationRate" />
					</label> <br> <label for="remittanceAccuracy"> <spring:message
							code="reporting.remittanceAccuracy" var="vremittanceAccuracy" />
						<input type="checkbox" name="remittanceAccuracy" value="checkbox"
						id="CheckboxGroup1_3" title="${vremittanceAccuracy}"> <spring:message
							code="reporting.remittanceAccuracy" /> </label> <br>

				</div>
				<div class="small_col">

					<spring:message code="reporting.selectedReportsToDownload"
						var="vselectedReportsToDownload" />
					<input type="text" name="selectedReportsToDownload"
						title="${vselectedReportsToDownload}" class="select_box">

					<label for="icd10TestingProjectOverview"> <spring:message
							code="reporting.icd10TestingProjectOverview"
							var="vicd10TestingProjectOverview" /> <input type="checkbox"
						name="icd10TestingProjectOverview" value="checkbox"
						id="CheckboxGroup1_0" title="${vicd10TestingProjectOverview}">
						<spring:message code="reporting.icd10TestingProjectOverview" />
					</label> <br> <label for="icd10CodingRevision"> <spring:message
							code="reporting.icd10CodingRevision" var="vicd10CodingRevision" />
						<input type="checkbox" name="icd10CodingRevision" value="checkbox"
						id="CheckboxGroup1_1" title="${vicd10CodingRevision}"> <spring:message
							code="reporting.icd10CodingRevision" /> </label> <br> <label
						for="adjudicationRate"> <spring:message
							code="reporting.adjudicationRate" var="vadjudicationRate" /> <input
						type="checkbox" name="adjudicationRate" value="checkbox"
						id="CheckboxGroup1_2" title="${vadjudicationRate}"> <spring:message
							code="reporting.adjudicationRate" />
					</label> <br> <label for="remittanceAccuracy"> <spring:message
							code="reporting.remittanceAccuracy" var="vremittanceAccuracy" />
						<input type="checkbox" name="remittanceAccuracy" value="checkbox"
						id="CheckboxGroup1_3" title="${vremittanceAccuracy}">
					<spring:message code="reporting.remittanceAccuracy" />
					</label> <br> <br> <input type="button"
						value="Download Testing Reports" class="btn_right button"
						onClick="">

				</div>
			</div>
			<div class="h_line"></div>


			<div class="section">
				<div class="large_col">
					<div class="medium_col">
						<input type="text" name="nationalICD10TestingMetrics"
							value="National ICD-10 Testing Metrics"
							title="National ICD-10 Testing Metrics" size="27"
							class="input_box">
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="medium_col">

					<select name="codingAccuracyAHRQCategoryCode" class="select_box">
						<option>Coding Accuracy by AHRQ Category Code</option>
						<option>opt1</option>
						<option>opt2</option>
					</select> <select name="codingAccuracyAHRQSubCategoryCode"
						class="select_box">
						<option>Coding Accuracy by AHRQ Sub-Category Code</option>
						<option>opt1</option>
						<option>opt2</option>
					</select> <select name="codingPatternsAHRQCategoryCode" class="select_box">
						<option>Coding Patterns by AHRQ Category Code</option>
						<option>opt1</option>
						<option>opt2</option>
					</select> <select name="codingPatternsAHRQSubCategoryCode"
						class="select_box">
						<option>Coding Patterns by AHRQ Sub-Category Code</option>
						<option>opt1</option>
						<option>opt2</option>
					</select> <select name="userDefinedReport" class="select_box">
						<option>User-Defined Report</option>
						<option>opt1</option>
						<option>opt2</option>
					</select>
				</div>

				<div class="medium_col">
					<select name="testingAccuracyByMedicalSpeciality"
						class="select_box">
						<option>Testing Accuracy By Medical Speciality</option>
						<option>opt1</option>
						<option>opt2</option>
					</select> <select name="ICD10CollaborativeTestingMetrics" class="select_box">
						<option>ICD-10 Collaborative Testing Metrics</option>
						<option>opt1</option>
						<option>opt2</option>
					</select> <select name="codingPatternsDRG" class="select_box">
						<option>Coding Patterns by DRG</option>
						<option>opt1</option>
						<option>opt2</option>
					</select> <select name="codingAccuracyDRG" class="select_box">
						<option>Coding Accuracy by DRG</option>
						<option>opt1</option>
						<option>opt2</option>
					</select> <select name="userDefinedReport" class="select_box">
						<option>User Defined Report</option>
						<option>opt1</option>
						<option>opt2</option>
					</select> <input type="button" value="Download National Reports"
						class="btn_right button" onClick="">
				</div>
			</div>
			<div class="h_line"></div>
			<div class="section">
				<div class="large_col">
					<div class="button_wrapper">
						<input type="button" value="FAQ" class="btn_right button"
							onClick="">
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		</form>
		<!-- footer -->
		<div class="clearfix"></div>
		<div id="footer">
			<span>Copyright 2013 Lott QA Group, Inc. All Rights Reserved
				Visibiledi is a registered trademark </span>
		</div>
	</div>
</body>
</html>