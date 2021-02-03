package lab_5;
import java.util.Scanner;
public class Lab_5 {
    public static void main(String[] args) {
         System.out.print("Введите число для конвертации градусов Цельсия: ");
         Scanner in = new Scanner(System.in);
         double C =in.nextDouble();
         Grsdus.Convertacia(C);
          System.out.println("");
         System.out.print("Введите сантиметры для конвертации: ");
         double CM =in.nextDouble();
         Sentimeters.Convertacia(CM);
         System.out.println("");
         System.out.print("Введите килограммы  для конвертации: ");
         double KG =in.nextDouble();
         Kilimeters.Convertacia(KG);
         System.out.println("");
         Sotrydnik.Persona();
    }
  }
