package com.javastudy.urlpairs;

import com.javastudy.urlpairs.inputsource.InputAnalyser;
import com.javastudy.urlpairs.inputsource.InputFileProcessor;

public class PairIdentifier {

	public static void main(String[] args) {

		InputAnalyser inputAnalyser = new InputAnalyser();

		System.out.println("URLs that don't have a pair:");
		System.out.println(inputAnalyser.getSingleURLs().toString());
		
		System.out.println();
		System.out.println("URLs that are paired:");
		System.out.println(inputAnalyser.getPairURLs().toString());
	}
}
