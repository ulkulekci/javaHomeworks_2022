package week3.youtubeDemo;
  //Yazılım geliştirme prensibleri SOLID
public class Customer {
	public int id;
	public String firstName;
	public String lastName;
	public int  nationalIdentity;
	
	public Customer() {
	  System.out.println("Müşteri nesnesi başlatıldı");
	}
	
	public Customer(int id, String firstName, String lastName, int nationalIdentity) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(int nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
	
	
}
