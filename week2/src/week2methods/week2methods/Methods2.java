package week2methods;

public class Methods2 {
	
	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yenimesaj = mesaj;

		int toplam = ekle(2, 6);
		System.out.println(toplam);

		System.out.println(sehir());

		int newToplam = topla2(3, 4, 1, 5, 7);
		System.out.println(newToplam);

	}

	public static int ekle(int sayi1, int sayi2) {
		System.out.println("Eklendi");
		return sayi1 + sayi2;
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void güncelle() {
		System.out.println("Güncellendi");
	}

	public static String sehir() {
		return "Antalya";
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}

		return toplam;
	}

}