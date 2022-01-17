package Iniciante;

import java.util.Scanner;

public class BEE_1006 {
    
    public static double A;
    public static double B;
    public static double C;
    public static double Media;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        A = in.nextDouble();
        B = in.nextDouble();
        C = in.nextDouble();
        
        Media = ((A * 2) + (B * 3) + (C * 5)) / 10;
        
        System.out.printf("MEDIA = %.1f\n", Media);
    }
}
