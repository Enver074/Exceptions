package HW_3;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    private Scanner scanner;

  public ConsoleInputReader(Scanner scanner) {
    this.scanner = scanner;
  }

  @Override
  public UserData readUserData() throws UDException {
    while (true) {
      System.out.println("Введите данные в следующем порядке, разделяя их пробелом: Фамилия Имя Отчество Номер телефона(в формате +79XX)");

      try {
        String input = scanner.nextLine();
        String[] data = input.split(" ");

        if (data.length != 4) {
          throw new UDException("Введено неверное количество данных");
        }

        long phoneNumber = parsePhoneNumber(data[3]);

        return new UserData(data[0], data[1], data[2], phoneNumber);
      } catch (ParseException | NumberFormatException e) {
        System.out.println("Ошибка: " + e.getMessage());
      }
    }
  }

  private long parsePhoneNumber(String phoneNumberString) throws ParseException, UDException {
    try {
      if (phoneNumberString.length() != 12){
        throw new UDException("Неверно введен номер телефона");}
      return Long.parseLong(phoneNumberString);
    } catch (NumberFormatException e) {
      throw new ParseException("Неверный формат номера телефона");
    }
  }
}