package com.virtusa.icd.service;

import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.beans.factory.InitializingBean;

import com.virtusa.icd.domain.EntityType;

public class MradminServiceImpl implements InitializingBean,
MradminService {


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

}
