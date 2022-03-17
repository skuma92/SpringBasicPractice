package com.shivam;

import com.shivam.service.SpringServiceTest;
import com.shivam.service.SprintServiceTestNew;
import com.shivam.service.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class SpringTestApplication implements CommandLineRunner {

	@Autowired
	ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}

	@Bean
	public SpringServiceTest springServiceTestOne(){
		return new SpringServiceTest();
	}

	@Bean(name = "newBean")
	public SpringServiceTest springServiceTestTwo(){
		return new SprintServiceTestNew();
	}

	@Override
	public void run(String... args) throws Exception {
		TestBean b = context.getBean(TestBean.class);
		b.method1();
		b.method2();
	}
}
