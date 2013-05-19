/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.virtusa.icd.service.builder;

import com.liferay.portal.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchEnrollmentException extends NoSuchModelException {

	public NoSuchEnrollmentException() {
		super();
	}

	public NoSuchEnrollmentException(String msg) {
		super(msg);
	}

	public NoSuchEnrollmentException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchEnrollmentException(Throwable cause) {
		super(cause);
	}

}