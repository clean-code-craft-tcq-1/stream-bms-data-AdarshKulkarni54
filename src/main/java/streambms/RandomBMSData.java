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
      int temperature = getRandomNumber(); // generating random values from -10 to 100
      int soc = getRandomNumber();
      temperatureList.add(temperature);
      socList.add(soc);
    }
    return new BMSDataFormatInMap(temperatureList, socList).formatData();
  }

  private int getRandomNumber()
  {
    return ThreadLocalRandom.current().nextInt(-10, 101);
  }
}
