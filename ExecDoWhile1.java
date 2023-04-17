package Loops;

import java.util.Scanner;

public class ExecDoWhile1 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner (System.in);
		
		int num,res=0;
		
		System.out.println("\nDigite um número:");
		num = leia.nextInt();
		
		if (num>0) {
			
			res += num;
		}
		
		do {
			System.out.println("\nDigite um número:");
			num = leia.nextInt();
			
			if (num>0) {
				res += num;
			}
			
		}while(num!=0); {
			
		}

		System.out.println("A soma dos números positivos é "+res);
		

	}

}
