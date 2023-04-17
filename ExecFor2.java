package Loops;

import java.util.Scanner;

public class ExecFor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int num,contpar=0,somaimp=0,x=0;
		
		System.out.println("\nEntre com um número: ");
		num = leia.nextInt();
		
		for(x=0;x<9;x++) {
			
			if (num % 2 == 0) {
				contpar++;//contpar = contpar + 1
			} else {
				somaimp++;
			}
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();
			
		}
		System.out.println("\nQuantidade números pares digitados: "+contpar);
		System.out.println("\nSomatorio números impares digitados: "+somaimp);
		
	}

}
