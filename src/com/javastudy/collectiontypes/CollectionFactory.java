package com.javastudy.collectiontypes;

public class CollectionFactory {

	public Collections_Common createCollection(String collection) {
		if (collection==null) {
			throw new IllegalArgumentException();
		}
		
		if (collection.toLowerCase().equals("arraylist")) {
			return new Collection_ArrayList();
		} else if (collection.toLowerCase().equals("linkedlist")) {
			return new Collection_LinkedList();
		} else {
			throw new IllegalArgumentException("Invalid collection type");
		}
	}
}