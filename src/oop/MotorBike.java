package oop;

public class MotorBike {
	// STATE
	private int speed;
	private boolean started;
	private String brand;

	// CONTSRUCTORS
	public MotorBike() {
		// this sets the default value of the brand to unknown
		// by calling the other constructor with a default value;
		this("Unknown");
	}

	public MotorBike(String brand) {
		this.setBrand(brand);
	}

	public MotorBike(int startSpeed) throws Exception {
		this.setSpeed(startSpeed);
	}

	// GETTERS AND SETTERS
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) throws Exception {
		if (!this.started)
			throw new Exception("can not set a speed on a stopped bike");
		this.speed = Math.max(0, this.speed += speed);
	}

	// METHODS
	void start() throws Exception {
		if (this.started)
			throw new Exception("bike is already started");
		System.out.println("started");
		this.started = true;
	}

	void stop() throws Exception {
		if (!this.started)
			throw new Exception("bike is already stopped");
		System.out.println("stopped");
		this.speed = 0;
		this.started = false;
	}

	public void varySpeed(int delta) throws Exception {
		setSpeed(delta);

	}
}
