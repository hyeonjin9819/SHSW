package ch15;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

import ch15.sec02.exam01.Board;
import ch15.sec02.exam01.BoardService;

public class BoardView {

	public static void main(String[] args) {
		BoardService service = new BoardService();
		Map<String, List<Board>> map = service.getBoard();

		// 공지사항 출력
		List<Board> notice = map.get("notice");
		for (Board b : notice) {
			System.out.println(b.getSubject() + " " + b.getContent());
			
		}

		// 뉴스 출력
		List<Board> news = map.get("news");
		for (Board b : news) {
			System.out.println(b.getSubject() + " " + b.getContent());
		}
		
		// 자료실 출력
		List<Board> data = map.get("data");
		for (Board b : data) {
			System.out.println(b.getSubject() + " " + b.getContent());
		}
		
		System.out.println("----------------------------------------");

//		Iterator<List<Board>> iter = map.values().iterator();
//		while (iter.hasNext()) {
//			List<Board> lb = iter.next();
//			for (Board b: lb) {
//				System.out.println(b.getSubject());
//			}
//		}
//		
//		Iterator<Board> ib = data.iterator();
		
		Stream<List<Board>> stream = map.values().stream();
//		stream.forEach(lb -> {
//			for(Board b: lb) {
//				System.out.println(b.getSubject());
//			} 
//		});
		
		stream.forEach(new Consumer<List<Board>>() {
		
		@Override
		public void accept(List<Board> t) {
			for(Board b: t) {
				System.out.println(b.getSubject());
			}
		}
		
	};
}
