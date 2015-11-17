package com.javastudy.collections;

import com.javastudy.collectiontypes.CollectionsFactory;
import com.javastudy.collectiontypes.ICollections;
import com.javastudy.measurements.IMeasurement;
import com.javastudy.measurements.MeasurementsFactory;

public class CollectionsStudy {

	public static void main(String[] args) {
		final int measurementCandidateSize = 1000000; 		
		final String[][] measurementSetups = {
				{"insert10M","ArrayList"},
				{"insert10M","LinkedList"},
				{"return10krandom","ArrayList"},
				{"return10krandom","LinkedList"}
		};

		CollectionsFactory collectionFactory = new CollectionsFactory();
		MeasurementsFactory measurementFactory = new MeasurementsFactory();
		ICollections collectionCandidate;
		IMeasurement measurement;
		
		for (int i=0; i<measurementSetups.length; i++) {
			collectionCandidate = collectionFactory.createCollection(measurementSetups[i][1]);
			collectionCandidate.initialiseCollection(measurementCandidateSize);
			
			measurement = measurementFactory.createMeasurement(measurementSetups[i][0], measurementSetups[i][1]);
			measurement.setMeasurementCandidate(collectionCandidate);

			System.out.println(measurement.performMeasurement());
		}
	}
}