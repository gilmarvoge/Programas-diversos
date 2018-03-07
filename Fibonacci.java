/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;

/**
 *
 * @author Gilmar Vogel
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para mostrar a sequência de Fibonacci:");
        int read = scan.nextInt();
        int numeroAnterior = 1;
        int fibonacci = 0;

        for (int i = 0; i < read; i++) {

            System.out.println("O próximo número da sequencia fibonacci é:" + fibonacci);
            fibonacci = numeroAnterior + fibonacci;
            numeroAnterior = fibonacci - numeroAnterior;

        }

    }

}
