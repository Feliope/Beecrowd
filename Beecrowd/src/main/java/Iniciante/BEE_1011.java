package Iniciante;

import java.util.Scanner;

class BEE_1011 {
    public static void main(String[] args){
        
        double PI = 3.14159;
        double Raio;
        double Volume;
        
        Scanner in = new Scanner(System.in);
        Raio = in.nextDouble();
        
        Volume = (4/3.0) * PI * Math.pow(Raio, 3);
        
        System.out.printf("VOLUME = %.3f\n", Volume);
    }
}
