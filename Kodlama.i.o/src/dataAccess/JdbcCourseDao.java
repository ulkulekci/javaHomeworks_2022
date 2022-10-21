package dataAccess;

import entities.Course;

public class JdbcCourseDao implements CourseDao{
	public void add(Course course) {
		// sadece ve sadece db erişim kodları yazılır....SQL
		System.out.println("JDBC ile veri tabanına eklendi");
	}
}
//Sen artık bir CourseDao implementasyonusun artık CourseDao'nun kurallarına uyacaksın.
//İçinde ne varsa onun kuralına uyacaksın