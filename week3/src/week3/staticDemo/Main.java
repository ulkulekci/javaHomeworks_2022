package week3.staticDemo;

public class Main {
	
	public static void main(String[] args) {
		
		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.name = "";
		product.id = 1;
		productManager.add(product);
		
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Connection.createConnection();
	}
	
}
