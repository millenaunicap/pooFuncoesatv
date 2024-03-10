package PooFuncoes;
import java.util.Scanner;

public class Q10 {
	
    public static void main(String[] args) {
        int numero1 = 8;
        int numero2 = 15;

        int maior = encontrarMaior(numero1, numero2);

        System.out.println("O maior entre " + numero1 + " e " + numero2 + " é: " + maior);
    }

   
    public static int encontrarMaior(int numero1, int numero2) {
        
        return (numero1 > numero2) ? numero1 : numero2;
    }

}
