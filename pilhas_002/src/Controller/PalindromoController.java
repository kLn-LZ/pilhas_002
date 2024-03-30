package Controller;

import kLN.Pilha;

public class PalindromoController {

    Pilha pilha = new Pilha();
    public PalindromoController() {
        super();
    }

    public boolean comparaPalavra (String palavra) throws Exception {
        String palavraInvertida = invertePalavra(palavra);

        if(palavra.equals(palavraInvertida)) {
            return true;
        }
        return false;
    }

    private String invertePalavra (String palavra) throws Exception {
        int tamInicial = palavra.length();
        while(palavra.length() > 0) {
            pilha.push(palavra.substring(0,1));
            palavra = palavra.substring(1, palavra.length());

        }

        while(!pilha.isEmpty()) {
            palavra = palavra + pilha.pop();
        }

        return palavra;

    }
}
