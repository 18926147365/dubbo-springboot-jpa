/**
 * 
 */
package com.mchuan.coolact.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 李浩铭
 * @since 2018年5月23日 下午4:51:09
 */
@SpringBootApplication()
@EnableTransactionManagement()
@ImportResource("classpath:*.xml")
@ComponentScan(basePackages={"com.mchuan.coolact.service"})  
@EnableJpaRepositories(basePackages = {"com.mchuan.coolact.dao"})
@EntityScan("com.mchuan.coolact.entity")
public class MainConfig {
	public static void main(String[] args) {
		SpringApplication.run(MainConfig.class, args);
	}
}
