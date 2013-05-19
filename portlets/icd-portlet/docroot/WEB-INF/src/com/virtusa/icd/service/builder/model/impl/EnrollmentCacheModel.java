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

import com.virtusa.icd.service.builder.model.Enrollment;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Enrollment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Enrollment
 * @generated
 */
public class EnrollmentCacheModel implements CacheModel<Enrollment>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(87);

		sb.append("{enrollmentId=");
		sb.append(enrollmentId);
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
		sb.append(", selectedEntityType=");
		sb.append(selectedEntityType);
		sb.append(", organizationNPINum=");
		sb.append(organizationNPINum);
		sb.append(", organizationName=");
		sb.append(organizationName);
		sb.append(", organizationAddress1=");
		sb.append(organizationAddress1);
		sb.append(", organizationAddress2=");
		sb.append(organizationAddress2);
		sb.append(", organizationCity=");
		sb.append(organizationCity);
		sb.append(", organizationPhone=");
		sb.append(organizationPhone);
		sb.append(", top5HealthPlansByRev=");
		sb.append(top5HealthPlansByRev);
		sb.append(", clearinghouses=");
		sb.append(clearinghouses);
		sb.append(", ehrBillingVendors=");
		sb.append(ehrBillingVendors);
		sb.append(", revCycleVendors=");
		sb.append(revCycleVendors);
		sb.append(", top5DrgByRev=");
		sb.append(top5DrgByRev);
		sb.append(", icd9Drg1=");
		sb.append(icd9Drg1);
		sb.append(", icd9Drg2=");
		sb.append(icd9Drg2);
		sb.append(", icd9Drg3=");
		sb.append(icd9Drg3);
		sb.append(", icd9Drg4=");
		sb.append(icd9Drg4);
		sb.append(", icd9Drg5=");
		sb.append(icd9Drg5);
		sb.append(", top5Icd9ByRev=");
		sb.append(top5Icd9ByRev);
		sb.append(", icd9Dx1=");
		sb.append(icd9Dx1);
		sb.append(", icd9Dx2=");
		sb.append(icd9Dx2);
		sb.append(", icd9Dx3=");
		sb.append(icd9Dx3);
		sb.append(", icd9Dx4=");
		sb.append(icd9Dx4);
		sb.append(", icd9Dx5=");
		sb.append(icd9Dx5);
		sb.append(", primaryTestingContact=");
		sb.append(primaryTestingContact);
		sb.append(", primaryTestingContactTitle=");
		sb.append(primaryTestingContactTitle);
		sb.append(", primaryTestingContactPhone=");
		sb.append(primaryTestingContactPhone);
		sb.append(", primaryTestingContactEmail=");
		sb.append(primaryTestingContactEmail);
		sb.append(", primaryCodingContact=");
		sb.append(primaryCodingContact);
		sb.append(", primaryCodingContactTitle=");
		sb.append(primaryCodingContactTitle);
		sb.append(", primaryCodingContactPhone=");
		sb.append(primaryCodingContactPhone);
		sb.append(", primaryCodingContactEmail=");
		sb.append(primaryCodingContactEmail);
		sb.append(", primaryBillingContact=");
		sb.append(primaryBillingContact);
		sb.append(", primaryBillingContactTitle=");
		sb.append(primaryBillingContactTitle);
		sb.append(", primaryBillingContactPhone=");
		sb.append(primaryBillingContactPhone);
		sb.append(", primaryBillingContactEmail=");
		sb.append(primaryBillingContactEmail);
		sb.append(", file=");
		sb.append(file);
		sb.append("}");

		return sb.toString();
	}

	public Enrollment toEntityModel() {
		EnrollmentImpl enrollmentImpl = new EnrollmentImpl();

		enrollmentImpl.setEnrollmentId(enrollmentId);
		enrollmentImpl.setGroupId(groupId);
		enrollmentImpl.setCompanyId(companyId);
		enrollmentImpl.setUserId(userId);

		if (userName == null) {
			enrollmentImpl.setUserName(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			enrollmentImpl.setCreateDate(null);
		}
		else {
			enrollmentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			enrollmentImpl.setModifiedDate(null);
		}
		else {
			enrollmentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (selectedEntityType == null) {
			enrollmentImpl.setSelectedEntityType(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setSelectedEntityType(selectedEntityType);
		}

		if (organizationNPINum == null) {
			enrollmentImpl.setOrganizationNPINum(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setOrganizationNPINum(organizationNPINum);
		}

		if (organizationName == null) {
			enrollmentImpl.setOrganizationName(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setOrganizationName(organizationName);
		}

		if (organizationAddress1 == null) {
			enrollmentImpl.setOrganizationAddress1(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setOrganizationAddress1(organizationAddress1);
		}

		if (organizationAddress2 == null) {
			enrollmentImpl.setOrganizationAddress2(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setOrganizationAddress2(organizationAddress2);
		}

		if (organizationCity == null) {
			enrollmentImpl.setOrganizationCity(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setOrganizationCity(organizationCity);
		}

		if (organizationPhone == null) {
			enrollmentImpl.setOrganizationPhone(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setOrganizationPhone(organizationPhone);
		}

		if (top5HealthPlansByRev == null) {
			enrollmentImpl.setTop5HealthPlansByRev(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setTop5HealthPlansByRev(top5HealthPlansByRev);
		}

		if (clearinghouses == null) {
			enrollmentImpl.setClearinghouses(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setClearinghouses(clearinghouses);
		}

		if (ehrBillingVendors == null) {
			enrollmentImpl.setEhrBillingVendors(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setEhrBillingVendors(ehrBillingVendors);
		}

		if (revCycleVendors == null) {
			enrollmentImpl.setRevCycleVendors(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setRevCycleVendors(revCycleVendors);
		}

		if (top5DrgByRev == null) {
			enrollmentImpl.setTop5DrgByRev(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setTop5DrgByRev(top5DrgByRev);
		}

		if (icd9Drg1 == null) {
			enrollmentImpl.setIcd9Drg1(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setIcd9Drg1(icd9Drg1);
		}

		if (icd9Drg2 == null) {
			enrollmentImpl.setIcd9Drg2(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setIcd9Drg2(icd9Drg2);
		}

		if (icd9Drg3 == null) {
			enrollmentImpl.setIcd9Drg3(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setIcd9Drg3(icd9Drg3);
		}

		if (icd9Drg4 == null) {
			enrollmentImpl.setIcd9Drg4(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setIcd9Drg4(icd9Drg4);
		}

		if (icd9Drg5 == null) {
			enrollmentImpl.setIcd9Drg5(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setIcd9Drg5(icd9Drg5);
		}

		if (top5Icd9ByRev == null) {
			enrollmentImpl.setTop5Icd9ByRev(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setTop5Icd9ByRev(top5Icd9ByRev);
		}

		if (icd9Dx1 == null) {
			enrollmentImpl.setIcd9Dx1(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setIcd9Dx1(icd9Dx1);
		}

		if (icd9Dx2 == null) {
			enrollmentImpl.setIcd9Dx2(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setIcd9Dx2(icd9Dx2);
		}

		if (icd9Dx3 == null) {
			enrollmentImpl.setIcd9Dx3(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setIcd9Dx3(icd9Dx3);
		}

		if (icd9Dx4 == null) {
			enrollmentImpl.setIcd9Dx4(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setIcd9Dx4(icd9Dx4);
		}

		if (icd9Dx5 == null) {
			enrollmentImpl.setIcd9Dx5(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setIcd9Dx5(icd9Dx5);
		}

		if (primaryTestingContact == null) {
			enrollmentImpl.setPrimaryTestingContact(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setPrimaryTestingContact(primaryTestingContact);
		}

		if (primaryTestingContactTitle == null) {
			enrollmentImpl.setPrimaryTestingContactTitle(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setPrimaryTestingContactTitle(primaryTestingContactTitle);
		}

		if (primaryTestingContactPhone == null) {
			enrollmentImpl.setPrimaryTestingContactPhone(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setPrimaryTestingContactPhone(primaryTestingContactPhone);
		}

		if (primaryTestingContactEmail == null) {
			enrollmentImpl.setPrimaryTestingContactEmail(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setPrimaryTestingContactEmail(primaryTestingContactEmail);
		}

		if (primaryCodingContact == null) {
			enrollmentImpl.setPrimaryCodingContact(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setPrimaryCodingContact(primaryCodingContact);
		}

		if (primaryCodingContactTitle == null) {
			enrollmentImpl.setPrimaryCodingContactTitle(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setPrimaryCodingContactTitle(primaryCodingContactTitle);
		}

		if (primaryCodingContactPhone == null) {
			enrollmentImpl.setPrimaryCodingContactPhone(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setPrimaryCodingContactPhone(primaryCodingContactPhone);
		}

		if (primaryCodingContactEmail == null) {
			enrollmentImpl.setPrimaryCodingContactEmail(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setPrimaryCodingContactEmail(primaryCodingContactEmail);
		}

		if (primaryBillingContact == null) {
			enrollmentImpl.setPrimaryBillingContact(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setPrimaryBillingContact(primaryBillingContact);
		}

		if (primaryBillingContactTitle == null) {
			enrollmentImpl.setPrimaryBillingContactTitle(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setPrimaryBillingContactTitle(primaryBillingContactTitle);
		}

		if (primaryBillingContactPhone == null) {
			enrollmentImpl.setPrimaryBillingContactPhone(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setPrimaryBillingContactPhone(primaryBillingContactPhone);
		}

		if (primaryBillingContactEmail == null) {
			enrollmentImpl.setPrimaryBillingContactEmail(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setPrimaryBillingContactEmail(primaryBillingContactEmail);
		}

		if (file == null) {
			enrollmentImpl.setFile(StringPool.BLANK);
		}
		else {
			enrollmentImpl.setFile(file);
		}

		enrollmentImpl.resetOriginalValues();

		return enrollmentImpl;
	}

	public long enrollmentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String selectedEntityType;
	public String organizationNPINum;
	public String organizationName;
	public String organizationAddress1;
	public String organizationAddress2;
	public String organizationCity;
	public String organizationPhone;
	public String top5HealthPlansByRev;
	public String clearinghouses;
	public String ehrBillingVendors;
	public String revCycleVendors;
	public String top5DrgByRev;
	public String icd9Drg1;
	public String icd9Drg2;
	public String icd9Drg3;
	public String icd9Drg4;
	public String icd9Drg5;
	public String top5Icd9ByRev;
	public String icd9Dx1;
	public String icd9Dx2;
	public String icd9Dx3;
	public String icd9Dx4;
	public String icd9Dx5;
	public String primaryTestingContact;
	public String primaryTestingContactTitle;
	public String primaryTestingContactPhone;
	public String primaryTestingContactEmail;
	public String primaryCodingContact;
	public String primaryCodingContactTitle;
	public String primaryCodingContactPhone;
	public String primaryCodingContactEmail;
	public String primaryBillingContact;
	public String primaryBillingContactTitle;
	public String primaryBillingContactPhone;
	public String primaryBillingContactEmail;
	public String file;
}