/**
 * 系统名称：sc_server_demo
 * 文件名称：ProducerApplication.java
 * 创建人：ZDT  
 * 创建时间：Apr 8, 2018 7:01:31 PM   
 * 所属包名：com.abc.test.sc_server_demo
 */
package com.abc.test.sc_server_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZDT 
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProducerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}

}
