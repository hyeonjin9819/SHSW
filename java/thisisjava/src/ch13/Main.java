package ch13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Object o = new Member(); 
		//o.login(); // 실행 불가능 -> Object에 정의되지 않았다고 에러뜸
		o.toString(); // Object에 있기 때문에 가능
		Member m = (Member)o; // 형변환
		m.login();
		
		o = new Admin(); // Object 타입이기때문에 Member과 Admin 둘다 받을 수 있음
		
		Member[] mArr = {new Member(), new Member(), new Member()};
		Admin[] aArr = {new Admin(), new Admin(), new Admin()};
		

		// ArrayList 
		ArrayList <Member> al= new ArrayList <Member>(); // 대부분 같은 객체를 넣는다.
		al.add(new Member());
		al.add(new Member());
		al.add(new Member());
		al.add(new Member());
		System.out.println(al.size());
		
		for (int i=0; i<al.size(); i++) {
			//Member m2 = (Member)al.get(i); 
			//System.out.println(m2.login()); //강제형변환을한 것으로 호출해야 login메소드 사용 가능 -> 불편
			System.out.println(al.get(i).login()); // return타입이 member로 바뀜 (제너릭 덕분) -> 그래서 바로 login메서드 사용 가능
		}
		
		// key와 value 매핑
		Map<String, Member> map = new HashMap<String, Member>();
		map.put("1", new Member());
		map.put("2", new Member());
		map.put("3", new Member());
		map.put("4", new Member());
		System.out.println(map.get("3").login());
		
		
		
		
		
		
		
	}

}
