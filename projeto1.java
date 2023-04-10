package projeto;

import java.util.Scanner;

public class projeto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor");
		int valor1 = sc.nextInt();

		if (valor1 % 2 ==0) {
			System.out.println(" É par ");
		} else {
			System.out.println(" É impar!!!");
		}

		sc.close();
	}

}
