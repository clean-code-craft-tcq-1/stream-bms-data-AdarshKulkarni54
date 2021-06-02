package streambms;

import java.util.ArrayList;
import java.util.List;

public class FakeBMSData implements IBMSData
{

  @Override
  public IBMSDataFormat getBMSData(final String input)
  {
    List<Integer> temperatureList = new ArrayList<>();
    List<Integer> socList = new ArrayList<>();
    for (int i = 0; i < Integer.parseInt(input); i++)
    {
      int temperature = 20 + i;
      int soc = 30 + i;
      temperatureList.add(temperature);
      socList.add(soc);
    }
    return new BMSDataFormatInMap(temperatureList, socList).formatData();
  }

}
