package week3.youtubeDemo;

public class CustomerManager {
	//Katmanlı mimari görevleri birbirinden ayırıyoruz
	
	//public void save(Customer customer ) {
	private Customer _customer;
	private ICreditManager _creditManager;
	public  CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer =customer;
		_creditManager =creditManager;
	}
	
	
	
		public void save() {
			System.out.println("Müşteri kaydedildi "+_customer.firstName);
	}
		public void delete() {
			System.out.println("Müşteri silindi "+_customer.firstName);
	}
		public void giveCredit() {
			
			_creditManager.calculate();
			System.out.println("Kredi verildi");
	}
		
}

	

