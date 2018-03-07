/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdc;

/**
 *
 * @author Gilmar Vogel
 */
public class MDC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        
    int x = 6;
    int y = 12;
    int result = mdc(x,y);    
    System.out.println("O Maior divisor comum é: " + result);
    }
    
    public static int mdc(int num1, int num2) {

    int resto;

    do {
        resto = num1 % num2;
        System.out.println("resto: " + resto);
        num2 = num1;
        System.out.println("num1: " + num2);
        num1 = resto;
        System.out.println("num2: " + num1);

    } while (resto != 0);

    return num2;
}
    
}
