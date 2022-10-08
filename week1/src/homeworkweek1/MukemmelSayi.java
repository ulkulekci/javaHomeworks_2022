package homeworkweek1;

public class MukemmelSayi {
	
	public static void main(String[] args) {
		System.out.println("Mükemmel sayilar");
		int i,j,sayi=2,kalan,top=0;
		for(j=1;j<1000000;j++) {
		for(i=1;i<sayi;i++) {
			kalan=sayi%i;
			if(kalan==0) {
			top=top+i;}
			}
		if(top==sayi) {
		System.out.println(""+sayi);
		}
		top=0;
		sayi++;
		}
	/*	if(top==sayi) {
			System.out.println("mükemmel sayi");
		}
		else
			System.out.println("mükemmel sayi değildir");*/
	}
	
}
