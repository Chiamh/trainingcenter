package de.npo.trainingcenter.common.tcx;

import java.util.List;

import de.npo.trainingcenter.common.TrackLap;
import de.npo.trainingcenter.common.TrackLogic;

public interface TcxTrackLogic extends TrackLogic {

	void handleLap();

	List<TrackLap> getLaps();
}