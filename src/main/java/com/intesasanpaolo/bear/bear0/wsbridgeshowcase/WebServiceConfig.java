package com.intesasanpaolo.bear.bear0.wsbridgeshowcase;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean(name = "WSDLName") //WSDL name
    public DefaultWsdl11Definition defaultWsdl11Definition()
            throws IOException, SAXException, ParserConfigurationException {
        SimpleXsdSchema xsdSchema = new SimpleXsdSchema(new ClassPathResource("configurazione.xsd")); //replace with XSD file location
        xsdSchema.afterPropertiesSet();
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ConfigurazioniValideRomoPortType"); //replace with portType name
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.w3.org/2001/XMLSchema"); //replace with target namespace
        wsdl11Definition.setSchema(xsdSchema);
        wsdl11Definition.setRequestSuffix("FindConfigurazioniValideRomo"); //replace with the suffix of the request class
        wsdl11Definition.setResponseSuffix("FindConfigurazioniValideRomoResponse"); //replace with the suffix of the response class
        return wsdl11Definition;
    }

}
