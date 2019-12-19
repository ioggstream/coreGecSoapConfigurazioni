package com.intesasanpaolo.bear.bear0.application;

import com.intesasanpaolo.bear.bear0.model.FindConfigurazioniValideRomo;
import com.intesasanpaolo.bear.bear0.model.FindConfigurazioniValideRomoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ConfigurazioneEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private ConfigurazioniRepository configurazioniRepository;

    @Autowired
    public ConfigurazioneEndpoint(ConfigurazioniRepository configurazioniRepository){
        this.configurazioniRepository = configurazioniRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findConfigurazioniValideRomo")
    @ResponsePayload
    public FindConfigurazioniValideRomoResponse findConfigurazioniValideRomo (@RequestPayload FindConfigurazioniValideRomo request) {
        FindConfigurazioniValideRomoResponse response = new FindConfigurazioniValideRomoResponse();
        response.setReturn(configurazioniRepository.findConfigurazione(request.getCodSoc()));
        return response;
    }

}
