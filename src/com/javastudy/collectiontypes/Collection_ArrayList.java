package com.javastudy.collectiontypes;

import java.util.ArrayList;

public class Collection_ArrayList implements Collections_Common {
	private ArrayList<Integer> arrayList = new ArrayList<Integer>();
	private int randomInteger;
	
	public ArrayList<Integer> initialiseCollection() {
		for (int i=0; i<=maxElementCount-1; i++) {
			arrayList.add(new Integer(i));
		}
		return arrayList;
	}
	
	public Integer returnRandomElement() {
		randomInteger = (int)Math.floor(maxElementCount*Math.random());
		return arrayList.get(randomInteger);
	}
}