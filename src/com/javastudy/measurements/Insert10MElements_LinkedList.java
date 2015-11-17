package com.javastudy.measurements;

public class Insert10MElements_LinkedList extends AbstractMeasurement{
	private long start_time;
	private long finish_time;
	
	@Override
	public String performMeasurement() {
		start_time = System.currentTimeMillis();
		for (int i=0; i<1000000; i++) {
			measurementCandidate.insertElement(new Integer(i));
		}
		finish_time = System.currentTimeMillis();
		return "Delta for LinkedList to insert 10 million elements: "+(finish_time-start_time)+" ms";
	}
}