package com.javastudy.collectiontypes;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CollectionsRandomReturnTests {

	@Test
	public void ArrayListShouldReturnInteger() {
		//Given
		Collection_ArrayList collection_arrayList = new Collection_ArrayList();
		collection_arrayList.initialiseCollection();
		
		//When and Then
		assertTrue(collection_arrayList.returnRandomElement() instanceof Integer);
	}
	
	@Test
	public void LinkedListShouldReturnInteger() {
		//Given
		Collection_LinkedList collection_linkedList = new Collection_LinkedList();
		collection_linkedList.initialiseCollection();
		
		//When and Then
		assertTrue(collection_linkedList.returnRandomElement() instanceof Integer);
	}

}
