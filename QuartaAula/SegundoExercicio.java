package QuartaAula;

/*
2) Faça um algoritmo que leia o nome, o sexo e o estado civil
de uma pessoa. Caso sexo seja “F” e estado civil seja
“CASADA”, solicitar o tempo de casada (anos)
 */

import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("[F = Feminino | M = Masculino]");
        System.out.print("Digite seu sexo: ");
        String sexo = teclado.nextLine();

        System.out.println("[SOLTEIRO | CASADO]");
        System.out.print("Digite seu estado cívil: ");
        String estCivil = teclado.nextLine();

        if (sexo.equals("F") && estCivil.equals("CASADA")) {
            System.out.print("Quanto tempo de casada: ");
            int tempCasamento = teclado.nextInt();
            System.out.println("A mulher " + nome + " é casada há " + tempCasamento + " anos.");
        }

        teclado.close();
    }
}
