package projeto02;

import java.util.Scanner;

public class q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a idade de J�ao  ");
		int joao = sc.nextInt();
		
		System.out.println("Insira a idade de J�se  ");
		int jose   = sc.nextInt();
		
		System.out.println("Insira a idade de Maria  ");
		int maria   = sc.nextInt();
		
		if ((joao < jose ) && (joao < maria)) {
			System.out.println("J�ao e mais novo ");
		
		
		}else if((jose <maria) && (jose <joao)) {
			System.out.println("Jose e o mais novo ");
		
			
		}else {
			System.out.println("Maria e a mais nova");
		}
		
		
		
	}

}
