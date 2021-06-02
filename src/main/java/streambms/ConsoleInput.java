package streambms;

import java.util.Scanner;

public class ConsoleInput implements IInputType
{

  @Override
  public String getInput()
  {
    System.out.println("Please enter required battery and charging parameters: ");
    Scanner scanner = new Scanner(System.in);
    String numberOfParameters = scanner.nextLine();
    scanner.close();
    return numberOfParameters;
  }

}
