package org.test.Test1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingMeasuresOfLength {

	public static void main(String[] args) throws IOException {
	    List<String> strings = (List) Arrays.asList("1m", "1.5m", "10m", "2m", "2.5m", "3m");
	    Collections.sort(strings, new Comparator<String>() {
	        public int compare(String o1, String o2) {
	            return extractInt(o1) - extractInt(o2);
	        }

	        int extractInt(String s) {
	            String num = s.replaceAll("\\D", "");
	            System.out.println(num);
	            // return 0 if no digits found
	            return num.isEmpty() ? 0 : Integer.parseInt(num);
	        }
	    });
	    System.out.println(strings);
	}
	
}
