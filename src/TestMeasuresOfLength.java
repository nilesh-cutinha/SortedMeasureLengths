/**
 * This class contains Test cases for the SortMeasuresOfLength methods
 */

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.Interview.MeasuresOfLength.SortMeasuresOfLength;
import org.junit.Before;
import org.junit.Test;

public class TestMeasuresOfLength {
	
	SortMeasuresOfLength sortMeasuresOfLength;
	
	@Before
	public void createMeasureOfLengthObject(){
		sortMeasuresOfLength = new SortMeasuresOfLength();
	}

	@Test
	public void testMeasureOfLengthMeters() {
		List<String> sortedMeasuresOfLengthMeters = sortMeasuresOfLength.
				sortUnsortedMeasuresOfLength((List<String>) Arrays.asList("1m", "1.5m", "10m", "2m", "2.5m", "3m","0m"));
		List<String> expectedMeasuresOfLengthMeters = (List<String>) Arrays.asList("0m","1m", "1.5m", "2m", "2.5m", "3m","10m");
		assertEquals(expectedMeasuresOfLengthMeters, sortedMeasuresOfLengthMeters);
	}

	@Test
	public void testMeasureOfLengthCentimeters() {
		List<String> sortedMeasuresOfLengthCentiMeters = sortMeasuresOfLength.
				sortUnsortedMeasuresOfLength((List<String>) Arrays.asList("1cm", "1.5cm", "10cm", "2cm", "2.5cm", "3cm","0cm"));
		List<String> expectedMeasuresOfLengthCentiMeters = (List<String>) Arrays.asList("0cm","1cm", "1.5cm", "2cm", "2.5cm", "3cm","10cm");
		assertEquals(expectedMeasuresOfLengthCentiMeters, sortedMeasuresOfLengthCentiMeters);
	}

	@Test
	public void testMeasureOfLengthKilometers() {
		List<String> sortedMeasuresOfLengthKiloMeters = sortMeasuresOfLength.
				sortUnsortedMeasuresOfLength((List<String>) Arrays.asList("10km", "1.512km", "20km", "27km", "2.56km", "3km","0km"));
		List<String> expectedMeasuresOfLengthKiloMeters = (List<String>) Arrays.asList("0km","1.512km", "2.56km", "3km", "10km", "20km","27km");
		assertEquals(expectedMeasuresOfLengthKiloMeters, sortedMeasuresOfLengthKiloMeters);
	}

	@Test
	public void testMeasureOfLengthMillimeters() {
		List<String> sortedMeasuresOfLengthMilliMeters = sortMeasuresOfLength.
				sortUnsortedMeasuresOfLength((List<String>) Arrays.asList("1.512mm","0.5mm","27mm", "20mm"));
		List<String> expectedMeasuresOfLengthMilliMeters = (List<String>) Arrays.asList("0.5mm","1.512mm", "20mm", "27mm");
		assertEquals(expectedMeasuresOfLengthMilliMeters, sortedMeasuresOfLengthMilliMeters);
	}

	
}
