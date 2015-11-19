package com.javastudy.urlpairs.inputsource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class InputFileProcessor {

	public LinkedList<String> getSanitisedURLs() {
		LinkedList<String> sanitisedURLs = new LinkedList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader("URLs.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				sanitisedURLs.add(sanitiseURL(line));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return sanitisedURLs;
	}
	
	private String sanitiseURL(String inputLine) {
		int extensionSeparator = inputLine.lastIndexOf('.');
		return inputLine.substring(0, extensionSeparator-3)+".xml";
		}	
}