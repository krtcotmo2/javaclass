package com.krc.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class DescendingStudentCompare implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}
}

class AscNameStudentCompare implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
		return student1.getName().compareToIgnoreCase(student2.getName());
	}
}

class DescNameStudentCompare implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
		return student2.getName().compareToIgnoreCase(student1.getName());
	}
}
public class CollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student("Kurt", 30),
				new Student("Bryan", 31), new Student("Kim", 26));

		List<Student> studentsAl = new ArrayList<>(students);
		System.out.println(studentsAl);
		Collections.sort(studentsAl);
		System.out.println(studentsAl);

		// Collections.sort(studentsAl, new DescendingStudentCompare());
		studentsAl.sort(new DescendingStudentCompare());
		System.out.println(studentsAl);
		// Collections.sort(studentsAl, new AscNameStudentCompare());
		studentsAl.sort(new AscNameStudentCompare());
		System.out.println(studentsAl);
		// Collections.sort(studentsAl, new DescNameStudentCompare());
		studentsAl.sort(new DescNameStudentCompare());
		System.out.println(studentsAl);

		TreeSet<Integer> treeNum = new TreeSet<>(
				Set.of(4, 7, 34, 90, 2, 345, 9));
		System.out.println(treeNum);
		// returns the first number that is =< given number
		System.out.println("floor ");
		System.out.println(treeNum.floor(34));
		// returns the first number that is < given number
		System.out.println("lower ");
		System.out.println(treeNum.lower(34));
		// returns the first number that is => given number
		System.out.println("ceil ");
		System.out.println(treeNum.ceiling(34));
		// returns the first number that is > given number
		System.out.println("higher ");
		System.out.println(treeNum.higher(34));
		// returns the first number that is >= first number AND < second number
		// DOES NOT INCLUDE SECOND #
		System.out.println("subsets ");
		System.out.println(treeNum.subSet(34, 345));
		// returns the first number that is >= first number AND <= second number
		// DOES INCLUDE BOTH #
		System.out.println(treeNum.subSet(34, true, 345, true));
		// returns range first number that is > first number AND <= second number
		// DOES NOT INCLUDE FIRST #
		System.out.println(treeNum.subSet(34, false, 345, true));
		// returns all #s < given number
		// DOES NOT INCLUDE #
		System.out.println("headsets ");
		System.out.println(treeNum.headSet(34));
		// returns all #s <=given number
		// DOES INCLUDE #
		System.out.println(treeNum.headSet(34, true));
		// returns all #s >= given number
		// DOES INCLUDE #
		System.out.println("tailsets ");
		System.out.println(treeNum.tailSet(34));
		// returns all #s > given number
		// DOES NOT INCLUDE #
		System.out.println(treeNum.tailSet(34, false));

	}

}
