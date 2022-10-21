package dataAccess;

import entities.Course;

public class HibernateCourseDao {
	public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
