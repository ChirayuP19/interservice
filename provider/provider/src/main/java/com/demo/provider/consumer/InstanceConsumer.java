package com.demo.provider.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstanceConsumer {

    private final String InstanceId=java.util.UUID.randomUUID().toString();

    @Value("${server.port}")
    private String port;

    @GetMapping("/instance-info")
    public String  getInstanceInfo(){
        System.out.println("request received at instance running on port: "+port);
        return "Instance served by port: "+port+" Instance Id: "+InstanceId;
    }
}
