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

import com.virtusa.icd.service.builder.model.References;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing References in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see References
 * @generated
 */
public class ReferencesCacheModel implements CacheModel<References>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{referencesId=");
		sb.append(referencesId);
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
		sb.append(", referencesName=");
		sb.append(referencesName);
		sb.append(", key=");
		sb.append(key);
		sb.append(", value=");
		sb.append(value);
		sb.append(", active=");
		sb.append(active);
		sb.append(", order=");
		sb.append(order);
		sb.append("}");

		return sb.toString();
	}

	public References toEntityModel() {
		ReferencesImpl referencesImpl = new ReferencesImpl();

		referencesImpl.setReferencesId(referencesId);
		referencesImpl.setGroupId(groupId);
		referencesImpl.setCompanyId(companyId);
		referencesImpl.setUserId(userId);

		if (userName == null) {
			referencesImpl.setUserName(StringPool.BLANK);
		}
		else {
			referencesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			referencesImpl.setCreateDate(null);
		}
		else {
			referencesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			referencesImpl.setModifiedDate(null);
		}
		else {
			referencesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (referencesName == null) {
			referencesImpl.setReferencesName(StringPool.BLANK);
		}
		else {
			referencesImpl.setReferencesName(referencesName);
		}

		if (key == null) {
			referencesImpl.setKey(StringPool.BLANK);
		}
		else {
			referencesImpl.setKey(key);
		}

		if (value == null) {
			referencesImpl.setValue(StringPool.BLANK);
		}
		else {
			referencesImpl.setValue(value);
		}

		if (active == null) {
			referencesImpl.setActive(StringPool.BLANK);
		}
		else {
			referencesImpl.setActive(active);
		}

		referencesImpl.setOrder(order);

		referencesImpl.resetOriginalValues();

		return referencesImpl;
	}

	public long referencesId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String referencesName;
	public String key;
	public String value;
	public String active;
	public int order;
}