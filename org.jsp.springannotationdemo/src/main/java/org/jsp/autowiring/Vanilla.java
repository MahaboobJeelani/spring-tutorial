package org.jsp.autowiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Vanilla implements IceCream{
	public void eat() {
		System.out.println("Baby is eating the vanilla iceCream");
		
	}
}
