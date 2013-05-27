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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.virtusa.icd.service.builder.service.MedicalRecordLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class MedicalRecordClp extends BaseModelImpl<MedicalRecord>
	implements MedicalRecord {
	public MedicalRecordClp() {
	}

	public Class<?> getModelClass() {
		return MedicalRecord.class;
	}

	public String getModelClassName() {
		return MedicalRecord.class.getName();
	}

	public long getPrimaryKey() {
		return _mrId;
	}

	public void setPrimaryKey(long primaryKey) {
		setMrId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_mrId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
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

	@Override
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

	public long getMrId() {
		return _mrId;
	}

	public void setMrId(long mrId) {
		_mrId = mrId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getMrTestCaseName() {
		return _mrTestCaseName;
	}

	public void setMrTestCaseName(String mrTestCaseName) {
		_mrTestCaseName = mrTestCaseName;
	}

	public String getMsDrg() {
		return _msDrg;
	}

	public void setMsDrg(String msDrg) {
		_msDrg = msDrg;
	}

	public String getPatientType() {
		return _patientType;
	}

	public void setPatientType(String patientType) {
		_patientType = patientType;
	}

	public String getPatientAge() {
		return _patientAge;
	}

	public void setPatientAge(String patientAge) {
		_patientAge = patientAge;
	}

	public String getLos() {
		return _los;
	}

	public void setLos(String los) {
		_los = los;
	}

	public String getAhrqCategoryCode() {
		return _ahrqCategoryCode;
	}

	public void setAhrqCategoryCode(String ahrqCategoryCode) {
		_ahrqCategoryCode = ahrqCategoryCode;
	}

	public String getAhrqSubCategoryCode() {
		return _ahrqSubCategoryCode;
	}

	public void setAhrqSubCategoryCode(String ahrqSubCategoryCode) {
		_ahrqSubCategoryCode = ahrqSubCategoryCode;
	}

	public String getMrTestCaseDescription() {
		return _mrTestCaseDescription;
	}

	public void setMrTestCaseDescription(String mrTestCaseDescription) {
		_mrTestCaseDescription = mrTestCaseDescription;
	}

	public String getIcd9AdmittingDx() {
		return _icd9AdmittingDx;
	}

	public void setIcd9AdmittingDx(String icd9AdmittingDx) {
		_icd9AdmittingDx = icd9AdmittingDx;
	}

	public String getIcd9PrincipalDx() {
		return _icd9PrincipalDx;
	}

	public void setIcd9PrincipalDx(String icd9PrincipalDx) {
		_icd9PrincipalDx = icd9PrincipalDx;
	}

	public String getIcd9PrincipalProcedure() {
		return _icd9PrincipalProcedure;
	}

	public void setIcd9PrincipalProcedure(String icd9PrincipalProcedure) {
		_icd9PrincipalProcedure = icd9PrincipalProcedure;
	}

	public String getOtherIcd9Dx1() {
		return _otherIcd9Dx1;
	}

	public void setOtherIcd9Dx1(String otherIcd9Dx1) {
		_otherIcd9Dx1 = otherIcd9Dx1;
	}

	public String getOtherIcd9Dx2() {
		return _otherIcd9Dx2;
	}

	public void setOtherIcd9Dx2(String otherIcd9Dx2) {
		_otherIcd9Dx2 = otherIcd9Dx2;
	}

	public String getOtherIcd9Dx3() {
		return _otherIcd9Dx3;
	}

	public void setOtherIcd9Dx3(String otherIcd9Dx3) {
		_otherIcd9Dx3 = otherIcd9Dx3;
	}

	public String getOtherIcd9Pcs1() {
		return _otherIcd9Pcs1;
	}

	public void setOtherIcd9Pcs1(String otherIcd9Pcs1) {
		_otherIcd9Pcs1 = otherIcd9Pcs1;
	}

	public String getOtherIcd9Pcs2() {
		return _otherIcd9Pcs2;
	}

	public void setOtherIcd9Pcs2(String otherIcd9Pcs2) {
		_otherIcd9Pcs2 = otherIcd9Pcs2;
	}

	public String getOtherIcd9Pcs3() {
		return _otherIcd9Pcs3;
	}

	public void setOtherIcd9Pcs3(String otherIcd9Pcs3) {
		_otherIcd9Pcs3 = otherIcd9Pcs3;
	}

	public String getIcd10AdmittingDx() {
		return _icd10AdmittingDx;
	}

	public void setIcd10AdmittingDx(String icd10AdmittingDx) {
		_icd10AdmittingDx = icd10AdmittingDx;
	}

	public String getIcd10PrincipalDx() {
		return _icd10PrincipalDx;
	}

	public void setIcd10PrincipalDx(String icd10PrincipalDx) {
		_icd10PrincipalDx = icd10PrincipalDx;
	}

	public String getIcd10PrincipalProcedure() {
		return _icd10PrincipalProcedure;
	}

	public void setIcd10PrincipalProcedure(String icd10PrincipalProcedure) {
		_icd10PrincipalProcedure = icd10PrincipalProcedure;
	}

	public String getOtherIcd10Dx1() {
		return _otherIcd10Dx1;
	}

	public void setOtherIcd10Dx1(String otherIcd10Dx1) {
		_otherIcd10Dx1 = otherIcd10Dx1;
	}

	public String getOtherIcd10Dx2() {
		return _otherIcd10Dx2;
	}

	public void setOtherIcd10Dx2(String otherIcd10Dx2) {
		_otherIcd10Dx2 = otherIcd10Dx2;
	}

	public String getOtherIcd10Dx3() {
		return _otherIcd10Dx3;
	}

	public void setOtherIcd10Dx3(String otherIcd10Dx3) {
		_otherIcd10Dx3 = otherIcd10Dx3;
	}

	public String getOtherIcd10Pcs1() {
		return _otherIcd10Pcs1;
	}

	public void setOtherIcd10Pcs1(String otherIcd10Pcs1) {
		_otherIcd10Pcs1 = otherIcd10Pcs1;
	}

	public String getOtherIcd10Pcs2() {
		return _otherIcd10Pcs2;
	}

	public void setOtherIcd10Pcs2(String otherIcd10Pcs2) {
		_otherIcd10Pcs2 = otherIcd10Pcs2;
	}

	public String getOtherIcd10Pcs3() {
		return _otherIcd10Pcs3;
	}

	public void setOtherIcd10Pcs3(String otherIcd10Pcs3) {
		_otherIcd10Pcs3 = otherIcd10Pcs3;
	}

	public boolean getIsHistoryAndPsysical() {
		return _isHistoryAndPsysical;
	}

	public boolean isIsHistoryAndPsysical() {
		return _isHistoryAndPsysical;
	}

	public void setIsHistoryAndPsysical(boolean isHistoryAndPsysical) {
		_isHistoryAndPsysical = isHistoryAndPsysical;
	}

	public boolean getIsDischargeNotes() {
		return _isDischargeNotes;
	}

	public boolean isIsDischargeNotes() {
		return _isDischargeNotes;
	}

	public void setIsDischargeNotes(boolean isDischargeNotes) {
		_isDischargeNotes = isDischargeNotes;
	}

	public boolean getIsConsultations() {
		return _isConsultations;
	}

	public boolean isIsConsultations() {
		return _isConsultations;
	}

	public void setIsConsultations(boolean isConsultations) {
		_isConsultations = isConsultations;
	}

	public boolean getIsOperatingNotes() {
		return _isOperatingNotes;
	}

	public boolean isIsOperatingNotes() {
		return _isOperatingNotes;
	}

	public void setIsOperatingNotes(boolean isOperatingNotes) {
		_isOperatingNotes = isOperatingNotes;
	}

	public boolean getIsPhysicianNotes() {
		return _isPhysicianNotes;
	}

	public boolean isIsPhysicianNotes() {
		return _isPhysicianNotes;
	}

	public void setIsPhysicianNotes(boolean isPhysicianNotes) {
		_isPhysicianNotes = isPhysicianNotes;
	}

	public boolean getIsRadiology() {
		return _isRadiology;
	}

	public boolean isIsRadiology() {
		return _isRadiology;
	}

	public void setIsRadiology(boolean isRadiology) {
		_isRadiology = isRadiology;
	}

	public boolean getIsGiProcedures() {
		return _isGiProcedures;
	}

	public boolean isIsGiProcedures() {
		return _isGiProcedures;
	}

	public void setIsGiProcedures(boolean isGiProcedures) {
		_isGiProcedures = isGiProcedures;
	}

	public boolean getIsEducationalNotes() {
		return _isEducationalNotes;
	}

	public boolean isIsEducationalNotes() {
		return _isEducationalNotes;
	}

	public void setIsEducationalNotes(boolean isEducationalNotes) {
		_isEducationalNotes = isEducationalNotes;
	}

	public String getFile() {
		return _file;
	}

	public void setFile(String file) {
		_file = file;
	}

	public BaseModel<?> getMedicalRecordRemoteModel() {
		return _medicalRecordRemoteModel;
	}

	public void setMedicalRecordRemoteModel(
		BaseModel<?> medicalRecordRemoteModel) {
		_medicalRecordRemoteModel = medicalRecordRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			MedicalRecordLocalServiceUtil.addMedicalRecord(this);
		}
		else {
			MedicalRecordLocalServiceUtil.updateMedicalRecord(this);
		}
	}

	@Override
	public MedicalRecord toEscapedModel() {
		return (MedicalRecord)Proxy.newProxyInstance(MedicalRecord.class.getClassLoader(),
			new Class[] { MedicalRecord.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MedicalRecordClp clone = new MedicalRecordClp();

		clone.setMrId(getMrId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setMrTestCaseName(getMrTestCaseName());
		clone.setMsDrg(getMsDrg());
		clone.setPatientType(getPatientType());
		clone.setPatientAge(getPatientAge());
		clone.setLos(getLos());
		clone.setAhrqCategoryCode(getAhrqCategoryCode());
		clone.setAhrqSubCategoryCode(getAhrqSubCategoryCode());
		clone.setMrTestCaseDescription(getMrTestCaseDescription());
		clone.setIcd9AdmittingDx(getIcd9AdmittingDx());
		clone.setIcd9PrincipalDx(getIcd9PrincipalDx());
		clone.setIcd9PrincipalProcedure(getIcd9PrincipalProcedure());
		clone.setOtherIcd9Dx1(getOtherIcd9Dx1());
		clone.setOtherIcd9Dx2(getOtherIcd9Dx2());
		clone.setOtherIcd9Dx3(getOtherIcd9Dx3());
		clone.setOtherIcd9Pcs1(getOtherIcd9Pcs1());
		clone.setOtherIcd9Pcs2(getOtherIcd9Pcs2());
		clone.setOtherIcd9Pcs3(getOtherIcd9Pcs3());
		clone.setIcd10AdmittingDx(getIcd10AdmittingDx());
		clone.setIcd10PrincipalDx(getIcd10PrincipalDx());
		clone.setIcd10PrincipalProcedure(getIcd10PrincipalProcedure());
		clone.setOtherIcd10Dx1(getOtherIcd10Dx1());
		clone.setOtherIcd10Dx2(getOtherIcd10Dx2());
		clone.setOtherIcd10Dx3(getOtherIcd10Dx3());
		clone.setOtherIcd10Pcs1(getOtherIcd10Pcs1());
		clone.setOtherIcd10Pcs2(getOtherIcd10Pcs2());
		clone.setOtherIcd10Pcs3(getOtherIcd10Pcs3());
		clone.setIsHistoryAndPsysical(getIsHistoryAndPsysical());
		clone.setIsDischargeNotes(getIsDischargeNotes());
		clone.setIsConsultations(getIsConsultations());
		clone.setIsOperatingNotes(getIsOperatingNotes());
		clone.setIsPhysicianNotes(getIsPhysicianNotes());
		clone.setIsRadiology(getIsRadiology());
		clone.setIsGiProcedures(getIsGiProcedures());
		clone.setIsEducationalNotes(getIsEducationalNotes());
		clone.setFile(getFile());

		return clone;
	}

	public int compareTo(MedicalRecord medicalRecord) {
		long primaryKey = medicalRecord.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		MedicalRecordClp medicalRecord = null;

		try {
			medicalRecord = (MedicalRecordClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = medicalRecord.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(85);

		sb.append("{mrId=");
		sb.append(getMrId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", mrTestCaseName=");
		sb.append(getMrTestCaseName());
		sb.append(", msDrg=");
		sb.append(getMsDrg());
		sb.append(", patientType=");
		sb.append(getPatientType());
		sb.append(", patientAge=");
		sb.append(getPatientAge());
		sb.append(", los=");
		sb.append(getLos());
		sb.append(", ahrqCategoryCode=");
		sb.append(getAhrqCategoryCode());
		sb.append(", ahrqSubCategoryCode=");
		sb.append(getAhrqSubCategoryCode());
		sb.append(", mrTestCaseDescription=");
		sb.append(getMrTestCaseDescription());
		sb.append(", icd9AdmittingDx=");
		sb.append(getIcd9AdmittingDx());
		sb.append(", icd9PrincipalDx=");
		sb.append(getIcd9PrincipalDx());
		sb.append(", icd9PrincipalProcedure=");
		sb.append(getIcd9PrincipalProcedure());
		sb.append(", otherIcd9Dx1=");
		sb.append(getOtherIcd9Dx1());
		sb.append(", otherIcd9Dx2=");
		sb.append(getOtherIcd9Dx2());
		sb.append(", otherIcd9Dx3=");
		sb.append(getOtherIcd9Dx3());
		sb.append(", otherIcd9Pcs1=");
		sb.append(getOtherIcd9Pcs1());
		sb.append(", otherIcd9Pcs2=");
		sb.append(getOtherIcd9Pcs2());
		sb.append(", otherIcd9Pcs3=");
		sb.append(getOtherIcd9Pcs3());
		sb.append(", icd10AdmittingDx=");
		sb.append(getIcd10AdmittingDx());
		sb.append(", icd10PrincipalDx=");
		sb.append(getIcd10PrincipalDx());
		sb.append(", icd10PrincipalProcedure=");
		sb.append(getIcd10PrincipalProcedure());
		sb.append(", otherIcd10Dx1=");
		sb.append(getOtherIcd10Dx1());
		sb.append(", otherIcd10Dx2=");
		sb.append(getOtherIcd10Dx2());
		sb.append(", otherIcd10Dx3=");
		sb.append(getOtherIcd10Dx3());
		sb.append(", otherIcd10Pcs1=");
		sb.append(getOtherIcd10Pcs1());
		sb.append(", otherIcd10Pcs2=");
		sb.append(getOtherIcd10Pcs2());
		sb.append(", otherIcd10Pcs3=");
		sb.append(getOtherIcd10Pcs3());
		sb.append(", isHistoryAndPsysical=");
		sb.append(getIsHistoryAndPsysical());
		sb.append(", isDischargeNotes=");
		sb.append(getIsDischargeNotes());
		sb.append(", isConsultations=");
		sb.append(getIsConsultations());
		sb.append(", isOperatingNotes=");
		sb.append(getIsOperatingNotes());
		sb.append(", isPhysicianNotes=");
		sb.append(getIsPhysicianNotes());
		sb.append(", isRadiology=");
		sb.append(getIsRadiology());
		sb.append(", isGiProcedures=");
		sb.append(getIsGiProcedures());
		sb.append(", isEducationalNotes=");
		sb.append(getIsEducationalNotes());
		sb.append(", file=");
		sb.append(getFile());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(130);

		sb.append("<model><model-name>");
		sb.append("com.virtusa.icd.service.builder.model.MedicalRecord");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>mrId</column-name><column-value><![CDATA[");
		sb.append(getMrId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mrTestCaseName</column-name><column-value><![CDATA[");
		sb.append(getMrTestCaseName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>msDrg</column-name><column-value><![CDATA[");
		sb.append(getMsDrg());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>patientType</column-name><column-value><![CDATA[");
		sb.append(getPatientType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>patientAge</column-name><column-value><![CDATA[");
		sb.append(getPatientAge());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>los</column-name><column-value><![CDATA[");
		sb.append(getLos());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ahrqCategoryCode</column-name><column-value><![CDATA[");
		sb.append(getAhrqCategoryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ahrqSubCategoryCode</column-name><column-value><![CDATA[");
		sb.append(getAhrqSubCategoryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mrTestCaseDescription</column-name><column-value><![CDATA[");
		sb.append(getMrTestCaseDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd9AdmittingDx</column-name><column-value><![CDATA[");
		sb.append(getIcd9AdmittingDx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd9PrincipalDx</column-name><column-value><![CDATA[");
		sb.append(getIcd9PrincipalDx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd9PrincipalProcedure</column-name><column-value><![CDATA[");
		sb.append(getIcd9PrincipalProcedure());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherIcd9Dx1</column-name><column-value><![CDATA[");
		sb.append(getOtherIcd9Dx1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherIcd9Dx2</column-name><column-value><![CDATA[");
		sb.append(getOtherIcd9Dx2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherIcd9Dx3</column-name><column-value><![CDATA[");
		sb.append(getOtherIcd9Dx3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherIcd9Pcs1</column-name><column-value><![CDATA[");
		sb.append(getOtherIcd9Pcs1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherIcd9Pcs2</column-name><column-value><![CDATA[");
		sb.append(getOtherIcd9Pcs2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherIcd9Pcs3</column-name><column-value><![CDATA[");
		sb.append(getOtherIcd9Pcs3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd10AdmittingDx</column-name><column-value><![CDATA[");
		sb.append(getIcd10AdmittingDx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd10PrincipalDx</column-name><column-value><![CDATA[");
		sb.append(getIcd10PrincipalDx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd10PrincipalProcedure</column-name><column-value><![CDATA[");
		sb.append(getIcd10PrincipalProcedure());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherIcd10Dx1</column-name><column-value><![CDATA[");
		sb.append(getOtherIcd10Dx1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherIcd10Dx2</column-name><column-value><![CDATA[");
		sb.append(getOtherIcd10Dx2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherIcd10Dx3</column-name><column-value><![CDATA[");
		sb.append(getOtherIcd10Dx3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherIcd10Pcs1</column-name><column-value><![CDATA[");
		sb.append(getOtherIcd10Pcs1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherIcd10Pcs2</column-name><column-value><![CDATA[");
		sb.append(getOtherIcd10Pcs2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherIcd10Pcs3</column-name><column-value><![CDATA[");
		sb.append(getOtherIcd10Pcs3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isHistoryAndPsysical</column-name><column-value><![CDATA[");
		sb.append(getIsHistoryAndPsysical());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isDischargeNotes</column-name><column-value><![CDATA[");
		sb.append(getIsDischargeNotes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isConsultations</column-name><column-value><![CDATA[");
		sb.append(getIsConsultations());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isOperatingNotes</column-name><column-value><![CDATA[");
		sb.append(getIsOperatingNotes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isPhysicianNotes</column-name><column-value><![CDATA[");
		sb.append(getIsPhysicianNotes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isRadiology</column-name><column-value><![CDATA[");
		sb.append(getIsRadiology());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isGiProcedures</column-name><column-value><![CDATA[");
		sb.append(getIsGiProcedures());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isEducationalNotes</column-name><column-value><![CDATA[");
		sb.append(getIsEducationalNotes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>file</column-name><column-value><![CDATA[");
		sb.append(getFile());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _mrId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _mrTestCaseName;
	private String _msDrg;
	private String _patientType;
	private String _patientAge;
	private String _los;
	private String _ahrqCategoryCode;
	private String _ahrqSubCategoryCode;
	private String _mrTestCaseDescription;
	private String _icd9AdmittingDx;
	private String _icd9PrincipalDx;
	private String _icd9PrincipalProcedure;
	private String _otherIcd9Dx1;
	private String _otherIcd9Dx2;
	private String _otherIcd9Dx3;
	private String _otherIcd9Pcs1;
	private String _otherIcd9Pcs2;
	private String _otherIcd9Pcs3;
	private String _icd10AdmittingDx;
	private String _icd10PrincipalDx;
	private String _icd10PrincipalProcedure;
	private String _otherIcd10Dx1;
	private String _otherIcd10Dx2;
	private String _otherIcd10Dx3;
	private String _otherIcd10Pcs1;
	private String _otherIcd10Pcs2;
	private String _otherIcd10Pcs3;
	private boolean _isHistoryAndPsysical;
	private boolean _isDischargeNotes;
	private boolean _isConsultations;
	private boolean _isOperatingNotes;
	private boolean _isPhysicianNotes;
	private boolean _isRadiology;
	private boolean _isGiProcedures;
	private boolean _isEducationalNotes;
	private String _file;
	private BaseModel<?> _medicalRecordRemoteModel;
}