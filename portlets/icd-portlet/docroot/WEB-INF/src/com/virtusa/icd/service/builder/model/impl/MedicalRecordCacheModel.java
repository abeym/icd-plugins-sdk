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

package com.virtusa.icd.service.builder.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.virtusa.icd.service.builder.model.MedicalRecord;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing MedicalRecord in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalRecord
 * @generated
 */
public class MedicalRecordCacheModel implements CacheModel<MedicalRecord>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(85);

		sb.append("{mrId=");
		sb.append(mrId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", mrTestCaseName=");
		sb.append(mrTestCaseName);
		sb.append(", msDrg=");
		sb.append(msDrg);
		sb.append(", patientType=");
		sb.append(patientType);
		sb.append(", patientAge=");
		sb.append(patientAge);
		sb.append(", los=");
		sb.append(los);
		sb.append(", ahrqCategoryCode=");
		sb.append(ahrqCategoryCode);
		sb.append(", ahrqSubCategoryCode=");
		sb.append(ahrqSubCategoryCode);
		sb.append(", mrTestCaseDescription=");
		sb.append(mrTestCaseDescription);
		sb.append(", icd9AdmittingDx=");
		sb.append(icd9AdmittingDx);
		sb.append(", icd9PrincipalDx=");
		sb.append(icd9PrincipalDx);
		sb.append(", icd9PrincipalProcedure=");
		sb.append(icd9PrincipalProcedure);
		sb.append(", otherIcd9Dx1=");
		sb.append(otherIcd9Dx1);
		sb.append(", otherIcd9Dx2=");
		sb.append(otherIcd9Dx2);
		sb.append(", otherIcd9Dx3=");
		sb.append(otherIcd9Dx3);
		sb.append(", otherIcd9Pcs1=");
		sb.append(otherIcd9Pcs1);
		sb.append(", otherIcd9Pcs2=");
		sb.append(otherIcd9Pcs2);
		sb.append(", otherIcd9Pcs3=");
		sb.append(otherIcd9Pcs3);
		sb.append(", icd10AdmittingDx=");
		sb.append(icd10AdmittingDx);
		sb.append(", icd10PrincipalDx=");
		sb.append(icd10PrincipalDx);
		sb.append(", icd10PrincipalProcedure=");
		sb.append(icd10PrincipalProcedure);
		sb.append(", otherIcd10Dx1=");
		sb.append(otherIcd10Dx1);
		sb.append(", otherIcd10Dx2=");
		sb.append(otherIcd10Dx2);
		sb.append(", otherIcd10Dx3=");
		sb.append(otherIcd10Dx3);
		sb.append(", otherIcd10Pcs1=");
		sb.append(otherIcd10Pcs1);
		sb.append(", otherIcd10Pcs2=");
		sb.append(otherIcd10Pcs2);
		sb.append(", otherIcd10Pcs3=");
		sb.append(otherIcd10Pcs3);
		sb.append(", isHistoryAndPsysical=");
		sb.append(isHistoryAndPsysical);
		sb.append(", isDischargeNotes=");
		sb.append(isDischargeNotes);
		sb.append(", isConsultations=");
		sb.append(isConsultations);
		sb.append(", isOperatingNotes=");
		sb.append(isOperatingNotes);
		sb.append(", isPhysicianNotes=");
		sb.append(isPhysicianNotes);
		sb.append(", isRadiology=");
		sb.append(isRadiology);
		sb.append(", isGiProcedures=");
		sb.append(isGiProcedures);
		sb.append(", isEducationalNotes=");
		sb.append(isEducationalNotes);
		sb.append(", file=");
		sb.append(file);
		sb.append("}");

		return sb.toString();
	}

	public MedicalRecord toEntityModel() {
		MedicalRecordImpl medicalRecordImpl = new MedicalRecordImpl();

		medicalRecordImpl.setMrId(mrId);
		medicalRecordImpl.setGroupId(groupId);
		medicalRecordImpl.setCompanyId(companyId);
		medicalRecordImpl.setUserId(userId);

		if (userName == null) {
			medicalRecordImpl.setUserName(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalRecordImpl.setCreateDate(null);
		}
		else {
			medicalRecordImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalRecordImpl.setModifiedDate(null);
		}
		else {
			medicalRecordImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (mrTestCaseName == null) {
			medicalRecordImpl.setMrTestCaseName(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setMrTestCaseName(mrTestCaseName);
		}

		if (msDrg == null) {
			medicalRecordImpl.setMsDrg(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setMsDrg(msDrg);
		}

		if (patientType == null) {
			medicalRecordImpl.setPatientType(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setPatientType(patientType);
		}

		if (patientAge == null) {
			medicalRecordImpl.setPatientAge(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setPatientAge(patientAge);
		}

		if (los == null) {
			medicalRecordImpl.setLos(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setLos(los);
		}

		if (ahrqCategoryCode == null) {
			medicalRecordImpl.setAhrqCategoryCode(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setAhrqCategoryCode(ahrqCategoryCode);
		}

		if (ahrqSubCategoryCode == null) {
			medicalRecordImpl.setAhrqSubCategoryCode(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setAhrqSubCategoryCode(ahrqSubCategoryCode);
		}

		if (mrTestCaseDescription == null) {
			medicalRecordImpl.setMrTestCaseDescription(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setMrTestCaseDescription(mrTestCaseDescription);
		}

		if (icd9AdmittingDx == null) {
			medicalRecordImpl.setIcd9AdmittingDx(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setIcd9AdmittingDx(icd9AdmittingDx);
		}

		if (icd9PrincipalDx == null) {
			medicalRecordImpl.setIcd9PrincipalDx(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setIcd9PrincipalDx(icd9PrincipalDx);
		}

		if (icd9PrincipalProcedure == null) {
			medicalRecordImpl.setIcd9PrincipalProcedure(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setIcd9PrincipalProcedure(icd9PrincipalProcedure);
		}

		if (otherIcd9Dx1 == null) {
			medicalRecordImpl.setOtherIcd9Dx1(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setOtherIcd9Dx1(otherIcd9Dx1);
		}

		if (otherIcd9Dx2 == null) {
			medicalRecordImpl.setOtherIcd9Dx2(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setOtherIcd9Dx2(otherIcd9Dx2);
		}

		if (otherIcd9Dx3 == null) {
			medicalRecordImpl.setOtherIcd9Dx3(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setOtherIcd9Dx3(otherIcd9Dx3);
		}

		if (otherIcd9Pcs1 == null) {
			medicalRecordImpl.setOtherIcd9Pcs1(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setOtherIcd9Pcs1(otherIcd9Pcs1);
		}

		if (otherIcd9Pcs2 == null) {
			medicalRecordImpl.setOtherIcd9Pcs2(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setOtherIcd9Pcs2(otherIcd9Pcs2);
		}

		if (otherIcd9Pcs3 == null) {
			medicalRecordImpl.setOtherIcd9Pcs3(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setOtherIcd9Pcs3(otherIcd9Pcs3);
		}

		if (icd10AdmittingDx == null) {
			medicalRecordImpl.setIcd10AdmittingDx(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setIcd10AdmittingDx(icd10AdmittingDx);
		}

		if (icd10PrincipalDx == null) {
			medicalRecordImpl.setIcd10PrincipalDx(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setIcd10PrincipalDx(icd10PrincipalDx);
		}

		if (icd10PrincipalProcedure == null) {
			medicalRecordImpl.setIcd10PrincipalProcedure(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setIcd10PrincipalProcedure(icd10PrincipalProcedure);
		}

		if (otherIcd10Dx1 == null) {
			medicalRecordImpl.setOtherIcd10Dx1(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setOtherIcd10Dx1(otherIcd10Dx1);
		}

		if (otherIcd10Dx2 == null) {
			medicalRecordImpl.setOtherIcd10Dx2(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setOtherIcd10Dx2(otherIcd10Dx2);
		}

		if (otherIcd10Dx3 == null) {
			medicalRecordImpl.setOtherIcd10Dx3(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setOtherIcd10Dx3(otherIcd10Dx3);
		}

		if (otherIcd10Pcs1 == null) {
			medicalRecordImpl.setOtherIcd10Pcs1(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setOtherIcd10Pcs1(otherIcd10Pcs1);
		}

		if (otherIcd10Pcs2 == null) {
			medicalRecordImpl.setOtherIcd10Pcs2(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setOtherIcd10Pcs2(otherIcd10Pcs2);
		}

		if (otherIcd10Pcs3 == null) {
			medicalRecordImpl.setOtherIcd10Pcs3(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setOtherIcd10Pcs3(otherIcd10Pcs3);
		}

		medicalRecordImpl.setIsHistoryAndPsysical(isHistoryAndPsysical);
		medicalRecordImpl.setIsDischargeNotes(isDischargeNotes);
		medicalRecordImpl.setIsConsultations(isConsultations);
		medicalRecordImpl.setIsOperatingNotes(isOperatingNotes);
		medicalRecordImpl.setIsPhysicianNotes(isPhysicianNotes);
		medicalRecordImpl.setIsRadiology(isRadiology);
		medicalRecordImpl.setIsGiProcedures(isGiProcedures);
		medicalRecordImpl.setIsEducationalNotes(isEducationalNotes);

		if (file == null) {
			medicalRecordImpl.setFile(StringPool.BLANK);
		}
		else {
			medicalRecordImpl.setFile(file);
		}

		medicalRecordImpl.resetOriginalValues();

		return medicalRecordImpl;
	}

	public long mrId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String mrTestCaseName;
	public String msDrg;
	public String patientType;
	public String patientAge;
	public String los;
	public String ahrqCategoryCode;
	public String ahrqSubCategoryCode;
	public String mrTestCaseDescription;
	public String icd9AdmittingDx;
	public String icd9PrincipalDx;
	public String icd9PrincipalProcedure;
	public String otherIcd9Dx1;
	public String otherIcd9Dx2;
	public String otherIcd9Dx3;
	public String otherIcd9Pcs1;
	public String otherIcd9Pcs2;
	public String otherIcd9Pcs3;
	public String icd10AdmittingDx;
	public String icd10PrincipalDx;
	public String icd10PrincipalProcedure;
	public String otherIcd10Dx1;
	public String otherIcd10Dx2;
	public String otherIcd10Dx3;
	public String otherIcd10Pcs1;
	public String otherIcd10Pcs2;
	public String otherIcd10Pcs3;
	public boolean isHistoryAndPsysical;
	public boolean isDischargeNotes;
	public boolean isConsultations;
	public boolean isOperatingNotes;
	public boolean isPhysicianNotes;
	public boolean isRadiology;
	public boolean isGiProcedures;
	public boolean isEducationalNotes;
	public String file;
}