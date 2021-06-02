package streambms;

import static org.junit.Assert.assertEquals;

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
    IBMSData bmsData = new FakeBMSData();
    IBMSDataFormat bmsDataFormat = bmsData.getBMSData("4");
    assertEquals("{Temperature=[20, 21, 22, 23], SOC=[30, 31, 32, 33]}", bmsDataFormat.toString());
  }
}
