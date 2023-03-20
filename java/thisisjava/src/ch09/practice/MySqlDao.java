package ch09.practice;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySQL DB를 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("MySQL에서 DB에 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("MySQL에서 DB를 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("MySQL에서 DB에서 삭제");
		
	}

}
