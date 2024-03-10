package PooFuncoes;

public class Q4 {
	
	 public static void main(String[] args) {
    
        int numero = 16;

        if (verificarQuadradoPerfeito(numero)) {
            System.out.println(numero + " é um quadrado perfeito.");
        } else {
            System.out.println(numero + " não é um quadrado perfeito.");
        }
    }

    
    public static boolean verificarQuadradoPerfeito(int numero) {
        
        if (numero < 0) {
            return false;
        }

        
        int raizQuadrada = (int) Math.sqrt(numero);

        
        return raizQuadrada * raizQuadrada == numero;
    }

}