package Iniciante;

import java.util.Scanner;

public class BEE_1008 {
    public static int NUMBER;
    public static int HORAS;
    public static double VALOR;
    public static double SALARIO;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        NUMBER = in.nextInt();
        HORAS = in.nextInt();
        VALOR = in.nextDouble();
        
        SALARIO = HORAS * VALOR;
        
        System.out.println("NUMBER = "+NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", SALARIO);
    }
}
