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
 * This class is a wrapper for {@link References}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       References
 * @generated
 */
public class ReferencesWrapper implements References, ModelWrapper<References> {
	public ReferencesWrapper(References references) {
		_references = references;
	}

	public Class<?> getModelClass() {
		return References.class;
	}

	public String getModelClassName() {
		return References.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("referencesId", getReferencesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("referencesName", getReferencesName());
		attributes.put("key", getKey());
		attributes.put("value", getValue());
		attributes.put("active", getActive());
		attributes.put("order", getOrder());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long referencesId = (Long)attributes.get("referencesId");

		if (referencesId != null) {
			setReferencesId(referencesId);
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

		String referencesName = (String)attributes.get("referencesName");

		if (referencesName != null) {
			setReferencesName(referencesName);
		}

		String key = (String)attributes.get("key");

		if (key != null) {
			setKey(key);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		String active = (String)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Integer order = (Integer)attributes.get("order");

		if (order != null) {
			setOrder(order);
		}
	}

	/**
	* Returns the primary key of this references.
	*
	* @return the primary key of this references
	*/
	public long getPrimaryKey() {
		return _references.getPrimaryKey();
	}

	/**
	* Sets the primary key of this references.
	*
	* @param primaryKey the primary key of this references
	*/
	public void setPrimaryKey(long primaryKey) {
		_references.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the references ID of this references.
	*
	* @return the references ID of this references
	*/
	public long getReferencesId() {
		return _references.getReferencesId();
	}

	/**
	* Sets the references ID of this references.
	*
	* @param referencesId the references ID of this references
	*/
	public void setReferencesId(long referencesId) {
		_references.setReferencesId(referencesId);
	}

	/**
	* Returns the group ID of this references.
	*
	* @return the group ID of this references
	*/
	public long getGroupId() {
		return _references.getGroupId();
	}

	/**
	* Sets the group ID of this references.
	*
	* @param groupId the group ID of this references
	*/
	public void setGroupId(long groupId) {
		_references.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this references.
	*
	* @return the company ID of this references
	*/
	public long getCompanyId() {
		return _references.getCompanyId();
	}

	/**
	* Sets the company ID of this references.
	*
	* @param companyId the company ID of this references
	*/
	public void setCompanyId(long companyId) {
		_references.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this references.
	*
	* @return the user ID of this references
	*/
	public long getUserId() {
		return _references.getUserId();
	}

	/**
	* Sets the user ID of this references.
	*
	* @param userId the user ID of this references
	*/
	public void setUserId(long userId) {
		_references.setUserId(userId);
	}

	/**
	* Returns the user uuid of this references.
	*
	* @return the user uuid of this references
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _references.getUserUuid();
	}

	/**
	* Sets the user uuid of this references.
	*
	* @param userUuid the user uuid of this references
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_references.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this references.
	*
	* @return the user name of this references
	*/
	public java.lang.String getUserName() {
		return _references.getUserName();
	}

	/**
	* Sets the user name of this references.
	*
	* @param userName the user name of this references
	*/
	public void setUserName(java.lang.String userName) {
		_references.setUserName(userName);
	}

	/**
	* Returns the create date of this references.
	*
	* @return the create date of this references
	*/
	public java.util.Date getCreateDate() {
		return _references.getCreateDate();
	}

	/**
	* Sets the create date of this references.
	*
	* @param createDate the create date of this references
	*/
	public void setCreateDate(java.util.Date createDate) {
		_references.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this references.
	*
	* @return the modified date of this references
	*/
	public java.util.Date getModifiedDate() {
		return _references.getModifiedDate();
	}

	/**
	* Sets the modified date of this references.
	*
	* @param modifiedDate the modified date of this references
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_references.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the references name of this references.
	*
	* @return the references name of this references
	*/
	public java.lang.String getReferencesName() {
		return _references.getReferencesName();
	}

	/**
	* Sets the references name of this references.
	*
	* @param referencesName the references name of this references
	*/
	public void setReferencesName(java.lang.String referencesName) {
		_references.setReferencesName(referencesName);
	}

	/**
	* Returns the key of this references.
	*
	* @return the key of this references
	*/
	public java.lang.String getKey() {
		return _references.getKey();
	}

	/**
	* Sets the key of this references.
	*
	* @param key the key of this references
	*/
	public void setKey(java.lang.String key) {
		_references.setKey(key);
	}

	/**
	* Returns the value of this references.
	*
	* @return the value of this references
	*/
	public java.lang.String getValue() {
		return _references.getValue();
	}

	/**
	* Sets the value of this references.
	*
	* @param value the value of this references
	*/
	public void setValue(java.lang.String value) {
		_references.setValue(value);
	}

	/**
	* Returns the active of this references.
	*
	* @return the active of this references
	*/
	public java.lang.String getActive() {
		return _references.getActive();
	}

	/**
	* Sets the active of this references.
	*
	* @param active the active of this references
	*/
	public void setActive(java.lang.String active) {
		_references.setActive(active);
	}

	/**
	* Returns the order of this references.
	*
	* @return the order of this references
	*/
	public int getOrder() {
		return _references.getOrder();
	}

	/**
	* Sets the order of this references.
	*
	* @param order the order of this references
	*/
	public void setOrder(int order) {
		_references.setOrder(order);
	}

	public boolean isNew() {
		return _references.isNew();
	}

	public void setNew(boolean n) {
		_references.setNew(n);
	}

	public boolean isCachedModel() {
		return _references.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_references.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _references.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _references.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_references.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _references.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_references.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ReferencesWrapper((References)_references.clone());
	}

	public int compareTo(
		com.virtusa.icd.service.builder.model.References references) {
		return _references.compareTo(references);
	}

	@Override
	public int hashCode() {
		return _references.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.virtusa.icd.service.builder.model.References> toCacheModel() {
		return _references.toCacheModel();
	}

	public com.virtusa.icd.service.builder.model.References toEscapedModel() {
		return new ReferencesWrapper(_references.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _references.toString();
	}

	public java.lang.String toXmlString() {
		return _references.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_references.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public References getWrappedReferences() {
		return _references;
	}

	public References getWrappedModel() {
		return _references;
	}

	public void resetOriginalValues() {
		_references.resetOriginalValues();
	}

	private References _references;
}