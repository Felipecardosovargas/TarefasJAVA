package SegundaTarefa;

import java.util.Scanner;
import java.util.Locale;

/*
Exercício 3- Peça para que usuário informe seu salário através
da Classe Scanner, em seguida use o “printf()” para formatar o
salário com 2 casas decimais após a vírgula, com Locale do
Brasil.

 */
public class TerceiroExercicio {
    public static void main(String[] args) {
        Double salario;

        Locale.setDefault(new Locale("pt", "BR"));
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe seu salário: ");
        salario = teclado.nextDouble();

        System.out.printf("Seu salário é: R$ %.2f%n", salario);

        teclado.close();
    }
}
