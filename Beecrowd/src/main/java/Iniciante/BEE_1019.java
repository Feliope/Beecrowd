package Iniciante;
import java.util.Scanner;

public class BEE_1019 {
   public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int Tempo = in.nextInt();
        int Horas = Tempo / 3600;
        int Minutos = (Tempo - (Horas * 3600)) / 60;
        int Segundos = Tempo - (Horas * 3600) - (Minutos * 60);
       
        System.out.println(Horas+":"+Minutos+":"+Segundos);
   }
}
