package com.abc.test.sc_client_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.abc.test.sc_client_demo.remote.HelloRemote;

@RestController
public class HelloController {
	@Autowired
	HelloRemote HelloRemote;
	
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return HelloRemote.hello(name);
    }
}
