package controller;

import Kreis.PilhaString.StringsPilha;

public class PalindromoController {
    public static String invertePalavra(String palavra) {
        StringsPilha pilha = new StringsPilha();
        
        String palavraInvertida = "";
        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(String.valueOf(palavra.charAt(i)));
        }
        while (!pilha.isEmpty()) {
            palavraInvertida += pilha.pop();
        }
        return palavraInvertida;
    }

    public static boolean comparaPalavras(String palavra, String palavraInvertida) {
        return palavra.equals(palavraInvertida);
    }
}