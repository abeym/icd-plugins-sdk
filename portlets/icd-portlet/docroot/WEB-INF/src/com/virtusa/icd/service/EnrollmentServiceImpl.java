package com.virtusa.icd.service;

import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.beans.factory.InitializingBean;

import com.liferay.portal.kernel.exception.SystemException;
import com.virtusa.icd.domain.EntityType;
import com.virtusa.icd.service.builder.model.Enrollment;
import com.virtusa.icd.service.builder.service.EnrollmentLocalServiceUtil;

public class EnrollmentServiceImpl implements InitializingBean,
		EnrollmentService {

	private String uploadSize;

	public String getUploadSize() {
		return uploadSize;
	}

	public void setUploadSize(String uploadSize) {
		this.uploadSize = uploadSize;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public SortedSet getEntityTypes() {
		SortedSet<EntityType> set = new TreeSet<EntityType>();
		set.add(new EntityType("Provider", "Provider"));
		set.add(new EntityType("Insurer", "Insurer"));
		set.add(new EntityType("Pharmacy", "Pharmacy"));
		return set;
	}

	@Override
	public Enrollment addEnrollment(String selectedEntityType, String organizationNPINum, String organizationName) throws SystemException {
		return EnrollmentLocalServiceUtil.addEnrollment(selectedEntityType, organizationNPINum, organizationName);
	}

}
