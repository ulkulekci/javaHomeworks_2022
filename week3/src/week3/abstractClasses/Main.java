package week3.abstractClasses;

public class Main {
	
	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		//Referansını tutabilir parametre olarak verilebilir zorunlu operasyonlar ekleyebiliyoruz herkesin ayrı ayrı içini doldurabileceği
		GameCalculator gameCalculator = new WomanGameCalculator();
				
		//Abstract sınıflar new'lenemezler tek başlarına kullanamazlar
		//GameCalculator gameCalculator = new GameCalculator() {
			
			//@Override
			//public void hesapla() {
				// TODO Auto-generated method stub
				
			//}
		}
	}
	


