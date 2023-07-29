package com.magic.httpinterface.controller;

import com.magic.httpinterface.client.BaiduClient;
import com.magic.httpinterface.client.ChuckNorrisClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Timer;

@RestController
@Slf4j
public class ChuckNorrisController {

    private final ChuckNorrisClient chuckNorrisClient;

    private final BaiduClient baiduClient;

    public ChuckNorrisController(ChuckNorrisClient chuckNorrisClient, BaiduClient baiduClient) {
        this.chuckNorrisClient = chuckNorrisClient;
        this.baiduClient = baiduClient;
    }

    @GetMapping("/")
    public String remote() {
        log.info("3:{}", chuckNorrisClient.getCategories());
        log.info("1:{}", chuckNorrisClient.getRandomQuote());
        log.info("2:{}", chuckNorrisClient.getQuoteFromCategory("hahaha"));
        return "SUCCESS";
    }

    @GetMapping("/baidu")
    public String baidu() {
        log.info("2:{}", baiduClient.get());
        return "SUCCESS";
    }
}
