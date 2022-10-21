package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao {
	public void add(Instructor instructor) {
		// sadece ve sadece db erişim kodları yazılır....SQL
		System.out.println("JDBC ile veri tabanına eklendi");
	}
}
