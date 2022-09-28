package homeworkweek1;

public class Mukemmelsayimi {
	
	public static void main(String[] args) {
		int i,sayi=8,kalan=0,top=0;
		for(i=1;i<sayi;i++) {
			kalan=sayi%i;
			if(kalan==0) {
			top=top+i;}
			}
		
		if(top==sayi) {
			System.out.println("mükemmel sayi");
		}
		else
			System.out.println("mükemmel sayi değildir");
	}
	
}
