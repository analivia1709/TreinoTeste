package cursoguanabara;

import java.util.Scanner;

public class Treino {

	public static void main(String[] args) {

			
			int ano,nasc,idade;
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Em que ano estamos ? ");
			ano = ler.nextInt();
			
			System.out.println("Em que ano você nasceu ? ");
			nasc= ler.nextInt();
					
					
		   idade = ano - nasc ;
		   
		   System.out.println("Voce tem " +idade+ " anos  de idade ");
			
		}

	}


