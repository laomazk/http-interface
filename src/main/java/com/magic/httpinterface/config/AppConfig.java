package com.magic.httpinterface.config;

import com.magic.httpinterface.client.BaiduClient;
import com.magic.httpinterface.client.ChuckNorrisClient;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class AppConfig {

    @Bean
    @SneakyThrows
    public ChuckNorrisClient chuckNorrisClient() {
        WebClient webClient = WebClient.builder()
                .baseUrl("https://api.chucknorris.io")
                .build();
        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(webClient))
                .build();

        return httpServiceProxyFactory.createClient(ChuckNorrisClient.class);
    }


    @Bean
    @SneakyThrows
    public BaiduClient baiduClient() {
        WebClient webClient = WebClient.builder()
                .baseUrl("https://www.baidu.com/")
                .build();
        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(webClient))
                .build();

        return httpServiceProxyFactory.createClient(BaiduClient.class);
    }
}
