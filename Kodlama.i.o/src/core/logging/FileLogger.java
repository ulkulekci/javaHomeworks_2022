package core.logging;

public class FileLogger implements Logger{

	@Override //bunun bir interfaceden abstractan veya base sınıftan  geldiğini söyler üzerine yazıyoruz
	//Silsekte birşey olmaz.
	public void log(String data) {
		System.out.println("Dosyaya loglandı :" + data);
		
	}
	
}
