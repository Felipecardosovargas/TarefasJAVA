package QuartaAula;

/*
6) Faça um algoritmo que leia uma variável e some 5 caso
seja par ou some 8 caso seja ímpar, imprimir o resultado
desta operação.

 */

import java.util.Scanner;

public class SextoExercicio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu número: ");
        int num = teclado.nextInt();

        if(num % 2 ==0) {
            int res = num + 5;
            System.out.println("O resultado é: "+res);
        } else {
            int res = num + 8;
            System.out.println("O resultado é: "+res);
        }
    }
}
