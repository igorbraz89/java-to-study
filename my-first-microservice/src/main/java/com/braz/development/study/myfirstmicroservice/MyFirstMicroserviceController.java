package com.braz.development.study.myfirstmicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstMicroserviceController {

	@GetMapping("/hello")
	public CustomResult getHello() {
		return new CustomResult("Hello budy");
	}
}
