package HW_2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        testtext();
    }

    public static void testtext(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = in.nextLine();
        if(str.isEmpty()){
            throw new IllegalArgumentException("Пустые строки вводить нельзя!");
        }
        else{
            System.out.println(str);
        }
        in.close();
    }
}
        

