package de.npo.trainingcenter.common;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class TcxTrackpointTest {

	private static final double DELTA_ACCEPTED = 0.001;

	private static final Date TEST1_DATE = new Date();
	private static final double TEST1_LONGITUDE = 123.0;
	private static final double TEST1_LATITUDE = 432.0;
	private static final int TEST1_ALTITUDE = 18;
	private static final double TEST1_DISTANCE = 34.5;

	private TcxTrackpoint test1TcxTrackpoint;

	@Before
	public void setup() {
		test1TcxTrackpoint = new TcxTrackpoint(TEST1_DATE, TEST1_LONGITUDE, TEST1_LATITUDE, TEST1_ALTITUDE, TEST1_DISTANCE);
	}

	@Test
	public void time() {
		assertEquals(TEST1_DATE, test1TcxTrackpoint.getTime());
		assertNotSame(TEST1_DATE, test1TcxTrackpoint.getTime());
	}

	@Test
	public void timeNull() {
		TcxTrackpoint testNullTime = new TcxTrackpoint(null, TEST1_LONGITUDE, TEST1_LATITUDE, TEST1_ALTITUDE, TEST1_DISTANCE);
		assertNull(testNullTime.getTime());
		assertEquals(TEST1_LONGITUDE, testNullTime.getLongitudeDegrees(), DELTA_ACCEPTED);
		assertEquals(TEST1_LATITUDE, testNullTime.getLatitudeDegrees(), DELTA_ACCEPTED);
		assertEquals(TEST1_ALTITUDE, testNullTime.getAltitudeMeters());
		assertEquals(TEST1_DISTANCE, testNullTime.getDistanceMeters(), DELTA_ACCEPTED);
	}

	@Test
	public void longitude() {
		assertEquals(TEST1_LONGITUDE, test1TcxTrackpoint.getLongitudeDegrees(), DELTA_ACCEPTED);
	}

	@Test
	public void latitude() {
		assertEquals(TEST1_LATITUDE, test1TcxTrackpoint.getLatitudeDegrees(), DELTA_ACCEPTED);
	}

	@Test
	public void altitude() {
		assertEquals(TEST1_ALTITUDE, test1TcxTrackpoint.getAltitudeMeters());
	}

	@Test
	public void distance() {
		assertEquals(TEST1_DISTANCE, test1TcxTrackpoint.getDistanceMeters(), DELTA_ACCEPTED);
	}
}