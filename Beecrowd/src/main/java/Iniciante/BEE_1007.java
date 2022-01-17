package Iniciante;

import java.util.Scanner;

public class BEE_1007 {
    
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    public static int DIF;
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        D = in.nextInt();
        
        DIF = (A * B - C * D);
        System.out.println("DIFERENCA = "+DIF);
    }
}
