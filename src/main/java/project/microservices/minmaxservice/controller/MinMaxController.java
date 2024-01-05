package project.microservices.minmaxservice.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import project.microservices.minmaxservice.bean.MinMax;
import project.microservices.minmaxservice.configuration.Configuration;

@RestController
public class MinMaxController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/minmax")
	public MinMax getLimits() {
		return new MinMax(configuration.getMin(), configuration.getMax());
	}

}
