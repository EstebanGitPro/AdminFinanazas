package com.mybudget.personalbudget.auth0;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import com.auth0.AuthenticationController;
import com.auth0.jwk.JwkProvider;
import com.auth0.jwk.JwkProviderBuilder;

@Configuration
@EnableWebSecurity
public class AuthConfig extends WebSecurityConfigurerAdapter {
    @Value(value = "${com.auth0.domain}")
    private String domain;

    @Value(value = "${com.auth0.clientId}")
    private String clientId;

    @Value(value = "${com.auth0.clientSecret}")
    private String clientSecret;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http
          .authorizeRequests()
          .antMatchers("/callback", "/login", "/").permitAll()
          .anyRequest().authenticated()
          .and()
          .formLogin()
          .loginPage("/login")
          .and()
          .logout().logoutSuccessHandler(LogoutSuccessHandler()).permitAll();
    }
    
  

	@Bean
    public AuthenticationController authenticationController() 
    	throws UnsupportedEncodingException {
        JwkProvider jwkProvider = new JwkProviderBuilder(domain).build();
        return AuthenticationController.newBuilder(domain, clientId, clientSecret)
          .withJwkProvider(jwkProvider)
          .build();
    }
}
