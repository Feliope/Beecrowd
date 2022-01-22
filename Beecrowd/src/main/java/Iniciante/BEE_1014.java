package Iniciante;
import java.util.Scanner;

public class BEE_1014 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int Dist = in.nextInt();
        double Litros = in.nextDouble(); 
        double Consumo;
        
        Consumo = Dist / Litros;
        
        System.out.printf("%.3f km/l\n", Consumo);
    }
}
