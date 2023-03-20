package ch07.review;

public class GrateWizard extends Wizard{
	GrateWizard(String name, int hp, int ap) {
		super(name, hp+30, ap+50);
	}
	
	// 메서드 재정의
	@Override
	void attack(Character c) {
		System.out.println("대마법사 " + this.name + "가 " + c.name + "를 공격");
		c.hp = c.hp - this.ap <0 ? 0: c.hp - this.ap; // 죽으면 체력은 0
		
		
	}
}
