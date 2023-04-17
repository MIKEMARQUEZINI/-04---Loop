package Loops;

import java.util.Scanner;

public class ExecWhile2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade, sexo, cat,bknd=0,front=0,mens=0,woman=0;
		String next = "S";
		
		while (next.equalsIgnoreCase("s")) {
			
		System.out.println("\n1/3 - Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("\n2/3 - Digite seu Genero(a): ");
		System.out.println("[1] - Masculino");
		System.out.println("[2] - Feminino");
		System.out.println("[3] - Outros");
		sexo = leia.nextInt();
		
		System.out.println("\n3/3 - Digite uma Categoria: (");
		System.out.println("[1] - Backend");
		System.out.println("[2] - Frontend");
		System.out.println("[3] - Mobile");
		System.out.println("[4] - FullStack");
		cat = leia.nextInt();
		System.out.println("\nDeseja Continuar?");
		System.out.println("\n[S] - Sim");
		System.out.println("\n[N] - Nao");
		next = leia.next();
		
			if (cat==1) {
			bknd++;
			}
				if (sexo==2 && cat==2) {
			front++;
			}
					if (idade>40 && sexo == 1 && cat == 3) {
			mens++;
			}
						if (idade<30 && sexo == 2 && cat == 4) {
			woman++;
			}
		
			
		}
		System.out.println("\nO número de pessoas desenvolvedoras Backend"+bknd);
		System.out.println("\nO número de mulheres desenvolvedoras Frontend"+front);
		System.out.println("\nO número de homens desenvolvedores Mobile maiores de 40 anos"+mens);
		System.out.println("\nO número de mulheres desenvolvedoras FullStack menores de 30 anos"+woman);
		
	}

}
