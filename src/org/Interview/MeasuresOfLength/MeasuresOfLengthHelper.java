package org.Interview.MeasuresOfLength;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
* The MeasuresOfLengthHelper class provides helper methods
* to be used in the MeasuresOfLength package 
*
* @author  Nilesh Cutinha
* 
*/
public final class MeasuresOfLengthHelper {

	private final static Logger logger = Logger.getLogger(MeasuresOfLengthHelper.class.getName());

	/** 
	 * Empty private constructor to prevent instantiation 
	 **/
	private MeasuresOfLengthHelper(){}

	/**
	 * This method extracts the digits from the string
	 * @param strValue a string which may contain a number
	 * @return extracted number from the string, takes care of floating
	 *         point numbers as well
	 */
	public static float extractDigitsFromString(String strValue) {
        String str = strValue.trim();
        StringBuffer digitsBuf = new StringBuffer();
        float digitsToReturn = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            char chrs = str.charAt(i);         
            // Check whether the character is a digit or a dot
            // A dot could indicate a floating value and should be retained
            if ('.' == chrs || Character.isDigit(chrs))
            	digitsBuf.append(chrs);
        }
        try{
        	digitsToReturn = Float.parseFloat(digitsBuf.toString());
        } catch(NumberFormatException ex) {
        	logger.log(Level.SEVERE, "Number Format Exception occurred while formatting the string", ex);
        }
        return digitsToReturn;
    }
}
