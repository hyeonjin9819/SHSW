package ch07.review;

import java.util.Random;

public class Battle {

	public static void main(String[] args) {
		Warrior warrior = new Warrior("전사", 100, 10);
		Wizard wizard = new GrateWizard("마법사", 80, 5);
		
		// 전사의 체력
		System.out.println("전사 체력: " + warrior.hp);
		// 마법사의 체력
		System.out.println("마법사 체력: " +wizard.hp);
		
		// 전사 -> 마법사 공격
		warrior.attack(wizard);
		System.out.println("마법사 체력: " +wizard.hp);
		
		// 랜덤 전투
		randomBattle(wizard, warrior);
		
		// 전사의 체력
		System.out.println("전사 체력: " + warrior.hp);
		// 마법사의 체력
		System.out.println("마법사 체력: " +wizard.hp);
	}
	
	public static void randomBattle(Character c1, Character c2) {
		boolean flag = true;
		
		while(flag) {
			int n = (int)(Math.random()*2);
			Character [] c = new Character[2];
			if (n==0) {
				c[0] = c1;
				c[1] = c2;
			} else {
				c[0] = c2;
				c[1] = c1;
			}
			
			c[0].attack(c[1]);
			
			if (c[0].hp <=0 || c[1].hp <=0) {
				flag = false;
				System.out.println("게임 종료");
			}
			
//			int A = (n == 0) ? c1.attack(c2) : c2.attack(c1);
//			
//			if (A <=0 || A <=0) {
//			flag = false;
//			System.out.println("게임 종료");
//		}
		}
	}
	


}
