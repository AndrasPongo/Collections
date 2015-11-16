package com.javastudy.collections;

public class CollectionsStudy {

	public static void main(String[] args) {
		long start_time;
		long finish_time;
		

		CollectionsInitialisationAndRandomAccess randomAccess_ArrayList = new CollectionsInitialisationAndRandomAccess("ArrayList");
		CollectionsInitialisationAndRandomAccess randomAccess_LinkedList = new CollectionsInitialisationAndRandomAccess("LinkedList");
		
		start_time = System.currentTimeMillis();
		randomAccess_ArrayList.return10kElement();
		finish_time = System.currentTimeMillis();
		System.out.println("Delta for ArrayList: "+(finish_time-start_time));
		
		start_time = System.currentTimeMillis();
		randomAccess_LinkedList.return10kElement();
		finish_time = System.currentTimeMillis();
		System.out.println("Delta for LinkedList: "+(finish_time-start_time));
	}
}
