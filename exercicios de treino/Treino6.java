package cursoguanabara;

import java.util.Scanner;

public class Treino6 {

	public static void main(String[] args) {

		int ano,nasc,ter;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Em que ano estamos: ");
		ano = ler.nextInt();
		
		System.out.println("Em que ano voce nasceu: ");
		nasc = ler.nextInt();
		
		
		ter= ano - nasc;
		
		if(ter>=18){
			
			
			System.out.println("Voce e maior de idade, parabens,voce tem" + ter + "anos de idade");
				
		}
		else if (ter<18) {
			
			System.out.println("Voce e menor de idade,sinto muito, voce tem apenas" + ter + "anos de idade");
		}
	}
}