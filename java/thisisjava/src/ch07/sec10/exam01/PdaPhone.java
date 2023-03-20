package ch07.sec10.exam01;

public abstract class PdaPhone {
	String owner;
	
	PdaPhone(String owner){
		this.owner = owner;
	}
	
	abstract void turnOn();	
	abstract void turnOff();

}
