package projeto;

import java.util.Scanner;

public class Media_devetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PREENCHENDO/POPULANDO ARRAY MEDIA DE ARRAY COMO FAZER !!!
		//LEMBRAR DE COLOCAR ENTRA PARENTESES O I
		Scanner sc = new Scanner(System.in);
		int soma = 0;

		int[] number = new int[10];
		for (int i = 0; i <= 9; i++) {
			System.out.println("Informe uma nota");
			number[i] = sc.nextInt();
			soma = soma + number[i];
		}
		
		double media = soma / 10;
		System.out.println("A média é :" + media);
		sc.close();
	}

}
