package aleatorio;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random dado = new Random();
        int numero;

        for (int i=0; i<=10; i++){
            numero = dado.nextInt(6);
            System.out.println(numero + 1);
        }

    }
}
