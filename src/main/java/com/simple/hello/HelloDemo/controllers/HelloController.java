package com.simple.hello.HelloDemo.controllers;

import com.simple.hello.HelloDemo.mappers.HelloTextMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by win_user on 23/05/2017.
 */
@RestController
public class HelloController {

    @Autowired
    private JdbcTemplate temp;

    @Autowired
    private HelloTextMapper helloText;

    @RequestMapping("/hellotext")
    public String hellotext(@RequestParam(value="name", defaultValue="World") String name) {
        String s = this.helloText.getHelloText();
        return "Hello "+s;
    }

    @RequestMapping("/change")
    public String change(@RequestParam(value="text", defaultValue="World") String text) {
        this.helloText.updateHelloText(text);
        return "changed";
    }
}
