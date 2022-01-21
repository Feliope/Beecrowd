package Iniciante;

import java.util.Scanner;

public class BEE_1010 {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int Peça1 = in.nextInt(); int Qtd1 = in.nextInt(); double Valor1 = in.nextDouble();
        int Peça2 = in.nextInt(); int Qtd2 = in.nextInt(); double Valor2 = in.nextDouble();
        
        double Total = (Qtd1 * Valor1) + (Qtd2 * Valor2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", Total);
    }
}