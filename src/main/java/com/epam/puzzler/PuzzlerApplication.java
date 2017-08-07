package com.epam.puzzler;

import ch.qos.logback.core.joran.util.beans.BeanDescriptionFactory;
import com.epam.puzzler.service.CommonService;
import com.epam.puzzler.service.WrapperCommonService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
public class PuzzlerApplication {

	private WrapperCommonService service;

	public PuzzlerApplication(WrapperCommonService service){
		this.service = service;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PuzzlerApplication.class, args);
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//context.register(PuzzlerApplication.class);
		//context.scan("com.epam.puzzler");
		//context.refresh();
		PuzzlerApplication puzzler = context.getBean(PuzzlerApplication.class);
		puzzler.printClassLoader();
		BeanFactoryPostProcessor a;
		BeanFactory b;
	}

	public void printClassLoader(){
		service.printClassLoaders(this.getClass());
	}

	//@Bean
	//public PuzzlerApplication puzzlerApplication(WrapperCommonService service){
	//	return new PuzzlerApplication(service);
	//}


}
