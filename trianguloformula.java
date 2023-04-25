package projeto;

import java.util.Scanner;

public class trianguloformula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Trinagulo();
		t

		System.out.println(" iNSIRA OS LADOS DO TRIANGULO B");
		System.out.println("Informe o lado de A");
		int ax = sc.nextInt();
		System.out.println("Informe o lado B");
		int bx = sc.nextInt();
		System.out.println("Informe o lado de C");
		int cx = sc.nextInt();
		System.out.println();

		System.out.println(" Insira os lados do triangulo y");
		System.out.println("Informe o lado de A");
		int ay = sc.nextInt();
		System.out.println("Informe o lado de B");
		int by = sc.nextInt();
		System.out.println("Informe o lado de C");
		int cy = sc.nextInt();
		System.out.println();

		double px = (ax + bx + cx) / 2;
		double areax = Math.sqrt(px * (px - ax) * (px - bx) * (px - cx));

		double py = (ay + by + cy) / 2;
		double areay = Math.sqrt(py * (py - ay) * (py - by) * (py - cy));

		System.out.println("Area do triangulo X:" + areax);
		System.out.println("Ara do triangulo Y:" + areay);

		if (areax >= areay) {
			System.out.println("A maior area e X ");

		} else {
			System.out.println("A maior area e y");

		}
	}

}
