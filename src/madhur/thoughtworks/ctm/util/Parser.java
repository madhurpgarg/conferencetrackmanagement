package madhur.thoughtworks.ctm.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import madhur.thoughtworks.ctm.Talk;

public class Parser {
	
	public static List<Talk> parse(String path) {
		List<Talk> talks = new ArrayList<Talk>();
		File inputFile = new File("input.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
			String talkString;
			while ((talkString = br.readLine()) != null) {
				talks.add(createTalk(talkString));
			}
		}

		catch (IOException e) {
			System.err.println("Problem in reading file with exception - " + e.getMessage());
		}

		return talks;
	}
	
	private static Talk createTalk(String talkString) {
		int lastIndexOfSpace = talkString.lastIndexOf(" ");
		String title = talkString.substring(0, lastIndexOfSpace);
		int talkLength = Integer.parseInt(talkString.substring(lastIndexOfSpace + 1).equalsIgnoreCase("lightning") ? "5"
				: talkString.substring(lastIndexOfSpace + 1, lastIndexOfSpace + 3));
		Talk talk = new Talk(title, talkLength);
		return talk;
	}

}
