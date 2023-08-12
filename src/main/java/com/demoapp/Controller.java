package com.demoapp;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class Controller {

    @PostMapping(value = "/api/v1/transactions/wagers")
    public String transaction(
        @RequestBody DTO transactionRequest
    ) {
        return "success!";
    }
}
