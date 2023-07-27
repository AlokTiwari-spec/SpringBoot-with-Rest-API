package com.alok.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public FilterBean filtering() {
		
		return new FilterBean("value 1", "value 2","value 3");
	}
	
	@GetMapping("/filtering-list")
	public List<FilterBean> filteringList() {
		
		return Arrays.asList(new FilterBean("value 1", "value 2","value 3")
				,new FilterBean("value 4", "value 5","value 6"
				));
	}
}
