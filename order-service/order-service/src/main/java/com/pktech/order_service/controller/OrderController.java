package com.pktech.order_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @GetMapping("/test")
    public String test() {
        return "Order Service Working!";
    }
}
