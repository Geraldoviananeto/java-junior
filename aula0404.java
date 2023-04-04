package projeto02;

import java.util.Scanner;

public class aula0404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor ");
		int valor1 = sc.nextInt();
		
		if ((valor1 > 100) && (valor1 < 200)) {
			System.out.println("Está no intervalo!!! ");
			
		} else {
			System.out.println("Não esta no intervalo ");

		}
	}

}
