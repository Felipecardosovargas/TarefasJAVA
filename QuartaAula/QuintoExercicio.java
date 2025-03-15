package QuartaAula;
/*
5) Encontrar o dobro de um número caso ele seja positivo e o
seu triplo caso seja negativo, imprimindo o resultado
 */

import java.util.Scanner;

public class QuintoExercicio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = teclado.nextInt();

        if (num > 0){
            int res = num*2;
            System.out.println("O resultado é: "+ res);
        } else {
            int res = num*3;
            System.out.println("O resultado é: "+ res);
        }
    }
}
