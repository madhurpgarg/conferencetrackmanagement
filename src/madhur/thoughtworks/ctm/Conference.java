package madhur.thoughtworks.ctm;

import java.util.ArrayList;
import java.util.List;

public class Conference {

	private List<Track> tracks;

	public Conference() {
		this.tracks = new ArrayList<Track>();
	}

	public Conference prepareSchedule(List<Talk> talks) {

		Track track1 = new Track("Track 1");
		//Track track2 = new Track("Track 2");
		Track track = track1;

		/*
		 * tracks.add(track1); tracks.add(track2);
		 */
		
		tracks.add(track);

		for (Talk talk : talks) {

			/*
			 * if(track1.canAccomodate(talk)){ track1.addTalk(talk); } else {
			 * track2.addTalk(talk); }
			 */
			if (track.canAccomodate(talk)) {
				track.addTalk(talk);
			} else {
				track = new Track("Track " + (tracks.size() + 1));
				tracks.add(track);
			}

		}

		return this;

	}

	@Override
	public String toString() {

		String confStr = "";
		for (Track track : tracks) {
			confStr = confStr + track + System.lineSeparator();
		}

		return confStr;
	}

}
