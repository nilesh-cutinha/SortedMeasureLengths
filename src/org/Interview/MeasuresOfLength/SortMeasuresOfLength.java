package org.Interview.MeasuresOfLength;

/**
 * This class contains methods to sort lists containing unsorted measures
 * 
 * @author  Nilesh Cutinha
 * 
 */

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMeasuresOfLength {

	/**
	 * This method takes in an input of unsorted measures and outputs a list of soreted measures
	 * @param measuresOfLengthList unsorted measures in a String list
	 * @return sorted measures in a String list 
	 */
	public List<String> sortUnsortedMeasuresOfLength(List<String> measuresOfLengthList) {
		Collections.sort(measuresOfLengthList, new Comparator<String>() {
	        public int compare(String o1, String o2) {
	        	float ascDescIndicator = MeasuresOfLengthHelper.extractDigitsFromString(o1) - 
	        			MeasuresOfLengthHelper.extractDigitsFromString(o2);
	        	return Math.round(ascDescIndicator);
	        }
		});
		return measuresOfLengthList;     
	}
}
