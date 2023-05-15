package com.bstek.demo.urule.web;

import com.bstek.demo.urule.entity.Customer;
import com.bstek.demo.urule.entity.Weather;
import com.bstek.demo.urule.service.CustomerService;
import com.bstek.demo.urule.service.WeatherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping(value = "/wydDemoTest")
@RestController
public class MyController {

    @Resource
    private WeatherService weatherService;
    @Resource
    private CustomerService customerService;

    @RequestMapping(value = "/testUrule", method = RequestMethod.GET)
    public String testUrule(Long customerId, Integer weatherId) {
        Weather weather = weatherService.queryById(weatherId);
        Customer customer = customerService.queryById(customerId);

        return "redirect:/urule/login";
    }
}
