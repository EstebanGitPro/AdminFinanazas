package com.mybudget.personalbudget.adapter.init;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Esteban Agudelo
 */

@ConfigurationProperties("budget")
public class Credential {
	
	
	
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${spring.datasource.url}")
	private String url;
	
}
