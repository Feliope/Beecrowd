package Iniciante;
import java.util.Scanner;

public class BEE_1020 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int Idade = in.nextInt();
        int Anos = Idade / 365;
        int Meses = (Idade - (Anos * 365)) / 30;
        int Dias = Idade - (Anos * 365) - (Meses * 30);
        
        System.out.println(Anos+" ano(s)");
        System.out.println(Meses+" mes(es)");
        System.out.println(Dias+(" dia(s)"));
    }
    
}
