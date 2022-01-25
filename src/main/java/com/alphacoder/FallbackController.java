package com.alphacoder;

import com.alphacoder.domain.FallbackResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @RequestMapping(value = "/trade-fallback")
    public ResponseEntity<FallbackResponse> tradeFallBack(){
        return ResponseEntity.internalServerError().body(
                new FallbackResponse("500", "Trade API is not responding, please try again."));
    }

    @RequestMapping(value = "/portfolio-fallback")
    public ResponseEntity<FallbackResponse> portfolioFallBack(){
        return ResponseEntity.internalServerError().body(
                new FallbackResponse("500", "Portfolio API is not responding, please try again."));
    }
}
