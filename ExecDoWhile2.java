package Loops;

import java.util.Scanner;

public class ExecDoWhile2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	
		
		int numero, soma = 0, contador = 0;
        double media;

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero % 3 == 0 && numero != 0) {
                soma += numero;
                contador++;
            }
        } while (numero != 0);

        if (contador == 0) {
            System.out.println("Não foram digitados números múltiplos de 3.");
        } else {
            media = (double) soma / contador;
            System.out.println("A média de todos os números múltiplos de 3 é: " + media);
		
	}
	}
}
