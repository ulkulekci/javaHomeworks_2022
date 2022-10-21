package dataAccess;

import entities.Category;

public class HibernateCategoryDao {
	public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
