import java.util.Scanner;

public class A {


	public static int[] lerClassificacoes() {
		Scanner scan = new Scanner(System.in);

		int numAlunos = scan.nextInt();
		
		// Declaração de array
		int[] classificacoes = new int[numAlunos];
		
		// Inicialização de array: Ler classificações para o array
		for (int i = 0; i < classificacoes.length; i++) {
			classificacoes[i] = scan.nextInt();
		}
		return classificacoes;
	}
	
	public static double calcularMedia(int[] arr) {
		double soma = 0.0;
		
		for (int i = 0; i < arr.length; i++) {
			soma += arr[i];
		}
		double media = soma/arr.length;
		
		return media;
	}
	
	public static void mostrarMedia(double num) {
		System.out.printf("average=%.1f\n", num);
	}
	
	public static void mostrarReprovaram(int[] arr) {
		int contador = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 10) {
				contador++;
			}
		}
		System.out.printf("failures=%d\n", contador);
	}
	
	public static void main(String[] args) {
		int[] classificacoes = lerClassificacoes();
		double media = calcularMedia(classificacoes);

		mostrarMedia(media);
		mostrarReprovaram(classificacoes);
	}

}
