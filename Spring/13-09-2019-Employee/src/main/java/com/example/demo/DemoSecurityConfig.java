package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// add our users for in memory authentication
		
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
			.withUser(users.username("john").password("test123").roles("EMPLOYEE"))
			.withUser(users.username("mary").password("test123").roles("EMPLOYEE","MANAGER"))
			.withUser(users.username("susan").password("test123").roles("EMPLOYEE","MANAGER","ADMIN"));
	}
	
	//@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
				.antMatchers("/").hasRole("EMPLOYEE")
				.antMatchers("/loginp/**").hasRole("MANAGER")
				.antMatchers("/loginc/**").hasRole("ADMIN")
				.antMatchers("/add/**").hasRole("ADMIN")
				.antMatchers("/employee/**").hasRole("ADMIN")
				.antMatchers("/pemployee/**").hasRole("ADMIN")
				.antMatchers("/cemployee/**").hasRole("ADMIN")
				.antMatchers("/employee/**").hasRole("ADMIN")

				.and()
			.formLogin()
				.permitAll()
				.and().logout().permitAll();
		
	}
}

