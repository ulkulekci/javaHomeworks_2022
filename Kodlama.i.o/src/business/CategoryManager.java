package business;

import java.util.List;


import core.logging.Logger;
import dataAccess.CategoryDao;
import dataAccess.JdbcCategoryDao;
import entities.Category;


public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categorys;
	public CategoryManager(JdbcCategoryDao jdbcCategoryDao, Logger[] loggers, List<Category> categorys) {
	
		this.categoryDao = (CategoryDao) jdbcCategoryDao;
		this.loggers = loggers;
		this.categorys = categorys;
	}
	
	public void add(Category category) throws Exception{
		for (Category categorys : categorys) {
			if (category.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception("Kategori ismi aynı olamaz");

            }
			for (Logger logger : loggers) { 
				logger.log(category.getCategoryName());
			}
			
			categoryDao.add(category);
			
		}
	}
	
	
}
