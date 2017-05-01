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