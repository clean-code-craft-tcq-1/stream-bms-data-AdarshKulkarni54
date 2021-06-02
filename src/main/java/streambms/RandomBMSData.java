package streambms;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomBMSData implements IBMSData
{

  @Override
  public IBMSDataFormat getBMSData(final String input)
  {
    List<Integer> temperatureList = new ArrayList<>();
    List<Integer> socList = new ArrayList<>();
    for (int i = 0; i < Integer.parseInt(input); i++)
    {
      int temperature = ThreadLocalRandom.current().nextInt(-10, 101); // generating random values from -10 to 100
      int soc = ThreadLocalRandom.current().nextInt(-10, 101);
      temperatureList.add(temperature);
      socList.add(soc);
    }
    return new BMSDataFormatInMap(temperatureList, socList).formatData();
  }
}
