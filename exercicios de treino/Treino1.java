package cursoguanabara;

import java.util.Scanner;

public class Treino1 {

	public static void main(String[] args) {

		int reais;
		double doll;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos reais voc� tem ?");
		reais = ler.nextInt();
		
		doll= reais / 2.22;
		
		System.out.printf("Voc� ter� %.2f",doll,"dolls");
		
	}

}
