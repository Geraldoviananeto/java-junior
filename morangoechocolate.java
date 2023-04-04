package projeto02;

import java.util.Scanner;

public class morangoechocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um sabor C para chocolate e M para morango ");
		String sorv = sc.next().toUpperCase();

	
		if (sorv.equalsIgnoreCase("C")) {
			System.out.println("Informe a quantidade de bolas ");
			int bolas = sc.nextInt();
			if (bolas >= 3) {
				System.out.println("Desconto de 10% ");
			} else {
				System.out.println("Desconto de 5% ");
			}

		} else if (sorv.equalsIgnoreCase("M")) {
			System.out.println("Informe a quantidade de bolas ");
			int bolas = sc.nextInt();
			System.out.println("Sem desconto ");

		} else {
			System.out.println("Sabor invalido ");
		}

	}

}
