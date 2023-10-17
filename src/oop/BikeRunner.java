package oop;

public class BikeRunner {

	public static void main(String[] args) throws Exception {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike("Honda");

		honda.start();
		ducati.start();
		ducati.varySpeed(50);

		System.out.println(ducati.getSpeed());
		ducati.varySpeed(67);
		System.out.println(ducati.getSpeed());
		ducati.varySpeed(-200);
		System.out.println(ducati.getSpeed());
		ducati.varySpeed(60);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getBrand());
	}

}
