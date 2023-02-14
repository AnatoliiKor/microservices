package com.epam.javacc.microservices.two.common;

import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigPropertiesController {

    private final DynamicStringProperty eurekaPort;
    private final DynamicStringProperty onePort;
    private final DynamicStringProperty twoPort;
    private final DynamicStringProperty extra;
    private final DynamicStringProperty eurekaDefaultZone;

    public ConfigPropertiesController() {
        eurekaPort = DynamicPropertyFactory.getInstance().getStringProperty("eureka.port", "8066");
        onePort = DynamicPropertyFactory.getInstance().getStringProperty("one.port", "8001");
        twoPort = DynamicPropertyFactory.getInstance().getStringProperty("two.port", "8002");
        extra = DynamicPropertyFactory.getInstance().getStringProperty("extra.property", "default");
        eurekaDefaultZone = DynamicPropertyFactory.getInstance()
                .getStringProperty("eureka.client.service-url.defaultZone", "http://localhost:8066/eureka");
    }

    @GetMapping("/eurekaPort")
    public String getEurekaPortValue() {
        return "Eureka port is: " + eurekaPort.getValue();
    }

    @GetMapping("/onePort")
    public String getOnePortValue() {
        return "Port for module 'One' is: " + onePort.getValue();
    }

    @GetMapping("/twoPort")
    public String getTwoPortValue() {
        return "Port for module 'Two' is: " + twoPort.getValue();
    }

    @GetMapping("/eurekaZone")
    public String getEurekaDefaultZoneValue() {
        return "Default zone for Eureka is: " + eurekaDefaultZone.getValue();
    }

    @GetMapping("/extra")
    public String getExtraValue() {
        return "Extra property is: " + extra.getValue();
    }
}
