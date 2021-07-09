package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {

//	We are returning parent bcz we need its object in Jdbc Template

	public DataSource getDataSource()

	{
		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("****");
		return ds;

	}

}
