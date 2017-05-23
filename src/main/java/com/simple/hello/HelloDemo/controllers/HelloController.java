package com.simple.hello.HelloDemo.controllers;

import com.simple.hello.HelloDemo.conf.AppConfig;
import com.simple.hello.HelloDemo.mappers.HelloText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by win_user on 23/05/2017.
 */
@RestController
public class HelloController {

    @Autowired
    private JdbcTemplate temp;

    @Autowired
    private HelloText helloText;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        String s = this.helloText.getHelloText();
        return "Hello "+s;
    }
}
