package madhur.thoughtworks.ctm;

import java.util.ArrayList;
import java.util.List;

public class Session {
	
	private int duration;
	private Time nextAvailableTime;
	private Time beginAt;
	private int minsLeft;


	public Session(int duration, String beginAt) {
		this.duration = duration;
		this.beginAt = new Time(beginAt);
		this.nextAvailableTime = this.beginAt;
		this.minsLeft = duration;
		this.talks = new ArrayList<Talk>();
	}

	public int getDuration() {
		return duration;
	}
	
	public void addTalk(Talk talk) {
		talk.setStartTime(nextAvailableTime);
		talks.add(talk);
		nextAvailableTime.incrementMinutesBy(talk.length());
		minsLeft = minsLeft - talk.length();
	}

	private List<Talk> talks;
	
	public boolean canAccomodate(Talk talk) {
		return minsLeft >= talk.length();
	}
	
	@Override
	public String toString() {
		String str = "";
		for (Talk talk : talks) {
			str = str + talk.toString() + System.lineSeparator();
		}
		return str;
	}
}
