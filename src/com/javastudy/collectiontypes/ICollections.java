package com.javastudy.collectiontypes;

import java.util.Collection;

public interface ICollections {
	Collection<Integer> initialiseCollection(int numberOFMaxElements);
	
	Integer returnElement(int index);
	
	void insertElement(int element);
	
	int returnSize();
	
	/*
	Integer returnRandomElement();
	
	Integer[] return10kRandomElements();
	 */
}