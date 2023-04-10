package projeto;

import java.util.Scanner;

public class aula03033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
	System.out.println("Informe um valor");
	int valor1 = sc.nextInt();
	String resultado = (valor1 % 2 == 0) ? "E par" : " E impar ";
	
	System.out.println(resultado);
	sc.close();
	}
	
	

}
