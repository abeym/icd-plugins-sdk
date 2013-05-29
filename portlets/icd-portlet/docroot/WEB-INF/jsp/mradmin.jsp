<%@ include file="/WEB-INF/jsp/include.jsp"%>

<!DOCTYPE HTML>
<html>

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

<body>

	<div id="page_container">
		<h1>
			<spring:message code="mradmin.title" />
		</h1>
		<form method="post" action="<portlet:actionURL/>"
			enctype="multipart/form-data">
			<div class="section">
				<div class="small_col">
					<div class="marginbottom_20"></div>
					<select name="selectedEntityType" class="select_box">
						<c:forEach items="${entityTypes}" var="entityType">
							<option value="<c:out value="${entityType.key}"/>">
								<c:out value="${entityType.value} " />
							</option>
						</c:forEach>
					</select>
					<spring:message code="mradmin.mrTestCaseNum" var="vmrTestCaseNum" />
					<input type="text" name="mrTestCaseNum" title="${vmrTestCaseNum}"
						size="27" class="input_box"> <select name="mrDrgNum"
						class="select_box">
						<c:forEach items="${msDrg}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="patientType" class="select_box">
						<c:forEach items="${patientType}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="patientAge" class="select_box">
						<c:forEach items="${patientAge}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="los" class="select_box">
						<c:forEach items="${los}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="ahrqCategoryCode" class="select_box">
						<c:forEach items="${ahrqCategoryCode}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="ahrqSubCategoryCode" class="select_box">
						<c:forEach items="${ahrqSubCategoryCode}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select>
					<textarea rows="3" cols="5" name="mrTestCaseDesc"
						title="mrTestCaseDesc" class="textarea"></textarea>

					<spring:message code="mradmin.mrFile" var="vmrFile"	/>
					<input type="file" name="mrFile" title="${vmrFile}" class="file_field marginbottom_10" size="8"/>

					<button type="submit" class="button">
						<spring:message code="mradmin.submitRecordToDatabase" />
					</button>
				</div>
				<div class="small_col">
					<div class="marginbottom_20"></div>
					<select name="icd9AdmittingDxCode" class="select_box">
						<c:forEach items="${icd9AdmittingDx}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="icd9PrincipalDxCode" class="select_box">
						<c:forEach items="${icd9PrincipalDx}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="icd9PrincipalProcCode" class="select_box">
						<c:forEach items="${icd9PrincipalProcedure}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="otherIcd9DxCode1" class="select_box">
						<c:forEach items="${otherIcd9Dx}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="otherIcd9DxCode2" class="select_box">
						<c:forEach items="${otherIcd9Dx}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="otherIcd9DxCode3" class="select_box">
						<c:forEach items="${otherIcd9Dx}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="otherIcd9PcsCode1" class="select_box">
						<c:forEach items="${otherIcd9Pcs}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="otherIcd9PcsCode2" class="select_box">
						<c:forEach items="${otherIcd9Pcs}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="otherIcd9PcsCode3" class="select_box">
						<c:forEach items="${otherIcd9Pcs}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select>
					<spring:message code="mradmin.historyAndPhysical"
						var="vhistoryAndPhysical" />
					<input type="checkbox" name="historyAndPhysical"
						title="${vhistoryAndPhysical}" value="checkbox"
						id="CheckboxGroup1_0"> <label for="historyAndPhysical"><spring:message
							code="mradmin.historyAndPhysical" /> </label><br>

					<spring:message code="mradmin.dischargeNotes" var="vdischargeNotes" />
					<input type="checkbox" name="dischargeNotes"
						title="${vdischargeNotes}" value="checkbox" id="CheckboxGroup1_1">
					<label for="dischargeNotes"><spring:message
							code="mradmin.dischargeNotes" /> </label> <br>

					<spring:message code="mradmin.consultations" var="vconsultations" />
					<input type="checkbox" name="consultations"
						title="${vconsultations}" value="checkbox" id="CheckboxGroup1_2">
					<label for="consultations"><spring:message
							code="mradmin.consultations" /> </label> <br>


					<spring:message code="mradmin.operatingNotes" var="voperatingNotes" />
					<input type="checkbox" name="operatingNotes"
						title="${voperatingNotes}" value="checkbox" id="CheckboxGroup1_3">
					<label for="operatingNotes"><spring:message
							code="mradmin.operatingNotes" /> </label><br>


				</div>


				<div class="small_col">

					<input type="text" name="searchMedicalRecords"
						title="search Medical Records" size="27" class="input_box search"
						value="Search Medical Records"> <select
						name="icd10AdmittingDxCode" class="select_box">
						<c:forEach items="${icd10AdmittingDx}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="icd10PrincipalDxCode" class="select_box">
						<c:forEach items="${icd10PrincipalDx}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="icd10PrincipalProcCode" class="select_box">
						<c:forEach items="${icd10PrincipalProcedure}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="otherIcd10DxCode1" class="select_box">
						<c:forEach items="${otherIcd10Dx}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="otherIcd10DxCode2" class="select_box">
						<c:forEach items="${otherIcd10Dx}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="otherIcd10DxCode3" class="select_box">
						<c:forEach items="${otherIcd10Dx}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="otherIcd10PcsCode1" class="select_box">
						<c:forEach items="${otherIcd10Pcs}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="otherIcd10PcsCode2" class="select_box">
						<c:forEach items="${otherIcd10Pcs}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="otherIcd10PcsCode3" class="select_box">
						<c:forEach items="${otherIcd10Pcs}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select>

					<spring:message code="mradmin.physicianNotes" var="vphysicianNotes" />
					<input type="checkbox" name="physicianNotes"
						title="${vphysicianNotes}" value="checkbox" id="Checkbox1">
					<label for="physicianNotes"><spring:message
							code="mradmin.physicianNotes" /> </label><br>




					<spring:message code="mradmin.radiology" var="vradiology" />
					<input type="checkbox" name="radiology" title="${vradiology}"
						value="checkbox" id="Checkbox2"> <label for="radiology"><spring:message
							code="mradmin.radiology" /> </label><br>


					<spring:message code="mradmin.giProcedures" var="vgiProcedures" />
					<input type="checkbox" name="giProcedures" title="${vgiProcedures}"
						value="checkbox" id="Checkbox3"> <label for="giProcedures"><spring:message
							code="mradmin.giProcedures" /> </label><br>


					<spring:message code="mradmin.educationalNotes"
						var="veducationalNotes" />
					<input type="checkbox" name="educationalNotes"
						title="${veducationalNotes}" value="checkbox" id="Checkbox4">
					<label for="educationalNotes"><spring:message
							code="mradmin.educationalNotes" /> </label><br>

				</div>
			</div>


			<div class="h_line"></div>
			<div class="section">
				<div class="large_col">
					<div class="button_wrapper">

						<button type="submit" class="button">
							<spring:message code="mradmin.csvBulkUpload" />
						</button>
						<button type="button" class="btn_right button">
							<spring:message code="button.faq" />
						</button>


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