package com.krc.inheritance;

import java.math.BigDecimal;

public class PeopleRunner {

	public static void main(String[] args) {
		Student s = new Student("Kurt Cooney", "University of Florida");
		s.setPhone("333.456.7890");
		System.out.println(s);
		Person p = new Person("Kym Cooney", "kym@aol.com");
		p.setPhone("555.890.2386");
		System.out.println(p);

		Employee e = new Employee("Kurt Cooney", "Software Engineer",
				"TIAA", 'C',
				new BigDecimal("97000"));
		e.setEmail("krtcotmo2@gmail.com");
		e.setPhone("678.557.3075");
		System.out.println(e);

		Dog raine = new Pet("Raine");
		raine.sayType();
		raine.sayOther();
		// raine.speak();
		/*
		 * I can have a higher level class defined by using the lower level constructor
		 * call to define it but there are limitations on the class now.
		 *
		 * I can not call speak since the Pet level has speak but we do not extend this
		 * object to have full Pet capabilities, we stopped at Dog and Dog does not have
		 * a speak method
		 *
		 * raine is still type of Pet but does not have all its methods
		 */

		// Pet badDemo = new Dog("Cujo");
		// Can not have a lower class set to that of the higher class.

		Pet spice = new Pet("Spice");
		spice.sayType();
		spice.sayOther();
		spice.speak();
		System.out.println("");
		System.out.println(spice.getName());
		System.out.println(spice instanceof Animal);
		System.out.println(spice instanceof Dog);
		System.out.println(spice instanceof Pet);
		System.out.println("");
		System.out.println(raine.getName());
		System.out.println(raine instanceof Animal);
		System.out.println(raine instanceof Dog);
		System.out.println(raine instanceof Pet);

	}

}
