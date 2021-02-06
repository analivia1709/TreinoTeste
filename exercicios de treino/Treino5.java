package cursoguanabara;

import java.util.Scanner;

public class Treino5 {

	public static void main(String[] args) {

		int emprestimo,juros,total,parcela;
		Scanner ler = new Scanner (System.in);
				
		System.out.println("Qual o valor do emprestimo que voce ira pegar: ");
		emprestimo= ler.nextInt();
		
		juros = (emprestimo * 20)/ 100;
		
		
		System.out.println("Em quantas parcelar voce ira pagar: ");
		parcela = ler.nextInt();
		total = (juros + emprestimo)/ parcela ;
		
		System.out.println("Voce pediu um emprestimo de " +emprestimo +
		"o emprestimo vai ter um valor de juros de 20%, o juros vai ser de " + juros +
		"voce ira parcelar em " + parcela + "vezes " + " e pagara todo mes o valor de " + total + "reais");
	}

}
