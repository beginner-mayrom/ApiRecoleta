package br.com.recoleta.app.users.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import br.com.recoleta.app.users.UserService;
import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class WebSecurityConfig{

	private final UserService userservice;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		//método antigo
		http
		.authorizeRequests()
        .requestMatchers("/registration/**").permitAll()
        .requestMatchers("/user/**").permitAll()
        .anyRequest().authenticated()
        .and().csrf().disable();
		
		/*método atual, mas não funciona
		http
		.authorizeHttpRequests((authz) -> authz
				.anyRequest().authenticated()
				);
		//.httpBasic(withDefaults());
		  */
		return http.build();
	}
	
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setPasswordEncoder(bCryptPasswordEncoder);
		provider.setUserDetailsService(userservice);
		return provider;
	}
	
	public AuthenticationManagerBuilder authenticationManagerBuilder(AuthenticationManagerBuilder auth) throws Exception{
		auth.authenticationProvider(daoAuthenticationProvider());
		return auth;
	}
}
