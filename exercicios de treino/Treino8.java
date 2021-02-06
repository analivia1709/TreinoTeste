package cursoguanabara;

import java.util.Scanner;

public class Treino8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int nota1,nota2,media;
		
		System.out.println("Entre com o valor da primeira nota: ");
		nota1= ler.nextInt();
		
		System.out.println("Entre com o valor da segunda nota: ");
		nota2 = ler.nextInt();
		
		media= (nota1 + nota2) / 2 ;
		
		System.out.println("Sua media foi de "+ media);
		
	
	
	if(media>=7  && media<=10) {
		
		System.out.println("Parabens voce passou");
		
	}
	else if (media<7) {
		
		System.out.println("Infelizmente voce ficou de recuperação ");
	}
	}
}
