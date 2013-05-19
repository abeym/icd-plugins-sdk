<%@ include file="/WEB-INF/jsp/include.jsp" %>

<h1><spring:message code="mradmin.title"/></h1>


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
					<input type="text" name="mrTestCaseNum">
				</td></tr>
				<tr><td>
					<select name="mrDrgNum">
					</select>
				</td></tr>
				<tr><td>
					<select name="patientType">
					</select>
				</td></tr>
				<tr><td>
					<select name="los">
					</select>
				</td></tr>
				<tr><td>
					<select name="ahrqCategoryCode">
					</select>
				</td></tr>
				<tr><td>
					<select name="ahrqSubCategoryCode">
					</select>
				</td></tr>
				<tr><td>
					<textarea rows="3" cols="5" name="mrTestCaseDesc"></textarea>
				</td></tr>
			</table></td>
	
	
			<td><table>
				<tr><td>
					<select name="icd9AdmittingDxCode"></select>
				</td></tr>
				<tr><td>
					<select name="icd9PrincipalDxCode"></select>
				</td></tr>
				<tr><td>
					<select name="icd9PrincipalProcCode"></select>
				</td></tr>
				<tr><td>
					<select name="otherIcd9DxCode1"></select>
				</td></tr>
				<tr><td>
					<select name="otherIcd9DxCode2"></select>
				</td></tr>
				<tr><td>
					<select name="otherIcd9DxCode3"></select>
				</td></tr>
				<tr><td>
					<select name="otherIcd9PcsCode1"></select>
				</td></tr>
				<tr><td>
					<select name="otherIcd9PcsCode2"></select>
				</td></tr>
				<tr><td>
					<select name="otherIcd9PcsCode3"></select>
				</td></tr>
			</table></td>
	
			<td><table>
				<tr><td>
					<select name="icd10AdmittingDxCode"></select>
				</td></tr>
				<tr><td>
					<select name="icd10PrincipalDxCode"></select>
				</td></tr>
				<tr><td>
					<select name="icd10PrincipalProcCode"></select>
				</td></tr>
				<tr><td>
					<select name="otherIcd10DxCode1"></select>
				</td></tr>
				<tr><td>
					<select name="otherIcd10DxCode2"></select>
				</td></tr>
				<tr><td>
					<select name="otherIcd10DxCode3"></select>
				</td></tr>
				<tr><td>
					<select name="otherIcd10PcsCode1"></select>
				</td></tr>
				<tr><td>
					<select name="otherIcd10PcsCode2"></select>
				</td></tr>
				<tr><td>
					<select name="otherIcd10PcsCode3"></select>
				</td></tr>
			</table></td>
	


		</tr>

		<tr>
			<td><table>
				<tr><td>
					<input type="file" name="mrFile"/>
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
					<input type="checkbox" name="historyAndPhysical"> <label for="historyAndPhysical"><spring:message code="mradmin.historyAndPhysical"/></label>
				</td></tr>
				<tr><td>
					<input type="checkbox" name="dischargeNotes"> <label for="dischargeNotes"><spring:message code="mradmin.dischargeNotes"/></label>
				</td></tr>
				<tr><td>
					<input type="checkbox" name="consultations"> <label for="consultations"><spring:message code="mradmin.consultations"/></label>
				</td></tr>
				<tr><td>
					<input type="checkbox" name="operatingNotes"> <label for="operatingNotes"><spring:message code="mradmin.operatingNotes"/></label>
				</td></tr>
			</table></td>
	
			<td><table>
				<tr><td>
					<input type="checkbox" name="physicianNotes"> <label for="physicianNotes"><spring:message code="mradmin.physicianNotes"/></label>
				</td></tr>
				<tr><td>
					<input type="checkbox" name="radiology"> <label for="radiology"><spring:message code="mradmin.radiology"/></label>
				</td></tr>
				<tr><td>
					<input type="checkbox" name="giProcedures"> <label for="giProcedures"><spring:message code="mradmin.giProcedures"/></label>
				</td></tr>
				<tr><td>
					<input type="checkbox" name="educationalNotes"> <label for="educationalNotes"><spring:message code="mradmin.educationalNotes"/></label>
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