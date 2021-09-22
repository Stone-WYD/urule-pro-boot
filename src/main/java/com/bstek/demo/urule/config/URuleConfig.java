package com.bstek.demo.urule.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bstek.urule.KnowledgePackageReceiverServlet;
import com.bstek.urule.console.URuleServlet;

/**
 * URULE配置
 */
@Configuration
public class URuleConfig {
    @Bean
    public ServletRegistrationBean<URuleServlet> registerUruleServlet() {
        ServletRegistrationBean<URuleServlet> servletRegistrationBean = new ServletRegistrationBean<URuleServlet>(
                new URuleServlet(), "/urule/*");
        return servletRegistrationBean;
    }
    
    @Bean
    public ServletRegistrationBean<KnowledgePackageReceiverServlet> registerKnowledgeServlet() {
        ServletRegistrationBean<KnowledgePackageReceiverServlet> servletRegistrationBean = new ServletRegistrationBean<KnowledgePackageReceiverServlet>(
                new KnowledgePackageReceiverServlet(), "/knowledgepackagereceiver");
        return servletRegistrationBean;
    }
}