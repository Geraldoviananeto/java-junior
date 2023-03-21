import java.util.Scanner;

public class aula03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Infome o tipo do combustivel");
		String combustivel = sc.nextLine();
		
		System.out.println("Informe a capacidade do tanque");
		double capacidade = sc.nextDouble();
	
		
		if(combustivel.equalsIgnoreCase("G")) {
			double valorPago = capacidade * 3.79;
			System.out.println("O valor pago na Gasolina:" + valorPago);
			
		}else {
			double valorPago = capacidade * 2.89;
			System.out.println("O valor pago na alcool :"+ valorPago);
				
			}
		sc.close();
		
			
		
		
		
		
	}

}