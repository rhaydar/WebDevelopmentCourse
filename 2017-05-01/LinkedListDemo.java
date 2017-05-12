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
		if (head == null) {
			head = new Node(val);
		}
		else {
			Node newNode = new Node(val);
			newNode.next = head;
			head = newNode;
		}
	}

	int pop() {
		// empty list, return -1
		if (head == null) {
			return -1;
		}
		else {
			int data = head.data;
			head = head.next;
			return data;
		}
	}

	int popBack() {
		// empty list, return -1
		if (head == null) {
			return -1;
		}
		// single node
		else if (head.next == null) {
			int data = head.data;
			head = null;
			return data;
		}
		// more than 1 node
		else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			int data = temp.next.data;
			temp.next = null;
			return data;
		}
	}

	boolean remove(int x) {
		return false;
	}

	boolean find(int val) {
		boolean found = false;
		Node temp = head;
		while (temp != null) {
			if (temp.data == val) {
				found = true;
				break;
			}
			temp = temp.next;
		}
		return found;
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
		// push(), print(), and length() tests
		System.out.println("TESTING PUSH(), PRINT(), AND LENGTH()\n");
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

		// pushFront() tests
		System.out.println("TESTING PUSHFRONT()\n");
		// reset list to empty list
		list.head = null;
		list.pushFront(-1);
		list.print();
		System.out.println();
		list.pushFront(-2);
		list.print();
		System.out.println();
		list.pushFront(-4);
		list.print();
		System.out.println();

		// pop() tests
		// System.out.println("TESTING POP()\n");
		// System.out.println("popped: " + list.pop());
		// list.print();
		// System.out.println();
		// System.out.println("popped: " + list.pop());
		// list.print();
		// System.out.println();
		// System.out.println("popped: " + list.pop());
		// list.print();
		// System.out.println();

		// popBack() tests
		// System.out.println("TESTING POPBACK()\n");
		// System.out.println("popped back: " + list.popBack());
		// list.print();
		// System.out.println();
		// System.out.println("popped back: " + list.popBack());
		// list.print();
		// System.out.println();
		// System.out.println("popped back: " + list.popBack());
		// list.print();
		// System.out.println();

		// find() tests
		System.out.println("TESTING FIND()\n");
		int x = 0;
		System.out.println("found " + x + ": " + list.find(x));
		x = 1;
		System.out.println("found " + x + ": " + list.find(x));
		x = -4;
		System.out.println("found " + x + ": " + list.find(x));
		x = 5;
		System.out.println("found " + x + ": " + list.find(x));

	}
}