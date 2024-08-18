package org.jsp.springannotationbase;

import org.btm.springannotationbase.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired(required = true)
	private Engine e;
	public Car() {
	}
	public Car(Engine e) {
		this.e = e;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
}
