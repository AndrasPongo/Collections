package com.javastudy.measurements;

public class MeasurementsFactory {
	
	public IMeasurement createMeasurement(String measurementType, String candidateType) {
		if (measurementType == null || candidateType == null) {
			throw new IllegalArgumentException();
		}
		
		if (measurementType.equals("return10krandom") && candidateType.equals("ArrayList")) {
			return new RandomAccess10kElements_ArrayList();
		} else if (measurementType.equals("return10krandom") && candidateType.equals("LinkedList")){
			return new RandomAccess10kElements_LinkedList();		
		} else if (measurementType.equals("insert10M") && candidateType.equals("ArrayList")){
			return new Insert10MElements_ArrayList();		
		} else if (measurementType.equals("insert10M") && candidateType.equals("LinkedList")){
			return new Insert10MElements_LinkedList();		
		} else {
		}
			throw new IllegalArgumentException("Unsupported measurement type");
		}
}