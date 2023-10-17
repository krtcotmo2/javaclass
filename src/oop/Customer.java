package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Customer {
	private String firstName;
	private String lastName;
	private ArrayList<Address> addresses;

	Customer(String fname, String lname) {
		this.firstName = fname;
		this.lastName = lname;
	}

	Customer(String fname, String lname, Address address) {
		this.firstName = fname;
		this.lastName = lname;
		this.addresses = new ArrayList<Address>();
		this.addresses.add(address);
	}

	public void addAddress(Address a) throws Exception {
		List<Address> addressExists = addresses.stream()
				.filter(c -> c.getId() == a.getId())
				.collect(Collectors.toList());
		if (addressExists.size() > 0) {
			throw new Exception("address exists");
		}
		addresses.add(a);
	}

	@Override
	public String toString() {
		return String.format("Name: %s,\nAddresses: %s",
				firstName + " " + lastName, addresses);
	}

}



