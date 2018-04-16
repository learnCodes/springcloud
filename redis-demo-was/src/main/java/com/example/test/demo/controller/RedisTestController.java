package com.example.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class RedisTestController {
	@Autowired
    private StringRedisTemplate stringRedisTemplate;
	   
	@RequestMapping("/test/redis")
    @ResponseBody
    String home() {
		int random = (int)(Math.random()*100);
		stringRedisTemplate.opsForValue().set("test", "stringValue"+random);
		return stringRedisTemplate.opsForValue().get("test");
    }
	
	@RequestMapping("/test/redis/{id}")
    @ResponseBody
    String home(@PathVariable("id") String id) {
		stringRedisTemplate.opsForValue().set("test", "stringValue"+id);
		return stringRedisTemplate.opsForValue().get("test");
    }
}
