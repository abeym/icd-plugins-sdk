<%@ include file="/WEB-INF/jsp/include.jsp" %>

<h1><spring:message code="mradmin.title"/></h1>
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
					<spring:message code="mradmin.mrTestCaseNum" var="vmrTestCaseNum"/>
					<input type="text" name="mrTestCaseNum" title="${vmrTestCaseNum}">
				</td></tr>
				<tr><td>
					<select name="mrDrgNum">
							<c:forEach items="${msDrg}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="patientType">
							<c:forEach items="${patientType}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="patientAge">
							<c:forEach items="${patientAge}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="los">
							<c:forEach items="${los}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="ahrqCategoryCode">
							<c:forEach items="${ahrqCategoryCode}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="ahrqSubCategoryCode">
							<c:forEach items="${ahrqSubCategoryCode}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<textarea rows="3" cols="5" name="mrTestCaseDesc"></textarea>
				</td></tr>
			</table></td>
	
	
			<td><table>
				<tr><td>
					<select name="icd9AdmittingDxCode">
							<c:forEach items="${icd9AdmittingDx}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="icd9PrincipalDxCode">
							<c:forEach items="${icd9PrincipalDx}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="icd9PrincipalProcCode">
							<c:forEach items="${icd9PrincipalProcedure}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="otherIcd9DxCode1">
							<c:forEach items="${otherIcd9Dx}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="otherIcd9DxCode2">
							<c:forEach items="${otherIcd9Dx}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="otherIcd9DxCode3">
							<c:forEach items="${otherIcd9Dx}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="otherIcd9PcsCode1">
							<c:forEach items="${otherIcd9Pcs}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="otherIcd9PcsCode2">
							<c:forEach items="${otherIcd9Pcs}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="otherIcd9PcsCode3">
							<c:forEach items="${otherIcd9Pcs}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
			</table></td>
	
			<td><table>
				<tr><td>
					<select name="icd10AdmittingDxCode">
							<c:forEach items="${icd10AdmittingDx}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="icd10PrincipalDxCode">
							<c:forEach items="${icd10PrincipalDx}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="icd10PrincipalProcCode">
							<c:forEach items="${icd10PrincipalProcedure}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="otherIcd10DxCode1">
							<c:forEach items="${otherIcd10Dx}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="otherIcd10DxCode2">
							<c:forEach items="${otherIcd10Dx}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="otherIcd10DxCode3">
							<c:forEach items="${otherIcd10Dx}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="otherIcd10PcsCode1">
							<c:forEach items="${otherIcd10Pcs}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="otherIcd10PcsCode2">
							<c:forEach items="${otherIcd10Pcs}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
				<tr><td>
					<select name="otherIcd10PcsCode3">
							<c:forEach items="${otherIcd10Pcs}" var="refItem">
										<option value="<c:out value="${refItem.key}"/>">
											<c:out value="${refItem.value} " />
										</option>
							</c:forEach>	
					</select>
				</td></tr>
			</table></td>
	


		</tr>

		<tr>
			<td><table>
				<tr><td>
					<spring:message code="mradmin.mrFile" var="vmrFile"/>
					<input type="file" name="mrFile" title="${vmrFile}"/>
				</td></tr>
				<tr><td>
					<button type="submit"><spring:message code="mradmin.submitRecordToDatabase"/></button>
				</td></tr>
				<tr><td>
					<button type="submit"><spring:message code="mradmin.csvBulkUpload"/></button>
				</td></tr>
			</table></td>
	
	
			<td><table>
				<tr><td>
					<spring:message code="mradmin.historyAndPhysical" var="vhistoryAndPhysical"/>
					<input type="checkbox" name="historyAndPhysical" title="${vhistoryAndPhysical}"> <label for="historyAndPhysical"><spring:message code="mradmin.historyAndPhysical"/></label>
				</td></tr>
				<tr><td>
					<spring:message code="mradmin.dischargeNotes" var="vdischargeNotes"/>
					<input type="checkbox" name="dischargeNotes" title="${vdischargeNotes}"> <label for="dischargeNotes"><spring:message code="mradmin.dischargeNotes"/></label>
				</td></tr>
				<tr><td>
					<spring:message code="mradmin.consultations" var="vconsultations"/>
					<input type="checkbox" name="consultations" title="${vconsultations}"> <label for="consultations"><spring:message code="mradmin.consultations"/></label>
				</td></tr>
				<tr><td>
					<spring:message code="mradmin.operatingNotes" var="voperatingNotes"/>
					<input type="checkbox" name="operatingNotes" title="${voperatingNotes}"> <label for="operatingNotes"><spring:message code="mradmin.operatingNotes"/></label>
				</td></tr>
			</table></td>
	
			<td><table>
				<tr><td>
					<spring:message code="mradmin.physicianNotes" var="vphysicianNotes"/>
					<input type="checkbox" name="physicianNotes" title="${vphysicianNotes}"> <label for="physicianNotes"><spring:message code="mradmin.physicianNotes"/></label>
				</td></tr>
				<tr><td>
					<spring:message code="mradmin.radiology" var="vradiology"/>
					<input type="checkbox" name="radiology" title="${vradiology}"> <label for="radiology"><spring:message code="mradmin.radiology"/></label>
				</td></tr>
				<tr><td>
					<spring:message code="mradmin.giProcedures" var="vgiProcedures"/>
					<input type="checkbox" name="giProcedures" title="${vgiProcedures}"> <label for="giProcedures"><spring:message code="mradmin.giProcedures"/></label>
				</td></tr>
				<tr><td>
					<spring:message code="mradmin.educationalNotes" var="veducationalNotes"/>
					<input type="checkbox" name="educationalNotes" title="${veducationalNotes}"> <label for="educationalNotes"><spring:message code="mradmin.educationalNotes"/></label>
				</td></tr>
			</table></td>
		</tr>

		<tr>
			<td colspan="3"><table>
				<tr><td>
					<button type="button"><spring:message code="button.faq"/></button>
				</td></tr>
			</table></td>
		</tr>


	</table>
	
	
</form>