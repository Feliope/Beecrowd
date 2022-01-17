package Iniciante;

import java.util.Scanner;

public class BEE_1009 {
    
    public static double Salario;
    public static double Vendas;
    public static double Total;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String Nome;
        Nome = in.nextLine();
        Salario = in.nextDouble();
        Vendas = in.nextDouble();
        Total = Salario + (Vendas * 0.15);
        
        System.out.printf("TOTAL = R$ %.2f\n", Total);
    }
}
