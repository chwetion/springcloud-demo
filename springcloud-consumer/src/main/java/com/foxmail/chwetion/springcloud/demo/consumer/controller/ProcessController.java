package com.foxmail.chwetion.springcloud.demo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/process")
public class ProcessController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public String add() {
        return "this is a spring cloud demo, it will access add interface from provider service <br>"
                + "the access result is: "
                + restTemplate.getForObject("http://provider/counter/add", String.class);
    }

    @GetMapping("multi")
    public String multi() {
        return "this is a spring cloud demo, it will access multi interface from provider service <br>"
                + "the access result is: "
                + restTemplate.getForObject("http://provider/counter/multi", String.class);
    }
}
