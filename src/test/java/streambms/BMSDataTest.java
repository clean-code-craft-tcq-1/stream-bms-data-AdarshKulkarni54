package streambms;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BMSDataTest
{
  @Test
  public void testBMSDataOnInput()
  {
    IBMSData bmsData = new RandomBMSData();
    IBMSDataFormat bmsDataFormat = bmsData.getBMSData("5");
    assertEquals(5, bmsDataFormat.getTemperature().size());
    assertEquals(5, bmsDataFormat.getSoc().size());
  }

  @Test
  public void testBMSDataFormat()
  {
    List<Integer> temperatureList = Arrays.asList(20, 21, 22, 23);
    List<Integer> socList = Arrays.asList(30, 31, 32, 33);
    IBMSDataFormat bmsDataFormat = new BMSDataFormatInMap(temperatureList, socList).formatData();
    assertEquals("{Temperature=[20, 21, 22, 23], SOC=[30, 31, 32, 33]}", bmsDataFormat.toString());
  }
}
