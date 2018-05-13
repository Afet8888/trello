package az.itstep.azjava.testapp.security.config;


import az.itstep.azjava.testapp.security.controller.JwtAuthenticationEntryPoint;
import az.itstep.azjava.testapp.security.controller.JwtAuthorizationTokenFilter;
import az.itstep.azjava.testapp.security.service.JwtUserDetailsService;
import az.itstep.azjava.testapp.security.utils.JwtTokenUtil;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    private JwtAuthenticationEntryPoint unauthorizedHandler;


    private JwtAuthorizationTokenFilter jwtAuthorizationTokenFilter;


    @Value("${jwt.header}")
    private String tokenHeader;

    @Value("${jwt.route.authentication.path}")
    private String authenticationPath;


    @Autowired
    public void setUnauthorizedHandler(JwtAuthenticationEntryPoint unauthorizedHandler) {
        this.unauthorizedHandler = unauthorizedHandler;
    }

    @Autowired
    public void setJwtAuthorizationTokenFilter(JwtAuthorizationTokenFilter jwtAuthorizationTokenFilter) {
        this.jwtAuthorizationTokenFilter = jwtAuthorizationTokenFilter;
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .cors().and()
                .csrf().disable()
                .exceptionHandling().authenticationEntryPoint(unauthorizedHandler)
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                    .antMatchers("/signin", "/signup").permitAll()
                    .antMatchers(HttpMethod.POST, "/chats").hasRole("ADMIN")
                    .antMatchers(HttpMethod.GET, "/chats").hasAnyRole("ADMIN", "USER")
                    .anyRequest().authenticated();

        httpSecurity
                .addFilterBefore(jwtAuthorizationTokenFilter, UsernamePasswordAuthenticationFilter.class);

        // disable page caching
        httpSecurity
                .headers()
                .frameOptions().sameOrigin()
                .cacheControl();
    }
}
