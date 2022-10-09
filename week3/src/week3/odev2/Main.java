package week3.odev2;

public class Main {
	
	public static void main(String[] args) {
		//EmailLogger logger = new EmailLogger();
		//logger.log("log mesajı");
		
		//BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),};
		//for (BaseLogger logger : loggers) {
		//	logger.log("Log mesajı");
		//}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}
	
}
