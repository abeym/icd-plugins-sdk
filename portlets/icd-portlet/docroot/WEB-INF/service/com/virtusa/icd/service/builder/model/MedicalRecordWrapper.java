/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.virtusa.icd.service.builder.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MedicalRecord}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       MedicalRecord
 * @generated
 */
public class MedicalRecordWrapper implements MedicalRecord,
	ModelWrapper<MedicalRecord> {
	public MedicalRecordWrapper(MedicalRecord medicalRecord) {
		_medicalRecord = medicalRecord;
	}

	public Class<?> getModelClass() {
		return MedicalRecord.class;
	}

	public String getModelClassName() {
		return MedicalRecord.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mrId", getMrId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("mrTestCaseName", getMrTestCaseName());
		attributes.put("msDrg", getMsDrg());
		attributes.put("patientType", getPatientType());
		attributes.put("patientAge", getPatientAge());
		attributes.put("los", getLos());
		attributes.put("ahrqCategoryCode", getAhrqCategoryCode());
		attributes.put("ahrqSubCategoryCode", getAhrqSubCategoryCode());
		attributes.put("mrTestCaseDescription", getMrTestCaseDescription());
		attributes.put("icd9AdmittingDx", getIcd9AdmittingDx());
		attributes.put("icd9PrincipalDx", getIcd9PrincipalDx());
		attributes.put("icd9PrincipalProcedure", getIcd9PrincipalProcedure());
		attributes.put("otherIcd9Dx1", getOtherIcd9Dx1());
		attributes.put("otherIcd9Dx2", getOtherIcd9Dx2());
		attributes.put("otherIcd9Dx3", getOtherIcd9Dx3());
		attributes.put("otherIcd9Pcs1", getOtherIcd9Pcs1());
		attributes.put("otherIcd9Pcs2", getOtherIcd9Pcs2());
		attributes.put("otherIcd9Pcs3", getOtherIcd9Pcs3());
		attributes.put("icd10AdmittingDx", getIcd10AdmittingDx());
		attributes.put("icd10PrincipalDx", getIcd10PrincipalDx());
		attributes.put("icd10PrincipalProcedure", getIcd10PrincipalProcedure());
		attributes.put("otherIcd10Dx1", getOtherIcd10Dx1());
		attributes.put("otherIcd10Dx2", getOtherIcd10Dx2());
		attributes.put("otherIcd10Dx3", getOtherIcd10Dx3());
		attributes.put("otherIcd10Pcs1", getOtherIcd10Pcs1());
		attributes.put("otherIcd10Pcs2", getOtherIcd10Pcs2());
		attributes.put("otherIcd10Pcs3", getOtherIcd10Pcs3());
		attributes.put("isHistoryAndPsysical", getIsHistoryAndPsysical());
		attributes.put("isDischargeNotes", getIsDischargeNotes());
		attributes.put("isConsultations", getIsConsultations());
		attributes.put("isOperatingNotes", getIsOperatingNotes());
		attributes.put("isPhysicianNotes", getIsPhysicianNotes());
		attributes.put("isRadiology", getIsRadiology());
		attributes.put("isGiProcedures", getIsGiProcedures());
		attributes.put("isEducationalNotes", getIsEducationalNotes());
		attributes.put("file", getFile());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long mrId = (Long)attributes.get("mrId");

		if (mrId != null) {
			setMrId(mrId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String mrTestCaseName = (String)attributes.get("mrTestCaseName");

		if (mrTestCaseName != null) {
			setMrTestCaseName(mrTestCaseName);
		}

		String msDrg = (String)attributes.get("msDrg");

		if (msDrg != null) {
			setMsDrg(msDrg);
		}

		String patientType = (String)attributes.get("patientType");

		if (patientType != null) {
			setPatientType(patientType);
		}

		String patientAge = (String)attributes.get("patientAge");

		if (patientAge != null) {
			setPatientAge(patientAge);
		}

		String los = (String)attributes.get("los");

		if (los != null) {
			setLos(los);
		}

		String ahrqCategoryCode = (String)attributes.get("ahrqCategoryCode");

		if (ahrqCategoryCode != null) {
			setAhrqCategoryCode(ahrqCategoryCode);
		}

		String ahrqSubCategoryCode = (String)attributes.get(
				"ahrqSubCategoryCode");

		if (ahrqSubCategoryCode != null) {
			setAhrqSubCategoryCode(ahrqSubCategoryCode);
		}

		String mrTestCaseDescription = (String)attributes.get(
				"mrTestCaseDescription");

		if (mrTestCaseDescription != null) {
			setMrTestCaseDescription(mrTestCaseDescription);
		}

		String icd9AdmittingDx = (String)attributes.get("icd9AdmittingDx");

		if (icd9AdmittingDx != null) {
			setIcd9AdmittingDx(icd9AdmittingDx);
		}

		String icd9PrincipalDx = (String)attributes.get("icd9PrincipalDx");

		if (icd9PrincipalDx != null) {
			setIcd9PrincipalDx(icd9PrincipalDx);
		}

		String icd9PrincipalProcedure = (String)attributes.get(
				"icd9PrincipalProcedure");

		if (icd9PrincipalProcedure != null) {
			setIcd9PrincipalProcedure(icd9PrincipalProcedure);
		}

		String otherIcd9Dx1 = (String)attributes.get("otherIcd9Dx1");

		if (otherIcd9Dx1 != null) {
			setOtherIcd9Dx1(otherIcd9Dx1);
		}

		String otherIcd9Dx2 = (String)attributes.get("otherIcd9Dx2");

		if (otherIcd9Dx2 != null) {
			setOtherIcd9Dx2(otherIcd9Dx2);
		}

		String otherIcd9Dx3 = (String)attributes.get("otherIcd9Dx3");

		if (otherIcd9Dx3 != null) {
			setOtherIcd9Dx3(otherIcd9Dx3);
		}

		String otherIcd9Pcs1 = (String)attributes.get("otherIcd9Pcs1");

		if (otherIcd9Pcs1 != null) {
			setOtherIcd9Pcs1(otherIcd9Pcs1);
		}

		String otherIcd9Pcs2 = (String)attributes.get("otherIcd9Pcs2");

		if (otherIcd9Pcs2 != null) {
			setOtherIcd9Pcs2(otherIcd9Pcs2);
		}

		String otherIcd9Pcs3 = (String)attributes.get("otherIcd9Pcs3");

		if (otherIcd9Pcs3 != null) {
			setOtherIcd9Pcs3(otherIcd9Pcs3);
		}

		String icd10AdmittingDx = (String)attributes.get("icd10AdmittingDx");

		if (icd10AdmittingDx != null) {
			setIcd10AdmittingDx(icd10AdmittingDx);
		}

		String icd10PrincipalDx = (String)attributes.get("icd10PrincipalDx");

		if (icd10PrincipalDx != null) {
			setIcd10PrincipalDx(icd10PrincipalDx);
		}

		String icd10PrincipalProcedure = (String)attributes.get(
				"icd10PrincipalProcedure");

		if (icd10PrincipalProcedure != null) {
			setIcd10PrincipalProcedure(icd10PrincipalProcedure);
		}

		String otherIcd10Dx1 = (String)attributes.get("otherIcd10Dx1");

		if (otherIcd10Dx1 != null) {
			setOtherIcd10Dx1(otherIcd10Dx1);
		}

		String otherIcd10Dx2 = (String)attributes.get("otherIcd10Dx2");

		if (otherIcd10Dx2 != null) {
			setOtherIcd10Dx2(otherIcd10Dx2);
		}

		String otherIcd10Dx3 = (String)attributes.get("otherIcd10Dx3");

		if (otherIcd10Dx3 != null) {
			setOtherIcd10Dx3(otherIcd10Dx3);
		}

		String otherIcd10Pcs1 = (String)attributes.get("otherIcd10Pcs1");

		if (otherIcd10Pcs1 != null) {
			setOtherIcd10Pcs1(otherIcd10Pcs1);
		}

		String otherIcd10Pcs2 = (String)attributes.get("otherIcd10Pcs2");

		if (otherIcd10Pcs2 != null) {
			setOtherIcd10Pcs2(otherIcd10Pcs2);
		}

		String otherIcd10Pcs3 = (String)attributes.get("otherIcd10Pcs3");

		if (otherIcd10Pcs3 != null) {
			setOtherIcd10Pcs3(otherIcd10Pcs3);
		}

		Boolean isHistoryAndPsysical = (Boolean)attributes.get(
				"isHistoryAndPsysical");

		if (isHistoryAndPsysical != null) {
			setIsHistoryAndPsysical(isHistoryAndPsysical);
		}

		Boolean isDischargeNotes = (Boolean)attributes.get("isDischargeNotes");

		if (isDischargeNotes != null) {
			setIsDischargeNotes(isDischargeNotes);
		}

		Boolean isConsultations = (Boolean)attributes.get("isConsultations");

		if (isConsultations != null) {
			setIsConsultations(isConsultations);
		}

		Boolean isOperatingNotes = (Boolean)attributes.get("isOperatingNotes");

		if (isOperatingNotes != null) {
			setIsOperatingNotes(isOperatingNotes);
		}

		Boolean isPhysicianNotes = (Boolean)attributes.get("isPhysicianNotes");

		if (isPhysicianNotes != null) {
			setIsPhysicianNotes(isPhysicianNotes);
		}

		Boolean isRadiology = (Boolean)attributes.get("isRadiology");

		if (isRadiology != null) {
			setIsRadiology(isRadiology);
		}

		Boolean isGiProcedures = (Boolean)attributes.get("isGiProcedures");

		if (isGiProcedures != null) {
			setIsGiProcedures(isGiProcedures);
		}

		Boolean isEducationalNotes = (Boolean)attributes.get(
				"isEducationalNotes");

		if (isEducationalNotes != null) {
			setIsEducationalNotes(isEducationalNotes);
		}

		String file = (String)attributes.get("file");

		if (file != null) {
			setFile(file);
		}
	}

	/**
	* Returns the primary key of this medical record.
	*
	* @return the primary key of this medical record
	*/
	public long getPrimaryKey() {
		return _medicalRecord.getPrimaryKey();
	}

	/**
	* Sets the primary key of this medical record.
	*
	* @param primaryKey the primary key of this medical record
	*/
	public void setPrimaryKey(long primaryKey) {
		_medicalRecord.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the mr ID of this medical record.
	*
	* @return the mr ID of this medical record
	*/
	public long getMrId() {
		return _medicalRecord.getMrId();
	}

	/**
	* Sets the mr ID of this medical record.
	*
	* @param mrId the mr ID of this medical record
	*/
	public void setMrId(long mrId) {
		_medicalRecord.setMrId(mrId);
	}

	/**
	* Returns the group ID of this medical record.
	*
	* @return the group ID of this medical record
	*/
	public long getGroupId() {
		return _medicalRecord.getGroupId();
	}

	/**
	* Sets the group ID of this medical record.
	*
	* @param groupId the group ID of this medical record
	*/
	public void setGroupId(long groupId) {
		_medicalRecord.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this medical record.
	*
	* @return the company ID of this medical record
	*/
	public long getCompanyId() {
		return _medicalRecord.getCompanyId();
	}

	/**
	* Sets the company ID of this medical record.
	*
	* @param companyId the company ID of this medical record
	*/
	public void setCompanyId(long companyId) {
		_medicalRecord.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this medical record.
	*
	* @return the user ID of this medical record
	*/
	public long getUserId() {
		return _medicalRecord.getUserId();
	}

	/**
	* Sets the user ID of this medical record.
	*
	* @param userId the user ID of this medical record
	*/
	public void setUserId(long userId) {
		_medicalRecord.setUserId(userId);
	}

	/**
	* Returns the user uuid of this medical record.
	*
	* @return the user uuid of this medical record
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _medicalRecord.getUserUuid();
	}

	/**
	* Sets the user uuid of this medical record.
	*
	* @param userUuid the user uuid of this medical record
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_medicalRecord.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this medical record.
	*
	* @return the user name of this medical record
	*/
	public java.lang.String getUserName() {
		return _medicalRecord.getUserName();
	}

	/**
	* Sets the user name of this medical record.
	*
	* @param userName the user name of this medical record
	*/
	public void setUserName(java.lang.String userName) {
		_medicalRecord.setUserName(userName);
	}

	/**
	* Returns the create date of this medical record.
	*
	* @return the create date of this medical record
	*/
	public java.util.Date getCreateDate() {
		return _medicalRecord.getCreateDate();
	}

	/**
	* Sets the create date of this medical record.
	*
	* @param createDate the create date of this medical record
	*/
	public void setCreateDate(java.util.Date createDate) {
		_medicalRecord.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this medical record.
	*
	* @return the modified date of this medical record
	*/
	public java.util.Date getModifiedDate() {
		return _medicalRecord.getModifiedDate();
	}

	/**
	* Sets the modified date of this medical record.
	*
	* @param modifiedDate the modified date of this medical record
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_medicalRecord.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the mr test case name of this medical record.
	*
	* @return the mr test case name of this medical record
	*/
	public java.lang.String getMrTestCaseName() {
		return _medicalRecord.getMrTestCaseName();
	}

	/**
	* Sets the mr test case name of this medical record.
	*
	* @param mrTestCaseName the mr test case name of this medical record
	*/
	public void setMrTestCaseName(java.lang.String mrTestCaseName) {
		_medicalRecord.setMrTestCaseName(mrTestCaseName);
	}

	/**
	* Returns the ms drg of this medical record.
	*
	* @return the ms drg of this medical record
	*/
	public java.lang.String getMsDrg() {
		return _medicalRecord.getMsDrg();
	}

	/**
	* Sets the ms drg of this medical record.
	*
	* @param msDrg the ms drg of this medical record
	*/
	public void setMsDrg(java.lang.String msDrg) {
		_medicalRecord.setMsDrg(msDrg);
	}

	/**
	* Returns the patient type of this medical record.
	*
	* @return the patient type of this medical record
	*/
	public java.lang.String getPatientType() {
		return _medicalRecord.getPatientType();
	}

	/**
	* Sets the patient type of this medical record.
	*
	* @param patientType the patient type of this medical record
	*/
	public void setPatientType(java.lang.String patientType) {
		_medicalRecord.setPatientType(patientType);
	}

	/**
	* Returns the patient age of this medical record.
	*
	* @return the patient age of this medical record
	*/
	public java.lang.String getPatientAge() {
		return _medicalRecord.getPatientAge();
	}

	/**
	* Sets the patient age of this medical record.
	*
	* @param patientAge the patient age of this medical record
	*/
	public void setPatientAge(java.lang.String patientAge) {
		_medicalRecord.setPatientAge(patientAge);
	}

	/**
	* Returns the los of this medical record.
	*
	* @return the los of this medical record
	*/
	public java.lang.String getLos() {
		return _medicalRecord.getLos();
	}

	/**
	* Sets the los of this medical record.
	*
	* @param los the los of this medical record
	*/
	public void setLos(java.lang.String los) {
		_medicalRecord.setLos(los);
	}

	/**
	* Returns the ahrq category code of this medical record.
	*
	* @return the ahrq category code of this medical record
	*/
	public java.lang.String getAhrqCategoryCode() {
		return _medicalRecord.getAhrqCategoryCode();
	}

	/**
	* Sets the ahrq category code of this medical record.
	*
	* @param ahrqCategoryCode the ahrq category code of this medical record
	*/
	public void setAhrqCategoryCode(java.lang.String ahrqCategoryCode) {
		_medicalRecord.setAhrqCategoryCode(ahrqCategoryCode);
	}

	/**
	* Returns the ahrq sub category code of this medical record.
	*
	* @return the ahrq sub category code of this medical record
	*/
	public java.lang.String getAhrqSubCategoryCode() {
		return _medicalRecord.getAhrqSubCategoryCode();
	}

	/**
	* Sets the ahrq sub category code of this medical record.
	*
	* @param ahrqSubCategoryCode the ahrq sub category code of this medical record
	*/
	public void setAhrqSubCategoryCode(java.lang.String ahrqSubCategoryCode) {
		_medicalRecord.setAhrqSubCategoryCode(ahrqSubCategoryCode);
	}

	/**
	* Returns the mr test case description of this medical record.
	*
	* @return the mr test case description of this medical record
	*/
	public java.lang.String getMrTestCaseDescription() {
		return _medicalRecord.getMrTestCaseDescription();
	}

	/**
	* Sets the mr test case description of this medical record.
	*
	* @param mrTestCaseDescription the mr test case description of this medical record
	*/
	public void setMrTestCaseDescription(java.lang.String mrTestCaseDescription) {
		_medicalRecord.setMrTestCaseDescription(mrTestCaseDescription);
	}

	/**
	* Returns the icd9 admitting dx of this medical record.
	*
	* @return the icd9 admitting dx of this medical record
	*/
	public java.lang.String getIcd9AdmittingDx() {
		return _medicalRecord.getIcd9AdmittingDx();
	}

	/**
	* Sets the icd9 admitting dx of this medical record.
	*
	* @param icd9AdmittingDx the icd9 admitting dx of this medical record
	*/
	public void setIcd9AdmittingDx(java.lang.String icd9AdmittingDx) {
		_medicalRecord.setIcd9AdmittingDx(icd9AdmittingDx);
	}

	/**
	* Returns the icd9 principal dx of this medical record.
	*
	* @return the icd9 principal dx of this medical record
	*/
	public java.lang.String getIcd9PrincipalDx() {
		return _medicalRecord.getIcd9PrincipalDx();
	}

	/**
	* Sets the icd9 principal dx of this medical record.
	*
	* @param icd9PrincipalDx the icd9 principal dx of this medical record
	*/
	public void setIcd9PrincipalDx(java.lang.String icd9PrincipalDx) {
		_medicalRecord.setIcd9PrincipalDx(icd9PrincipalDx);
	}

	/**
	* Returns the icd9 principal procedure of this medical record.
	*
	* @return the icd9 principal procedure of this medical record
	*/
	public java.lang.String getIcd9PrincipalProcedure() {
		return _medicalRecord.getIcd9PrincipalProcedure();
	}

	/**
	* Sets the icd9 principal procedure of this medical record.
	*
	* @param icd9PrincipalProcedure the icd9 principal procedure of this medical record
	*/
	public void setIcd9PrincipalProcedure(
		java.lang.String icd9PrincipalProcedure) {
		_medicalRecord.setIcd9PrincipalProcedure(icd9PrincipalProcedure);
	}

	/**
	* Returns the other icd9 dx1 of this medical record.
	*
	* @return the other icd9 dx1 of this medical record
	*/
	public java.lang.String getOtherIcd9Dx1() {
		return _medicalRecord.getOtherIcd9Dx1();
	}

	/**
	* Sets the other icd9 dx1 of this medical record.
	*
	* @param otherIcd9Dx1 the other icd9 dx1 of this medical record
	*/
	public void setOtherIcd9Dx1(java.lang.String otherIcd9Dx1) {
		_medicalRecord.setOtherIcd9Dx1(otherIcd9Dx1);
	}

	/**
	* Returns the other icd9 dx2 of this medical record.
	*
	* @return the other icd9 dx2 of this medical record
	*/
	public java.lang.String getOtherIcd9Dx2() {
		return _medicalRecord.getOtherIcd9Dx2();
	}

	/**
	* Sets the other icd9 dx2 of this medical record.
	*
	* @param otherIcd9Dx2 the other icd9 dx2 of this medical record
	*/
	public void setOtherIcd9Dx2(java.lang.String otherIcd9Dx2) {
		_medicalRecord.setOtherIcd9Dx2(otherIcd9Dx2);
	}

	/**
	* Returns the other icd9 dx3 of this medical record.
	*
	* @return the other icd9 dx3 of this medical record
	*/
	public java.lang.String getOtherIcd9Dx3() {
		return _medicalRecord.getOtherIcd9Dx3();
	}

	/**
	* Sets the other icd9 dx3 of this medical record.
	*
	* @param otherIcd9Dx3 the other icd9 dx3 of this medical record
	*/
	public void setOtherIcd9Dx3(java.lang.String otherIcd9Dx3) {
		_medicalRecord.setOtherIcd9Dx3(otherIcd9Dx3);
	}

	/**
	* Returns the other icd9 pcs1 of this medical record.
	*
	* @return the other icd9 pcs1 of this medical record
	*/
	public java.lang.String getOtherIcd9Pcs1() {
		return _medicalRecord.getOtherIcd9Pcs1();
	}

	/**
	* Sets the other icd9 pcs1 of this medical record.
	*
	* @param otherIcd9Pcs1 the other icd9 pcs1 of this medical record
	*/
	public void setOtherIcd9Pcs1(java.lang.String otherIcd9Pcs1) {
		_medicalRecord.setOtherIcd9Pcs1(otherIcd9Pcs1);
	}

	/**
	* Returns the other icd9 pcs2 of this medical record.
	*
	* @return the other icd9 pcs2 of this medical record
	*/
	public java.lang.String getOtherIcd9Pcs2() {
		return _medicalRecord.getOtherIcd9Pcs2();
	}

	/**
	* Sets the other icd9 pcs2 of this medical record.
	*
	* @param otherIcd9Pcs2 the other icd9 pcs2 of this medical record
	*/
	public void setOtherIcd9Pcs2(java.lang.String otherIcd9Pcs2) {
		_medicalRecord.setOtherIcd9Pcs2(otherIcd9Pcs2);
	}

	/**
	* Returns the other icd9 pcs3 of this medical record.
	*
	* @return the other icd9 pcs3 of this medical record
	*/
	public java.lang.String getOtherIcd9Pcs3() {
		return _medicalRecord.getOtherIcd9Pcs3();
	}

	/**
	* Sets the other icd9 pcs3 of this medical record.
	*
	* @param otherIcd9Pcs3 the other icd9 pcs3 of this medical record
	*/
	public void setOtherIcd9Pcs3(java.lang.String otherIcd9Pcs3) {
		_medicalRecord.setOtherIcd9Pcs3(otherIcd9Pcs3);
	}

	/**
	* Returns the icd10 admitting dx of this medical record.
	*
	* @return the icd10 admitting dx of this medical record
	*/
	public java.lang.String getIcd10AdmittingDx() {
		return _medicalRecord.getIcd10AdmittingDx();
	}

	/**
	* Sets the icd10 admitting dx of this medical record.
	*
	* @param icd10AdmittingDx the icd10 admitting dx of this medical record
	*/
	public void setIcd10AdmittingDx(java.lang.String icd10AdmittingDx) {
		_medicalRecord.setIcd10AdmittingDx(icd10AdmittingDx);
	}

	/**
	* Returns the icd10 principal dx of this medical record.
	*
	* @return the icd10 principal dx of this medical record
	*/
	public java.lang.String getIcd10PrincipalDx() {
		return _medicalRecord.getIcd10PrincipalDx();
	}

	/**
	* Sets the icd10 principal dx of this medical record.
	*
	* @param icd10PrincipalDx the icd10 principal dx of this medical record
	*/
	public void setIcd10PrincipalDx(java.lang.String icd10PrincipalDx) {
		_medicalRecord.setIcd10PrincipalDx(icd10PrincipalDx);
	}

	/**
	* Returns the icd10 principal procedure of this medical record.
	*
	* @return the icd10 principal procedure of this medical record
	*/
	public java.lang.String getIcd10PrincipalProcedure() {
		return _medicalRecord.getIcd10PrincipalProcedure();
	}

	/**
	* Sets the icd10 principal procedure of this medical record.
	*
	* @param icd10PrincipalProcedure the icd10 principal procedure of this medical record
	*/
	public void setIcd10PrincipalProcedure(
		java.lang.String icd10PrincipalProcedure) {
		_medicalRecord.setIcd10PrincipalProcedure(icd10PrincipalProcedure);
	}

	/**
	* Returns the other icd10 dx1 of this medical record.
	*
	* @return the other icd10 dx1 of this medical record
	*/
	public java.lang.String getOtherIcd10Dx1() {
		return _medicalRecord.getOtherIcd10Dx1();
	}

	/**
	* Sets the other icd10 dx1 of this medical record.
	*
	* @param otherIcd10Dx1 the other icd10 dx1 of this medical record
	*/
	public void setOtherIcd10Dx1(java.lang.String otherIcd10Dx1) {
		_medicalRecord.setOtherIcd10Dx1(otherIcd10Dx1);
	}

	/**
	* Returns the other icd10 dx2 of this medical record.
	*
	* @return the other icd10 dx2 of this medical record
	*/
	public java.lang.String getOtherIcd10Dx2() {
		return _medicalRecord.getOtherIcd10Dx2();
	}

	/**
	* Sets the other icd10 dx2 of this medical record.
	*
	* @param otherIcd10Dx2 the other icd10 dx2 of this medical record
	*/
	public void setOtherIcd10Dx2(java.lang.String otherIcd10Dx2) {
		_medicalRecord.setOtherIcd10Dx2(otherIcd10Dx2);
	}

	/**
	* Returns the other icd10 dx3 of this medical record.
	*
	* @return the other icd10 dx3 of this medical record
	*/
	public java.lang.String getOtherIcd10Dx3() {
		return _medicalRecord.getOtherIcd10Dx3();
	}

	/**
	* Sets the other icd10 dx3 of this medical record.
	*
	* @param otherIcd10Dx3 the other icd10 dx3 of this medical record
	*/
	public void setOtherIcd10Dx3(java.lang.String otherIcd10Dx3) {
		_medicalRecord.setOtherIcd10Dx3(otherIcd10Dx3);
	}

	/**
	* Returns the other icd10 pcs1 of this medical record.
	*
	* @return the other icd10 pcs1 of this medical record
	*/
	public java.lang.String getOtherIcd10Pcs1() {
		return _medicalRecord.getOtherIcd10Pcs1();
	}

	/**
	* Sets the other icd10 pcs1 of this medical record.
	*
	* @param otherIcd10Pcs1 the other icd10 pcs1 of this medical record
	*/
	public void setOtherIcd10Pcs1(java.lang.String otherIcd10Pcs1) {
		_medicalRecord.setOtherIcd10Pcs1(otherIcd10Pcs1);
	}

	/**
	* Returns the other icd10 pcs2 of this medical record.
	*
	* @return the other icd10 pcs2 of this medical record
	*/
	public java.lang.String getOtherIcd10Pcs2() {
		return _medicalRecord.getOtherIcd10Pcs2();
	}

	/**
	* Sets the other icd10 pcs2 of this medical record.
	*
	* @param otherIcd10Pcs2 the other icd10 pcs2 of this medical record
	*/
	public void setOtherIcd10Pcs2(java.lang.String otherIcd10Pcs2) {
		_medicalRecord.setOtherIcd10Pcs2(otherIcd10Pcs2);
	}

	/**
	* Returns the other icd10 pcs3 of this medical record.
	*
	* @return the other icd10 pcs3 of this medical record
	*/
	public java.lang.String getOtherIcd10Pcs3() {
		return _medicalRecord.getOtherIcd10Pcs3();
	}

	/**
	* Sets the other icd10 pcs3 of this medical record.
	*
	* @param otherIcd10Pcs3 the other icd10 pcs3 of this medical record
	*/
	public void setOtherIcd10Pcs3(java.lang.String otherIcd10Pcs3) {
		_medicalRecord.setOtherIcd10Pcs3(otherIcd10Pcs3);
	}

	/**
	* Returns the is history and psysical of this medical record.
	*
	* @return the is history and psysical of this medical record
	*/
	public boolean getIsHistoryAndPsysical() {
		return _medicalRecord.getIsHistoryAndPsysical();
	}

	/**
	* Returns <code>true</code> if this medical record is is history and psysical.
	*
	* @return <code>true</code> if this medical record is is history and psysical; <code>false</code> otherwise
	*/
	public boolean isIsHistoryAndPsysical() {
		return _medicalRecord.isIsHistoryAndPsysical();
	}

	/**
	* Sets whether this medical record is is history and psysical.
	*
	* @param isHistoryAndPsysical the is history and psysical of this medical record
	*/
	public void setIsHistoryAndPsysical(boolean isHistoryAndPsysical) {
		_medicalRecord.setIsHistoryAndPsysical(isHistoryAndPsysical);
	}

	/**
	* Returns the is discharge notes of this medical record.
	*
	* @return the is discharge notes of this medical record
	*/
	public boolean getIsDischargeNotes() {
		return _medicalRecord.getIsDischargeNotes();
	}

	/**
	* Returns <code>true</code> if this medical record is is discharge notes.
	*
	* @return <code>true</code> if this medical record is is discharge notes; <code>false</code> otherwise
	*/
	public boolean isIsDischargeNotes() {
		return _medicalRecord.isIsDischargeNotes();
	}

	/**
	* Sets whether this medical record is is discharge notes.
	*
	* @param isDischargeNotes the is discharge notes of this medical record
	*/
	public void setIsDischargeNotes(boolean isDischargeNotes) {
		_medicalRecord.setIsDischargeNotes(isDischargeNotes);
	}

	/**
	* Returns the is consultations of this medical record.
	*
	* @return the is consultations of this medical record
	*/
	public boolean getIsConsultations() {
		return _medicalRecord.getIsConsultations();
	}

	/**
	* Returns <code>true</code> if this medical record is is consultations.
	*
	* @return <code>true</code> if this medical record is is consultations; <code>false</code> otherwise
	*/
	public boolean isIsConsultations() {
		return _medicalRecord.isIsConsultations();
	}

	/**
	* Sets whether this medical record is is consultations.
	*
	* @param isConsultations the is consultations of this medical record
	*/
	public void setIsConsultations(boolean isConsultations) {
		_medicalRecord.setIsConsultations(isConsultations);
	}

	/**
	* Returns the is operating notes of this medical record.
	*
	* @return the is operating notes of this medical record
	*/
	public boolean getIsOperatingNotes() {
		return _medicalRecord.getIsOperatingNotes();
	}

	/**
	* Returns <code>true</code> if this medical record is is operating notes.
	*
	* @return <code>true</code> if this medical record is is operating notes; <code>false</code> otherwise
	*/
	public boolean isIsOperatingNotes() {
		return _medicalRecord.isIsOperatingNotes();
	}

	/**
	* Sets whether this medical record is is operating notes.
	*
	* @param isOperatingNotes the is operating notes of this medical record
	*/
	public void setIsOperatingNotes(boolean isOperatingNotes) {
		_medicalRecord.setIsOperatingNotes(isOperatingNotes);
	}

	/**
	* Returns the is physician notes of this medical record.
	*
	* @return the is physician notes of this medical record
	*/
	public boolean getIsPhysicianNotes() {
		return _medicalRecord.getIsPhysicianNotes();
	}

	/**
	* Returns <code>true</code> if this medical record is is physician notes.
	*
	* @return <code>true</code> if this medical record is is physician notes; <code>false</code> otherwise
	*/
	public boolean isIsPhysicianNotes() {
		return _medicalRecord.isIsPhysicianNotes();
	}

	/**
	* Sets whether this medical record is is physician notes.
	*
	* @param isPhysicianNotes the is physician notes of this medical record
	*/
	public void setIsPhysicianNotes(boolean isPhysicianNotes) {
		_medicalRecord.setIsPhysicianNotes(isPhysicianNotes);
	}

	/**
	* Returns the is radiology of this medical record.
	*
	* @return the is radiology of this medical record
	*/
	public boolean getIsRadiology() {
		return _medicalRecord.getIsRadiology();
	}

	/**
	* Returns <code>true</code> if this medical record is is radiology.
	*
	* @return <code>true</code> if this medical record is is radiology; <code>false</code> otherwise
	*/
	public boolean isIsRadiology() {
		return _medicalRecord.isIsRadiology();
	}

	/**
	* Sets whether this medical record is is radiology.
	*
	* @param isRadiology the is radiology of this medical record
	*/
	public void setIsRadiology(boolean isRadiology) {
		_medicalRecord.setIsRadiology(isRadiology);
	}

	/**
	* Returns the is gi procedures of this medical record.
	*
	* @return the is gi procedures of this medical record
	*/
	public boolean getIsGiProcedures() {
		return _medicalRecord.getIsGiProcedures();
	}

	/**
	* Returns <code>true</code> if this medical record is is gi procedures.
	*
	* @return <code>true</code> if this medical record is is gi procedures; <code>false</code> otherwise
	*/
	public boolean isIsGiProcedures() {
		return _medicalRecord.isIsGiProcedures();
	}

	/**
	* Sets whether this medical record is is gi procedures.
	*
	* @param isGiProcedures the is gi procedures of this medical record
	*/
	public void setIsGiProcedures(boolean isGiProcedures) {
		_medicalRecord.setIsGiProcedures(isGiProcedures);
	}

	/**
	* Returns the is educational notes of this medical record.
	*
	* @return the is educational notes of this medical record
	*/
	public boolean getIsEducationalNotes() {
		return _medicalRecord.getIsEducationalNotes();
	}

	/**
	* Returns <code>true</code> if this medical record is is educational notes.
	*
	* @return <code>true</code> if this medical record is is educational notes; <code>false</code> otherwise
	*/
	public boolean isIsEducationalNotes() {
		return _medicalRecord.isIsEducationalNotes();
	}

	/**
	* Sets whether this medical record is is educational notes.
	*
	* @param isEducationalNotes the is educational notes of this medical record
	*/
	public void setIsEducationalNotes(boolean isEducationalNotes) {
		_medicalRecord.setIsEducationalNotes(isEducationalNotes);
	}

	/**
	* Returns the file of this medical record.
	*
	* @return the file of this medical record
	*/
	public java.lang.String getFile() {
		return _medicalRecord.getFile();
	}

	/**
	* Sets the file of this medical record.
	*
	* @param file the file of this medical record
	*/
	public void setFile(java.lang.String file) {
		_medicalRecord.setFile(file);
	}

	public boolean isNew() {
		return _medicalRecord.isNew();
	}

	public void setNew(boolean n) {
		_medicalRecord.setNew(n);
	}

	public boolean isCachedModel() {
		return _medicalRecord.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_medicalRecord.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _medicalRecord.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _medicalRecord.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_medicalRecord.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _medicalRecord.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_medicalRecord.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MedicalRecordWrapper((MedicalRecord)_medicalRecord.clone());
	}

	public int compareTo(
		com.virtusa.icd.service.builder.model.MedicalRecord medicalRecord) {
		return _medicalRecord.compareTo(medicalRecord);
	}

	@Override
	public int hashCode() {
		return _medicalRecord.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.virtusa.icd.service.builder.model.MedicalRecord> toCacheModel() {
		return _medicalRecord.toCacheModel();
	}

	public com.virtusa.icd.service.builder.model.MedicalRecord toEscapedModel() {
		return new MedicalRecordWrapper(_medicalRecord.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _medicalRecord.toString();
	}

	public java.lang.String toXmlString() {
		return _medicalRecord.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_medicalRecord.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public MedicalRecord getWrappedMedicalRecord() {
		return _medicalRecord;
	}

	public MedicalRecord getWrappedModel() {
		return _medicalRecord;
	}

	public void resetOriginalValues() {
		_medicalRecord.resetOriginalValues();
	}

	private MedicalRecord _medicalRecord;
}