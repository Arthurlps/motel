package br.com.motelFatec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.motelFatec.controller.MotelController;
import br.com.motelFatec.dao.ClienteDAO;

@EnableWebMvc
@ComponentScan(basePackageClasses = { MotelController.class, ClienteDAO.class })
public class AppWebConfiguration {

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");

        return resolver;
    }

}
