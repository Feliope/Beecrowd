package Iniciante;
import java.util.Scanner;

public class BEE_1018 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int Dinheiro = in.nextInt();
        int C100, C50, C20, C10, C5, C2, C1;
        C100 = Dinheiro / 100;
        C50 = (Dinheiro - (C100 * 100)) / 50;
        C20 = (Dinheiro - ((C100 * 100) + (C50 * 50))) / 20;
        C10 = (Dinheiro - ((C100 * 100) + (C50 * 50) + (C20 * 20))) / 10;
        C5 = (Dinheiro - ((C100 * 100) + (C50 * 50) + (C20 * 20) + (C10 * 10))) / 5;
        C2 = (Dinheiro - ((C100 * 100) + (C50 * 50) + (C20 * 20) + (C10 * 10) + (C5 * 5))) / 2;
        C1 = Dinheiro - ((C100 * 100) + (C50 * 50) + (C20 * 20) + (C10 * 10) + (C5 * 5) + (C2 * 2));
        
        System.out.println(Dinheiro);
        System.out.println(C100+" nota(s) de R$ 100,00");
        System.out.println(C50+" nota(s) de R$ 50,00");
        System.out.println(C20+" nota(s) de R$ 20,00");
        System.out.println(C10+" nota(s) de R$ 10,00");
        System.out.println(C5+" nota(s) de R$ 5,00");
        System.out.println(C2+" nota(s) de R$ 2,00");
        System.out.println(C1+" nota(s) de R$ 1,00");
    }
}
