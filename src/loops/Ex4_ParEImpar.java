package loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int count = 0;
        int somaPar = 0,  somaImpar = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if(numero % 2 == 0) somaPar++;
            else somaImpar++;
            count++;
        } while(count < quantNumeros);

        System.out.println("Quantidade de números pares é de: " + somaPar);
        System.out.println("Quantidade de números ímpares é de " + somaImpar);
    }

}
