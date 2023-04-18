package projeto;

import java.util.Scanner;

public class igualar_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q06 Colocar os valores do vetor A dentro do vetor B
		//igualar o vetor
		
		
		
		Scanner sc = new Scanner(System.in);
		//vetores
		int[] A = new int[5];
		int[] B = new int[5];
		
		//Para digitar algo q as vezes q vai se repetir na tela
		for (int i = 0; i <= 4; i++) {
			System.out.println("Informe uma nota");
			A[i] = sc.nextInt();
			B[i] = A[i];
		}
		//Print do vetor A
		System.out.println("\n valores do Vetor A");
		for (int i = 0; i < A.length; i++) {
			System.out.println("valor:" +A[i]);
			
		//Print do vetor A	
		}
		System.out.println("\n valores do Vetor A");
		for (int i = 0; i < A.length; i++) {
			System.out.println("valor:" +A[i]);
			
		}	
	}

}
