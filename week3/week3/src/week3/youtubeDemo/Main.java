package week3.youtubeDemo;

public class Main {
	
	public static void main(String[] args) {
		//sonar qube
		//IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();
		
		
		/*CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.calculate();
		creditManager.save();
		
		Customer customer = new Customer();
		customer.id =1;
		customer.firstName = "Ulku";
		customer.lastName = "Kulekci";
		customer.nationalIdentity = 12345678;
		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save();
		customerManager.delete();
		//customerManager.save(1,"Ulku","Kulekci",12345678);
		
		//Referans tipleri anlamak
		
		Company company=new Company();
		company.firstName ="ülkü";
		company.TaxNumber ="123456";
		
		CustomerManager customerManager2 = new CustomerManager(new Company());
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		
		
		System.out.println("Hello World");
		
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {10,20,30};
		
		sayilar1 = sayilar2;
		
		sayilar2[0]=1000;
		
		System.out.println(sayilar1[0]);
		
		
		*/
	}
	
}
