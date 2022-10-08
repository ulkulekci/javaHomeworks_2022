package homeworkweek1;

public class ArkadasSayilar {
	
	public static void main(String[] args) {
	int sayi1=220;
	int sayi2=284;
	int kalan=0;
	int top1=0,top2=0;
	int i;
	for(i=2;i<=sayi1;i++) {
		kalan=sayi1%i;
		if(kalan==0) {
		top1=top1+i;}
		}
	for(i=2;i<=sayi2;i++) {
		kalan=sayi2%i;
		if(kalan==0) {
		top2=top2+i;}
		}
	if (top1==top2) {
		System.out.println("Arkadaş sayılardır");
	}
	else {
		System.out.println("Arkadaş sayılar değillerdir");
	}
	}
	
}
