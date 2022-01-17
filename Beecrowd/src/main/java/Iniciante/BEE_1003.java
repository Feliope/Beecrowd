package Iniciante;

import java.util.Scanner;

public class BEE_1003 {
    public static int A;
    public static int B;
    public static int SOMA;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        SOMA = A + B;
        System.out.printf("SOMA = %d\n", SOMA);
    }
}
