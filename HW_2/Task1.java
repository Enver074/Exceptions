package HW_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        exception();
    }
    
    public static void floatnum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
            String strnum = in.nextLine();
                if(strnum.indexOf(",") != -1){
                    strnum = strnum.replace(",", ".");
                }
            Float num = Float.parseFloat(strnum);
            System.out.println("Вы ввели: " + num);
        in.close();
    }

    public static void exception(){
        try {
            floatnum();
        }
        catch(InputMismatchException | NumberFormatException e){
            System.out.println("Неверный ввод!");
        }
    }
}

