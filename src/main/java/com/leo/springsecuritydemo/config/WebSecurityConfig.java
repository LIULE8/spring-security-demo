package com.leo.springsecuritydemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 描述: spring security config
 *
 * @author LIULE9
 * @create 2018-11-13 10:38 AM
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
        .anyRequest().authenticated()
        .and()
        .formLogin()
        .and()
        .httpBasic()
        .and()
        .logout()
        .logoutUrl("/myLogout")
        .logoutSuccessUrl("/myLogin")
        .invalidateHttpSession(true)
        .deleteCookies("cookieName1", "cookieName2");
  }
}