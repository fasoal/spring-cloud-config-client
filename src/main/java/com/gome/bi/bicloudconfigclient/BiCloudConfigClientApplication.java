package com.gome.bi.bicloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BiCloudConfigClientApplication {

    @Value("${key1}") // git配置文件里的key
            String myww;

    @RequestMapping(value = "/hi")
    public String hi(){
        return myww;
    }

    public static void main(String[] args) {
        SpringApplication.run(BiCloudConfigClientApplication.class, args);
    }
}
