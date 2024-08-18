package org.jsp.autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
public class MyConfig {
	@Bean
	public List<String> getList(){
		return new ArrayList<String>(Arrays.asList("Virat", "kohili", "Rahul"));
	}
	@Primary
	@Bean
	public List<String> getList2(){
		return new LinkedList<String>(Arrays.asList("Jeelani", "Tapan", "Ashish"));
		
	}
	
	@Bean
	public Set<Integer> getList3(){
		return new HashSet<Integer>(Arrays.asList(10, 20, 30));
	}
	@Primary
	@Bean
	public Set<Integer> getList4(){
		return new HashSet<Integer>(Arrays.asList(101, 202, 303));
	}
	
}
