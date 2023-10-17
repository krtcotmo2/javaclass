package oop;

public class Address {
	private int id;
	private AddressType type;
	private String street;
	private String city;
	private String state;
	private String zip;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AddressType getType() {
		return type;
	}

	public void setType(AddressType type) {
		this.type = type;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return String.format("\n\t%s: %s, %s %s %s", type.toString(),
				street,
				city, state, zip);
	}

}
