package HW_3;

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ConsoleInputReader inputReader = new ConsoleInputReader(scanner);
    UDFileWriterImpl fileWriter = new UDFileWriterImpl();

    try {
      UserData userData = inputReader.readUserData();
      fileWriter.writeUserData(userData);
    } catch (UDException | IOException e) {
      System.out.println("Ошибка: " + e.getMessage());
    }
  }
}