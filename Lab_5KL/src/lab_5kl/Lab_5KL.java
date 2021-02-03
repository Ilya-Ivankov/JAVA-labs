package lab_5kl;
import java.util.Scanner;
import java.util.ArrayList;
public class Lab_5KL {
public static int Numbers;
public static int min;
public static int min_index;
public static int min_elements;
    public static void main(String[] args) {
ArrayList<Integer>arrayList = new ArrayList<>();
ArrayList<Integer>arrayList2 = new ArrayList<>();
ArrayList<Integer>arrayList3 = new ArrayList<>();
Scanner in = new Scanner(System.in);
boolean Check;//Переменная проверки
System.out.print("Начинаем ввод данныех в массив (true-ДА, false-НЕТ)?: ");
Check = in.nextBoolean(); 
//Пользователь вводит данные в массив;
    while(Check == true)
    {
       System.out.print("Введите число в массив: ");
       Numbers = in.nextInt();
       arrayList.add(Numbers);
       Check = false;
       System.out.print("Хотите ещё ввести данные в массив (true-ДА, false-НЕТ)?: ");
       Check = in.nextBoolean();
    }
//Поиск Индекса и Значения  минимального чётного элемента;
for(int i = 0; i < arrayList.size(); i++){
    if(arrayList.get(i)%2 ==0){
    min =arrayList.get(i);
    min_index = i;
    }
     for(int j = i+1; j < arrayList.size(); j++){
         if((min > arrayList.get(j)) && (arrayList.get(j)%2 == 0))
         {
         min =arrayList.get(j);
         min_index = j;    
         }
     }
     
}
//Поиск числа в  массиве который при делении на "min" даст остаток 0;
   for(int i = 0; i < arrayList.size(); i++){
    if(arrayList.get(i)%min ==0){
        arrayList2.add(arrayList.get(i));
    }
   }
 System.out.println("Введеный массив: "+ arrayList);
 System.out.println("Минимальное чётное число в массиве: "+ min);
 System.out.println("Индекс минимального чётного числа в массиве: "+ min_index);
 System.out.println("Числа которые при делении на минимальное чётное число в массиве: даст остаток 0: "+ arrayList2);
 int lastIndex;
   for(int i = 0; i < arrayList.size(); i++){
      lastIndex = arrayList.lastIndexOf(arrayList.get(i));
        if (lastIndex == arrayList.indexOf(arrayList.get(i))){
        arrayList3.add(arrayList.get(i));
      }
  }
   System.out.println("Числа которые встрачаются только один раз: "+ arrayList3);
    }
 }
