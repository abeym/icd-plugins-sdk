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

import com.virtusa.icd.service.builder.service.EnrollmentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class EnrollmentClp extends BaseModelImpl<Enrollment>
	implements Enrollment {
	public EnrollmentClp() {
	}

	public Class<?> getModelClass() {
		return Enrollment.class;
	}

	public String getModelClassName() {
		return Enrollment.class.getName();
	}

	public long getPrimaryKey() {
		return _enrollmentId;
	}

	public void setPrimaryKey(long primaryKey) {
		setEnrollmentId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_enrollmentId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("enrollmentId", getEnrollmentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("selectedEntityType", getSelectedEntityType());
		attributes.put("organizationNPINum", getOrganizationNPINum());
		attributes.put("organizationName", getOrganizationName());
		attributes.put("organizationAddress1", getOrganizationAddress1());
		attributes.put("organizationAddress2", getOrganizationAddress2());
		attributes.put("organizationCity", getOrganizationCity());
		attributes.put("organizationPhone", getOrganizationPhone());
		attributes.put("top5HealthPlansByRev", getTop5HealthPlansByRev());
		attributes.put("clearinghouses", getClearinghouses());
		attributes.put("ehrBillingVendors", getEhrBillingVendors());
		attributes.put("revCycleVendors", getRevCycleVendors());
		attributes.put("top5DrgByRev", getTop5DrgByRev());
		attributes.put("icd9Drg1", getIcd9Drg1());
		attributes.put("icd9Drg2", getIcd9Drg2());
		attributes.put("icd9Drg3", getIcd9Drg3());
		attributes.put("icd9Drg4", getIcd9Drg4());
		attributes.put("icd9Drg5", getIcd9Drg5());
		attributes.put("top5Icd9ByRev", getTop5Icd9ByRev());
		attributes.put("icd9Dx1", getIcd9Dx1());
		attributes.put("icd9Dx2", getIcd9Dx2());
		attributes.put("icd9Dx3", getIcd9Dx3());
		attributes.put("icd9Dx4", getIcd9Dx4());
		attributes.put("icd9Dx5", getIcd9Dx5());
		attributes.put("primaryTestingContact", getPrimaryTestingContact());
		attributes.put("primaryTestingContactTitle",
			getPrimaryTestingContactTitle());
		attributes.put("primaryTestingContactPhone",
			getPrimaryTestingContactPhone());
		attributes.put("primaryTestingContactEmail",
			getPrimaryTestingContactEmail());
		attributes.put("primaryCodingContact", getPrimaryCodingContact());
		attributes.put("primaryCodingContactTitle",
			getPrimaryCodingContactTitle());
		attributes.put("primaryCodingContactPhone",
			getPrimaryCodingContactPhone());
		attributes.put("primaryCodingContactEmail",
			getPrimaryCodingContactEmail());
		attributes.put("primaryBillingContact", getPrimaryBillingContact());
		attributes.put("primaryBillingContactTitle",
			getPrimaryBillingContactTitle());
		attributes.put("primaryBillingContactPhone",
			getPrimaryBillingContactPhone());
		attributes.put("primaryBillingContactEmail",
			getPrimaryBillingContactEmail());
		attributes.put("file", getFile());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long enrollmentId = (Long)attributes.get("enrollmentId");

		if (enrollmentId != null) {
			setEnrollmentId(enrollmentId);
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

		String selectedEntityType = (String)attributes.get("selectedEntityType");

		if (selectedEntityType != null) {
			setSelectedEntityType(selectedEntityType);
		}

		String organizationNPINum = (String)attributes.get("organizationNPINum");

		if (organizationNPINum != null) {
			setOrganizationNPINum(organizationNPINum);
		}

		String organizationName = (String)attributes.get("organizationName");

		if (organizationName != null) {
			setOrganizationName(organizationName);
		}

		String organizationAddress1 = (String)attributes.get(
				"organizationAddress1");

		if (organizationAddress1 != null) {
			setOrganizationAddress1(organizationAddress1);
		}

		String organizationAddress2 = (String)attributes.get(
				"organizationAddress2");

		if (organizationAddress2 != null) {
			setOrganizationAddress2(organizationAddress2);
		}

		String organizationCity = (String)attributes.get("organizationCity");

		if (organizationCity != null) {
			setOrganizationCity(organizationCity);
		}

		String organizationPhone = (String)attributes.get("organizationPhone");

		if (organizationPhone != null) {
			setOrganizationPhone(organizationPhone);
		}

		String top5HealthPlansByRev = (String)attributes.get(
				"top5HealthPlansByRev");

		if (top5HealthPlansByRev != null) {
			setTop5HealthPlansByRev(top5HealthPlansByRev);
		}

		String clearinghouses = (String)attributes.get("clearinghouses");

		if (clearinghouses != null) {
			setClearinghouses(clearinghouses);
		}

		String ehrBillingVendors = (String)attributes.get("ehrBillingVendors");

		if (ehrBillingVendors != null) {
			setEhrBillingVendors(ehrBillingVendors);
		}

		String revCycleVendors = (String)attributes.get("revCycleVendors");

		if (revCycleVendors != null) {
			setRevCycleVendors(revCycleVendors);
		}

		String top5DrgByRev = (String)attributes.get("top5DrgByRev");

		if (top5DrgByRev != null) {
			setTop5DrgByRev(top5DrgByRev);
		}

		String icd9Drg1 = (String)attributes.get("icd9Drg1");

		if (icd9Drg1 != null) {
			setIcd9Drg1(icd9Drg1);
		}

		String icd9Drg2 = (String)attributes.get("icd9Drg2");

		if (icd9Drg2 != null) {
			setIcd9Drg2(icd9Drg2);
		}

		String icd9Drg3 = (String)attributes.get("icd9Drg3");

		if (icd9Drg3 != null) {
			setIcd9Drg3(icd9Drg3);
		}

		String icd9Drg4 = (String)attributes.get("icd9Drg4");

		if (icd9Drg4 != null) {
			setIcd9Drg4(icd9Drg4);
		}

		String icd9Drg5 = (String)attributes.get("icd9Drg5");

		if (icd9Drg5 != null) {
			setIcd9Drg5(icd9Drg5);
		}

		String top5Icd9ByRev = (String)attributes.get("top5Icd9ByRev");

		if (top5Icd9ByRev != null) {
			setTop5Icd9ByRev(top5Icd9ByRev);
		}

		String icd9Dx1 = (String)attributes.get("icd9Dx1");

		if (icd9Dx1 != null) {
			setIcd9Dx1(icd9Dx1);
		}

		String icd9Dx2 = (String)attributes.get("icd9Dx2");

		if (icd9Dx2 != null) {
			setIcd9Dx2(icd9Dx2);
		}

		String icd9Dx3 = (String)attributes.get("icd9Dx3");

		if (icd9Dx3 != null) {
			setIcd9Dx3(icd9Dx3);
		}

		String icd9Dx4 = (String)attributes.get("icd9Dx4");

		if (icd9Dx4 != null) {
			setIcd9Dx4(icd9Dx4);
		}

		String icd9Dx5 = (String)attributes.get("icd9Dx5");

		if (icd9Dx5 != null) {
			setIcd9Dx5(icd9Dx5);
		}

		String primaryTestingContact = (String)attributes.get(
				"primaryTestingContact");

		if (primaryTestingContact != null) {
			setPrimaryTestingContact(primaryTestingContact);
		}

		String primaryTestingContactTitle = (String)attributes.get(
				"primaryTestingContactTitle");

		if (primaryTestingContactTitle != null) {
			setPrimaryTestingContactTitle(primaryTestingContactTitle);
		}

		String primaryTestingContactPhone = (String)attributes.get(
				"primaryTestingContactPhone");

		if (primaryTestingContactPhone != null) {
			setPrimaryTestingContactPhone(primaryTestingContactPhone);
		}

		String primaryTestingContactEmail = (String)attributes.get(
				"primaryTestingContactEmail");

		if (primaryTestingContactEmail != null) {
			setPrimaryTestingContactEmail(primaryTestingContactEmail);
		}

		String primaryCodingContact = (String)attributes.get(
				"primaryCodingContact");

		if (primaryCodingContact != null) {
			setPrimaryCodingContact(primaryCodingContact);
		}

		String primaryCodingContactTitle = (String)attributes.get(
				"primaryCodingContactTitle");

		if (primaryCodingContactTitle != null) {
			setPrimaryCodingContactTitle(primaryCodingContactTitle);
		}

		String primaryCodingContactPhone = (String)attributes.get(
				"primaryCodingContactPhone");

		if (primaryCodingContactPhone != null) {
			setPrimaryCodingContactPhone(primaryCodingContactPhone);
		}

		String primaryCodingContactEmail = (String)attributes.get(
				"primaryCodingContactEmail");

		if (primaryCodingContactEmail != null) {
			setPrimaryCodingContactEmail(primaryCodingContactEmail);
		}

		String primaryBillingContact = (String)attributes.get(
				"primaryBillingContact");

		if (primaryBillingContact != null) {
			setPrimaryBillingContact(primaryBillingContact);
		}

		String primaryBillingContactTitle = (String)attributes.get(
				"primaryBillingContactTitle");

		if (primaryBillingContactTitle != null) {
			setPrimaryBillingContactTitle(primaryBillingContactTitle);
		}

		String primaryBillingContactPhone = (String)attributes.get(
				"primaryBillingContactPhone");

		if (primaryBillingContactPhone != null) {
			setPrimaryBillingContactPhone(primaryBillingContactPhone);
		}

		String primaryBillingContactEmail = (String)attributes.get(
				"primaryBillingContactEmail");

		if (primaryBillingContactEmail != null) {
			setPrimaryBillingContactEmail(primaryBillingContactEmail);
		}

		String file = (String)attributes.get("file");

		if (file != null) {
			setFile(file);
		}
	}

	public long getEnrollmentId() {
		return _enrollmentId;
	}

	public void setEnrollmentId(long enrollmentId) {
		_enrollmentId = enrollmentId;
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

	public String getSelectedEntityType() {
		return _selectedEntityType;
	}

	public void setSelectedEntityType(String selectedEntityType) {
		_selectedEntityType = selectedEntityType;
	}

	public String getOrganizationNPINum() {
		return _organizationNPINum;
	}

	public void setOrganizationNPINum(String organizationNPINum) {
		_organizationNPINum = organizationNPINum;
	}

	public String getOrganizationName() {
		return _organizationName;
	}

	public void setOrganizationName(String organizationName) {
		_organizationName = organizationName;
	}

	public String getOrganizationAddress1() {
		return _organizationAddress1;
	}

	public void setOrganizationAddress1(String organizationAddress1) {
		_organizationAddress1 = organizationAddress1;
	}

	public String getOrganizationAddress2() {
		return _organizationAddress2;
	}

	public void setOrganizationAddress2(String organizationAddress2) {
		_organizationAddress2 = organizationAddress2;
	}

	public String getOrganizationCity() {
		return _organizationCity;
	}

	public void setOrganizationCity(String organizationCity) {
		_organizationCity = organizationCity;
	}

	public String getOrganizationPhone() {
		return _organizationPhone;
	}

	public void setOrganizationPhone(String organizationPhone) {
		_organizationPhone = organizationPhone;
	}

	public String getTop5HealthPlansByRev() {
		return _top5HealthPlansByRev;
	}

	public void setTop5HealthPlansByRev(String top5HealthPlansByRev) {
		_top5HealthPlansByRev = top5HealthPlansByRev;
	}

	public String getClearinghouses() {
		return _clearinghouses;
	}

	public void setClearinghouses(String clearinghouses) {
		_clearinghouses = clearinghouses;
	}

	public String getEhrBillingVendors() {
		return _ehrBillingVendors;
	}

	public void setEhrBillingVendors(String ehrBillingVendors) {
		_ehrBillingVendors = ehrBillingVendors;
	}

	public String getRevCycleVendors() {
		return _revCycleVendors;
	}

	public void setRevCycleVendors(String revCycleVendors) {
		_revCycleVendors = revCycleVendors;
	}

	public String getTop5DrgByRev() {
		return _top5DrgByRev;
	}

	public void setTop5DrgByRev(String top5DrgByRev) {
		_top5DrgByRev = top5DrgByRev;
	}

	public String getIcd9Drg1() {
		return _icd9Drg1;
	}

	public void setIcd9Drg1(String icd9Drg1) {
		_icd9Drg1 = icd9Drg1;
	}

	public String getIcd9Drg2() {
		return _icd9Drg2;
	}

	public void setIcd9Drg2(String icd9Drg2) {
		_icd9Drg2 = icd9Drg2;
	}

	public String getIcd9Drg3() {
		return _icd9Drg3;
	}

	public void setIcd9Drg3(String icd9Drg3) {
		_icd9Drg3 = icd9Drg3;
	}

	public String getIcd9Drg4() {
		return _icd9Drg4;
	}

	public void setIcd9Drg4(String icd9Drg4) {
		_icd9Drg4 = icd9Drg4;
	}

	public String getIcd9Drg5() {
		return _icd9Drg5;
	}

	public void setIcd9Drg5(String icd9Drg5) {
		_icd9Drg5 = icd9Drg5;
	}

	public String getTop5Icd9ByRev() {
		return _top5Icd9ByRev;
	}

	public void setTop5Icd9ByRev(String top5Icd9ByRev) {
		_top5Icd9ByRev = top5Icd9ByRev;
	}

	public String getIcd9Dx1() {
		return _icd9Dx1;
	}

	public void setIcd9Dx1(String icd9Dx1) {
		_icd9Dx1 = icd9Dx1;
	}

	public String getIcd9Dx2() {
		return _icd9Dx2;
	}

	public void setIcd9Dx2(String icd9Dx2) {
		_icd9Dx2 = icd9Dx2;
	}

	public String getIcd9Dx3() {
		return _icd9Dx3;
	}

	public void setIcd9Dx3(String icd9Dx3) {
		_icd9Dx3 = icd9Dx3;
	}

	public String getIcd9Dx4() {
		return _icd9Dx4;
	}

	public void setIcd9Dx4(String icd9Dx4) {
		_icd9Dx4 = icd9Dx4;
	}

	public String getIcd9Dx5() {
		return _icd9Dx5;
	}

	public void setIcd9Dx5(String icd9Dx5) {
		_icd9Dx5 = icd9Dx5;
	}

	public String getPrimaryTestingContact() {
		return _primaryTestingContact;
	}

	public void setPrimaryTestingContact(String primaryTestingContact) {
		_primaryTestingContact = primaryTestingContact;
	}

	public String getPrimaryTestingContactTitle() {
		return _primaryTestingContactTitle;
	}

	public void setPrimaryTestingContactTitle(String primaryTestingContactTitle) {
		_primaryTestingContactTitle = primaryTestingContactTitle;
	}

	public String getPrimaryTestingContactPhone() {
		return _primaryTestingContactPhone;
	}

	public void setPrimaryTestingContactPhone(String primaryTestingContactPhone) {
		_primaryTestingContactPhone = primaryTestingContactPhone;
	}

	public String getPrimaryTestingContactEmail() {
		return _primaryTestingContactEmail;
	}

	public void setPrimaryTestingContactEmail(String primaryTestingContactEmail) {
		_primaryTestingContactEmail = primaryTestingContactEmail;
	}

	public String getPrimaryCodingContact() {
		return _primaryCodingContact;
	}

	public void setPrimaryCodingContact(String primaryCodingContact) {
		_primaryCodingContact = primaryCodingContact;
	}

	public String getPrimaryCodingContactTitle() {
		return _primaryCodingContactTitle;
	}

	public void setPrimaryCodingContactTitle(String primaryCodingContactTitle) {
		_primaryCodingContactTitle = primaryCodingContactTitle;
	}

	public String getPrimaryCodingContactPhone() {
		return _primaryCodingContactPhone;
	}

	public void setPrimaryCodingContactPhone(String primaryCodingContactPhone) {
		_primaryCodingContactPhone = primaryCodingContactPhone;
	}

	public String getPrimaryCodingContactEmail() {
		return _primaryCodingContactEmail;
	}

	public void setPrimaryCodingContactEmail(String primaryCodingContactEmail) {
		_primaryCodingContactEmail = primaryCodingContactEmail;
	}

	public String getPrimaryBillingContact() {
		return _primaryBillingContact;
	}

	public void setPrimaryBillingContact(String primaryBillingContact) {
		_primaryBillingContact = primaryBillingContact;
	}

	public String getPrimaryBillingContactTitle() {
		return _primaryBillingContactTitle;
	}

	public void setPrimaryBillingContactTitle(String primaryBillingContactTitle) {
		_primaryBillingContactTitle = primaryBillingContactTitle;
	}

	public String getPrimaryBillingContactPhone() {
		return _primaryBillingContactPhone;
	}

	public void setPrimaryBillingContactPhone(String primaryBillingContactPhone) {
		_primaryBillingContactPhone = primaryBillingContactPhone;
	}

	public String getPrimaryBillingContactEmail() {
		return _primaryBillingContactEmail;
	}

	public void setPrimaryBillingContactEmail(String primaryBillingContactEmail) {
		_primaryBillingContactEmail = primaryBillingContactEmail;
	}

	public String getFile() {
		return _file;
	}

	public void setFile(String file) {
		_file = file;
	}

	public BaseModel<?> getEnrollmentRemoteModel() {
		return _enrollmentRemoteModel;
	}

	public void setEnrollmentRemoteModel(BaseModel<?> enrollmentRemoteModel) {
		_enrollmentRemoteModel = enrollmentRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			EnrollmentLocalServiceUtil.addEnrollment(this);
		}
		else {
			EnrollmentLocalServiceUtil.updateEnrollment(this);
		}
	}

	@Override
	public Enrollment toEscapedModel() {
		return (Enrollment)Proxy.newProxyInstance(Enrollment.class.getClassLoader(),
			new Class[] { Enrollment.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EnrollmentClp clone = new EnrollmentClp();

		clone.setEnrollmentId(getEnrollmentId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setSelectedEntityType(getSelectedEntityType());
		clone.setOrganizationNPINum(getOrganizationNPINum());
		clone.setOrganizationName(getOrganizationName());
		clone.setOrganizationAddress1(getOrganizationAddress1());
		clone.setOrganizationAddress2(getOrganizationAddress2());
		clone.setOrganizationCity(getOrganizationCity());
		clone.setOrganizationPhone(getOrganizationPhone());
		clone.setTop5HealthPlansByRev(getTop5HealthPlansByRev());
		clone.setClearinghouses(getClearinghouses());
		clone.setEhrBillingVendors(getEhrBillingVendors());
		clone.setRevCycleVendors(getRevCycleVendors());
		clone.setTop5DrgByRev(getTop5DrgByRev());
		clone.setIcd9Drg1(getIcd9Drg1());
		clone.setIcd9Drg2(getIcd9Drg2());
		clone.setIcd9Drg3(getIcd9Drg3());
		clone.setIcd9Drg4(getIcd9Drg4());
		clone.setIcd9Drg5(getIcd9Drg5());
		clone.setTop5Icd9ByRev(getTop5Icd9ByRev());
		clone.setIcd9Dx1(getIcd9Dx1());
		clone.setIcd9Dx2(getIcd9Dx2());
		clone.setIcd9Dx3(getIcd9Dx3());
		clone.setIcd9Dx4(getIcd9Dx4());
		clone.setIcd9Dx5(getIcd9Dx5());
		clone.setPrimaryTestingContact(getPrimaryTestingContact());
		clone.setPrimaryTestingContactTitle(getPrimaryTestingContactTitle());
		clone.setPrimaryTestingContactPhone(getPrimaryTestingContactPhone());
		clone.setPrimaryTestingContactEmail(getPrimaryTestingContactEmail());
		clone.setPrimaryCodingContact(getPrimaryCodingContact());
		clone.setPrimaryCodingContactTitle(getPrimaryCodingContactTitle());
		clone.setPrimaryCodingContactPhone(getPrimaryCodingContactPhone());
		clone.setPrimaryCodingContactEmail(getPrimaryCodingContactEmail());
		clone.setPrimaryBillingContact(getPrimaryBillingContact());
		clone.setPrimaryBillingContactTitle(getPrimaryBillingContactTitle());
		clone.setPrimaryBillingContactPhone(getPrimaryBillingContactPhone());
		clone.setPrimaryBillingContactEmail(getPrimaryBillingContactEmail());
		clone.setFile(getFile());

		return clone;
	}

	public int compareTo(Enrollment enrollment) {
		long primaryKey = enrollment.getPrimaryKey();

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

		EnrollmentClp enrollment = null;

		try {
			enrollment = (EnrollmentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = enrollment.getPrimaryKey();

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
		StringBundler sb = new StringBundler(87);

		sb.append("{enrollmentId=");
		sb.append(getEnrollmentId());
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
		sb.append(", selectedEntityType=");
		sb.append(getSelectedEntityType());
		sb.append(", organizationNPINum=");
		sb.append(getOrganizationNPINum());
		sb.append(", organizationName=");
		sb.append(getOrganizationName());
		sb.append(", organizationAddress1=");
		sb.append(getOrganizationAddress1());
		sb.append(", organizationAddress2=");
		sb.append(getOrganizationAddress2());
		sb.append(", organizationCity=");
		sb.append(getOrganizationCity());
		sb.append(", organizationPhone=");
		sb.append(getOrganizationPhone());
		sb.append(", top5HealthPlansByRev=");
		sb.append(getTop5HealthPlansByRev());
		sb.append(", clearinghouses=");
		sb.append(getClearinghouses());
		sb.append(", ehrBillingVendors=");
		sb.append(getEhrBillingVendors());
		sb.append(", revCycleVendors=");
		sb.append(getRevCycleVendors());
		sb.append(", top5DrgByRev=");
		sb.append(getTop5DrgByRev());
		sb.append(", icd9Drg1=");
		sb.append(getIcd9Drg1());
		sb.append(", icd9Drg2=");
		sb.append(getIcd9Drg2());
		sb.append(", icd9Drg3=");
		sb.append(getIcd9Drg3());
		sb.append(", icd9Drg4=");
		sb.append(getIcd9Drg4());
		sb.append(", icd9Drg5=");
		sb.append(getIcd9Drg5());
		sb.append(", top5Icd9ByRev=");
		sb.append(getTop5Icd9ByRev());
		sb.append(", icd9Dx1=");
		sb.append(getIcd9Dx1());
		sb.append(", icd9Dx2=");
		sb.append(getIcd9Dx2());
		sb.append(", icd9Dx3=");
		sb.append(getIcd9Dx3());
		sb.append(", icd9Dx4=");
		sb.append(getIcd9Dx4());
		sb.append(", icd9Dx5=");
		sb.append(getIcd9Dx5());
		sb.append(", primaryTestingContact=");
		sb.append(getPrimaryTestingContact());
		sb.append(", primaryTestingContactTitle=");
		sb.append(getPrimaryTestingContactTitle());
		sb.append(", primaryTestingContactPhone=");
		sb.append(getPrimaryTestingContactPhone());
		sb.append(", primaryTestingContactEmail=");
		sb.append(getPrimaryTestingContactEmail());
		sb.append(", primaryCodingContact=");
		sb.append(getPrimaryCodingContact());
		sb.append(", primaryCodingContactTitle=");
		sb.append(getPrimaryCodingContactTitle());
		sb.append(", primaryCodingContactPhone=");
		sb.append(getPrimaryCodingContactPhone());
		sb.append(", primaryCodingContactEmail=");
		sb.append(getPrimaryCodingContactEmail());
		sb.append(", primaryBillingContact=");
		sb.append(getPrimaryBillingContact());
		sb.append(", primaryBillingContactTitle=");
		sb.append(getPrimaryBillingContactTitle());
		sb.append(", primaryBillingContactPhone=");
		sb.append(getPrimaryBillingContactPhone());
		sb.append(", primaryBillingContactEmail=");
		sb.append(getPrimaryBillingContactEmail());
		sb.append(", file=");
		sb.append(getFile());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(133);

		sb.append("<model><model-name>");
		sb.append("com.virtusa.icd.service.builder.model.Enrollment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>enrollmentId</column-name><column-value><![CDATA[");
		sb.append(getEnrollmentId());
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
			"<column><column-name>selectedEntityType</column-name><column-value><![CDATA[");
		sb.append(getSelectedEntityType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationNPINum</column-name><column-value><![CDATA[");
		sb.append(getOrganizationNPINum());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationName</column-name><column-value><![CDATA[");
		sb.append(getOrganizationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationAddress1</column-name><column-value><![CDATA[");
		sb.append(getOrganizationAddress1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationAddress2</column-name><column-value><![CDATA[");
		sb.append(getOrganizationAddress2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationCity</column-name><column-value><![CDATA[");
		sb.append(getOrganizationCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationPhone</column-name><column-value><![CDATA[");
		sb.append(getOrganizationPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>top5HealthPlansByRev</column-name><column-value><![CDATA[");
		sb.append(getTop5HealthPlansByRev());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clearinghouses</column-name><column-value><![CDATA[");
		sb.append(getClearinghouses());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ehrBillingVendors</column-name><column-value><![CDATA[");
		sb.append(getEhrBillingVendors());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>revCycleVendors</column-name><column-value><![CDATA[");
		sb.append(getRevCycleVendors());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>top5DrgByRev</column-name><column-value><![CDATA[");
		sb.append(getTop5DrgByRev());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd9Drg1</column-name><column-value><![CDATA[");
		sb.append(getIcd9Drg1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd9Drg2</column-name><column-value><![CDATA[");
		sb.append(getIcd9Drg2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd9Drg3</column-name><column-value><![CDATA[");
		sb.append(getIcd9Drg3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd9Drg4</column-name><column-value><![CDATA[");
		sb.append(getIcd9Drg4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd9Drg5</column-name><column-value><![CDATA[");
		sb.append(getIcd9Drg5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>top5Icd9ByRev</column-name><column-value><![CDATA[");
		sb.append(getTop5Icd9ByRev());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd9Dx1</column-name><column-value><![CDATA[");
		sb.append(getIcd9Dx1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd9Dx2</column-name><column-value><![CDATA[");
		sb.append(getIcd9Dx2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd9Dx3</column-name><column-value><![CDATA[");
		sb.append(getIcd9Dx3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd9Dx4</column-name><column-value><![CDATA[");
		sb.append(getIcd9Dx4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>icd9Dx5</column-name><column-value><![CDATA[");
		sb.append(getIcd9Dx5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primaryTestingContact</column-name><column-value><![CDATA[");
		sb.append(getPrimaryTestingContact());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primaryTestingContactTitle</column-name><column-value><![CDATA[");
		sb.append(getPrimaryTestingContactTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primaryTestingContactPhone</column-name><column-value><![CDATA[");
		sb.append(getPrimaryTestingContactPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primaryTestingContactEmail</column-name><column-value><![CDATA[");
		sb.append(getPrimaryTestingContactEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primaryCodingContact</column-name><column-value><![CDATA[");
		sb.append(getPrimaryCodingContact());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primaryCodingContactTitle</column-name><column-value><![CDATA[");
		sb.append(getPrimaryCodingContactTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primaryCodingContactPhone</column-name><column-value><![CDATA[");
		sb.append(getPrimaryCodingContactPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primaryCodingContactEmail</column-name><column-value><![CDATA[");
		sb.append(getPrimaryCodingContactEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primaryBillingContact</column-name><column-value><![CDATA[");
		sb.append(getPrimaryBillingContact());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primaryBillingContactTitle</column-name><column-value><![CDATA[");
		sb.append(getPrimaryBillingContactTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primaryBillingContactPhone</column-name><column-value><![CDATA[");
		sb.append(getPrimaryBillingContactPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primaryBillingContactEmail</column-name><column-value><![CDATA[");
		sb.append(getPrimaryBillingContactEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>file</column-name><column-value><![CDATA[");
		sb.append(getFile());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _enrollmentId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _selectedEntityType;
	private String _organizationNPINum;
	private String _organizationName;
	private String _organizationAddress1;
	private String _organizationAddress2;
	private String _organizationCity;
	private String _organizationPhone;
	private String _top5HealthPlansByRev;
	private String _clearinghouses;
	private String _ehrBillingVendors;
	private String _revCycleVendors;
	private String _top5DrgByRev;
	private String _icd9Drg1;
	private String _icd9Drg2;
	private String _icd9Drg3;
	private String _icd9Drg4;
	private String _icd9Drg5;
	private String _top5Icd9ByRev;
	private String _icd9Dx1;
	private String _icd9Dx2;
	private String _icd9Dx3;
	private String _icd9Dx4;
	private String _icd9Dx5;
	private String _primaryTestingContact;
	private String _primaryTestingContactTitle;
	private String _primaryTestingContactPhone;
	private String _primaryTestingContactEmail;
	private String _primaryCodingContact;
	private String _primaryCodingContactTitle;
	private String _primaryCodingContactPhone;
	private String _primaryCodingContactEmail;
	private String _primaryBillingContact;
	private String _primaryBillingContactTitle;
	private String _primaryBillingContactPhone;
	private String _primaryBillingContactEmail;
	private String _file;
	private BaseModel<?> _enrollmentRemoteModel;
}