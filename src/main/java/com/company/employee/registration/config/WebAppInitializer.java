package com.company.employee.registration.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
    protected String[] getServletMappings() {
        /* Map DispatcherServlet to /, handles, all the requests coming into the web app. */
        return new String[] {"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        /* Specify configuration data */
        return new Class<?>[] {WebConfig.class};
    }

}
