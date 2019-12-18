package com.intesasanpaolo.bear.bear0.wsbridgeshowcase;

import com.intesasanpaolo.bear.bear0.model.FindConfigurazioniValideRomo;
import com.intesasanpaolo.bear.bear0.model.FindConfigurazioniValideRomoResponse;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ConfigurazioniValideRomoEndpoint {

    private static final String NAMESPACE_URI = "http://oracle.j2ee.ws/ejb/GecWebService"; //namespace of XSD schema

    @Autowired
    private ObjectFactory objectFactory;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findConfigurazioniValideRomo")
    @ResponsePayload
    public FindConfigurazioniValideRomoResponse findConfigurazioniValideRomo (@RequestPayload FindConfigurazioniValideRomo cfg){
        FindConfigurazioniValideRomoResponse findConfigurazioniValideRomoResponse = null;
        findConfigurazioniValideRomoResponse.setReturn(true);
        return findConfigurazioniValideRomoResponse;

    }


}
