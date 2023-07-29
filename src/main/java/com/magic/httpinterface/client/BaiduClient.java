package com.magic.httpinterface.client;


import com.magic.httpinterface.vo.ChuckNorrisVO;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface BaiduClient {
    @GetExchange
    String get();
}
