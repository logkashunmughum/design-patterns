package singletonpattern;

public class LazyInitialization {

	private static LazyInitialization instance;
	
	private LazyInitialization() {
		
	}
	
	public static LazyInitialization getInstance() {
		if(instance == null) {
			instance = new LazyInitialization();
		}
		return instance;
	}
	public static void main(String[] args) {
		
		LazyInitialization instance1 = getInstance();
		System.out.println("Object ID is : " + instance1);
		
		LazyInitialization instance2 = getInstance();
		System.out.println("Object ID is : " + instance2);
		
		if(instance1 == instance2) {
			System.out.println("Singleton pattern using Lazy initialization verified successfully");
		}

	}

}
