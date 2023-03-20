package ch07.review;

public class Wizard extends Character{
	
	Wizard(String name, int hp, int ap) {
		super(name, hp, ap);
	}
	
	
	void fireAttack(Character c) {
		c.hp = c.hp - (this.ap +15);
	}
}
