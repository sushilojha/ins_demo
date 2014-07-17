package com.tcs.dews.lobintegration.spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.tcs.dews.lobintegration.LobIntegration;

public class DelegateRegistry {

	private final Map<String, LobIntegration> mappings = new HashMap<String, LobIntegration>();

	protected void addDelegate(String key, LobIntegration delegate) {
		mappings.put(key, delegate);
	}

	public LobIntegration get(String key) {
		return mappings.get(key);

	}

	public Collection<LobIntegration> getAll() {
		return mappings.values();
	}
}
