package homeworkweek1;

public class MiniProjeAsalSayi {
	
	public static void main(String[] args) {
		int number=15,a=0,i;
		int remainder=0;
		
		for (i =2; i<number; i++) {
			remainder=number%i;
		
		if (remainder==0) {
			System.out.println("Sayi:" +number+ " asal değildir");
			a=1;
			i=number;
		}
	}
		if(a==0) {
			System.out.println("Sayi:" +number+ " asaldir ");
		}
		//hocanın çözümü
		
		int sayi=25;
		Boolean isPrime = false;
		for (int k = 0; k < sayi; k++) {
			if (sayi % 2 == 0) {
				isPrime = false;
			}
		}
        if (isPrime) {
	       System.out.println("Sayı asaldır");
         }
        else {
        	System.out.println(sayi+": Sayı asal değildir");
		}
  
}}
