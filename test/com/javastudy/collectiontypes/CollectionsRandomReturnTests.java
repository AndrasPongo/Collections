package com.javastudy.collectiontypes;

import static org.junit.Assert.*;
import org.junit.Test;

public class CollectionsRandomReturnTests {

	@Test
	public void ArrayListShouldReturnInteger() {
		//Given
		ArrayListWrapper collection_arrayList = new ArrayListWrapper();
		collection_arrayList.initialiseCollection(1);
		
		//When and Then
		assertTrue(collection_arrayList.returnElement(0) instanceof Integer);
	}
	
	@Test
	public void LinkedListShouldReturnInteger() {
		//Given
		LinkedListWrapper collection_linkedList = new LinkedListWrapper();
		collection_linkedList.initialiseCollection(1);
		
		//When and Then
		assertTrue(collection_linkedList.returnElement(0) instanceof Integer);
	}

}
