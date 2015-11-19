package com.javastudy.urlpairs.inputsource;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class InputAnalyser {
	private HashSet<String> singleURLs = new HashSet<String>();
	private LinkedList<String> duplicateURLs = new LinkedList<String>();
	
	private InputFileProcessor inputFileProcessor = new InputFileProcessor();
	private LinkedList<String> sanitisedURLs;
	
	public InputAnalyser() {
		this.sanitisedURLs = inputFileProcessor.getSanitisedURLs();
	}
	
	public HashSet<String> getSingleURLs() {
		
		while (!(sanitisedURLs.isEmpty())) {
			String nextURL = sanitisedURLs.removeFirst();
			if (!(singleURLs.add(nextURL))) {
				this.duplicateURLs.add(nextURL);
				singleURLs.remove(nextURL);
			}
		}
		return singleURLs;
	}
	
	public LinkedList<String> getPairURLs() {
		return duplicateURLs;
	}
}