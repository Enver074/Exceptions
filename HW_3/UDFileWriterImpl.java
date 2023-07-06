package HW_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UDFileWriterImpl implements UDFileWriter {

  @Override
  public void writeUserData(UserData userData) throws IOException {
    Scanner scanner = new Scanner(System.in);
    String fileName = userData.getLastName();
    try(FileWriter writer = new FileWriter(fileName, true)){
    String userDataString = String.join(" ",
        userData.getLastName(),
        userData.getFirstName(),
        userData.getMiddleName(),
        String.valueOf("+" + userData.getPhoneNumber()));
    writer.write(userDataString + "\n");
    writer.close();
    System.out.println("Данные успешно записаны в файл: " + fileName);
  }
    catch(IOException ex){
      System.out.println(ex.getMessage());
    }
    scanner.close();
  }
 
}
