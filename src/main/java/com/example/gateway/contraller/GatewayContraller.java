package com.example.gateway.contraller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gatewayContraller")
public class GatewayContraller {

    @GetMapping("/gateway")
    public String gateway(){
        return "gateway success";
    }

}
