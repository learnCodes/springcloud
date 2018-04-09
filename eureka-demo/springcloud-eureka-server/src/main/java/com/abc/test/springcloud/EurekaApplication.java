/**
 * 
 */
package com.abc.test.springcloud;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZDT
 * 
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 new SpringApplicationBuilder(EurekaApplication.class).web(true).run(args);
	}

}
