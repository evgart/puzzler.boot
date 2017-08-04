package com.epam.puzzler;

import com.epam.puzzler.service.CommonService;
import com.epam.puzzler.service.WrapperCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PuzzlerApplication {

	private WrapperCommonService service;

	public PuzzlerApplication(WrapperCommonService service){
		this.service = service;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PuzzlerApplication.class, args);
		PuzzlerApplication puzzler = context.getBean(PuzzlerApplication.class);
		puzzler.printClassLoader();
	}

	public void printClassLoader(){
		service.printClassLoaders(this.getClass());
	}

	//@Bean
	//public PuzzlerApplication puzzlerApplication(WrapperCommonService service){
	//	return new PuzzlerApplication(service);
	//}


}
