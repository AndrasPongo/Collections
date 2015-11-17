package com.javastudy.collectiontypes;

import static org.junit.Assert.*;
import org.junit.Test;

public class CollectionsInitialisationTests {

	@Test
	public void ArrayListLengthShouldBe1M() {
		//Given
		int desiredListSize = 1000000; 
		ArrayListWrapper collection_arrayList = new ArrayListWrapper();
		
		//When
		collection_arrayList.initialiseCollection(desiredListSize);
		
		// Then
		assertTrue(collection_arrayList.returnSize() == desiredListSize);
	}
	
	@Test
	public void LinkedListLengthShouldBe1M() {
		//Given
		int desiredListSize = 1000000; 
		LinkedListWrapper collection_linkedList = new LinkedListWrapper();
		
		//When
		collection_linkedList.initialiseCollection(desiredListSize);
		
		// Then
		assertTrue(collection_linkedList.returnSize() == desiredListSize);
	}
}
