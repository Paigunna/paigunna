/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paigunna.web;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/01/13
 */
@Controller
@EnableAutoConfiguration
public class AppStarter {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!, Paigunna.";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppStarter.class, args);
    }

}
