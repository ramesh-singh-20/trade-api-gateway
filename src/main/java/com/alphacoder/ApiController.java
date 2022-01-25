package com.alphacoder;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping(value = "/trade-fallback")
    public String tradeFallBack(){
        return "Trade API is not responding, please try again.";
    }

    @RequestMapping(value = "/portfolio-fallback")
    public String portfolioFallBack(){
        return "Portfolio API is not responding, please try again.";
    }
}
