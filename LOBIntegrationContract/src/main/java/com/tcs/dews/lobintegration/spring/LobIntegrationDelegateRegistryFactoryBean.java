package com.tcs.dews.lobintegration.spring;

import java.util.List;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.web.client.RestTemplate;

import com.tcs.dews.lobintegration.delegate.LobIntegrationDelegate;
import com.tcs.dews.lobintegration.util.ApplicationUrlUtils;

public class LobIntegrationDelegateRegistryFactoryBean  extends IntegrationDelegateFactoryBean implements
		FactoryBean<DelegateRegistry> {

	private List<DelegateConfig> delegateConfigs;
	
	@Override
	public DelegateRegistry getObject() throws Exception {
		
		DelegateRegistry registry = new DelegateRegistry();
		RestTemplate restTemplate = restTemplate();
		ApplicationUrlUtils applicationUrlUtils = new ApplicationUrlUtils();
		
		for ( DelegateConfig delegateConfig : delegateConfigs ){
			LobIntegrationDelegate lobIntegrationDelegate = new LobIntegrationDelegate(delegateConfig.getContextRoot(), delegateConfig.getDefaultHost());
			
			lobIntegrationDelegate.setRestTemplate(restTemplate);
			lobIntegrationDelegate.setApplicationUrlUtils(applicationUrlUtils);
			registry.addDelegate(delegateConfig.getKey(), lobIntegrationDelegate);
		}
		
		return registry;
	}

	@Override
	public Class<?> getObjectType() {		
		return DelegateRegistry.class;
	}

	@Override
	public boolean isSingleton() {		
		return true;
	}

	public List<DelegateConfig> getDelegateConfigs() {
		return delegateConfigs;
	}

	public void setDelegateConfigs(List<DelegateConfig> delegateConfigs) {
		this.delegateConfigs = delegateConfigs;
	}

	
}
