package com.curso.java.configuraciones;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext appContex = new AnnotationConfigWebApplicationContext();
		appContex.setConfigLocation("com.curso.java.configuraciones.MiAPP");

		ServletRegistration.Dynamic registro = servletContext.addServlet("miFirstApp",
				new DispatcherServlet(appContex));
		registro.setLoadOnStartup(1);
		registro.addMapping("*.html");
	}

}
