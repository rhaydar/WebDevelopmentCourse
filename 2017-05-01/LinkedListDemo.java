/*
	2017-05-01
	Implement a Linked List data structure in Java

	Create the following classes:
		class Node {
			int data;
			Node next;
		}

		class LinkedList {
			Node head;
		}

	add the following methods to the LinkedList class:
		-void push(int val): adds a node to the end of the list with its data
		set to val. 
		-void pushFront(int val): adds a node to the front of the list with its
		data set to val.
		-int pop(): removes the first node from the list, and returns its data.
		-int popBack(): removes the last node from the list, and returns its data.
		-boolean remove(int x): removes all the nodes that have x as their data.
		-boolean find(int val): returns true if any of the nodes in the list have val
		as their data member, and false otherwise.
		-int length(): returns the length of the list.

	Example usage:
		LinkedList list = new LinkedList();
		list.push(2);
		list.pushFront(5);
		list.pop();
		list.popBack();
*/

class Node {
	int data;
	Node next;

	Node() {
		data = 0;
		next = null;
	}

	Node(int val) {
		data = val;
		next = null;
	}
}

class LinkedList {
	Node head;

	LinkedList() {
		head = null;
	}

	void push(int val) {
		if (head == null) {
			head = new Node(val);
		}
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(val);
		}
	}

	void pushFront(int val) {

	}

	int pop() {
		return 0;
	}

	int popBack() {
		return 0;
	}

	boolean remove(int x) {
		return false;
	}

	boolean find(int val) {
		return false;
	}

	int length() {
		int nodes = 0;
		Node temp = head;
		while (temp != null) {
			nodes++;
			temp = temp.next;
		}
		return nodes;
	}

	void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(1);
		list.print();
		System.out.println("length: " + list.length() + "\n");
		list.push(2);
		list.print();
		System.out.println("length: " + list.length() + "\n");
		list.push(4);
		list.print();
		System.out.println("length: " + list.length() + "\n");
		list.push(8);
		list.print();
		System.out.println("length: " + list.length() + "\n");
		list.push(16);
		list.print();
		System.out.println("length: " + list.length() + "\n");
	}
}