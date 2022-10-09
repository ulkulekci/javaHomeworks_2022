package week3.interfaces;

public class Main {
	
	public static void main(String[] args) {
		
		//Interfaceler'de new'lenemezler, imza taşırlar, birden fazla class'ı implemente edebilir
		ICustomerDal customerDal = new OracleCustomerDal();
		
		//CustomerManager customerManager =  new CustomerManager();
		//customerManager.customerDal = new MySqlCustomerDal();
		//customerManager.add();
		
		//CustomerManager customerManager1 =  new CustomerManager();
		//customerManager1.customerDal = new OracleCustomerDal();
		//customerManager1.add();
		
		CustomerManager customerManager =  new CustomerManager(new OracleCustomerDal());
		customerManager.add();
		
		CustomerManager customerManager2 = new CustomerManager(new MySqlCustomerDal());
		customerManager2.add();
	}
	
}
