package com.bjcric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAppliction {
	/*
	 * @Configuration : 表示Application作为sprig配置文件存在
	 *  @EnableAutoConfiguration: 启动spring boot内置的自动配置
	 *  @ComponentScan : 扫描bean，路径为Application类所在package以及package下的子路径，
	 *  这里为 com.u51.lkl.springboot，在spring boot中bean都放置在该路径已经子路径下。
	 * */
	public static void main(String[] args) {
		SpringApplication.run(DemoAppliction.class, args);
		//这个最基本的springboot的工程完成
		//但是没什么卵用连最基本的helloworld都打不出来 
		//先从RESTController开始 先不说url跳转html
	}
}