package streambms;

import java.util.List;

public interface IBMSDataFormat
{
  List<Integer> getTemperature();

  void setTemperature(final List<Integer> temperature);

  List<Integer> getSoc();

  void setSoc(final List<Integer> soc);

  IBMSDataFormat formatData();

  void send();
}
