package cursoguanabara;

import java.util.Scanner;

public class Treino7 {

	public static void main(String[] args) {
		
		int x;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de dinheiro que voce tem para fazer a viagem: ");
		x = ler.nextInt();
		
		if(x>2000){
			
			System.out.println("Parabens, voce vai conseguir fazer a viagem dos seus sonhos (; ");
			
		}
		else if(x<2000) {
			
			System.out.println("Sinto muito, o valor nao e suficiente para voce fazer a vigem );");
		}
	}

}
