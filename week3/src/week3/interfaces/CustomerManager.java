package week3.interfaces;

public class CustomerManager {
	
	 ICustomerDal customerDal;
	 public CustomerManager(ICustomerDal customerDal) {
		 this.customerDal = customerDal;
	 }
	public void add() {
		//İş kodları
		customerDal.add();
	}
}
