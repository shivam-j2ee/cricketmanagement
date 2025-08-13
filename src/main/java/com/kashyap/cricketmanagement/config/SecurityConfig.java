package com.kashyap.cricketmanagement.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    @Qualifier("myUserDetailService")
    private UserDetailsService userDetailsService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // Configure security settings here
        //http.csrf(customize -> customize.disable());// disable CSRF protection for simplicity
        //Customizer<CsrfConfigurer<HttpSecurity>> cust = new Customizer<CsrfConfigurer<HttpSecurity>>() {
          //  @Override
           // public void customize(CsrfConfigurer<HttpSecurity> customize) {
            //    customize.disable();
            //}
        //};
        //http.authorizeHttpRequests(request -> request.anyRequest().authenticated());// enable authentication for all requests
        //http.formLogin(Customizer.withDefaults());// for browser-based login
        //http.httpBasic(Customizer.withDefaults()); // for post-man
        //http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));// to make session stateless to handle CRSF in better way
        return http
                .csrf(customize -> customize.disable())// disable CSRF protection for simplicity
                .authorizeHttpRequests(request -> request.anyRequest().authenticated())// enable authentication for all requests
                .formLogin(Customizer.withDefaults())// for browser-based login
                .httpBasic(Customizer.withDefaults()) // for post-man
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))// to make session stateless to handle CRSF in better way
                .build(); // Replace with actual security filter chain configuration
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {

        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        //provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); // Use a no-op password encoder for simplicity
        provider.setPasswordEncoder(new BCryptPasswordEncoder(12)); // Use a no-op password encoder for simplicity
        provider.setUserDetailsService(userDetailsService); // Set the user details service
        return provider; // Replace with actual AuthenticationProvider implementation
    }

   // @Bean
    //not working due to password encoder issue
    //public UserDetailsService userDetailsService() {
        // Define your UserDetails here
      //  UserDetails user1 = User.builder()
             //   .passwordEncoder(NoOpPasswordEncoder.getInstance()) // Use a no-op password encoder for simplicity
        //        .username("kiran")
           //         .password("k@123")
             //   .roles("ADMIN").build();
        //return new InMemoryUserDetailsManager(user1); // Replace with actual UserDetailsService implementation
   // }
}
