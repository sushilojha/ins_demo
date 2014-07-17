package com.tcs.dews.lobintegration.util;

import java.io.Serializable;

import org.apache.commons.lang.builder.CompareToBuilder;

public class KeyValue implements Comparable<KeyValue>, Serializable {

	private static final long serialVersionUID = -2849778517637044587L;
	private String key;
	private String value;

	public KeyValue() {
		super();
	}

	public KeyValue(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int compareTo(KeyValue o) {

		return new CompareToBuilder().append(this.key, o.key).toComparison();
	}

}
