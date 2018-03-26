package java;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
@Component(basePackages="java")
public class SpringConfig extends WebMvcConfigurerAdapter {

	
	 @Bean

	    public ViewResolver viewResolver() {@Configuration

	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setViewClass(JstlView.class);

	        viewResolver.setPrefix("/WEB-INF/pages/");

	        viewResolver.setSuffix(".jsp");

	        return viewResolver;

	    }

	    @Override

	    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

	        configurer.enable();

	    }
}
