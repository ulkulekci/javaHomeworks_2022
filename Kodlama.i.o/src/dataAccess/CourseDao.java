package dataAccess;

import entities.Course;

public interface CourseDao {
    void add(Course course);
}
//Sadece şablonunu çiziyoruz. birbirinin alternatifi durumlarda oluşturuyoruz.
//interface'ler sadece metot imzasını barındırır. Başına I koyarakta oluşturulabilir 
//iki alternatifte  void add(Course course) içerir;