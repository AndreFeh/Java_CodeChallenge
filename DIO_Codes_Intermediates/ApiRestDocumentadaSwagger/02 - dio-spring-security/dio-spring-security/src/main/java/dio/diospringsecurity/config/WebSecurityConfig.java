package dio.diospringsecurity.config;

import dio.diospringsecurity.config.SecurityDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


@Configuration                                      // Classe de configuração
@EnableWebSecurity                                  // Habilitando Segurança Web De Forma Manual
@EnableGlobalMethodSecurity(prePostEnabled = true)  // Recursos globais de configuração
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//Quando ja habilitado a classe SecurityDatabaseService, vinculando com Database nao ha necessidade de ter usuario em memoria
/*    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception { *//*Cria cadeia de usuarios em Memoria*//*
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("{noop}user123") *//*NOOP nivel de criptografia*//*
                .roles("USERS")
                .and()
                .withUser("andre")
                .password("{noop}admin123")
                .roles("MANAGERS");
    }*/
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/managers").hasAnyRole("MANAGERS")
                .antMatchers("/users").hasAnyRole("USERS","MANAGERS")
                .anyRequest().authenticated().and()/*formLogin() Aplicando segurança*/.httpBasic(); //nao terei mais a forma de seguranca atraves da tela de login
    }
    @Autowired //Injetando
    private SecurityDatabaseService securityService;
    @Autowired // Injetando uma Autenticação de gerenciador de autenticador
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityService).passwordEncoder(NoOpPasswordEncoder.getInstance()); // diz que o banco nao tem estrategia de criptografia

    }
}