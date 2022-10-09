package week3.interfaces;

public class Main {
	
	public static void main(String[] args) {
		
		//Interfaceler'de new'lenemezler, imza taşırlar, birden fazla class'ı implemente edebilir
		ICustomerDal customerDal = new OracleCustomerDal();
	}
	
}
