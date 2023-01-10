package dezembro;

/*
 *1. Implemente um programa que solicite ao(à) usuário(a) um número inteiro positivo n. Exiba
na saída:
a. Os n primeiros pares (considere que o zero é o primeiro número par); e
b. A soma dos ímpares de 1 até o último número par exibido.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int acumulador = 0;		

		System.out.print("Informe um número inteiro positivo: ");
		int numInteiro = sc.nextInt();
		int dobro = (numInteiro * 2);

		int[] valores = new int[dobro];
		

		for (int i = 0; i < valores.length; i++) {
			valores[i] = i;
			if (valores[i] % 2 == 0) {
				System.out.print(valores[i] + " ");
			}
		}
		
		for (int j = 0; j < valores.length - 1; j++) {			
			if (valores[j] % 2 != 0) {
				acumulador += valores[j];
			}			
		}

		System.out.println("\nA soma dos ímpares de 1 até o último número par exibido é: " + acumulador);
		
	}

}
