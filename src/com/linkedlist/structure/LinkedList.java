package com.linkedlist.structure;

public class LinkedList {
	private Node headNode;
	
	public LinkedList() {
		headNode = null;
	}
	
	public void add(Node node) {
		Node lastNode = getLastNode();
		if(lastNode == null) {
			headNode = node;
		} else {
			lastNode.setNextNode(node);
		}
	}
	
	private Node getLastNode() {
		Node lastNode = headNode;
		while(lastNode != null && lastNode.getNextNode() != null) {
			lastNode = lastNode.getNextNode();
		}
		return lastNode;
	}
	
	private Node getNodeAtIndex(int index) {
		if(index < 0) {
			return null;
		}
		
		if(headNode == null || index == 0) {
			return headNode;
		}
		
		Node lastNode = headNode;
		int indexCounter = 0;
		while(lastNode.getNextNode() != null && indexCounter != index) {
			lastNode = lastNode.getNextNode();
			indexCounter++;
		}
		if(indexCounter != index) {
			lastNode = null;
		}
		return lastNode;
	}
	
	public Node getNode(int index) {
		return getNodeAtIndex(index);
	}
	
	public void remove(int index) {
		if(index < 0) {
			return;
		}
		
		if(index == 0 && headNode != null) {
			headNode = headNode.getNextNode();
		} else {
			Node previousNodeToDeletedNode = getNodeAtIndex(index - 1);
			if(previousNodeToDeletedNode != null) {
				Node deletedNode = previousNodeToDeletedNode.getNextNode();
				if(deletedNode != null) 
					previousNodeToDeletedNode.setNextNode(deletedNode.getNextNode());
				deletedNode = null;
			}
		}
	}
	
	public void traverse() {
		Node lastNode = headNode;
		while(lastNode != null) {
			System.out.println(lastNode.getData());
			lastNode = lastNode.getNextNode();
		}
	}
}
