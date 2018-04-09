/**
 * 系统名称：sc_client_demo
 * 文件名称：HelloMethodRemote.java
 * 创建人：ZDT  
 * 创建时间：Apr 9, 2018 8:46:22 AM   
 * 所属包名：com.abc.test.sc_client_demo.interfaces
 */
package com.abc.test.sc_client_demo.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ZDT 
 *
 */
@FeignClient(name= "spring-cloud-producer-demo1")
public interface HelloRemote {
	@RequestMapping(value = "/hello")
	public String hello(@RequestParam(value = "name") String name);
}
