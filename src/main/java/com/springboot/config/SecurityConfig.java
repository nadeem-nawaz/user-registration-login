package com.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http
		.csrf(csrf->csrf.disable())
		.authorizeHttpRequests(auth-> auth
				.requestMatchers("/actuator/monitor-springversion").authenticated()
				.anyRequest().permitAll()
				)
		.httpBasic()
		.and()
		.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		return http.build();
				
	}
	@Bean
	UserDetailsService userDetailService() {
		UserDetails user = User.withUsername("monitor").password("{noop}monitor123").build();
		return new InMemoryUserDetailsManager(user);
	}
}
