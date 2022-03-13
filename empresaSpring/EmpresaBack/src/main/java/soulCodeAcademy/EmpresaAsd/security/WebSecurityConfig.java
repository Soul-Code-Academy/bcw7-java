//package soulCodeAcademy.EmpresaAsd.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//
//	protected void configure(HttpSecurity http) throws Exception{
//		
//		http.authorizeRequests()
//		.antMatchers("//cdn.jsdelivr.net/**").permitAll()
//		.anyRequest()//As configurações definidas devem ser seguidas ppor todas requisições
//		.authenticated()//O usuário deve estar autenticado para acessar nossas requisições
//		.and()
//		.formLogin()
//		.loginPage("/login")
//		.permitAll();
//		
//	}
//}
