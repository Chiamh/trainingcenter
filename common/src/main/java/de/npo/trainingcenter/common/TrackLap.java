package de.npo.trainingcenter.common;

import java.util.Date;

public class TrackLap implements Comparable<TrackLap> {

	private Date startTime;

	private double durationInSeconds;

	private double distanceInMeters;

	public TrackLap() {
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(final Date startTime) {
		if (startTime != null) {
			this.startTime = (Date) startTime.clone();
		} else {
			this.startTime = null;
		}
	}

	public double getDurationInSeconds() {
		return durationInSeconds;
	}

	public void setDurationInSeconds(final double durationInSeconds) {
		this.durationInSeconds = durationInSeconds;
	}

	public double getDistanceInMeters() {
		return distanceInMeters;
	}

	public void setDistanceInMeters(final double distanceInMeters) {
		this.distanceInMeters = distanceInMeters;
	}

	@Override
	public int compareTo(TrackLap other) {
		if (other == null) {
			throw new NullPointerException("Lap.compareTo(null)");
		} else {
			if (getStartTime() == null && other.getStartTime() == null) {
				return 0;
			} else if (getStartTime() == null) {
				return -1;
			} else if (other.getStartTime() == null) {
				return 1;
			} else {
				return getStartTime().compareTo(other.getStartTime());
			}
		}
	}
}