package com.javastudy.measurements;

import com.javastudy.collectiontypes.ICollections;

public interface IMeasurement {

	public void setMeasurementCandidate(ICollections measurementCandidate);
	
	public String performMeasurement();
}
