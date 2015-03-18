package de.npo.trainingcenter.common;

import java.util.List;

public interface TcxTrackLogic extends TrackLogic {

	void handleLap();

	List<TrackLap> getLaps();
}