package com.chapter_pichincha.library.config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

//public class DatabaseConfig {
//    private static DatabaseConfig instance;
//    private DataSource dataSource;
//
//    private DatabaseConfig() {
//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//        driverManagerDataSource.setDriverClassName("org.h2.Driver");
//        driverManagerDataSource.setUrl("jdbc:h2:mem:librarydb");
//        driverManagerDataSource.setUsername("sa");
//        driverManagerDataSource.setPassword("");
//        this.dataSource = driverManagerDataSource;
//    }
//
//    public static synchronized DatabaseConfig getInstance() {
//        if (instance == null) {
//            instance = new DatabaseConfig();
//        }
//        return instance;
//    }
//
//    public DataSource getDataSource() {
//        return dataSource;
//    }
//}
