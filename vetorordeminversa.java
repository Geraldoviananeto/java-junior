package projeto;

import java.util.Scanner;

public class vetorordeminversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		for (int i = 0; i < number.length; i++) {
			System.out.println("Informe um número");
			number[i] = sc.nextInt();
		}
		System.out.println("Vetores Originais");
		for (int i : number) {
			System.out.println(i);
		}
		
		System.out.println("Vetores Inversos");
		for (int i = number.length - 1; i > -1; i--) {
			System.out.println(number[i]);
		}
	}

}
