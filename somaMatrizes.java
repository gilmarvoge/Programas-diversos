/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

/**
 *
 * @author Gilmar Vogel
 */
public class somaMatrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int matriz1[][] = {{8, 4}, {2, 4}, {8, 4}};
        int matriz2[][] = {{1, 2}, {3, 4}, {5, 6}};

        int[][] matrizResultado = new int[3][2];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2.length-1; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length-1; j++) {
                System.out.println("Resultado da posição:" + i + j + " é: " + matrizResultado[i][j]);
            }
        }
    }
}
