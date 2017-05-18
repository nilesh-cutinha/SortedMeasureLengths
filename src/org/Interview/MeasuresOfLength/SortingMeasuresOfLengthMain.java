package org.Interview.MeasuresOfLength;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingMeasuresOfLengthMain {

	public static void main(String[] args) throws IOException {
	    // List<String> stringList = (List) Arrays.asList("1m", "1.5m", "10m", "2m", "2.5m", "3m","0m");
		List<String> stringList = (List) Arrays.asList("1.512mm","0.5mm","27mm", "20mm");
	    SortMeasuresOfLength sortMeasuresOfLength = new SortMeasuresOfLength();
	    stringList = sortMeasuresOfLength.sortUnsortedMeasuresOfLength(stringList);
	    System.out.println(stringList);
	}
	
}
