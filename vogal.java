package projeto02;

import java.util.Scanner;

public class vogal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//questao da vogal aceitar apenas uma letra 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe uma vogal");
		char vogal = sc.next().charAt(0);
		
		
		
		if (vogal == 'A') {
			System.out.println("E vogal");
			
		} else {
			System.out.println("Não vogal");
		}
		
		//
	}

}
