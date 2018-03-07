import java.util.Scanner;

public class numeroPrimo {

	public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é número primo:");
        int read = scan.nextInt();
        int count = 0;

        for (int i = 1; i <= read; i++) {

            if (read % i == 0) {
                count++; //contar quantas vezes o resto da divisão é 0;
            }

        }
        if (count == 2)//se count for 2 quer dizer que o número é primo,
        {              //pois só houve resto da divisão "0" em duas ocasiões,divisão por ele mesmo e por 1
            System.out.println(" O número " + read + " é primo ");
        } else {
            System.out.println(" O número " + read + " não é primo ");
        }

    }


}
