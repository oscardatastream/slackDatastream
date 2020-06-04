package com.curso.java.configuraciones;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataSource {
	
	public DriverManagerDataSource getDriverManagerDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/alumnosjava2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		ds.setUsername("root");
		ds.setPassword("");		
		return ds;
	}

}
