/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO I
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class TP03 {
	public static int lerHora(Scanner ler) {
		int hora = 0;

		while(true) {
			try {
				System.out.print("Digite a hora (0-23): ");
				hora = ler.nextInt();
				if (hora < 0 || hora > 23) {
					System.out.println("Hora inválida. Deve estar entre 0 e 23. Tente novamente:");
				} else {
					return hora;
				}
			} catch (InputMismatchException error) {
				System.out.println("Digite um número inteiro válido.");
				ler.next();
			}
		}
	}

	public static int lerMinuto(Scanner ler) {
		int minuto = 0;

		while(true) {
			try {
				System.out.print("Digite o minuto (0-59): ");
				minuto = ler.nextInt();
				if (minuto < 0 || minuto > 59) {
					System.out.println("Hora inválida. Deve estar entre 0 e 59. Tente novamente:");
				} else {
					return minuto;
				}
			} catch (InputMismatchException error) {
				System.out.println("Digite um número inteiro válido.");
				ler.next();
			}
		}
	}

	public static int lerSegundo(Scanner ler) {
		int segundo = 0;

		while(true) {
			try {
				System.out.print("Digite o segundo (0-59): ");
				segundo = ler.nextInt();
				if (segundo < 0 || segundo > 59) {
					System.out.println("Hora inválida. Deve estar entre 0 e 59. Tente novamente:");
				} else {
					return segundo;
				}
			} catch (InputMismatchException error) {
				System.out.println("Digite um número inteiro válido.");
				ler.next();
			}
		}
	}

	public static void main (String [] args) {
		// Criação do objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Inicialização das variáveis
		int h = lerHora(ler);
		int m = lerMinuto(ler);
		int s = lerSegundo(ler);

		// Criação do objeto Hora
		Hora hora = new Hora(h, m, s);
		
		// Instancia por construtor vazio
		Hora hora0 = new Hora();

		// Exibição dos dados
		System.out.println(hora.getHora1());
		System.out.println(hora.getHora2());
		System.out.println(hora.getSegundos() + " segundos.");
		System.out.println("Hora vazio: " + hora0.getHora1());
		System.out.println("Hora vazio: " + hora0.getHora2());
		System.out.println("Segundos: " + hora0.getSegundos());
	}
}