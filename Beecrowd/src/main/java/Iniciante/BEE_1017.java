package Iniciante;
import java.util.Scanner;

public class BEE_1017 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int Tempo = in.nextInt();
        int Media = in.nextInt();
        double Consumo = Tempo * Media / 12.0;
        
        System.out.printf("%.3f\n", Consumo);
    }
}
