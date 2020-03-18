package com.foxmail.chwetion.springcloud.demo.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/counter")
public class CounterController {
    private Random random = new Random();

    @GetMapping("/add")
    public String add() {
        int x = random.nextInt();
        int y = random.nextInt();
        return "random number x is " + x + " and random number y is " + y + " and result number of x+y is " + (x + y);
    }

    @GetMapping("/multi")
    public String multi() {
        double x = random.nextDouble();
        double y = random.nextDouble();
        return "random number x is " + x + " and random number y is " + y + " and result number of x*y is " + (x * y);
    }
}
