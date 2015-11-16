package com.javastudy.collectiontypes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

public class CollectionsInitialisationTests {

	@Test
	public void ArrayListLengthShouldBe1M() {
		//Given
		Collection_ArrayList collection_arrayList = new Collection_ArrayList();
		
		//When
		ArrayList<Integer> arrayList = collection_arrayList.initialiseCollection();
		
		// Then
		System.out.println(arrayList.size());
		assertTrue(arrayList.size() == 1000000);
	}
	
	@Test
	public void LinkedListLengthShouldBe1M() {
		//Given
		Collection_LinkedList collection_linkedList = new Collection_LinkedList();
		
		//When
		LinkedList<Integer> linkedList = collection_linkedList.initialiseCollection();
		
		// Then
		System.out.println(linkedList.size());
		assertTrue(linkedList.size() == 1000000);
	}
}
