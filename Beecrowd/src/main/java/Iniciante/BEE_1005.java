package Iniciante;

import java.util.Scanner;

public class BEE_1005 {
    public static double A;
    public static double B;
    public static double Media;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        A = in.nextDouble();
        B = in.nextDouble();
        
        Media = (((A * 3.5) + (B * 7.5)) / 11);
        System.out.printf("MEDIA = %.5f\n", Media);
    }
}
