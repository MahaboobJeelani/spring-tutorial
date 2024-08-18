package org.jsp.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Chocolate implements IceCream{

	public void eat() {
		System.out.println("Baby is eating the Chocolate IceCream");
	}
	
	
}
