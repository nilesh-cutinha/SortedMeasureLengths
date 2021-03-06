package org.Interview.MeasuresOfLength;

/**
 * The main class to test the working of Sorting Length Measures
 */
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SortingMeasuresOfLengthMain {

	public static void main(String[] args) throws IOException {
	    List<String> stringList = (List<String>) Arrays.asList("1m", "1.5m", "10m", "2m", "2.5m", "3m","0m");
	    SortMeasuresOfLength sortMeasuresOfLength = new SortMeasuresOfLength();
	    stringList = sortMeasuresOfLength.sortUnsortedMeasuresOfLength(stringList);
	    System.out.println(stringList);
	}
	
}
