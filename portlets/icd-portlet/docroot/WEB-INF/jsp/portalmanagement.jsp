<%@ include file="/WEB-INF/jsp/include.jsp" %>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="<%=request.getContextPath()%>/css/main.css" rel="stylesheet" type="text/css">

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
				<div class="small_col">
					<select name="selectedPortalUser" class="select_box" title="Select portal user">
						<option>Select portal user</option>
					</select> 
					<select name="selectedMedicalRecordId" class="select_box" title="Select Medical record">
						<option>Select medical record id#</option>
					</select>
					<spring:message code="portalmanagement.currentTestingState"
						var="vcurrentTestingState" />
					<input type="text" name="currentTestingState"
						title="${vcurrentTestingState}" size="27" class="input_box"> 
					<select name="changeTestingState" class="select_box" title="Change testing state">
						<c:forEach items="${testingStates}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select>
					<textarea rows="3" cols="5" name="testingStateChangeNotes" class="textarea" title="Testing state change notes"></textarea>
					<button type="button" class="button_gry"><spring:message code="button.cancel"/></button>
					<button type="button" class="button"><spring:message code="button.submitChange"/></button>
				</div>
				<div class="small_col">
					<spring:message code="portalmanagement.searchMedicalRecords"
						var="vsearchMedicalRecords" />
					<input type="text" name="searchMedicalRecords"
						title="${vsearchMedicalRecords}" size="27" class="input_box search" value="Search Medical Records">
				</div>
				<div class="small_col">
					<spring:message code="portalmanagement.searchPortalUsers"
						var="vsearchPortalUsers" />
					<input type="text" name="searchPortalUsers"
						title="${vsearchPortalUsers}" size="27" class="input_box search" value="Search Portal Users">
				</div>
				<div class="ex_medium_col">
					<table width="102%" border="0" cellspacing="0" cellpadding="0">
						<col width="305">
						<col>
						<tr>
							<td>
							<select name="icd9AdmittingDxControl" class="select_box" title="icd9AdmittingDxControl">
								<c:forEach items="${icd9AdmittingDxControl}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
								</c:forEach>
							</select>
							</td>
							<td class="padding_le_10">
							<select name="icd10AdmittingDxPattern1" class="select_box" title="icd10AdmittingDxPattern1">
								<c:forEach items="${icd10AdmittingDxPattern1}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
								</c:forEach>
							</select> 
							<select name="icd10AdmittingDxPattern2" class="select_box" title="icd10AdmittingDxPattern2">
								<c:forEach items="${icd10AdmittingDxPattern2}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
								</c:forEach>
							</select> 
							<select name="icd10AdmittingDxPattern3" class="select_box" title="icd10AdmittingDxPattern3">
								<c:forEach items="${icd10AdmittingDxPattern3}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
								</c:forEach>
							</select>
							</td>
						</tr>
						<tr>
							<td>
							<select name="icd9PrincipalDxControl" class="select_box" title="icd9PrincipalDxControl">
									<c:forEach items="${icd9PrincipalDxControl}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
									</c:forEach>
							</select>
							</td>
							<td class="padding_le_10">
							<select name="icd10PrincipalDxPattern1" class="select_box" title="icd10PrincipalDxPattern1">
									<c:forEach items="${icd10PrincipalDxPattern1}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
									</c:forEach>
							</select> 
							<select name="icd10PrincipalDxPattern2" class="select_box" title="icd10PrincipalDxPattern2">
									<c:forEach items="${icd10PrincipalDxPattern2}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
									</c:forEach>
							</select> 
							<select name="icd10PrincipalDxPattern3" class="select_box" title="icd10PrincipalDxPattern3">
									<c:forEach items="${icd10PrincipalDxPattern3}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
									</c:forEach>
							</select>
							</td>
						</tr>
						<tr>
							<td>
							<select name="icd9PrincipalProcControl" class="select_box" title="icd9PrincipalProcControl">
									<c:forEach items="${icd9PrincipalPcsControl}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
									</c:forEach>
							</select>
							</td>
							<td class="padding_le_10">
							<select name="icd9PrincipalPcsPattern1" class="select_box" title="icd9PrincipalPcsPattern1">
									<c:forEach items="${icd9PrincipalPcsPattern1}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
									</c:forEach>
							</select> 
							<select name="icd9PrincipalPcsPattern2" class="select_box" title="icd9PrincipalPcsPattern2">
									<c:forEach items="${icd9PrincipalPcsPattern2}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
									</c:forEach>
							</select> 
							<select name="icd9PrincipalPcsPattern3" class="select_box" title="icd9PrincipalPcsPattern3">
									<c:forEach items="${icd9PrincipalPcsPattern3}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
									</c:forEach>
							</select>
							</td>
						</tr>
					</table>
				</div>
			</div>
			<div class="h_line"></div>
			<div class="section">
				<div class="small_col">
					<input type="button"
						value="<spring:message code="portalmanagement.createDashboardData"/>"
						class="button marginbottom_10" onClick=""> 
					<input type="button"
						value="<spring:message code="portalmanagement.uploadDashboardData"/>"
						class="button" onClick="">
				</div>
				<div class="small_col"></div>
				<div class="small_col">
					<select name="codingAccuracy" class="select_box" title="codingAccuracy">
						<c:forEach items="${codingAccuracy}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> 
					<select name="codingProficiency" class="select_box" title="codingProficiency">
						<c:forEach items="${codingProficiency}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> <select name="clearinghouseAccuracy" class="select_box" title="clearinghouseAccuracy">
						<c:forEach items="${clearingHouseAccuracy}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select> 
					<select name="adjudicationRate" class="select_box" title="adjudicationRate">
						<c:forEach items="${adjudicationRate}" var="refItem">
							<option value="<c:out value="${refItem.key}"/>">
								<c:out value="${refItem.value} " />
							</option>
						</c:forEach>
					</select>
				</div>

			</div>
			<div class="h_line"></div>
			<div class="section">
				<div class="large_col">
					<div class="button_wrapper">
						<input type="button" value="<spring:message code="mradmin.csvBulkUpload"/>" class="button"
							onClick=""> 
						<input type="button" value="<spring:message code="button.faq"/>"
							class="btn_right button" onClick="">
					</div>
				</div>
			</div>
		</form>
		<!-- footer -->
  <div class="clearfix"></div>
  <div id="footer"> <span>Copyright 2013 Lott QA Group, Inc. All Rights Reserved Visibiledi is a registered trademark </span> </div>
</div>
</body>
</html>
