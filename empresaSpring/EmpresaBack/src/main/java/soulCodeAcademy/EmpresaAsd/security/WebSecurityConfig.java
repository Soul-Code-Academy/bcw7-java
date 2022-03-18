package soulCodeAcademy.EmpresaAsd.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;

@Configuration

public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors();
		http.csrf().disable();
		  http.authorizeRequests().antMatchers("/**").fullyAuthenticated().and
		 ().httpBasic(); 
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("javatechie").password("{noop}jt143").roles("USER");
	}

}
