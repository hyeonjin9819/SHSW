package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardService {
	// 공지사항, 뉴스, 자료실 글을 담아서 리턴
	public Map<String, List<Board>> getBoard() {
		Map<String, List<Board>> map = new HashMap<>();
		ArrayList<Board> list = new ArrayList<Board>();
		list.add(new Board("공지사항 제목1", "공지사항 내용1", "작성자"));
		list.add(new Board("공지사항 제목2", "공지사항 내용2", "작성자"));
		list.add(new Board("공지사항 제목3", "공지사항 내용3", "작성자"));
		map.put("notice", list);
		
		list = new ArrayList<Board>();
		list.add(new Board("뉴스 제목1", "뉴스 내용1", "작성자"));
		list.add(new Board("뉴스 제목2", "뉴스 내용2", "작성자"));
		list.add(new Board("뉴스 제목3", "뉴스 내용3", "작성자"));
		map.put("news", list);
		
		list = new ArrayList<Board>();
		list.add(new Board("자료실 제목1", "자료실 내용1", "작성자"));
		list.add(new Board("자료실 제목2", "자료실 내용2", "작성자"));
		list.add(new Board("자료실 제목3", "자료실 내용3", "작성자"));
		map.put("data", list);
		
		
		return map;
	}
}
