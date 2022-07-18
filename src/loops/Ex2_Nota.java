package loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota;

        System.out.println("Nota: ");
        nota = scan.nextDouble();

       while(nota < 0 | nota > 10) {
           System.out.println("Nota inválida! Digite novamente.");
           nota = scan.nextDouble();
       }

    }
}
