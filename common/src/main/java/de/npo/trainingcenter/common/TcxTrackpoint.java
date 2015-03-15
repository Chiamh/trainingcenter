package de.npo.trainingcenter.common;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcxTrackpoint implements Trackpoint {

	public static final String DATE_TIME_FORMAT = "dd-MM-yyyy HH:mm:ss";
	public static final String DEGREES_FORMAT = "##0.0000000";

	private final DateFormat DATE_TIME_FORMATTER = new SimpleDateFormat(DATE_TIME_FORMAT);
	private final DecimalFormat DEGREES_FORMATTER = new DecimalFormat(DEGREES_FORMAT);

	private final Date time;
	private final double longitudeDegrees;
	private final double latitudeDegrees;
	private final int altitudeMeters;
	private final double distanceMeters;

	public TcxTrackpoint(final Date time, final double longitudeDegrees, final double latitudeDegrees, final int altitudeMeters,
			final double distanceMeters) {
		if (time != null) {
			this.time = (Date) time.clone();
		} else {
			this.time = null;
		}
		this.longitudeDegrees = longitudeDegrees;
		this.latitudeDegrees = latitudeDegrees;
		this.altitudeMeters = altitudeMeters;
		this.distanceMeters = distanceMeters;
	}

	@Override
	public Date getTime() {
		return time;
	}

	@Override
	public double getLongitudeDegrees() {
		return longitudeDegrees;
	}

	@Override
	public double getLatitudeDegrees() {
		return latitudeDegrees;
	}

	@Override
	public int getAltitudeMeters() {
		return altitudeMeters;
	}

	public double getDistanceMeters() {
		return distanceMeters;
	}

	@Override
	public String toString() {
		return DATE_TIME_FORMATTER.format(time) + " ( " + DEGREES_FORMATTER.format(longitudeDegrees) + " , "
				+ DEGREES_FORMATTER.format(latitudeDegrees) + " , " + altitudeMeters + " , " + distanceMeters + " )";
	}
}