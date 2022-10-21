import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;

public class Main {
	
	public static void main(String[] args) throws Exception { //Hata yönetimi olduğu için burayada throws konulması gerekir
		
		Course course1 =new Course(1,"java","Ulku",12000); //Bu bilgiler kullanıcıdan geldi
		Course course2 =new Course(2,"C#","Engin",123000);
		
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
		List<Course> courses = new ArrayList<>();
		
		//Arayüz iş birimi ile iletişim kurar iş birimi CourseManager api yi saymazsak :)
		CourseManager courseManager =new CourseManager(new JdbcCourseDao(), loggers, courses);
		//CourseManager courseManager =new CourseManager(new HibernateCourseDao());
		courseManager.add(course1); //CourseManager in add'ine bu course'yi yolluyoruz
		courseManager.add(course2); 
		System.out.println("----------------------------------------------");
		
		Category category1 = new Category(1,"Programlama");
		Category category2 = new Category(2,"Yabancı dil");
		
		
		List<Category> categorys = new  ArrayList<>();
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categorys);
		categoryManager.add(category1);

		
	}
	
}
