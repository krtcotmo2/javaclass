package oop;

public class CustomerRunner {

	public static void main(String[] args) {
		Address a = new Address();
		a.setStreet("1374 Brentwood Lane");
		a.setCity("Marietta");
		a.setState("GA");
		a.setZip("30062");
		a.setId(1);
		a.setType(AddressType.HOME);

		Address b = new Address();
		b.setStreet("255 Holcomb Bridge");
		b.setCity("Alpharetta");
		b.setState("GA");
		b.setZip("30005");
		b.setId(2);
		b.setType(AddressType.WORK);

		Customer k = new Customer("Kurt", "Cooney", a);
		try {
			k.addAddress(b);
			k.addAddress(b);
		} catch (Exception e) {
		}
		System.out.println(k.toString());

	}

}
