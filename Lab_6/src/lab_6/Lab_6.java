package lab_6;

import java.util.Scanner;

public class Lab_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите ваш набор символов: ");
        String str = input.nextLine();
        String output = "";
        int counter = 0;
        int n = str.length();
        int m1 = n/3;
        int m = m1*3;
        System.out.println("Количество слов: " + m1);
        for(int i = 0; i < m; i++){
            counter++;
            output += str.charAt(i);
            if(counter == 3){
                output += " ";
                counter = 0;
            }
        }
        System.out.println(output);
    }
}

        
        

