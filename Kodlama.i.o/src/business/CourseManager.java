package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	private List <Course> courses;
	
	
	public CourseManager(CourseDao courseDao,Logger[] loggers,List <Course> courses) { //CourseManager new'lendiğinde bana böyle birşey ver diyorum
		this.courseDao = courseDao; //Sadece interface bağlıyız hibernate jdbc yok yani.
		this.loggers=loggers;
		this.courses=courses;
	}

	public void add(Course course) throws Exception { //bu metodu çağırdığında böyle hata fırlatır
		// İŞ KURALLARI
		if (course.getUnitPrice() < 0) { //hata fırlatılırsa orada durur uygulama.
			// eğer geçerse sisteme uygun bu ürün sisteme kaydedilebilir
			throw new Exception("Kursun fiyatı 0 dan küçük olamaz");
		}
		//Bir katman başka bir katmanın sınıfını kullanıyorken sadece interfacesinden erişim kurmalıdır.
		//CourseDao interface onu implemente eden sınıfın referansını(new'ini instınsını) tutar
		//CourseDao courseDao = new JdbcCourseDao();
		
		for (Course coursee: courses) {
			if(coursee.getCourseName().equals(coursee.getCourseName())) {
				throw new Exception("Kurs ismi aynı olamaz");
			}
		}
				
		courseDao.add(course); // add i çağırdık kurallara uyuyorsa veri tabanına eklenir
		courses.add(course);
		
		for (Logger logger : loggers) { 
			logger.log(course.getCourseName());//void log(String data); System.out.println("Mail gönderildi :" + data);
		}
}}