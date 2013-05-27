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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.virtusa.icd.service.builder.service.http.MedicalRecordServiceSoap}.
 *
 * @author    Brian Wing Shun Chan
 * @see       com.virtusa.icd.service.builder.service.http.MedicalRecordServiceSoap
 * @generated
 */
public class MedicalRecordSoap implements Serializable {
	public static MedicalRecordSoap toSoapModel(MedicalRecord model) {
		MedicalRecordSoap soapModel = new MedicalRecordSoap();

		soapModel.setMrId(model.getMrId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setMrTestCaseName(model.getMrTestCaseName());
		soapModel.setMsDrg(model.getMsDrg());
		soapModel.setPatientType(model.getPatientType());
		soapModel.setPatientAge(model.getPatientAge());
		soapModel.setLos(model.getLos());
		soapModel.setAhrqCategoryCode(model.getAhrqCategoryCode());
		soapModel.setAhrqSubCategoryCode(model.getAhrqSubCategoryCode());
		soapModel.setMrTestCaseDescription(model.getMrTestCaseDescription());
		soapModel.setIcd9AdmittingDx(model.getIcd9AdmittingDx());
		soapModel.setIcd9PrincipalDx(model.getIcd9PrincipalDx());
		soapModel.setIcd9PrincipalProcedure(model.getIcd9PrincipalProcedure());
		soapModel.setOtherIcd9Dx1(model.getOtherIcd9Dx1());
		soapModel.setOtherIcd9Dx2(model.getOtherIcd9Dx2());
		soapModel.setOtherIcd9Dx3(model.getOtherIcd9Dx3());
		soapModel.setOtherIcd9Pcs1(model.getOtherIcd9Pcs1());
		soapModel.setOtherIcd9Pcs2(model.getOtherIcd9Pcs2());
		soapModel.setOtherIcd9Pcs3(model.getOtherIcd9Pcs3());
		soapModel.setIcd10AdmittingDx(model.getIcd10AdmittingDx());
		soapModel.setIcd10PrincipalDx(model.getIcd10PrincipalDx());
		soapModel.setIcd10PrincipalProcedure(model.getIcd10PrincipalProcedure());
		soapModel.setOtherIcd10Dx1(model.getOtherIcd10Dx1());
		soapModel.setOtherIcd10Dx2(model.getOtherIcd10Dx2());
		soapModel.setOtherIcd10Dx3(model.getOtherIcd10Dx3());
		soapModel.setOtherIcd10Pcs1(model.getOtherIcd10Pcs1());
		soapModel.setOtherIcd10Pcs2(model.getOtherIcd10Pcs2());
		soapModel.setOtherIcd10Pcs3(model.getOtherIcd10Pcs3());
		soapModel.setIsHistoryAndPsysical(model.getIsHistoryAndPsysical());
		soapModel.setIsDischargeNotes(model.getIsDischargeNotes());
		soapModel.setIsConsultations(model.getIsConsultations());
		soapModel.setIsOperatingNotes(model.getIsOperatingNotes());
		soapModel.setIsPhysicianNotes(model.getIsPhysicianNotes());
		soapModel.setIsRadiology(model.getIsRadiology());
		soapModel.setIsGiProcedures(model.getIsGiProcedures());
		soapModel.setIsEducationalNotes(model.getIsEducationalNotes());
		soapModel.setFile(model.getFile());

		return soapModel;
	}

	public static MedicalRecordSoap[] toSoapModels(MedicalRecord[] models) {
		MedicalRecordSoap[] soapModels = new MedicalRecordSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MedicalRecordSoap[][] toSoapModels(MedicalRecord[][] models) {
		MedicalRecordSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MedicalRecordSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MedicalRecordSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MedicalRecordSoap[] toSoapModels(List<MedicalRecord> models) {
		List<MedicalRecordSoap> soapModels = new ArrayList<MedicalRecordSoap>(models.size());

		for (MedicalRecord model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MedicalRecordSoap[soapModels.size()]);
	}

	public MedicalRecordSoap() {
	}

	public long getPrimaryKey() {
		return _mrId;
	}

	public void setPrimaryKey(long pk) {
		setMrId(pk);
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

	private long _mrId;
	private long _groupId;
	private long _companyId;
	private long _userId;
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
}