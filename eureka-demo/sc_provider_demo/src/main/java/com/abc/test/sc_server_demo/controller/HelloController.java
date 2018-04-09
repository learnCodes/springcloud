/**
 * 系统名称：sc_server_demo
 * 文件名称：HelloController.java
 * 创建人：ZDT  
 * 创建时间：Apr 8, 2018 7:03:52 PM   
 * 所属包名：com.abc.test.sc_server_demo.controller
 */
package com.abc.test.sc_server_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZDT 
 *
 */
@RestController
public class HelloController {
	
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }
}