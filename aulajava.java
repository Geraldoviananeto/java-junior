package aulajava;

import java.util.Scanner;

public class aulajava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor inteiro: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Informe um valor inteiro: ");
		int valor2 = sc.nextInt();
		
	
		int soma = valor1 + valor2;
		System.out.println( "O resultado é " + soma);

		sc.close();
		


	}

}
