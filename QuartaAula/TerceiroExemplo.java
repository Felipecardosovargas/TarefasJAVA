package QuartaAula;

import java.util.Scanner;

/*
3) Faça um algoritmo para receber um número qualquer e
informar na tela se é par ou ímpar
 */
public class TerceiroExemplo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = teclado.nextInt();

        if (num % 2 == 0){
            System.out.println("Número PAR!");
        } else {
            System.out.println("Número IMPAR!");
        }
    }
}
