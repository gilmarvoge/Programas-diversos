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

        System.out.println("Digite um número para calcular a sua tabuada:");
        int read = scan.nextInt();
        int result;

        for (int i = 1; i <= 10; i++) {
            result = read * i;
            System.out.println(read + " x " + i + " = " + result);

        }

    }

}
