import java.util.Scanner;

public class AULA02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um numero : ");
		int n1 = sc.nextInt();
		
		
		if (n1 % 3 == 0) {
			System.out.println("E MULTIPLO DE 3!!");
			
		} else {
			System.out.println(" Nao MULTIPLO DE 3!!");
			
		}

	}

}
