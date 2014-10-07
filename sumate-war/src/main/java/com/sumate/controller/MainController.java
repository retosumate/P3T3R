/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author 09050793
 */
@Controller
public class MainController {
    
    @RequestMapping(value = "/")
    public String home() {
        return "home";
    }
}
