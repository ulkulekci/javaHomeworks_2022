package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao {
	public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
