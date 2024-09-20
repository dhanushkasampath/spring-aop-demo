package com.learn.spring_aop_demo;

import com.learn.spring_aop_demo.config.BeanConfig;
import com.learn.spring_aop_demo.service.ShoppingCart;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringAopDemoApplication {

	public static void main(String[] args) {
		//we get the context. And from this context we can get the beans
		ApplicationContext context
				= new AnnotationConfigApplicationContext(BeanConfig.class);

		//suppose I want the shopping cart bean. Then I can get it as follows
		ShoppingCart cart = context.getBean(ShoppingCart.class);// in brackets, I say, I need the bean of type ShoppingCart.class
		//then we can call the methods in this bean
		cart.checkout("CANCELLED");
//		SpringApplication.run(SpringAopDemoApplication.class, args);
	}

}
