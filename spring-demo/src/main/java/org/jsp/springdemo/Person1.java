package org.jsp.springdemo;

public class Person1 {
	private PanCard card;
	
	public Person1() {
	}
	
	public Person1(PanCard card) {
		this.card =  card;
	}
	
	public PanCard getCard() {
		return card;
	}
	public void setCard(PanCard card) {
		this.card = card;
	}
}
