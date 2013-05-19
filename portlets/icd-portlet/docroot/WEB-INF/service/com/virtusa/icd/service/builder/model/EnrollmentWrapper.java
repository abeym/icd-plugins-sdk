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
 * This class is a wrapper for {@link Enrollment}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       Enrollment
 * @generated
 */
public class EnrollmentWrapper implements Enrollment, ModelWrapper<Enrollment> {
	public EnrollmentWrapper(Enrollment enrollment) {
		_enrollment = enrollment;
	}

	public Class<?> getModelClass() {
		return Enrollment.class;
	}

	public String getModelClassName() {
		return Enrollment.class.getName();
	}

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

	/**
	* Returns the primary key of this enrollment.
	*
	* @return the primary key of this enrollment
	*/
	public long getPrimaryKey() {
		return _enrollment.getPrimaryKey();
	}

	/**
	* Sets the primary key of this enrollment.
	*
	* @param primaryKey the primary key of this enrollment
	*/
	public void setPrimaryKey(long primaryKey) {
		_enrollment.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the enrollment ID of this enrollment.
	*
	* @return the enrollment ID of this enrollment
	*/
	public long getEnrollmentId() {
		return _enrollment.getEnrollmentId();
	}

	/**
	* Sets the enrollment ID of this enrollment.
	*
	* @param enrollmentId the enrollment ID of this enrollment
	*/
	public void setEnrollmentId(long enrollmentId) {
		_enrollment.setEnrollmentId(enrollmentId);
	}

	/**
	* Returns the group ID of this enrollment.
	*
	* @return the group ID of this enrollment
	*/
	public long getGroupId() {
		return _enrollment.getGroupId();
	}

	/**
	* Sets the group ID of this enrollment.
	*
	* @param groupId the group ID of this enrollment
	*/
	public void setGroupId(long groupId) {
		_enrollment.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this enrollment.
	*
	* @return the company ID of this enrollment
	*/
	public long getCompanyId() {
		return _enrollment.getCompanyId();
	}

	/**
	* Sets the company ID of this enrollment.
	*
	* @param companyId the company ID of this enrollment
	*/
	public void setCompanyId(long companyId) {
		_enrollment.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this enrollment.
	*
	* @return the user ID of this enrollment
	*/
	public long getUserId() {
		return _enrollment.getUserId();
	}

	/**
	* Sets the user ID of this enrollment.
	*
	* @param userId the user ID of this enrollment
	*/
	public void setUserId(long userId) {
		_enrollment.setUserId(userId);
	}

	/**
	* Returns the user uuid of this enrollment.
	*
	* @return the user uuid of this enrollment
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _enrollment.getUserUuid();
	}

	/**
	* Sets the user uuid of this enrollment.
	*
	* @param userUuid the user uuid of this enrollment
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_enrollment.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this enrollment.
	*
	* @return the user name of this enrollment
	*/
	public java.lang.String getUserName() {
		return _enrollment.getUserName();
	}

	/**
	* Sets the user name of this enrollment.
	*
	* @param userName the user name of this enrollment
	*/
	public void setUserName(java.lang.String userName) {
		_enrollment.setUserName(userName);
	}

	/**
	* Returns the create date of this enrollment.
	*
	* @return the create date of this enrollment
	*/
	public java.util.Date getCreateDate() {
		return _enrollment.getCreateDate();
	}

	/**
	* Sets the create date of this enrollment.
	*
	* @param createDate the create date of this enrollment
	*/
	public void setCreateDate(java.util.Date createDate) {
		_enrollment.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this enrollment.
	*
	* @return the modified date of this enrollment
	*/
	public java.util.Date getModifiedDate() {
		return _enrollment.getModifiedDate();
	}

	/**
	* Sets the modified date of this enrollment.
	*
	* @param modifiedDate the modified date of this enrollment
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_enrollment.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the selected entity type of this enrollment.
	*
	* @return the selected entity type of this enrollment
	*/
	public java.lang.String getSelectedEntityType() {
		return _enrollment.getSelectedEntityType();
	}

	/**
	* Sets the selected entity type of this enrollment.
	*
	* @param selectedEntityType the selected entity type of this enrollment
	*/
	public void setSelectedEntityType(java.lang.String selectedEntityType) {
		_enrollment.setSelectedEntityType(selectedEntityType);
	}

	/**
	* Returns the organization n p i num of this enrollment.
	*
	* @return the organization n p i num of this enrollment
	*/
	public java.lang.String getOrganizationNPINum() {
		return _enrollment.getOrganizationNPINum();
	}

	/**
	* Sets the organization n p i num of this enrollment.
	*
	* @param organizationNPINum the organization n p i num of this enrollment
	*/
	public void setOrganizationNPINum(java.lang.String organizationNPINum) {
		_enrollment.setOrganizationNPINum(organizationNPINum);
	}

	/**
	* Returns the organization name of this enrollment.
	*
	* @return the organization name of this enrollment
	*/
	public java.lang.String getOrganizationName() {
		return _enrollment.getOrganizationName();
	}

	/**
	* Sets the organization name of this enrollment.
	*
	* @param organizationName the organization name of this enrollment
	*/
	public void setOrganizationName(java.lang.String organizationName) {
		_enrollment.setOrganizationName(organizationName);
	}

	/**
	* Returns the organization address1 of this enrollment.
	*
	* @return the organization address1 of this enrollment
	*/
	public java.lang.String getOrganizationAddress1() {
		return _enrollment.getOrganizationAddress1();
	}

	/**
	* Sets the organization address1 of this enrollment.
	*
	* @param organizationAddress1 the organization address1 of this enrollment
	*/
	public void setOrganizationAddress1(java.lang.String organizationAddress1) {
		_enrollment.setOrganizationAddress1(organizationAddress1);
	}

	/**
	* Returns the organization address2 of this enrollment.
	*
	* @return the organization address2 of this enrollment
	*/
	public java.lang.String getOrganizationAddress2() {
		return _enrollment.getOrganizationAddress2();
	}

	/**
	* Sets the organization address2 of this enrollment.
	*
	* @param organizationAddress2 the organization address2 of this enrollment
	*/
	public void setOrganizationAddress2(java.lang.String organizationAddress2) {
		_enrollment.setOrganizationAddress2(organizationAddress2);
	}

	/**
	* Returns the organization city of this enrollment.
	*
	* @return the organization city of this enrollment
	*/
	public java.lang.String getOrganizationCity() {
		return _enrollment.getOrganizationCity();
	}

	/**
	* Sets the organization city of this enrollment.
	*
	* @param organizationCity the organization city of this enrollment
	*/
	public void setOrganizationCity(java.lang.String organizationCity) {
		_enrollment.setOrganizationCity(organizationCity);
	}

	/**
	* Returns the organization phone of this enrollment.
	*
	* @return the organization phone of this enrollment
	*/
	public java.lang.String getOrganizationPhone() {
		return _enrollment.getOrganizationPhone();
	}

	/**
	* Sets the organization phone of this enrollment.
	*
	* @param organizationPhone the organization phone of this enrollment
	*/
	public void setOrganizationPhone(java.lang.String organizationPhone) {
		_enrollment.setOrganizationPhone(organizationPhone);
	}

	/**
	* Returns the top5 health plans by rev of this enrollment.
	*
	* @return the top5 health plans by rev of this enrollment
	*/
	public java.lang.String getTop5HealthPlansByRev() {
		return _enrollment.getTop5HealthPlansByRev();
	}

	/**
	* Sets the top5 health plans by rev of this enrollment.
	*
	* @param top5HealthPlansByRev the top5 health plans by rev of this enrollment
	*/
	public void setTop5HealthPlansByRev(java.lang.String top5HealthPlansByRev) {
		_enrollment.setTop5HealthPlansByRev(top5HealthPlansByRev);
	}

	/**
	* Returns the clearinghouses of this enrollment.
	*
	* @return the clearinghouses of this enrollment
	*/
	public java.lang.String getClearinghouses() {
		return _enrollment.getClearinghouses();
	}

	/**
	* Sets the clearinghouses of this enrollment.
	*
	* @param clearinghouses the clearinghouses of this enrollment
	*/
	public void setClearinghouses(java.lang.String clearinghouses) {
		_enrollment.setClearinghouses(clearinghouses);
	}

	/**
	* Returns the ehr billing vendors of this enrollment.
	*
	* @return the ehr billing vendors of this enrollment
	*/
	public java.lang.String getEhrBillingVendors() {
		return _enrollment.getEhrBillingVendors();
	}

	/**
	* Sets the ehr billing vendors of this enrollment.
	*
	* @param ehrBillingVendors the ehr billing vendors of this enrollment
	*/
	public void setEhrBillingVendors(java.lang.String ehrBillingVendors) {
		_enrollment.setEhrBillingVendors(ehrBillingVendors);
	}

	/**
	* Returns the rev cycle vendors of this enrollment.
	*
	* @return the rev cycle vendors of this enrollment
	*/
	public java.lang.String getRevCycleVendors() {
		return _enrollment.getRevCycleVendors();
	}

	/**
	* Sets the rev cycle vendors of this enrollment.
	*
	* @param revCycleVendors the rev cycle vendors of this enrollment
	*/
	public void setRevCycleVendors(java.lang.String revCycleVendors) {
		_enrollment.setRevCycleVendors(revCycleVendors);
	}

	/**
	* Returns the top5 drg by rev of this enrollment.
	*
	* @return the top5 drg by rev of this enrollment
	*/
	public java.lang.String getTop5DrgByRev() {
		return _enrollment.getTop5DrgByRev();
	}

	/**
	* Sets the top5 drg by rev of this enrollment.
	*
	* @param top5DrgByRev the top5 drg by rev of this enrollment
	*/
	public void setTop5DrgByRev(java.lang.String top5DrgByRev) {
		_enrollment.setTop5DrgByRev(top5DrgByRev);
	}

	/**
	* Returns the icd9 drg1 of this enrollment.
	*
	* @return the icd9 drg1 of this enrollment
	*/
	public java.lang.String getIcd9Drg1() {
		return _enrollment.getIcd9Drg1();
	}

	/**
	* Sets the icd9 drg1 of this enrollment.
	*
	* @param icd9Drg1 the icd9 drg1 of this enrollment
	*/
	public void setIcd9Drg1(java.lang.String icd9Drg1) {
		_enrollment.setIcd9Drg1(icd9Drg1);
	}

	/**
	* Returns the icd9 drg2 of this enrollment.
	*
	* @return the icd9 drg2 of this enrollment
	*/
	public java.lang.String getIcd9Drg2() {
		return _enrollment.getIcd9Drg2();
	}

	/**
	* Sets the icd9 drg2 of this enrollment.
	*
	* @param icd9Drg2 the icd9 drg2 of this enrollment
	*/
	public void setIcd9Drg2(java.lang.String icd9Drg2) {
		_enrollment.setIcd9Drg2(icd9Drg2);
	}

	/**
	* Returns the icd9 drg3 of this enrollment.
	*
	* @return the icd9 drg3 of this enrollment
	*/
	public java.lang.String getIcd9Drg3() {
		return _enrollment.getIcd9Drg3();
	}

	/**
	* Sets the icd9 drg3 of this enrollment.
	*
	* @param icd9Drg3 the icd9 drg3 of this enrollment
	*/
	public void setIcd9Drg3(java.lang.String icd9Drg3) {
		_enrollment.setIcd9Drg3(icd9Drg3);
	}

	/**
	* Returns the icd9 drg4 of this enrollment.
	*
	* @return the icd9 drg4 of this enrollment
	*/
	public java.lang.String getIcd9Drg4() {
		return _enrollment.getIcd9Drg4();
	}

	/**
	* Sets the icd9 drg4 of this enrollment.
	*
	* @param icd9Drg4 the icd9 drg4 of this enrollment
	*/
	public void setIcd9Drg4(java.lang.String icd9Drg4) {
		_enrollment.setIcd9Drg4(icd9Drg4);
	}

	/**
	* Returns the icd9 drg5 of this enrollment.
	*
	* @return the icd9 drg5 of this enrollment
	*/
	public java.lang.String getIcd9Drg5() {
		return _enrollment.getIcd9Drg5();
	}

	/**
	* Sets the icd9 drg5 of this enrollment.
	*
	* @param icd9Drg5 the icd9 drg5 of this enrollment
	*/
	public void setIcd9Drg5(java.lang.String icd9Drg5) {
		_enrollment.setIcd9Drg5(icd9Drg5);
	}

	/**
	* Returns the top5 icd9 by rev of this enrollment.
	*
	* @return the top5 icd9 by rev of this enrollment
	*/
	public java.lang.String getTop5Icd9ByRev() {
		return _enrollment.getTop5Icd9ByRev();
	}

	/**
	* Sets the top5 icd9 by rev of this enrollment.
	*
	* @param top5Icd9ByRev the top5 icd9 by rev of this enrollment
	*/
	public void setTop5Icd9ByRev(java.lang.String top5Icd9ByRev) {
		_enrollment.setTop5Icd9ByRev(top5Icd9ByRev);
	}

	/**
	* Returns the icd9 dx1 of this enrollment.
	*
	* @return the icd9 dx1 of this enrollment
	*/
	public java.lang.String getIcd9Dx1() {
		return _enrollment.getIcd9Dx1();
	}

	/**
	* Sets the icd9 dx1 of this enrollment.
	*
	* @param icd9Dx1 the icd9 dx1 of this enrollment
	*/
	public void setIcd9Dx1(java.lang.String icd9Dx1) {
		_enrollment.setIcd9Dx1(icd9Dx1);
	}

	/**
	* Returns the icd9 dx2 of this enrollment.
	*
	* @return the icd9 dx2 of this enrollment
	*/
	public java.lang.String getIcd9Dx2() {
		return _enrollment.getIcd9Dx2();
	}

	/**
	* Sets the icd9 dx2 of this enrollment.
	*
	* @param icd9Dx2 the icd9 dx2 of this enrollment
	*/
	public void setIcd9Dx2(java.lang.String icd9Dx2) {
		_enrollment.setIcd9Dx2(icd9Dx2);
	}

	/**
	* Returns the icd9 dx3 of this enrollment.
	*
	* @return the icd9 dx3 of this enrollment
	*/
	public java.lang.String getIcd9Dx3() {
		return _enrollment.getIcd9Dx3();
	}

	/**
	* Sets the icd9 dx3 of this enrollment.
	*
	* @param icd9Dx3 the icd9 dx3 of this enrollment
	*/
	public void setIcd9Dx3(java.lang.String icd9Dx3) {
		_enrollment.setIcd9Dx3(icd9Dx3);
	}

	/**
	* Returns the icd9 dx4 of this enrollment.
	*
	* @return the icd9 dx4 of this enrollment
	*/
	public java.lang.String getIcd9Dx4() {
		return _enrollment.getIcd9Dx4();
	}

	/**
	* Sets the icd9 dx4 of this enrollment.
	*
	* @param icd9Dx4 the icd9 dx4 of this enrollment
	*/
	public void setIcd9Dx4(java.lang.String icd9Dx4) {
		_enrollment.setIcd9Dx4(icd9Dx4);
	}

	/**
	* Returns the icd9 dx5 of this enrollment.
	*
	* @return the icd9 dx5 of this enrollment
	*/
	public java.lang.String getIcd9Dx5() {
		return _enrollment.getIcd9Dx5();
	}

	/**
	* Sets the icd9 dx5 of this enrollment.
	*
	* @param icd9Dx5 the icd9 dx5 of this enrollment
	*/
	public void setIcd9Dx5(java.lang.String icd9Dx5) {
		_enrollment.setIcd9Dx5(icd9Dx5);
	}

	/**
	* Returns the primary testing contact of this enrollment.
	*
	* @return the primary testing contact of this enrollment
	*/
	public java.lang.String getPrimaryTestingContact() {
		return _enrollment.getPrimaryTestingContact();
	}

	/**
	* Sets the primary testing contact of this enrollment.
	*
	* @param primaryTestingContact the primary testing contact of this enrollment
	*/
	public void setPrimaryTestingContact(java.lang.String primaryTestingContact) {
		_enrollment.setPrimaryTestingContact(primaryTestingContact);
	}

	/**
	* Returns the primary testing contact title of this enrollment.
	*
	* @return the primary testing contact title of this enrollment
	*/
	public java.lang.String getPrimaryTestingContactTitle() {
		return _enrollment.getPrimaryTestingContactTitle();
	}

	/**
	* Sets the primary testing contact title of this enrollment.
	*
	* @param primaryTestingContactTitle the primary testing contact title of this enrollment
	*/
	public void setPrimaryTestingContactTitle(
		java.lang.String primaryTestingContactTitle) {
		_enrollment.setPrimaryTestingContactTitle(primaryTestingContactTitle);
	}

	/**
	* Returns the primary testing contact phone of this enrollment.
	*
	* @return the primary testing contact phone of this enrollment
	*/
	public java.lang.String getPrimaryTestingContactPhone() {
		return _enrollment.getPrimaryTestingContactPhone();
	}

	/**
	* Sets the primary testing contact phone of this enrollment.
	*
	* @param primaryTestingContactPhone the primary testing contact phone of this enrollment
	*/
	public void setPrimaryTestingContactPhone(
		java.lang.String primaryTestingContactPhone) {
		_enrollment.setPrimaryTestingContactPhone(primaryTestingContactPhone);
	}

	/**
	* Returns the primary testing contact email of this enrollment.
	*
	* @return the primary testing contact email of this enrollment
	*/
	public java.lang.String getPrimaryTestingContactEmail() {
		return _enrollment.getPrimaryTestingContactEmail();
	}

	/**
	* Sets the primary testing contact email of this enrollment.
	*
	* @param primaryTestingContactEmail the primary testing contact email of this enrollment
	*/
	public void setPrimaryTestingContactEmail(
		java.lang.String primaryTestingContactEmail) {
		_enrollment.setPrimaryTestingContactEmail(primaryTestingContactEmail);
	}

	/**
	* Returns the primary coding contact of this enrollment.
	*
	* @return the primary coding contact of this enrollment
	*/
	public java.lang.String getPrimaryCodingContact() {
		return _enrollment.getPrimaryCodingContact();
	}

	/**
	* Sets the primary coding contact of this enrollment.
	*
	* @param primaryCodingContact the primary coding contact of this enrollment
	*/
	public void setPrimaryCodingContact(java.lang.String primaryCodingContact) {
		_enrollment.setPrimaryCodingContact(primaryCodingContact);
	}

	/**
	* Returns the primary coding contact title of this enrollment.
	*
	* @return the primary coding contact title of this enrollment
	*/
	public java.lang.String getPrimaryCodingContactTitle() {
		return _enrollment.getPrimaryCodingContactTitle();
	}

	/**
	* Sets the primary coding contact title of this enrollment.
	*
	* @param primaryCodingContactTitle the primary coding contact title of this enrollment
	*/
	public void setPrimaryCodingContactTitle(
		java.lang.String primaryCodingContactTitle) {
		_enrollment.setPrimaryCodingContactTitle(primaryCodingContactTitle);
	}

	/**
	* Returns the primary coding contact phone of this enrollment.
	*
	* @return the primary coding contact phone of this enrollment
	*/
	public java.lang.String getPrimaryCodingContactPhone() {
		return _enrollment.getPrimaryCodingContactPhone();
	}

	/**
	* Sets the primary coding contact phone of this enrollment.
	*
	* @param primaryCodingContactPhone the primary coding contact phone of this enrollment
	*/
	public void setPrimaryCodingContactPhone(
		java.lang.String primaryCodingContactPhone) {
		_enrollment.setPrimaryCodingContactPhone(primaryCodingContactPhone);
	}

	/**
	* Returns the primary coding contact email of this enrollment.
	*
	* @return the primary coding contact email of this enrollment
	*/
	public java.lang.String getPrimaryCodingContactEmail() {
		return _enrollment.getPrimaryCodingContactEmail();
	}

	/**
	* Sets the primary coding contact email of this enrollment.
	*
	* @param primaryCodingContactEmail the primary coding contact email of this enrollment
	*/
	public void setPrimaryCodingContactEmail(
		java.lang.String primaryCodingContactEmail) {
		_enrollment.setPrimaryCodingContactEmail(primaryCodingContactEmail);
	}

	/**
	* Returns the primary billing contact of this enrollment.
	*
	* @return the primary billing contact of this enrollment
	*/
	public java.lang.String getPrimaryBillingContact() {
		return _enrollment.getPrimaryBillingContact();
	}

	/**
	* Sets the primary billing contact of this enrollment.
	*
	* @param primaryBillingContact the primary billing contact of this enrollment
	*/
	public void setPrimaryBillingContact(java.lang.String primaryBillingContact) {
		_enrollment.setPrimaryBillingContact(primaryBillingContact);
	}

	/**
	* Returns the primary billing contact title of this enrollment.
	*
	* @return the primary billing contact title of this enrollment
	*/
	public java.lang.String getPrimaryBillingContactTitle() {
		return _enrollment.getPrimaryBillingContactTitle();
	}

	/**
	* Sets the primary billing contact title of this enrollment.
	*
	* @param primaryBillingContactTitle the primary billing contact title of this enrollment
	*/
	public void setPrimaryBillingContactTitle(
		java.lang.String primaryBillingContactTitle) {
		_enrollment.setPrimaryBillingContactTitle(primaryBillingContactTitle);
	}

	/**
	* Returns the primary billing contact phone of this enrollment.
	*
	* @return the primary billing contact phone of this enrollment
	*/
	public java.lang.String getPrimaryBillingContactPhone() {
		return _enrollment.getPrimaryBillingContactPhone();
	}

	/**
	* Sets the primary billing contact phone of this enrollment.
	*
	* @param primaryBillingContactPhone the primary billing contact phone of this enrollment
	*/
	public void setPrimaryBillingContactPhone(
		java.lang.String primaryBillingContactPhone) {
		_enrollment.setPrimaryBillingContactPhone(primaryBillingContactPhone);
	}

	/**
	* Returns the primary billing contact email of this enrollment.
	*
	* @return the primary billing contact email of this enrollment
	*/
	public java.lang.String getPrimaryBillingContactEmail() {
		return _enrollment.getPrimaryBillingContactEmail();
	}

	/**
	* Sets the primary billing contact email of this enrollment.
	*
	* @param primaryBillingContactEmail the primary billing contact email of this enrollment
	*/
	public void setPrimaryBillingContactEmail(
		java.lang.String primaryBillingContactEmail) {
		_enrollment.setPrimaryBillingContactEmail(primaryBillingContactEmail);
	}

	/**
	* Returns the file of this enrollment.
	*
	* @return the file of this enrollment
	*/
	public java.lang.String getFile() {
		return _enrollment.getFile();
	}

	/**
	* Sets the file of this enrollment.
	*
	* @param file the file of this enrollment
	*/
	public void setFile(java.lang.String file) {
		_enrollment.setFile(file);
	}

	public boolean isNew() {
		return _enrollment.isNew();
	}

	public void setNew(boolean n) {
		_enrollment.setNew(n);
	}

	public boolean isCachedModel() {
		return _enrollment.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_enrollment.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _enrollment.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _enrollment.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_enrollment.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _enrollment.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_enrollment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EnrollmentWrapper((Enrollment)_enrollment.clone());
	}

	public int compareTo(Enrollment enrollment) {
		return _enrollment.compareTo(enrollment);
	}

	@Override
	public int hashCode() {
		return _enrollment.hashCode();
	}

	public com.liferay.portal.model.CacheModel<Enrollment> toCacheModel() {
		return _enrollment.toCacheModel();
	}

	public Enrollment toEscapedModel() {
		return new EnrollmentWrapper(_enrollment.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _enrollment.toString();
	}

	public java.lang.String toXmlString() {
		return _enrollment.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_enrollment.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Enrollment getWrappedEnrollment() {
		return _enrollment;
	}

	public Enrollment getWrappedModel() {
		return _enrollment;
	}

	public void resetOriginalValues() {
		_enrollment.resetOriginalValues();
	}

	private Enrollment _enrollment;
}