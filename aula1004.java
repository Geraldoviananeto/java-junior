package projeto;

import java.util.Scanner;

public class aula1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor ");
		int n1 = sc.nextInt();
		
		System.out.println("informe um valor ");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		
		int valor = (soma >=20) ? soma + 10 : soma -5;
		System.out.println(" O resultado sera " + valor);
		
		sc.close();
		
		
	}

}
