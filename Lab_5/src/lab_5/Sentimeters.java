package lab_5;
public class Sentimeters {
   public static double D;
   public static double Ft;
    public static void Convertacia(double CM){
        D = CM /2.54;
        Ft = CM *0.0328083992;
         System.out.println(CM+" см. - это "+D+" Дюймов, или "+Ft+" Футов;");
    }
}
