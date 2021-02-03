package lab_5;
public class Kilimeters {
   public static double Un;
   public static double Pd;
   public static double Kt;
     public static void Convertacia(double KG){
      Un = 32.15075*KG;
      Pd = 16.3804964 * KG;
      Kt = 0.819672 *KG;
            System.out.println(KG+" кг. - это "+Un+" Унций, или "+Pd+" Пудов или "+Kt+" Катти;");
     }
}
