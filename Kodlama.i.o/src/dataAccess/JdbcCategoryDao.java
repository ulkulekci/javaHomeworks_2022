package dataAccess;

import entities.Category;

public class JdbcCategoryDao {
	public void add(Category category) {
		// sadece ve sadece db erişim kodları yazılır....SQL
		System.out.println("JDBC ile veri tabanına eklendi");
	}
}
