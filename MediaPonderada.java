package dezembro;
/*2- De acordo com os pesos apresentados na tabela anteriormente, exiba na saída a respectiva média
ponderada com precisão de duas casas decimais. O programa só deverá ser encerrado,
caso o professor escolha a segunda opção. Além disso, exiba antes de encerrar o programa,
quantas médias foram calculadas.
*/

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double prova1; 	  //7.4
		double trabalho;  //4.8
		double prova2;    //3.0
		int calcMedia, contadorNumeroMedia = 0;

		// Peso das notas:
		// prova 1 = 3.5
		// trabalho = 2.5
		// prova 2 = 4.0

		mensagemUsuario(); // MÉTODO QUE CHAMA O MENU
		calcMedia = sc.nextInt();

		while (calcMedia == 1) {

			System.out.print("Prova 1: ");
			prova1 = sc.nextDouble();
			System.out.print("Trabalho: ");
			trabalho = sc.nextDouble();
			System.out.print("Prova 2: ");
			prova2 = sc.nextDouble();

			double res = (prova1 * 3.5 + trabalho * 2.5 + prova2 * 4.0) / (3.5 + 2.5 + 4.0);

			System.out.println("\nMédia: " + String.format("%.2f: ", res)+"\n");

			mensagemUsuario();

			calcMedia = sc.nextInt();
			contadorNumeroMedia++;
		}

		System.out.println("Foram realizados " + contadorNumeroMedia + " cálculos de média.");
		System.out.println("Encerrando o programa");

	}

	public static void mensagemUsuario() {

		System.out.println("Escolha: ");
		System.out.println("1 - Calcular média do estudante");
		System.out.println("2 - Sair");

	}

}
