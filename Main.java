package metodos;

import java.util.Scanner;

public class Main {


	static Scanner console = new Scanner(System.in);

	static double calcularMedia(double notaA1, double notaA2, double notaA3) {
		return (notaA1 + notaA2 + notaA3) / 3;
	}
	
	static double lerNota(String mensagem) {
		
		System.out.print(mensagem);
		return console.nextDouble();
		
	}
	
	static String analisarMediaNotaFinal(double mediaNotas) {
		
		if (mediaNotas < 33.333)
			return " Reprovado :( ";
		else
			return " Aprovado!!!";
		
	}
	
	public static void main(String[] args) {double notaA1 = lerNota("Nota A1: ");
		double notaA2 = lerNota("Nota A2: ");
		double notaA3 = lerNota("Nota A3: ");
		
		double mediaNotas = calcularMedia(notaA1, notaA2, notaA3);
		System.out.println("Média: " + mediaNotas);
		System.out.printf("Média %.2f", mediaNotas);
		
		
		System.out.println(analisarMediaNotaFinal(mediaNotas));
		
		calcularMedia(notaA1, notaA2, notaA3);
		}
}


