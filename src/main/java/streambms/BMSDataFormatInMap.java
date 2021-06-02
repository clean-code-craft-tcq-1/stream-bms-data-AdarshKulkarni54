package streambms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BMSDataFormatInMap implements IBMSDataFormat
{
  private List<Integer> temperature = new ArrayList<>();
  private List<Integer> soc = new ArrayList<>();
  private Map<String, List<Integer>> bmsDataInMap = new HashMap<>();

  public BMSDataFormatInMap(final List<Integer> temparature, final List<Integer> soc)
  {
    this.temperature = temparature;
    this.soc = soc;
  }

  @Override
  public List<Integer> getTemperature()
  {
    return this.temperature;
  }

  @Override
  public void setTemperature(final List<Integer> temperature)
  {
    this.temperature = temperature;
  }

  @Override
  public List<Integer> getSoc()
  {
    return this.soc;
  }

  @Override
  public void setSoc(final List<Integer> soc)
  {
    this.soc = soc;
  }

  public Map<String, List<Integer>> getBmsDataInMap()
  {
    return this.bmsDataInMap;
  }

  public void setBmsDataInMap(final Map<String, List<Integer>> bmsDataInMap)
  {
    this.bmsDataInMap = bmsDataInMap;
  }

  @Override
  public IBMSDataFormat formatData()
  {
    this.bmsDataInMap.put("Temperature", getTemperature());
    this.bmsDataInMap.put("SOC", getSoc());
    return this;
  }

  @Override
  public void send()
  {
    System.out.println(toString());
  }

  @Override
  public String toString()
  {
    return getBmsDataInMap().toString();
  }
}
