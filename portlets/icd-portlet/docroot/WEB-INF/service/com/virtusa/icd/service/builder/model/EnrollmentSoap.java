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
 * This class is used by SOAP remote services, specifically {@link com.virtusa.icd.service.builder.service.http.EnrollmentServiceSoap}.
 *
 * @author    Brian Wing Shun Chan
 * @see       com.virtusa.icd.service.builder.service.http.EnrollmentServiceSoap
 * @generated
 */
public class EnrollmentSoap implements Serializable {
	public static EnrollmentSoap toSoapModel(Enrollment model) {
		EnrollmentSoap soapModel = new EnrollmentSoap();

		soapModel.setEnrollmentId(model.getEnrollmentId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setSelectedEntityType(model.getSelectedEntityType());
		soapModel.setOrganizationNPINum(model.getOrganizationNPINum());
		soapModel.setOrganizationName(model.getOrganizationName());
		soapModel.setOrganizationAddress1(model.getOrganizationAddress1());
		soapModel.setOrganizationAddress2(model.getOrganizationAddress2());
		soapModel.setOrganizationCity(model.getOrganizationCity());
		soapModel.setOrganizationPhone(model.getOrganizationPhone());
		soapModel.setTop5HealthPlansByRev(model.getTop5HealthPlansByRev());
		soapModel.setClearinghouses(model.getClearinghouses());
		soapModel.setEhrBillingVendors(model.getEhrBillingVendors());
		soapModel.setRevCycleVendors(model.getRevCycleVendors());
		soapModel.setTop5DrgByRev(model.getTop5DrgByRev());
		soapModel.setIcd9Drg1(model.getIcd9Drg1());
		soapModel.setIcd9Drg2(model.getIcd9Drg2());
		soapModel.setIcd9Drg3(model.getIcd9Drg3());
		soapModel.setIcd9Drg4(model.getIcd9Drg4());
		soapModel.setIcd9Drg5(model.getIcd9Drg5());
		soapModel.setTop5Icd9ByRev(model.getTop5Icd9ByRev());
		soapModel.setIcd9Dx1(model.getIcd9Dx1());
		soapModel.setIcd9Dx2(model.getIcd9Dx2());
		soapModel.setIcd9Dx3(model.getIcd9Dx3());
		soapModel.setIcd9Dx4(model.getIcd9Dx4());
		soapModel.setIcd9Dx5(model.getIcd9Dx5());
		soapModel.setPrimaryTestingContact(model.getPrimaryTestingContact());
		soapModel.setPrimaryTestingContactTitle(model.getPrimaryTestingContactTitle());
		soapModel.setPrimaryTestingContactPhone(model.getPrimaryTestingContactPhone());
		soapModel.setPrimaryTestingContactEmail(model.getPrimaryTestingContactEmail());
		soapModel.setPrimaryCodingContact(model.getPrimaryCodingContact());
		soapModel.setPrimaryCodingContactTitle(model.getPrimaryCodingContactTitle());
		soapModel.setPrimaryCodingContactPhone(model.getPrimaryCodingContactPhone());
		soapModel.setPrimaryCodingContactEmail(model.getPrimaryCodingContactEmail());
		soapModel.setPrimaryBillingContact(model.getPrimaryBillingContact());
		soapModel.setPrimaryBillingContactTitle(model.getPrimaryBillingContactTitle());
		soapModel.setPrimaryBillingContactPhone(model.getPrimaryBillingContactPhone());
		soapModel.setPrimaryBillingContactEmail(model.getPrimaryBillingContactEmail());
		soapModel.setFile(model.getFile());

		return soapModel;
	}

	public static EnrollmentSoap[] toSoapModels(Enrollment[] models) {
		EnrollmentSoap[] soapModels = new EnrollmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EnrollmentSoap[][] toSoapModels(Enrollment[][] models) {
		EnrollmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EnrollmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EnrollmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EnrollmentSoap[] toSoapModels(List<Enrollment> models) {
		List<EnrollmentSoap> soapModels = new ArrayList<EnrollmentSoap>(models.size());

		for (Enrollment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EnrollmentSoap[soapModels.size()]);
	}

	public EnrollmentSoap() {
	}

	public long getPrimaryKey() {
		return _enrollmentId;
	}

	public void setPrimaryKey(long pk) {
		setEnrollmentId(pk);
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

	private long _enrollmentId;
	private long _groupId;
	private long _companyId;
	private long _userId;
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
}