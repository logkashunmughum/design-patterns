package factorypattern;

abstract class Vehicle {

	abstract int getWheels();

	public String toString() {
		return "No of Wheels " + getWheels();
	}
}

class Car extends Vehicle {

	int wheels;

	Car(int wheels) {
		this.wheels = wheels;
	}

	@Override
	int getWheels() {
		// TODO Auto-generated method stub
		return this.wheels;
	}

}

class Bike extends Vehicle {
	int wheels;

	Bike(int wheels) {
		this.wheels = wheels;
	}

	@Override
	int getWheels() {
		// TODO Auto-generated method stub
		return this.wheels;
	}
}

class VehicleFactory {

	public static Vehicle getInsatnce(String type, int wheels) {
		if (type.equalsIgnoreCase("car")) {
			return new Car(wheels);

		} else if (type.equalsIgnoreCase("bike")) {
			return new Bike(wheels);
		}
		return null;
	}
}

class FactoryPatternExample {

	public static void main(String args[]) {

		Vehicle vehicle = VehicleFactory.getInsatnce("Car", 4);
		System.out.println(vehicle);
	}
}