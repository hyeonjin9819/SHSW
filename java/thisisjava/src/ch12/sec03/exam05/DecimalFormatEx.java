package ch12.sec03.exam05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecimalFormatEx {

	public static void main(String[] args) {
		// 1000000
		//String price = "1,000,000";
		//System.out.println(Integer.parseInt(price.replace(",", "")));
		
		int price = 1000000;
		DecimalFormat sdf = new DecimalFormat("#,###");
		System.out.println(sdf.format(price));
		
		// 반올림
		double d = 3.141592;
		DecimalFormat sdf2 = new DecimalFormat("#.###");
		System.out.println(sdf2.format(d));
		
		// 상품번호: 5자리로 -> 00001
		DecimalFormat sdf3 = new DecimalFormat("00000");
		System.out.println(sdf3.format(123));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("YYYY-MM-dd");
		System.out.println(sdf4.format(new Date()));
		
		// 정규표현식
		Pattern p = Pattern.compile("a[a-zA-Z]*");
		Matcher m;
		m = p.matcher("abbbbb");
		System.out.println(m.matches());
		
		// 게시판에 글(내용) 작성할때, 내용에 전화번호가 들어있으면 전화번호를 삭제
		String content = "안녕하세요, 저는 홍길동입니다. 어쩌고 저쩌고... 02-1234-5678이고, 반갑습니다.";
		content += "... 제 친구 핸드폰번호는요 010-7890-1234에요.";
		p = Pattern.compile("(\\d{2,3}-\\d{3,4}-)(\\d{4})");
		m = p.matcher(content);
		System.out.println(m.find());
		String newcontent = content;
		int cnt = 1;
		while(m.find()) {
			System.out.println(m.group());
			System.out.println(m.group(1) + "****");
			//newcontent += newcontent.replace(m.group(), "");
		}
		System.out.println(newcontent);
		
		
	}

}
