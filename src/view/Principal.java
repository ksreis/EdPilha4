package view;

import java.util.Scanner;
import controller.PalindromoController;
import Kreis.PilhaString.StringsPilha;

public class Principal {
    public static void main(String[] args) {
    	StringsPilha pilha = new StringsPilha();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra para verificar se é um palíndromo: ");
        String palavra = scanner.nextLine();
        String palavraInvertida = PalindromoController.invertePalavra(palavra);

        boolean isPalindromo = PalindromoController.comparaPalavras(palavra, palavraInvertida);
        if (isPalindromo) {
            System.out.println("A palavra " + palavra + " é um palíndromo.");
        } else {
            System.out.println("A palavra " + palavra + " não é um palíndromo.");
        }
    }
}