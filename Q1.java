package PooFuncoes;

public class Q1 {
	
    public static void main(String[] args) {
        int numero = 5;
        int resultado = calcularDobro(numero);
        System.out.println("O dobro de " + numero + " é: " + resultado);
    }

   
    public static int calcularDobro(int numero) {
        return numero * 2;
    }

}
