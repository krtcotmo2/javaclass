package com.krc.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class DescOrderQueue implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o2.compareToIgnoreCase(o1);
	}
}

class TextlengthOrderQueue implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}
}

public class QuequeRunner {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new DescOrderQueue());
		//		Queue<String> queue = new PriorityQueue<>(
		//				new TextlengthOrderQueue());
		System.out.println(queue.poll());
		//		queue.offer("Make the bed");
		queue
		.addAll(List.of("Make the bed", "Wash the dishes",
				"Clean the floors", "Rest"));// by default it tries to set the order in ascending order

		System.out.println(queue);
		System.out.println(queue.poll()); // poll is like popping the first element from the queue
		//		System.out.println(queue);
		System.out.println(queue.poll());
		//		System.out.println(queue);
		System.out.println(queue.poll());
		//		System.out.println(queue);
		System.out.println(queue.poll());
	}

}
