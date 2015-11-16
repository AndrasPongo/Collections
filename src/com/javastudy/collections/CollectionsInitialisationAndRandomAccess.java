package com.javastudy.collections;

import java.util.Collection;
import com.javastudy.collectiontypes.*;

public class CollectionsInitialisationAndRandomAccess {
	private String collectionType;
	private Integer[] resultArray = new Integer[10000];
	private CollectionFactory collectionFactory = new CollectionFactory();
	private	Collections_Common collection;
	
	public CollectionsInitialisationAndRandomAccess(String collectionType) {
		this.collectionType = collectionType;
		collection = collectionFactory.createCollection(collectionType);
		collection.initialiseCollection();
	}

	public Integer[] return10kElement() {
		for  (int i=0; i<10000; i++) {
			resultArray[i] = collection.returnRandomElement();			
		}
		return resultArray;		
	}
}
