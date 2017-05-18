package org.test.Test1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingMeasuresOfLength2 {

	public static void main(String[] args) throws IOException {
	    List<String> strings = (List) Arrays.asList("1m", "1.5m", "10m", "2m", "2.5m", "3m","0m");
	    Collections.sort(strings, new Comparator<String>() {
	        public int compare( String o2,String o1) {
	        	// System.out.println(drawDigitsFromString(o1));
	        	// System.out.println(drawDigitsFromString(o2));
	        	float checkTheNumber = Float.parseFloat(drawDigitsFromString(o1)) - Float.parseFloat(drawDigitsFromString(o2));
	        	return Math.round(checkTheNumber);
	        }

	        public String drawDigitsFromString(String strValue){
	            String str = strValue.trim();
	            StringBuffer digits= new StringBuffer();
	            for (int i = 0; i < str.length(); i++) {
	                char chrs = str.charAt(i);              
	                if (Character.isDigit(chrs) || chrs == '.')
	                	// System.out.println(chrs);
	                    digits.append(chrs);
	            }
	            return digits.toString();
	        }
	    });
	    System.out.println(strings);
	}
	
}
