
package com.carlaospa.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * HelloController
 */
@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String getString() {
        return "Olá Mundo";
    }
    
    
}