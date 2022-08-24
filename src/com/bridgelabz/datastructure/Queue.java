package com.bridgelabz.datastructure;

import java.util.LinkedList;

public class Queue<E> {
	public LinkedList<E> queue;

	public Queue() {
		queue = new LinkedList<>();
	}

	public void enqueue(E data) {
		queue.add(data);
	}

	public E dequeue() {
		E poppedElement = queue.pop();
		return poppedElement;
	}

	public boolean isEmpty() {
		return queue.isEmpty() ? true : false;
	}

	@Override
	public String toString() {
		return "Queue{" + "queue=" + queue + '}';
	}
}
