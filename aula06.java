import java.util.Scanner;

public class aula06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("insira um numero x");
		int nx = sc.nextInt();

		System.out.println(" Insira um numero y ");
		int ny = sc.nextInt();

		if (nx > ny) {
			System.out.println(nx + "É maior que" + ny);
		} else {
			if (ny > nx) {
				System.out.println(ny + "É maior que " + nx);
			} else {
				System.out.println("São iguais ");
			}

		}

	}

}
