package projeto;

import java.util.Scanner;

public class printar_vetorv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[4];
				for (int i = 0; i <=3; i++) {
					System.out.println("Informe um numero:");
					num[i] = sc.nextInt();
							
				}
		
				for (int i = 0; i <=3; i++) {
					System.out.printf("Posição %d: %d %n",i, num[i]); 
	}
				sc.close();
}
}