package week3.staticDemo;

public class ProductManager {
	static {
		System.out.println("Yapıcı blok çalıştı.");
	}
	public void add(Product product) {
	//	ProductValidator productValidator = new ProductValidator();
		if(ProductValidator.isValid(product))
			System.out.println("Ürün eklendi.");
		else
			System.out.println("Ürün bilgileri geçersizdir.");
	}
}
