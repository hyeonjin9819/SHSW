package ch06.practice.p03;

public class Order {
	int orderNum;
	Menu[] menus;
	
	public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
	}
	
	public int totalPrice() {
		int sum = 0;
		// 모든 주문 메뉴의 총합을 반환
		for (int i =0; i<menus.length; i++) {
			sum += this.menus[i].price;
		}

		return sum;
	}

}
