package com.virtusa.icd.util;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import com.virtusa.icd.service.builder.model.References;
import com.virtusa.icd.service.builder.service.ReferencesLocalServiceUtil;

public class Utils {

	/**
	 * Utility function to get references.
	 * 
	 * @param refName
	 *            the reference catogery name
	 * @return a sorted set of references under that catogery
	 */
	public static SortedSet getReferences(String refName) {
		try {
			List<References> list = ReferencesLocalServiceUtil.getService()
					.getReferencesByName(refName);
			SortedSet<References> set = new TreeSet<References>();
			for (References ref : list) {
				set.add(ref);
			}
			return set;
		} catch (Exception e) {
			return null;
		}
	}
}
