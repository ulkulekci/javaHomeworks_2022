package week3.youtubeDemo;

public class CustomerManager {
	//Katmanlı mimari görevleri birbirinden ayırıyoruz
	
	//public void Save(Customer customer ) {
	private Customer _customer;
	private ICreditManager _creditManager;
	public  CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer =customer;
		_creditManager =creditManager;
	}
	
	
	
		public void Save() {
			System.out.println("Müşteri kaydedildi "+_customer.firstName);
	}
		public void Delete() {
			System.out.println("Müşteri silindi "+_customer.firstName);
	}
		public void GiveCredit() {
			
			_creditManager.Calculate();
			System.out.println("Kredi verildi");
	}
		
}

	

