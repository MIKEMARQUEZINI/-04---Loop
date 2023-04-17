package Loops;

import java.util.Scanner;

public class ExecWhile1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int idade=0,cont21=0,cont50=0;
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
			while (idade >=0){
				
				if (idade <21) {
					cont21++;
				}else if (idade>50) {
					cont50++;			
				}
				System.out.println("\nDigite uma idade: ");
				idade = leia.nextInt();
				}		
		System.out.println("\nTotal de pessoas menores de 21 anos: "+cont21);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+cont50);
	}
}
