package designpatterns;

public class ThreadSafeBlockInitialization {

	private static ThreadSafeBlockInitialization instance;

	private ThreadSafeBlockInitialization() {
		
	}

	public static ThreadSafeBlockInitialization getInstance() {
		
		synchronized (ThreadSafeBlockInitialization.class) {
			if (instance == null) {
				instance = new ThreadSafeBlockInitialization();
			}
			return instance;
		}
		
	}

	public static void main(String[] args) {

		ThreadSafeBlockInitialization instance1 = getInstance();
		System.out.println("Object ID is : " + instance1);

		ThreadSafeBlockInitialization instance2 = getInstance();
		System.out.println("Object ID is : " + instance2);

		if (instance1 == instance2) {
			System.out.println("Singleton pattern using Thread safe block initialization verified successfully");
		}
	}

}
