<%@ include file="/WEB-INF/jsp/include.jsp" %>

<h1><spring:message code="enrollment.title"/></h1>
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
				<tr><td>
					<select name="selectedEntityType">
						<c:forEach items="${entityTypes}" var="entityType">
							<option value="<c:out value="${entityType.key}"/>">
					    		<c:out value="${entityType.value} "/>
							</option>
						</c:forEach>
					</select>
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.organizationNPINum" var="vorganizationNPINum"/>
					<input type="text" name="organizationNPINum" title="${vorganizationNPINum}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.organizationName" var="vorganizationName"/>
					<input type="text" name="organizationName" title="${vorganizationName}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.organizationAddress1" var="vorganizationAddress1"/>
					<input type="text" name="organizationAddress1" title="${vorganizationAddress1}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.organizationAddress2" var="vorganizationAddress2"/>
					<input type="text" name="organizationAddress2" title="${vorganizationAddress2}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.organizationCity" var="vorganizationCity"/>
					<input type="text" name="organizationCity" title="${vorganizationCity}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.organizationPhone" var="vorganizationPhone"/>
					<input type="text" name="organizationPhone" title="${vorganizationPhone}">
				</td></tr>
			</table></td>
	
	
			<td><table>
				<tr><td>
					<select multiple="multiple" name="top5HealthPlansByRev"></select>
				</td></tr>
				<tr><td>
					<select multiple="multiple" name="clearinghouses"></select>
				</td></tr>
				<tr><td>
					<select multiple="multiple" name="ehrBillingVendors"></select>
				</td></tr>
				<tr><td>
					<select multiple="multiple" name="revCycleVendors"></select>
				</td></tr>
			</table></td>
	
			<td><table>
				<tr><td>
					<textarea rows="3" cols="5" name="top5DrgByRev"></textarea>
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.icd9Drg1" var="vicd9Drg1"/>
					<input type="text" name="icd9Drg1" title="${vicd9Drg1}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.icd9Drg2" var="vicd9Drg2"/>
					<input type="text" name="icd9Drg2" title="${vicd9Drg2}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.icd9Drg3" var="vicd9Drg3"/>
					<input type="text" name="icd9Drg3" title="${vicd9Drg3}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.icd9Drg4" var="vicd9Drg4"/>
					<input type="text" name="icd9Drg4" title="${vicd9Drg4}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.icd9Drg5" var="vicd9Drg5"/>
					<input type="text" name="icd9Drg5" title="${vicd9Drg5}">
				</td></tr>
			</table></td>
	
			<td><table>
				<tr><td>
					<textarea rows="3" cols="5" name="top5Icd9ByRev"></textarea>
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.icd9Dx1" var="vicd9Dx1"/>
					<input type="text" name="icd9Dx1" title="${vicd9Dx1}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.icd9Dx2" var="vicd9Dx2"/>
					<input type="text" name="icd9Dx2" title="${vicd9Dx2}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.icd9Dx3" var="vicd9Dx3"/>
					<input type="text" name="icd9Dx3" title="${vicd9Dx3}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.icd9Dx4" var="vicd9Dx4"/>
					<input type="text" name="icd9Dx4" title="${vicd9Dx4}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.icd9Dx5" var="vicd9Dx5"/>
					<input type="text" name="icd9Dx5" title="${vicd9Dx5}">
				</td></tr>

			</table></td>
		</tr>

		<tr>
			<td><table>
				<tr><td>
					<spring:message code="enrollment.primaryTestingContact" var="vprimaryTestingContact"/>
					<input type="text" name="primaryTestingContact" title="${vprimaryTestingContact}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.primaryTestingContactTitle" var="vprimaryTestingContactTitle"/>
					<input type="text" name="primaryTestingContactTitle" title="${vprimaryTestingContactTitle}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.primaryTestingContactPhone" var="vprimaryTestingContactPhone"/>
					<input type="text" name="primaryTestingContactPhone" title="${vprimaryTestingContactPhone}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.primaryTestingContactEmail" var="vprimaryTestingContactEmail"/>
					<input type="text" name="primaryTestingContactEmail" title="${vprimaryTestingContactEmail}">
				</td></tr>
			</table></td>
	
	
			<td><table>
				<tr><td>
					<spring:message code="enrollment.primaryCodingContact" var="vprimaryCodingContact"/>
					<input type="text" name="primaryCodingContact" title="${vprimaryCodingContact}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.primaryCodingContactTitle" var="vprimaryCodingContactTitle"/>
					<input type="text" name="primaryCodingContactTitle" title="${vprimaryCodingContactTitle}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.primaryCodingContactPhone" var="vprimaryCodingContactPhone"/>
					<input type="text" name="primaryCodingContactPhone" title="${vprimaryCodingContactPhone}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.primaryCodingContactEmail" var="vprimaryCodingContactEmail"/>
					<input type="text" name="primaryCodingContactEmail" title="${vprimaryCodingContactEmail}">
				</td></tr>
			</table></td>
	
			<td colspan="2"><table>
				<tr><td>
					<spring:message code="enrollment.primaryBillingContact" var="vprimaryBillingContact"/>
					<input type="text" name="primaryBillingContact" title="${vprimaryBillingContact}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.primaryBillingContactTitle" var="vprimaryBillingContactTitle"/>
					<input type="text" name="primaryBillingContactTitle" title="${vprimaryBillingContactTitle}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.primaryBillingContactPhone" var="vprimaryBillingContactPhone"/>
					<input type="text" name="primaryBillingContactPhone" title="${vprimaryBillingContactPhone}">
				</td></tr>
				<tr><td>
					<spring:message code="enrollment.primaryBillingContactEmail" var="vprimaryBillingContactEmail"/>
					<input type="text" name="primaryBillingContactEmail" title="${vprimaryBillingContactEmail}">
				</td></tr>
			</table></td>
		</tr>


		<tr>
			<td colspan="4"><table>
				<tr>
				<td>
					<spring:message code="enrollment.file" var="vfile"/>
					<input type="file" name="file" title="${vfile}"/>
					<button type="submit"><spring:message code="button.upload"/></button>
				</td>
				<td>
					<button type="button" ><spring:message code="button.submit"/></button>
				</td>
				<td>
					<button type="button"><spring:message code="button.faq"/></button>
				</td>
				</tr>
			</table></td>
		</tr>


	</table>
	
	
</form>