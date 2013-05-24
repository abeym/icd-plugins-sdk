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
						<select name="selectedEntityType">
							<c:forEach items="${entityTypes}" var="entityType">
								<option value="<c:out value="${entityType.key}"/>">
						    		<c:out value="${entityType.value} "/>
								</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						<spring:message code="reporting.enrollmentReport" var="venrollmentReport"/>
						<input type="checkbox" name="enrollmentReport" title="${venrollmentReport}"> <label for="enrollmentReport"><spring:message code="reporting.enrollmentReport"/></label>
					</td>
				</tr>
				<tr>
					<td>
						<spring:message code="reporting.mrStatus" var="vmrStatus"/>
						<input type="checkbox" name="mrStatus" title="${vmrStatus}"> <label for="mrStatus"><spring:message code="reporting.mrStatus"/></label>
					</td>
				</tr>
				<tr>
					<td>
						<spring:message code="reporting.icd10CodingAccuracy" var="vicd10CodingAccuracy"/>
						<input type="checkbox" name="icd10CodingAccuracy" title="${vicd10CodingAccuracy}"> <label for="icd10CodingAccuracy"><spring:message code="reporting.icd10CodingAccuracy"/></label>
					</td>
				</tr>
				<tr>
					<td>
						<spring:message code="reporting.icd10CodingPatterns" var="vicd10CodingPatterns"/>
						<input type="checkbox" name="icd10CodingPatterns" title="${vicd10CodingPatterns}"> <label for="icd10CodingPatterns"><spring:message code="reporting.icd10CodingPatterns"/></label>
					</td>
				</tr>
			</table></td>

			<td><table>
				<tr>
					<td>
						<select name="selectedEntity">
						</select>
					</td>
				</tr>
				<tr>
					<td>
						<spring:message code="reporting.testingStatus" var="vtestingStatus"/>
						<input type="checkbox" name="testingStatus" title="${vtestingStatus}"> <label for="testingStatus"><spring:message code="reporting.testingStatus"/></label>
					</td>
				</tr>
				<tr>
					<td>
						<spring:message code="reporting.5010Compliance" var="v5010Compliance"/>
						<input type="checkbox" name="5010Compliance" title="${v5010Compliance}"> <label for="5010Compliance"><spring:message code="reporting.5010Compliance"/></label>
					</td>
				</tr>
				<tr>
					<td>
						<spring:message code="reporting.adjudicationRate" var="vadjudicationRate"/>
						<input type="checkbox" name="adjudicationRate" title="${vadjudicationRate}"> <label for="adjudicationRate"><spring:message code="reporting.adjudicationRate"/></label>
					</td>
				</tr>
				<tr>
					<td>
						<spring:message code="reporting.remittanceAccuracy" var="vremittanceAccuracy"/>
						<input type="checkbox" name="remittanceAccuracy" title="${vremittanceAccuracy}"> <label for="remittanceAccuracy"><spring:message code="reporting.remittanceAccuracy"/></label>
					</td>
				</tr>
			</table></td>


			<td><table>
				<tr>
					<td>
						<spring:message code="reporting.selectedReportsToDownload" var="vselectedReportsToDownload"/>
						<input type="text" name="selectedReportsToDownload" title="${vselectedReportsToDownload}">
					</td>
				</tr>
				<tr>
					<td>
						<spring:message code="reporting.icd10TestingProjectOverview" var="vicd10TestingProjectOverview"/>
						<input type="checkbox" name="icd10TestingProjectOverview" title="${vicd10TestingProjectOverview}"> <label for="icd10TestingProjectOverview"><spring:message code="reporting.icd10TestingProjectOverview"/></label>
					</td>
				</tr>
				<tr>
					<td>
						<spring:message code="reporting.icd10CodingRevision" var="vicd10CodingRevision"/>
						<input type="checkbox" name="icd10CodingRevision" title="${vicd10CodingRevision}"> <label for="icd10CodingRevision"><spring:message code="reporting.icd10CodingRevision"/></label>
					</td>
				</tr>
				<tr>
					<td>
						<spring:message code="reporting.adjudicationRate" var="vadjudicationRate"/>
						<input type="checkbox" name="adjudicationRate" title="${vadjudicationRate}"> <label for="adjudicationRate"><spring:message code="reporting.adjudicationRate"/></label>
					</td>
				</tr>
				<tr>
					<td>
						<spring:message code="reporting.remittanceAccuracy" var="vremittanceAccuracy"/>
						<input type="checkbox" name="remittanceAccuracy" title="${vremittanceAccuracy}"> <label for="remittanceAccuracy"><spring:message code="reporting.remittanceAccuracy"/></label>
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
					<spring:message code="reporting.currentTestingState" var="vcurrentTestingState"/>
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
					<button type="button"><spring:message code="reporting.csvBulkUpload"/></button>
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
	
	
</form>