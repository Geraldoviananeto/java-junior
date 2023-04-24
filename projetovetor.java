package projeto;

import java.util.Scanner;

public class projetovetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[]A = new int [2];
		int[]B = new int [3];
		int[]C = new int [5];
		//PREENCHENDO O ARRAY A
		System.out.println(" == preenchendo o vetor a ==");
		for (int i = 0; i < A.length; i++) {
			System.out.println("Informe a nota");
			A[i] = sc.nextInt();
			
		}
	//PREENCHENDO O ARRAY B
		
		System.out.println(" == preenchendo o vetor b ==");
		for (int i = 0; i < B.length; i++) {
			System.out.println("Informe a nota");
			B[i] = sc.nextInt();
		
		}
		for (int i = 0; i < A.length; i++) {
			C[i] = A[i];
		}
		
		//Preenchendo o array c com os valores de B
		for (int i = 2; i < C.length; i++) {
			C[i] = B[i - 2];
			
		}
		//exibindo os valores do vetor C
		System.out.println("\n == Exibindo os valores do vetor C");
		for (int i : C) {
		System.out.println(i);
		
		sc.close();
		}
		}

}
