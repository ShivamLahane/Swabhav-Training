package com.techlabs.beanConfigs;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.techlabs.services.SessionService;

@Component
public class SessionServiceBeanConfig
{
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public SessionService getSessionService()
	{
		return new SessionService();
	}
}
