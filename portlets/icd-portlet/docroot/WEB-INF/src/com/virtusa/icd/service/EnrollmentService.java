package com.virtusa.icd.service;

import java.util.SortedSet;
import java.util.TreeSet;

import com.liferay.portal.kernel.exception.SystemException;
import com.virtusa.icd.service.builder.model.Enrollment;

public interface EnrollmentService {

	public SortedSet getEntityTypes();

	public Enrollment addEnrollment(String selectedEntityType, String organizationNPINum, String organizationName) throws SystemException;

}
