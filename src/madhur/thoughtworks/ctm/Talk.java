package madhur.thoughtworks.ctm;

public class Talk {
	
	private String title;
	private int length;
	private Time startTime;
	private boolean scheduled;
	
	public Talk(final String title, final int length) {
		if(title.matches(".*\\d+.*")) {
			throw new IllegalArgumentException(title + " - Title is Invalid because it contains number");
		}
		this.title = title;
		this.length = length;
		
	}
	
	public String title() {
		return title;
	}
	
	public int length() {
		return length;
	}
	
	public Time startTime() {
		return startTime;
	}
	
	public void setStartTime(Time nextAvailableTime) {
		this.startTime = new Time(nextAvailableTime);
	}
	
	@Override
	public String toString() {	
		return this.startTime + " " + this.title + " " + this.length + "min"; 
	}

}