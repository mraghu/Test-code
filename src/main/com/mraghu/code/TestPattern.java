package com.mraghu.code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {

	private static String text = "Even as a child, Vasudeva exhibited precocious talent for grasping all things "
			+"spiritual. As an incarnation of Mukhyaprana this was not new for him. He was drawn to the path of " 
			+"renunciation and even as a boy of eleven years, he chose initiation into the monastic order from "
			+ "Acyuta-Prajna (also called Acyuta Preksa), a reputed ascetic of the time, near Udupi, in the year "
			+ "Saumya (1249 CE). The preceptor Acyuta Preksa gave the boy Vasudeva the name of Purnaprajna at the "
			+ "time of his initiation into sannyasa (renounced order).";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\s*[a-zA-Z]{2,}\\s+[a-zA-Z]{2,}\\s*");
		Matcher matcher = pattern.matcher(text);
	    while (matcher.find()) {
	      String matched = matcher.group();
	      
	      System.out.println(matched);
	    }


	}

}
