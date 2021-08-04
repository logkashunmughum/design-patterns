package designpatterns;

public class EagerInitialization {

	//Eager Initialization
	private static EagerInitialization instance = new EagerInitialization();
	
	private EagerInitialization() {
		
	}
	
	public static EagerInitialization getInstance(){
		return instance;
	}
	
	public static void main(String[] args) {
		
		EagerInitialization instance1 = getInstance();
		System.out.println("Object ID is :" + instance1);
		
		EagerInitialization instance2 = getInstance();
		System.out.println("Object ID is :" + instance2);
		
		if(instance1 == instance2) {
			System.out.println("Singleton pattern using Eager initialization verified successfully");
		}

	}

}
