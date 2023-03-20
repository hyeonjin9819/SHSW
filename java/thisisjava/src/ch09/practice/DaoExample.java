package ch09.practice;

public class DaoExample {

	public static void main(String[] args) {
		DataAccessObject dao = new OracleDao();
		dbWork(dao);
		dbWork(new MySqlDao());

	}
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.select();
	}

}
