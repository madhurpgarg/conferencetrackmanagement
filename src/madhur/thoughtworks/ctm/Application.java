package madhur.thoughtworks.ctm;

import java.util.List;

import madhur.thoughtworks.ctm.util.Parser;

public class Application {
	public static void main(String[] args) {
		List<Talk> talks = Parser.parse("input.txt");
		Conference conference = new Conference();
		System.out.println(conference.prepareSchedule(talks));
		
	}

}
