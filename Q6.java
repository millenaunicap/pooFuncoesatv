package PooFuncoes;

public class Q6 {
	
    public static void main(String[] args) {
    int horas = 3;
    int minutos = 10;
    int segundos = 45;

    int resultado = converterParaSegundos(horas, minutos, segundos);

    System.out.println(horas + " horas, " + minutos + " minutos e " + segundos + " segundos equivalem a " + resultado + " segundos.");
}


public static int converterParaSegundos(int horas, int minutos, int segundos) {
    
    if (horas < 0 || minutos < 0 || segundos < 0) {
        System.out.println("Por favor, insira valores para horas, minutos e segundos.");
        return -1;
    }

   
    return horas * 3600 + minutos * 60 + segundos;
}

}
