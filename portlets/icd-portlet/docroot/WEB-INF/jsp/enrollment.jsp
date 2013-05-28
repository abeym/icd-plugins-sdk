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
			<spring:message code="enrollment.title" />
		</h1>
		<form method="post" action="<portlet:actionURL/>"
			enctype="multipart/form-data">
			<div class="section">
				<div class="small_col">

					<select name="selectedEntityType" class="select_box">
						<c:forEach items="${entityTypes}" var="entityType">
							<option value="<c:out value="${entityType.key}"/>">
								<c:out value="${entityType.value} " />
							</option>
						</c:forEach>
					</select>
					<spring:message code="enrollment.organizationNPINum"
						var="vorganizationNPINum" />
					<input type="text" name="organizationNPINum"
						title="${vorganizationNPINum}" size="27" class="input_box">
					<spring:message code="enrollment.organizationName"
						var="vorganizationName" />
					<input type="text" name="organizationName"
						title="${vorganizationName}" size="25" class="input_box">

					<spring:message code="enrollment.organizationAddress1"
						var="vorganizationAddress1" />
					<input type="text" name="organizationAddress1"
						title="${vorganizationAddress1}" size="25" class="input_box">
					<spring:message code="enrollment.organizationAddress2"
						var="vorganizationAddress2" />
					<input type="text" name="organizationAddress2"
						title="${vorganizationAddress2}" size="25" class="input_box">

					<spring:message code="enrollment.organizationCity"
						var="vorganizationCity" />
					<input type="text" name="organizationCity"
						title="${vorganizationCity}" size="25" class="input_box">
					<spring:message code="enrollment.organizationPhone"
						var="vorganizationPhone" />
					<input type="text" name="organizationPhone"
						title="${vorganizationPhone}" size="25" class="input_box">

				</div>
				<div class="small_col">
					<select multiple="multiple" name="top5HealthPlansByRev"
						class="select_multiple" size="3">
								<c:forEach items="${top5byrev}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
									</c:forEach>						
					</select> <select multiple="multiple" name="clearinghouses"
						class="select_multiple" size="3">
									<c:forEach items="${clearinghouses}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
									</c:forEach>	

					</select> <select multiple="multiple" name="ehrBillingVendors" size="3"
						class="select_multiple">
									<c:forEach items="${ehrAndBillingVendors}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
									</c:forEach>	
						
					</select> <select multiple="multiple" name="revCycleVendors" size="3"
						class="select_multiple">
									<c:forEach items="${revCycleVendors}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
									</c:forEach>	
					</select>
				</div>

				<div class="small_col">
					<div class="ex_small_col">

						<textarea rows="3" cols="5" name="top5DrgByRev" class="textarea"></textarea>
						<spring:message code="enrollment.icd9Drg1" var="vicd9Drg1" />
						<input type="text" name="icd9Drg1" title="${vicd9Drg1}" size="25"
							class="input_box">

						<spring:message code="enrollment.icd9Drg2" var="vicd9Drg2" />
						<input type="text" name="icd9Drg2" title="${vicd9Drg2}" size="25"
							class="input_box">
						<spring:message code="enrollment.icd9Drg3" var="vicd9Drg3" />
						<input type="text" name="icd9Drg3" title="${vicd9Drg3}" size="25"
							class="input_box">
						<spring:message code="enrollment.icd9Drg4" var="vicd9Drg4" />
						<input type="text" name="icd9Drg4" title="${vicd9Drg4}" size="25"
							class="input_box">
						<spring:message code="enrollment.icd9Drg5" var="vicd9Drg5" />
						<input type="text" name="icd9Drg5" title="${vicd9Drg5}" size="25"
							class="input_box">

					</div>
					<div class="ex_small_col">
						<textarea rows="3" cols="5" name="top5Icd9ByRev" class="textarea"></textarea>
						<spring:message code="enrollment.icd9Dx1" var="vicd9Dx1" />
						<input type="text" name="icd9Dx1" title="${vicd9Dx1}" size="25"
							class="input_box">
						<spring:message code="enrollment.icd9Dx2" var="vicd9Dx2" />
						<input type="text" name="icd9Dx2" title="${vicd9Dx2}" size="25"
							class="input_box">
						<spring:message code="enrollment.icd9Dx3" var="vicd9Dx3" />
						<input type="text" name="icd9Dx3" title="${vicd9Dx3}" size="25"
							class="input_box">
						<spring:message code="enrollment.icd9Dx4" var="vicd9Dx4" />
						<input type="text" name="icd9Dx4" title="${vicd9Dx4}" size="25"
							class="input_box">
						<spring:message code="enrollment.icd9Dx5" var="vicd9Dx5" />
						<input type="text" name="icd9Dx5" title="${vicd9Dx5}" size="25"
							class="input_box">

					</div>
				</div>
			</div>
			<div class="h_line"></div>
			<div class="section">
				<div class="small_col">

					<spring:message code="enrollment.primaryTestingContact"
						var="vprimaryTestingContact" />
					<input type="text" name="primaryTestingContact"
						title="${vprimaryTestingContact}" size="25" class="input_box">
					<spring:message code="enrollment.primaryTestingContactTitle"
						var="vprimaryTestingContactTitle" />
					<input type="text" name="primaryTestingContactTitle"
						title="${vprimaryTestingContactTitle}" size="25" class="input_box">
					<spring:message code="enrollment.primaryTestingContactPhone"
						var="vprimaryTestingContactPhone" />
					<input type="text" name="primaryTestingContactPhone"
						title="${vprimaryTestingContactPhone}" size="25" class="input_box">
					<spring:message code="enrollment.primaryTestingContactEmail"
						var="vprimaryTestingContactEmail" />
					<input type="text" name="primaryTestingContactEmail"
						title="${vprimaryTestingContactEmail}" size="25" class="input_box">


				</div>
				<div class="small_col">

					<spring:message code="enrollment.primaryCodingContact"
						var="vprimaryCodingContact" />
					<input type="text" name="primaryCodingContact"
						title="${vprimaryCodingContact}" size="25" class="input_box">
					<spring:message code="enrollment.primaryCodingContactTitle"
						var="vprimaryCodingContactTitle" />
					<input type="text" name="primaryCodingContactTitle"
						title="${vprimaryCodingContactTitle}" size="25" class="input_box">
					<spring:message code="enrollment.primaryCodingContactPhone"
						var="vprimaryCodingContactPhone" />
					<input type="text" name="primaryCodingContactPhone"
						title="${vprimaryCodingContactPhone}" size="25" class="input_box">
					<spring:message code="enrollment.primaryCodingContactEmail"
						var="vprimaryCodingContactEmail" />
					<input type="text" name="primaryCodingContactEmail"
						title="${vprimaryCodingContactEmail}" size="25" class="input_box">


				</div>
				<div class="small_col">
					<spring:message code="enrollment.primaryBillingContact"
						var="vprimaryBillingContact" />
					<input type="text" name="primaryBillingContact"
						title="${vprimaryBillingContact}" size="25" class="input_box">
					<spring:message code="enrollment.primaryBillingContactTitle"
						var="vprimaryBillingContactTitle" />
					<input type="text" name="primaryBillingContactTitle"
						title="${vprimaryBillingContactTitle}" size="25" class="input_box">
					<spring:message code="enrollment.primaryBillingContactPhone"
						var="vprimaryBillingContactPhone" />
					<input type="text" name="primaryBillingContactPhone"
						title="${vprimaryBillingContactPhone}" size="25" class="input_box">
					<spring:message code="enrollment.primaryBillingContactEmail"
						var="vprimaryBillingContactEmail" />
					<input type="text" name="primaryBillingContactEmail"
						title="${vprimaryBillingContactEmail}" size="25" class="input_box">
				</div>
			</div>
			<div class="h_line"></div>
			<div class="section">
				<div class="large_col">
					<div class="button_wrapper">


						<spring:message code="enrollment.file" var="vfile" />
						<input type="file" name="file" title="${vfile}" class="file_field"
							size="35" />

						<button type="submit" class="button">
							<spring:message code="button.upload" />
						</button>

						<button type="button">
							<spring:message code="button.submit" />
						</button>

						<button type="button"  class="btn_right button">
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