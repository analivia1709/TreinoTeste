package cursoguanabara;

import java.util.Scanner;

public class Treino1 {

	public static void main(String[] args) {

		int reais;
		double doll;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos reais você tem ?");
		reais = ler.nextInt();
		
		doll= reais / 2.22;
		
		System.out.printf("Você terá %.2f",doll,"dolls");
		
	}

}
