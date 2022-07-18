package loops;

import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;

            count += 1;

        } while(count < 5);

        System.out.println("O maior número é: " + maior);
        System.out.println("A média das somas é igual a " + (soma / 5));



    }
}
