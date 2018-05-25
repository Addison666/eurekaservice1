package com.add.eurekaservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by THLiu on 5/23/2018.
 * e-mail: dlthliu@ibm.cn.com
 */
@RestController
public class ServiceController {

    @RequestMapping(value = "/api/client", method = RequestMethod.GET)
    public String client(){

        return "client";
    }
}
