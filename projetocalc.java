import java.util.Scanner;

public class projetocalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		
		int soma;
		
		do {
		
					
		System.out.println("Informe um valor:");
		int valor1 = sc.nextInt();
		
		System.out.println("Informe outro valor:");
		int valor2 = sc.nextInt();
		
		System.out.println("Informe agora qual operação voce quer que seja feita:");
		String operação = sc.next().toUpperCase();
		
		System.out.println("Caso queira parar deigite -999, ou qualquer numero para continuar");
		soma = sc.nextInt();
		
		switch (operação) {
		case "A":
			total = valor1 + valor2;
			System.out.println("Voce escolheu adiçao" + total);
			break;
			
		case"S":
			total = valor1 - valor2;
			System.out.println("Voce escolheu subtração" + total);
			break;
			
		case"D":
			total = valor1 / valor2;
			System.out.println("Voce escolheu divisao" + total);
			break;
			
		case"M" :
			total = valor1 * valor2;
			System.out.println("Voce escolheu multiplicação" + total);
			break;
		default:
			System.out.println("Operação invalida");
			break;
		}
		if (total > 0) {
			System.out.println("Seu resultado é maior qie zero:" + total);
		
			if (total % 2 == 0) {
			System.out.println("Seu resultado é par" + total);
		} else {
			System.out.println("Seu resultado e impar" + total);
		}
		
		} else {
			if (total % 2 == 0) {
				System.out.println("Seu resultado é par" + total);
			} else {
				System.out.println("Seu resultado e impar"+ total);
			}
			System.out.println("Seu resultado é menor que zero"+ total);
			}
		
		}while (soma != -999);
		System.out.println("Seu programa acaba aqui");
		
		sc.close();
	}

}		
		
		
	


