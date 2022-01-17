package Iniciante;

import java.util.Scanner;

public class BEE_1002 {
    
    public static double Raio;
    public static double A;
    public static double PI;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Raio = in.nextDouble();
        PI = 3.14159;
        A = PI * Math.pow(Raio, 2);
        
        System.out.printf("A=%.4f\n", A);
    }
}
