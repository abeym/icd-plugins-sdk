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
 * This class is used by SOAP remote services, specifically {@link com.virtusa.icd.service.builder.service.http.ReferencesServiceSoap}.
 *
 * @author    Brian Wing Shun Chan
 * @see       com.virtusa.icd.service.builder.service.http.ReferencesServiceSoap
 * @generated
 */
public class ReferencesSoap implements Serializable {
	public static ReferencesSoap toSoapModel(References model) {
		ReferencesSoap soapModel = new ReferencesSoap();

		soapModel.setReferencesId(model.getReferencesId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setReferencesName(model.getReferencesName());
		soapModel.setKey(model.getKey());
		soapModel.setValue(model.getValue());
		soapModel.setActive(model.getActive());
		soapModel.setOrder(model.getOrder());

		return soapModel;
	}

	public static ReferencesSoap[] toSoapModels(References[] models) {
		ReferencesSoap[] soapModels = new ReferencesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ReferencesSoap[][] toSoapModels(References[][] models) {
		ReferencesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ReferencesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ReferencesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ReferencesSoap[] toSoapModels(List<References> models) {
		List<ReferencesSoap> soapModels = new ArrayList<ReferencesSoap>(models.size());

		for (References model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ReferencesSoap[soapModels.size()]);
	}

	public ReferencesSoap() {
	}

	public long getPrimaryKey() {
		return _referencesId;
	}

	public void setPrimaryKey(long pk) {
		setReferencesId(pk);
	}

	public long getReferencesId() {
		return _referencesId;
	}

	public void setReferencesId(long referencesId) {
		_referencesId = referencesId;
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

	public String getReferencesName() {
		return _referencesName;
	}

	public void setReferencesName(String referencesName) {
		_referencesName = referencesName;
	}

	public String getKey() {
		return _key;
	}

	public void setKey(String key) {
		_key = key;
	}

	public String getValue() {
		return _value;
	}

	public void setValue(String value) {
		_value = value;
	}

	public String getActive() {
		return _active;
	}

	public void setActive(String active) {
		_active = active;
	}

	public int getOrder() {
		return _order;
	}

	public void setOrder(int order) {
		_order = order;
	}

	private long _referencesId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _referencesName;
	private String _key;
	private String _value;
	private String _active;
	private int _order;
}