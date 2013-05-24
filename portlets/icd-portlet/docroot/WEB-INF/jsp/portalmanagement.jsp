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
					<select name="changeTeestingState">
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
					<select name="icd9AdmittingDxControl"></select>
				</td></tr>
				<tr><td>
					<select name="icd9PrincipalDxControl"></select>
				</td></tr>
				<tr><td>
					<select name="icd9PrincipalProcControl"></select>
				</td></tr>
			</table></td>
	
			<td><table>
				<tr><td>
					<select name="icd10AdmittingDxPattern1"></select>
				</td></tr>
				<tr><td>
					<select name="icd10AdmittingDxPattern2"></select>
				</td></tr>
				<tr><td>
					<select name="icd10AdmittingDxPattern3"></select>
				</td></tr>

				<tr><td>
					<select name="icd10PrincipalDxPattern1"></select>
				</td></tr>
				<tr><td>
					<select name="icd10PrincipalDxPattern2"></select>
				</td></tr>
				<tr><td>
					<select name="icd10PrincipalDxPattern3"></select>
				</td></tr>

				<tr><td>
					<select name="icd10PrincipalPcsPattern1"></select>
				</td></tr>
				<tr><td>
					<select name="icd10PrincipalPcsPattern2"></select>
				</td></tr>
				<tr><td>
					<select name="icd10PrincipalPcsPattern3"></select>
				</td></tr>

				<tr><td>
					<select name="codingAccuracy"></select>
				</td></tr>
				<tr><td>
					<select name="codingProficiency"></select>
				</td></tr>
				<tr><td>
					<select name="clearinghouseAccuracy"></select>
				</td></tr>
				<tr><td>
					<select name="adjudicationRate"></select>
				</td></tr>
		</tr>

	</table>
	</table>
	
	
</form>