package streambms;

public class Sender
{
  public static void main(final String[] args)
  {
    IBMSData bmsData = new RandomBMSData();
    IInputType inputType = new ConsoleInput();
    bmsData.getBMSData(inputType.getInput()).send();
  }
}
