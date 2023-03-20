package ch06.practice.p02;

public class ItemTest {

	public static void main(String[] args) {
		 Item storm = new Item("스톰 브레이커", 600);
		 Item gauntlet = new Item("인피니티 건틀렛", 999);
		 Item bow = new Item("호크아이의 활", 50);
		 Item shield = new Item("캡틴아메리카의 방패", 50);
		    
		 // 객체 배열에 아이템 할당
		 Item[] items = new Item[4];
		 items[0] = storm;
		 items[1] = gauntlet;
		 items[2] = bow;
		 items[3] = shield;
		    
		    /* 2. 모든 아이템 정보를 출력하세요. */
		 for (int i =0; i<items.length; i++) {
			 System.out.println(items[i].toString());
		 }
	}

}
