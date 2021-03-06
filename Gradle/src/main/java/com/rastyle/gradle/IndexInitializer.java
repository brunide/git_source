package com.rastyle.gradle;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.rastyle.gradle.config.IndexConfig;

public class IndexInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		RegisterDispatcherServlet(servletContext);
	}
	
	private void RegisterDispatcherServlet(ServletContext servletContext){
		WebApplicationContext dispatcherContext = createContext(IndexConfig.class);
		DispatcherServlet dispatcherServlet = new DispatcherServlet(dispatcherContext);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", dispatcherServlet);
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("*.htm");
		///wqeqw
	}
	
	private WebApplicationContext createContext(Class<?>...  annotatedClasses){
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		
		context.register(annotatedClasses);
		return context;
	}
	
	
}
