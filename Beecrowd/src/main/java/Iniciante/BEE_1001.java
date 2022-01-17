package Iniciante;

import java.util.Scanner;

public class BEE_1001 {
    
    public static int A;
    public static int B;
    public static int X;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        X = A + B;
        System.out.println("X = "+X);
    }
}
