<%@ include file="/WEB-INF/jsp/include.jsp" %>

<h1><spring:message code="portalmanagement.title"/></h1>
<script type="text/javascript"
src="http://ajax.googleapis.com/ajax/libs/jquery/1.2.6/jquery.min.js"></script>
<script type="text/javascript" 
src="<%=request.getContextPath()%>/js/jquery.labelify.js"></script>
<script type="text/javascript">
$(document).ready(function(){
  $(":text").labelify();
});
</script>


<form method="post" action="<portlet:actionURL/>" enctype="multipart/form-data">


	<table>
		<tr>
			<td><table>
				<tr>
					<td>
						<spring:message code="portalmanagement.searchMedicalRecords" var="vsearchMedicalRecords"/>
						<input type="text" name="searchMedicalRecords" title="${vsearchMedicalRecords}">
					</td>
					<td>
						<spring:message code="portalmanagement.searchPortalUsers" var="vsearchPortalUsers"/>
						<input type="text" name="searchPortalUsers" title="${vsearchPortalUsers}">
					</td>
				</tr>
			</table></td>
		</tr>

		<tr>
			<td><table>
				<tr><td>
					<select name="selectedPortalUser">
					</select>
				</td></tr>
				<tr><td>
					<select name="selectedMedicalRecordId">
					</select>
				</td></tr>
				<tr><td>
					<spring:message code="portalmanagement.currentTestingState" var="vcurrentTestingState"/>
					<input type="text" name="currentTestingState" title="${vcurrentTestingState}">
				</td></tr>
				<tr><td>
					<select name="changeTestingState">
							<c:forEach items="${testingStates}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<textarea rows="3" cols="5" name="testingStateChangeNotes"></textarea>
				</td></tr>
				<tr><td>
					<button type="button"><spring:message code="button.cancel"/></button>
					<button type="button"><spring:message code="button.submitChange"/></button>
				</td></tr>

				<tr><td>
					<button type="button"><spring:message code="portalmanagement.createDashboardData"/></button>
				</td></tr>
				<tr><td>
					<button type="button"><spring:message code="portalmanagement.uploadDashboardData"/></button>
				</td></tr>
				<tr><td>
					<button type="button"><spring:message code="mradmin.csvBulkUpload"/></button>
				</td></tr>
			</table></td>
	
	
			<td><table>
				<tr><td>
					<select name="icd9AdmittingDxControl">
							<c:forEach items="${icd9AdmittingDxControl}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="icd9PrincipalDxControl">
							<c:forEach items="${icd9PrincipalDxControl}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="icd9PrincipalProcControl">
							<c:forEach items="${icd9PrincipalPcsControl}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
			</table></td>
	
			<td><table>
				<tr><td>
					<select name="icd10AdmittingDxPattern1">
							<c:forEach items="${icd10AdmittingDxPattern1}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="icd10AdmittingDxPattern2">
							<c:forEach items="${icd10AdmittingDxPattern2}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="icd10AdmittingDxPattern3">
							<c:forEach items="${icd10AdmittingDxPattern3}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>

				<tr><td>
					<select name="icd10PrincipalDxPattern1">
							<c:forEach items="${icd10PrincipalDxPattern1}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="icd10PrincipalDxPattern2">
							<c:forEach items="${icd10PrincipalDxPattern2}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="icd10PrincipalDxPattern3">
							<c:forEach items="${icd10PrincipalDxPattern3}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>

				<tr><td>
					<select name="icd9PrincipalPcsPattern1">
							<c:forEach items="${icd9PrincipalPcsPattern1}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="icd9PrincipalPcsPattern2">
							<c:forEach items="${icd9PrincipalPcsPattern2}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="icd9PrincipalPcsPattern3">
							<c:forEach items="${icd9PrincipalPcsPattern3}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>

				<tr><td>
					<select name="codingAccuracy">
							<c:forEach items="${codingAccuracy}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="codingProficiency">
							<c:forEach items="${codingProficiency}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="clearinghouseAccuracy">
							<c:forEach items="${clearingHouseAccuracy}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="adjudicationRate">
							<c:forEach items="${adjudicationRate}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
		</tr>

	</table>
	</table>
	
	
</form>