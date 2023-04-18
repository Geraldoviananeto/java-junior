package projeto;

import java.util.Scanner;

public class printar_vetorv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] notas = new int[4];
		//Preenchendo o array notas
		for (int i = 0; i <=3; i++) {
			System.out.println("Informe a nota :");
			notas[i] = sc.nextInt();
					
		}
		
		//imprimindo o array notas
		for (int i = 0; i <=3; i++) {
			System.out.println("Posição[" + i + "] : " +notas[i]);
			
		}
		
	}

}
