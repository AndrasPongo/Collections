package com.javastudy.collectiontypes;

import java.util.ArrayList;

public class ArrayListWrapper implements ICollections {
	private ArrayList<Integer> arrayList;
	private int maxElementCount;
	
	public ArrayListWrapper() {
		arrayList = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> initialiseCollection(int numberOFMaxElements) {
		this.maxElementCount = numberOFMaxElements;
		for (int i=0; i<maxElementCount; i++) {
			arrayList.add(new Integer(i));
		}
		return arrayList;
	}
	
	public Integer returnElement(int index) {
		return arrayList.get(index);
	}
	
	public int returnSize() {
		return arrayList.size();
	}
}