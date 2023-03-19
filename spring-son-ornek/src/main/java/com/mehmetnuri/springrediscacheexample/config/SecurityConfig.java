package com.mehmetnuri.springrediscacheexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.httpBasic().and()
                .authorizeRequests()
                .antMatchers("/api/v1/categories/**").hasRole("ADMIN")
                .antMatchers("/api/v1/mamakabi/**").hasRole("ADMIN")
                .antMatchers("/merhaba").permitAll()
                .antMatchers("/v2/**").permitAll()
                .and()
                .csrf().disable()
                .formLogin().disable();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {

        UserDetails user1 = User.builder().username("user").password("password").roles("USER").build();
        UserDetails user2=  User.builder().username("admin").password("password").roles("ADMIN").build();

        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(user1);
        manager.createUser(user2);
        return manager;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
