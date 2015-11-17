package com.javastudy.measurements;

class RandomAccess10kElements_ArrayList extends AbstractMeasurement {
	private int randomInteger;
	private Integer[] resultArray = new Integer[10000];
	private long start_time;
	private long finish_time;
	
	@Override
	public String performMeasurement() {
		start_time = System.currentTimeMillis();
		for  (int i=0; i<10000; i++) {
			randomInteger = (int)Math.floor(measurementCandidate.returnSize()*Math.random());
			resultArray[i] = measurementCandidate.returnElement(randomInteger);			
		}
		finish_time = System.currentTimeMillis();
		return "Delta for ArrayList: "+(finish_time-start_time)+" ms";
	}
}
