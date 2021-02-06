package cursoguanabara;

import java.util.Scanner;

public class Treino2 {

	public static void main(String[] args) {

		
		double temperatura;
		int f;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite a tempertura em Fahrenheit na America do Norte: ");
		f = ler.nextInt();
		
		temperatura = (f-32)/1.8 ;
		
		System.out.printf("A temperatura em celcius  no Brasil seria de  %.0f" , temperatura ," graus" );
		
	}

}
