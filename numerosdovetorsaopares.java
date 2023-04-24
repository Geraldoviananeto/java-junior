package projeto;

import java.util.Scanner;

public class numerosdovetorsaopares {

	public static void main(String[] args) {
		//varrendo percorrendo o vetor - foreach
		//system.out.println(" + -- vetor Originial -- +")
		//for ( int i : notas) {
		//system.out.println(i)
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		for (int i = 0; i <= 4; i++) {
			System.out.println("Informe um número");
			number[i] = sc.nextInt();
		}
	
			
			for (int i = 0; i <= 4; i++) {
			 if (number[i] % 2 ==0 ) {
				number[i] = number[i] * 3;
			 }else {
				 number[i] = number[i] +1;
					
				}
				
			}                              
			
			System.out.println("/n+ -- vetor Originial -- +");
			for ( int i : number) {
				System.out.println(i);
		
			}
			System.out.println("+ ------------------+");
			}
			}
		
