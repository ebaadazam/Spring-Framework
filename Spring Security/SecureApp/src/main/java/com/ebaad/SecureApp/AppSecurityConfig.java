package com.ebaad.secureapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration // annotation use for configuration
@EnableWebSecurity // it will enable the web security
// To change the username and password we have to do some configuration in AppSecurityConfig and need to extend this class with WebSecurityConfigurerAdapter so that we get all the configuration features
public class AppSecurityConfig extends WebSecurityConfigurerAdapter
{
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public AuthenticationProvider authProvider()
	{
    // If we want to work with the database then we use DaoAuthenticationProvider
		DaoAuthenticationProvider provider =new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		return provider;
	}
	
	
	
   @Bean // to get the object of UserDetailsService
   @Override
   // Overridden method of WebSecurityConfigurerAdapter interface
   protected UserDetailsService userDetailsService() {
       // UserDetails is an inbuilt class in spring security 
       List<UserDetails> users = new ArrayList<>();
       users.add(User.withDefaultPasswordEncoder().username("ebaad").password("1234").roles("USER").build());
    		
       return new InMemoryUserDetailsManager(users);
   } 

}
