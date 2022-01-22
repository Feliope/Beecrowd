package Iniciante;

import java.util.Scanner;

public class BEE_1012 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble(); double B = in.nextDouble(); double C = in.nextDouble();
        double Triangulo, Circulo, Trapezio, Quadrado, Retangulo;
        double Pi = 3.14159;
        
        Triangulo = (A * C) / 2.0;
        Circulo = Pi * Math.pow(C, 2);
        Trapezio = ((A + B) * C ) / 2.0;
        Quadrado = Math.pow(B, 2);
        Retangulo = A * B;
        
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", Triangulo, Circulo, Trapezio, Quadrado, Retangulo);
    }
}
