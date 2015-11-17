package com.javastudy.collectiontypes;

public class CollectionsFactory {

	public ICollections createCollection(String collection) {
		if (collection==null) {
			throw new IllegalArgumentException();
		}
		
		if (collection.toLowerCase().equals("arraylist")) {
			return new ArrayListWrapper();
		} else if (collection.toLowerCase().equals("linkedlist")) {
			return new LinkedListWrapper();
		} else {
			throw new IllegalArgumentException("Invalid collection type");
		}
	}
}