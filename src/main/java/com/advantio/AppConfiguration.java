package com.advantio;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import javax.sql.DataSource;


/**
 * Created by Bogdan on 25.06.2017.
 */
@Configuration
@ComponentScan(basePackages = "com.advantio")
@PropertySource("classpath:application.properties")
public class AppConfiguration {

    @Value("${url}")
    private String url;
    @Value("${username}")
    private String userName;
    @Value("${password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource(url, userName, password);
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory;
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
