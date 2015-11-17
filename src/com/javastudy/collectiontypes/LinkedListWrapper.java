package com.javastudy.collectiontypes;

import java.util.LinkedList;

public class LinkedListWrapper implements ICollections {
	private LinkedList<Integer> linkedList;
	private int maxElementCount;

	public LinkedListWrapper() {
		this.linkedList = new LinkedList<Integer>();
	}
	
	public LinkedList<Integer> initialiseCollection(int numberOFMaxElements) {
		this.maxElementCount = numberOFMaxElements;
		for (int i=0; i<maxElementCount; i++) {
			this.linkedList.add(new Integer(i));
		}
		return this.linkedList;
	}
	
	public Integer returnElement(int index) {
		return linkedList.get(index);
	}
	
	public int returnSize() {
		return linkedList.size();
	}
}