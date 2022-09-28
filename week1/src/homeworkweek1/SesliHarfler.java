package homeworkweek1;

public class SesliHarfler {
	
	public static void main(String[] args) {
		
		char harf='K';
		if (harf=='A'||harf=='I'||harf=='O'||harf=='U') {
			System.out.println(harf+":Kalın sesli harf");
		}
		if (harf=='E'||harf=='İ'||harf=='Ü'||harf=='Ö') {
			System.out.println(harf+":İnce sesli harf");
		}
		else {
			System.out.println(harf+":Sessiz harf");
		}
		
		char letter = 'I';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letter + ":Kalın sesli harf");
                break;
            default:
                System.out.println(letter + ":İnce sesli harf");
        }
		
	}
	
}
