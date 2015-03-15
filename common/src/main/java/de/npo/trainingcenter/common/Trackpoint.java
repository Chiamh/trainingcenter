package de.npo.trainingcenter.common;

import java.util.Date;

public interface Trackpoint {

	Date getTime();

	double getLongitudeDegrees();

	double getLatitudeDegrees();

	int getAltitudeMeters();
}