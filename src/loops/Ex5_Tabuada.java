package loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada = 0;


        System.out.println("Informe um número para ver a sua tabuada: ");
        tabuada = scan.nextInt();

        for(int count = 0; count <= 10; count++)  {

            System.out.println(tabuada + " x " + count + " = " + (tabuada * count));

        }



    }
}
