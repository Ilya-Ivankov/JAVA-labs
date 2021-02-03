package lab_6kl;
import java.util.Scanner;
public class Lab_6KL {

    public static void main(String[] args) {
 number2();
 number1();
}
    
 public static void  number1(){
Scanner in = new Scanner(System.in);
String[] one = new String[]{"ноль ","один ","два ","три ","четыре ","пять ","шесть ","семь ","восемь ","девять ", "десять ","одинадцать ","двенадцать ","тренадцать ","четырнадцать ","пятнадцать ","шеснадцать ","семнадцать ","восемнадцать ","девятнадцать "};
String[] too = new String[]{"","","двадцать ","тридцать ","сорок ","пятдесят ", "шестьдесят ","семнадцать ","восемдесят ","девяносто ",};    
String[] three = new String[]{"","сто ","двести ","триста ","четыреста ", "пятьсот ","шестьсот ","семьсот ","восемьсот ","девятсот "};    
    int []Ost100 =new int[3];
    int Ost10;
    System.out.print("Введите число: ");
    int Number = in.nextInt();
    int N = Number;
    int N2 = 0; 
        if (Number > 99 && Number <1000){
           for(int i = 0; i < 3; i++){
        Ost10 = Number%10;
        Number = Number / 10;
        Ost100[i] = Ost10;
          }
        if (N > 109 && N < 119){
          N2 = N%100;
         System.out.println(three[Ost100[2]]+one[N2]); 
        }
       
        else if (Ost100[0] == 0){
        System.out.println(three[Ost100[2]]+too[Ost100[1]]);     
        }

        else{
       System.out.println(three[Ost100[2]]+too[Ost100[1]]+one[Ost100[0]]); 
        }
         }
    else if(Number > 19 && Number < 100) {
        for(int i = 0; i < 3; i++){
        Ost10 = Number%10;
        Number = Number / 10;
        Ost100[i] = Ost10;
          } 
     System.out.print(too[Ost100[1]]+one[Ost100[0]]);     
    }
    else if(Number < 20){
       System.out.println(one[Number]); 
    }
 // END        
    }    


public static void  number2(){
int NM = 0;
Scanner in = new Scanner(System.in);
System.out.print("Введите число буквами: ");
String Number = in.nextLine();
Number = Number.toLowerCase();
String[] SLOVA = Number.split(" ");
int Error = 0;
if (SLOVA.length > 3){
    System.out.print(" [-1] Ты ввёл больше 3-х слов / некорректное расположение  слов");
    Error = -1;
}
String[] one = new String[]{"ноль","один","два","три","четыре","пять","шесть","семь","восемь","девять", "десять","одинадцать","двенадцать","тренадцать","четырнадцать","пятнадцать","шеснадцать","семнадцать","восемнадцать","девятнадцать"};
String[] too = new String[]{"","","двадцать","тридцать","сорок","пятдесят", "шестьдесят","семнадцать","восемдесят","девяносто",};    
String[] three = new String[]{"","сто","двести","триста","четыреста", "пятьсот","шестьсот","семьсот","восемьсот","девятсот"};    
 if (SLOVA.length == 3){
    for(int i = 1; i < three.length; i++){
        if(three[i].equals(SLOVA[0])){
          NM += i *100;  
        }
    }
     for(int j = 0; j < too.length; j++){
        if(too[j].equals(SLOVA[1])){
         NM += j *10;  
        }    
    }
      for(int j = 0; j < one.length; j++){
        if(one[j].equals(SLOVA[2])){
         NM += j;  
        }    
    }
System.out.println(NM);
}
 else if(SLOVA.length == 2){
    for(int i = 1; i < three.length; i++){
        if(three[i].equals(SLOVA[0])){
          NM += i *100;  
        }
    }
     for(int j = 0; j < too.length; j++){
        if(too[j].equals(SLOVA[0])){
         NM += j *10;  
        }    
    }
      for(int j = 0; j < one.length; j++){
        if(one[j].equals(SLOVA[1])){
         NM += j;  
        }    
    }
System.out.println(NM);
}
  else if(SLOVA.length == 1){
    for(int i = 1; i < three.length; i++){
        if(three[i].equals(SLOVA[0])){
          NM += i *100;  
        }
    }
     for(int j = 0; j < too.length; j++){
        if(too[j].equals(SLOVA[0])){
         NM += j *10;  
        }    
    }
      for(int j = 0; j < one.length; j++){
        if(one[j].equals(SLOVA[0])){
         NM += j;  
        }    
    }
System.out.println(NM);
}
  
}
}