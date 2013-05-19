package com.virtusa.icd.domain;

import java.io.Serializable;

public final class EntityType implements Comparable, Serializable {
	private String key;
	private String value;
	private int hashCode = -2147483648;

	public EntityType(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	@Override
	public int compareTo(Object obj) {
	    if (obj == null) {
	        throw new NullPointerException("Cannot compare to null object");
	      }
	      if (!(obj instanceof EntityType)) {
	        throw new ClassCastException("Can only compare to class " + getClass().getName());
	      }

	      if (equals(obj)) {
	        return 0;
	      }
	      EntityType entity = (EntityType) obj;
	      int res = this.key.compareTo(entity.key);
	      if(res !=0)
	    	  return res;

	      return this.value.compareTo(entity.value);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof EntityType))
			return false;
		EntityType entity = (EntityType) obj;
		if ((this.key == null) || (this.value == null) || (entity.key == null)
				|| (entity.value == null))
			return false;

		return this.key.equals(entity.key) && this.value.equals(entity.value);
	}

	@Override
	public int hashCode() {
		if (-2147483648 == this.hashCode) {
			String hashStr = getClass().getName() + ":" + toString();
			this.hashCode = hashStr.hashCode();
		}
		return this.hashCode;
	}

	@Override
	public String toString() {
		return this.key + ":" + this.value;
	}
}
