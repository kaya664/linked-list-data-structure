package com.linkedlist.structure;

public class LinkedListStructureMain {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Node("First"));
		list.add(new Node("First1"));
		list.add(new Node("First2"));
		list.add(new Node("First3"));
		list.add(new Node("First4"));
		
		list.traverse();
		list.remove(4);
		list.traverse();
	}
}
