
public class Main {

	public static void main(String[] args) {
	//BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsolLogger()};
	//for (BaseLogger logger:loggers) {
		//logger.Log("Log mesajı");
		
	//}
	CustomerManager customerManager = new CustomerManager(new FileLogger());
	customerManager.add();
	

	}

}
