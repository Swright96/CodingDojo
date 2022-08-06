package com.codingdojo.controllerspractice.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controllerspractice{
        @RequestMapping("/")
        public String hello() {
                return "Hello World!";
        }
}
