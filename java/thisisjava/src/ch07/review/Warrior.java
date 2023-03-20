package ch07.review;

public class Warrior extends Character{
	
	// 부모의 생성자 실행
	Warrior(String name, int hp, int ap) {
		super(name, hp, ap);
	}
	
	// 전사만의 스킬
	void jumpAttack(Character c) {
		c.hp = c.hp - (this.ap+10);
	}
	
}
