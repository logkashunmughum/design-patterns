package singletonpattern;

public class ThreadSafeMethodInitialization {

	private static ThreadSafeMethodInitialization instance;
	
	private ThreadSafeMethodInitialization() {
		
	}
	
	public static synchronized ThreadSafeMethodInitialization getInstance() {
		if(instance == null) {
			instance = new ThreadSafeMethodInitialization();
		}
		return instance;
	}
	public static void main(String[] args) {
		
		ThreadSafeMethodInitialization instance1 = getInstance();
		System.out.println("Object ID is : " + instance1);
		
		ThreadSafeMethodInitialization instance2 = getInstance();
		System.out.println("Object ID is : " + instance2);
		
		if(instance1 == instance2) {
			System.out.println("Singleton pattern using Thread safe method initialization verified successfully");
		}
	}

}
