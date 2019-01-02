package com.hans.spingbootDemo.config;

import com.hans.spingbootDemo.controller.interceptor.OneInterceptor;
import com.hans.spingbootDemo.controller.interceptor.TwoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new OneInterceptor()).addPathPatterns("/one/**");
        registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/one/**")
                .addPathPatterns("/two/**");

        super.addInterceptors(registry);

    }
}
