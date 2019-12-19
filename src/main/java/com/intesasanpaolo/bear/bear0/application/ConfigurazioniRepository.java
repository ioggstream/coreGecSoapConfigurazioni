package com.intesasanpaolo.bear.bear0.application;


import com.intesasanpaolo.bear.bear0.model.Configurazione;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class ConfigurazioniRepository {

    private static final Map<String, Configurazione> configurazioneHashMap = new HashMap<String, Configurazione>();

    @PostConstruct
    public void initData() {

        Configurazione spain = new Configurazione();
        spain.setCodSoc("spainCodSoc");
        spain.setAcronimo("spainAcronimo");
        spain.setCodCanale("spainCodCanale");
        spain.setCodCliente("spainCodCliente");
        spain.setCodMerc("spainCodMerc");
        spain.setCodSistProv("spainCodSistProv");
        spain.setFiltroTemplateTradeSummary("spainFiltroTemplateTradeSummary");
        spain.setIndCliente("spainIndCliente");
        configurazioneHashMap.put(spain.getCodSoc(), spain);

        Configurazione italy = new Configurazione();
        italy.setCodSoc("italyCodSoc");
        italy.setAcronimo("italyAcronimo");
        italy.setCodCanale("italyCodCanale");
        italy.setCodCliente("italyCodCliente");
        italy.setCodMerc("italyCodMerc");
        italy.setCodSistProv("italyCodSistProv");
        italy.setFiltroTemplateTradeSummary("italyFiltroTemplateTradeSummary");
        italy.setIndCliente("italyIndCliente");
        configurazioneHashMap.put(italy.getCodSoc(), italy);

        Configurazione germany = new Configurazione();
        germany.setCodSoc("germanyCodSoc");
        germany.setAcronimo("germanyAcronimo");
        germany.setCodCanale("germanyCodCanale");
        germany.setCodCliente("germanyCodCliente");
        germany.setCodMerc("germanyCodMerc");
        germany.setCodSistProv("germanyCodSistProv");
        germany.setFiltroTemplateTradeSummary("germanyFiltroTemplateTradeSummary");
        germany.setIndCliente("germanyIndCliente");
        configurazioneHashMap.put(germany.getCodSoc(), germany);
    }

    public Boolean findConfigurazione(String configurazioneCodSoc){
        Assert.notNull(configurazioneCodSoc, "Config codSoc must not be nulllll");
        return configurazioneHashMap.containsKey(configurazioneCodSoc);
    }

}
