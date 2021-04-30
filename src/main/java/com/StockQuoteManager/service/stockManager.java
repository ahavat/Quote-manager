package com.StockQuoteManager.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@Service
@FeignClient(url= "http://localhost:8080/stock " , name = "stockManager")
public class stockManager {

}
