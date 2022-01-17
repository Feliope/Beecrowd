package Iniciante;

import java.util.Scanner;

public class BEE_1004 {
    
    public static int A;
    public static int B;
    public static int PROD;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        PROD = A * B;
        System.out.printf("PROD = %d\n", PROD);
    }
}
