package View;

import Controller.PalindromoController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        PalindromoController PC = new PalindromoController();
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira uma palavra para testar se é Palíndromo: ");
        String palavra = scan.next();


        if (PC.comparaPalavra(palavra)) {
            System.out.println("É Palíndromo");
        } else {
            System.out.println("Nãe é Palíndromo");
        }


    }
}
