package homeworkweek1;

import java.util.Iterator;

public class LoopDemo {
	
	public static void main(String[] args) {
		//For i+=2 2 arttır
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		int i=1;
		//While
		while(i<10) {
		System.out.println(i);
		i++;

		}
		System.out.println("While Döngüsü Bitti");
		
		//Do-While
		int j=1;
		do {
			System.out.println(j);
			j+=1;
		} while (j<10);

		System.out.println("Do-While Döngüsü Bittii");
	}	
}
