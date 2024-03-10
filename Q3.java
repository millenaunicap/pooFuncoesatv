package PooFuncoes;

public class Q3 {
	
    public static void main(String[] args) {
        int numero = 4;

        int resultado = verificarPositivoNegativo(numero);

        System.out.println("O resultado para o número " + numero + " é: " + resultado);
    }

    
    public static int verificarPositivoNegativo(int numero) {
        if (numero > 0) {
            return 1; 
        } else if (numero < 0) {
            return -1; 
        } else {
            return 0; 
        }
    }

}
