package dezembro;
/*3. Implemente um programa que solicite ao(à) usuário(a) que informe um número inteiro
positivo compreendido entre 1 e 999999. Exiba na saída qual é o maior e o menor dígito do
número informado.*/
import java.util.Scanner;

public class ContadorDigito {
	public static void main(String[] args) {

		int dig = 0, soma = 0, maior = 0, menor = 999999;

		int num = 878121;
		while (num > 0) {
			dig = num % 10; // resto da divisao, separa os digitos

			if (dig > maior) {
				maior = dig;

			}
			if (dig < menor) { // o digito sempre será menor que o menor, pois o menor tem um valor alto
				menor = dig;
			}

			num /= 10; // limpa os finais zero
		}
		System.out.println("O maior dígito desse número é: " + maior);
		System.out.println("O menor dígito desse número é: " + menor);

	}

}
