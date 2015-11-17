package com.javastudy.measurements;

import com.javastudy.collectiontypes.ICollections;

public abstract class AbstractMeasurement implements IMeasurement {
	
	protected ICollections measurementCandidate;
	
	public void setMeasurementCandidate(ICollections measurementCandidate) {
		this.measurementCandidate = measurementCandidate;
	}
}