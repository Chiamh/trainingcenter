package de.npo.trainingcenter.common;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface TrackLogic {

	void handleNewTrackpoint(Trackpoint trackpoint);

	Map<Date, Double> calcPaces(double timeInterval);

	List<TrackLap> calcAutolaps(double lapLength);
}