package Iniciante;
import java.util.Scanner;

public class BEE_1013 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt(); int B = in.nextInt(); int C = in.nextInt();
        int MaiorAB, MaiorBC;
        
        MaiorAB = (A + B + Math.abs(A - B)) / 2;
        MaiorBC = (MaiorAB + C + Math.abs(MaiorAB - C)) / 2;
        
        System.out.println(MaiorBC+" eh o maior");
        
    }
    
}
