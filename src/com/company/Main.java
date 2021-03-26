package com.company;

public class Main {

    public static void main(String[] args) {
	Queue theQueue = new Queue(5);

	theQueue.enqueue(18);
	theQueue.enqueue(28);
	theQueue.enqueue(38);
	theQueue.enqueue(48);

	theQueue.dequeue();
	theQueue.dequeue();
	theQueue.dequeue();

	theQueue.enqueue(58);
	theQueue.enqueue(68);
	theQueue.enqueue(78);
	theQueue.enqueue(88);

	while (!theQueue.isEmpty()) {
		long n = theQueue.dequeue();
		System.out.print(n);
		System.out.println(" ");
	}
	System.out.println("");



    }
}
