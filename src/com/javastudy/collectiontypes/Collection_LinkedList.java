package com.javastudy.collectiontypes;

import java.util.LinkedList;

public class Collection_LinkedList implements Collections_Common {
	private LinkedList<Integer> linkedList = new LinkedList<Integer>();
	private int randomInteger;
	
	public LinkedList<Integer> initialiseCollection() {
		for (int i=0; i<maxElementCount; i++) {
			linkedList.add(new Integer(i));
		}
		return linkedList;
	}
	
	public Integer returnRandomElement() {
		randomInteger = (int)Math.floor(maxElementCount*Math.random());
		return linkedList.get(randomInteger);
	}
}