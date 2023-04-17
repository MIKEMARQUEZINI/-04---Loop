package Loops;

import java.util.Scanner;

public class ExecFor1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int num1,num2,x=0;
		
		System.out.println("Insira o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("Insira o segundo número: ");
		num2 = leia.nextInt();
		
		if 	(num1>num2) {
				System.out.println("\nIntervalo inválido");
			
			} else for (x=10; x<=100;x++) {
				if	(x % 3 == 0 && x % 5 == 0) {
					System.out.printf("\n %d  é múltiplo de 3 e 5:",x);
				}
			}
		}
		
}
