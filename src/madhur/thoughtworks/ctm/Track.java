package madhur.thoughtworks.ctm;

public class Track {

	private Session morningSession;
	private Session lunch;
	private Session eveningSession;
	private Session networkingEvent;
	private String name;

	public String getName() {
		return name;
	}

	public Track(String name) {
		this.name = name;
		this.morningSession = new Session(180, "09:00AM");

		this.lunch = new Session(60, "12:00PM");
		this.lunch.addTalk(new Talk("Lunch", 60));

		this.networkingEvent = new Session(60, "05:00PM");
		this.networkingEvent.addTalk(new Talk("Networking Event", 60));

		this.eveningSession = new Session(240, "01:00PM");

	}

	public boolean canAccomodate(Talk talk) {
		return this.morningSession.canAccomodate(talk) || this.eveningSession.canAccomodate(talk);
	}

	public void addTalk(Talk talk) {
		if (this.morningSession.canAccomodate(talk)) {
			this.morningSession.addTalk(talk);
		} else if (this.eveningSession.canAccomodate(talk)) {
			this.eveningSession.addTalk(talk);
		} else {
			throw new IllegalArgumentException("No space for new talk");
		}
	}

	@Override
	public String toString() {
		return this.name + ":" + System.lineSeparator() + morningSession + lunch
				+ eveningSession + networkingEvent;
	}

}
