package projeto;

import java.util.Scanner;

public class Retancle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Retângulo r = new Retângulo();
		System.out.println("Informe a largura do retangulo");
		r.width = sc.nextDouble();
		
		System.out.println("Informe a altura do retangulo");
		r.height = sc.nextDouble();
		
		double valorArea = r.area();
		System.out.println("O valor da Area:" + valorArea);
		
		System.out.println("O valor do Perimetro:" + r.perimetro());
	}

}
