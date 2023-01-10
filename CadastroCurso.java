package dezembro;
/*4 - Implemente um programa que solicite ao(à) usuário(a) qual curso deseja se inscrever,
apresentando um menu com os cursos oferecidos. Caso o(a) usuário(a) escolha um curso
que ainda há vagas disponíveis para inscrição, atualize o estoque do respectivo curso e*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CadastroCurso {

	// Cadastrar 2 usuários em cada curso

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> linguagemC = new ArrayList<String>();
		List<String> cursoPython = new ArrayList<String>();
		List<String> cursoPHP = new ArrayList<String>();
		int valor1 = 0, valor2 = 0, valor3 = 0;
		String res;

		do {

			System.out.println("Escolha qual curso deseja se inscrever " + "\n(1) Curso Linguagem C"
					+ "\n(2) Curso Python para Finanças" + "\n(3) Curso de PHP com MySql");
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:

				for (int i = 0; i < linguagemC.size(); i++) {
					valor1 = linguagemC.size();
				}

				System.out.print("Nome do aluno: ");
				String nome1 = sc.next();
				if (valor1 <= 1) {
					if (linguagemC.contains(nome1)) {
						System.out.println("Você já possui cadastro nesse curso.");
					} else {
						linguagemC.add(nome1);
						System.out.println("Sua inscrição no curso de Linguagem C foi realizado com sucesso! Até lá!");
					}

				} else {
					System.out.println("Todas as incrições foram esgotadas.");
				}

				break;
			case 2:
				for (int i = 0; i < cursoPython.size(); i++) {
					valor2 = cursoPython.size();
				}

				System.out.print("Nome do aluno: ");
				String nome2 = sc.next();
				if (valor2 <= 1) {

					if (cursoPython.contains(nome2)) {
						System.out.println("Você já possui cadastro nesse curso.");
					} else {
						cursoPython.add(nome2);
						System.out.println("Sua inscrição no curso de Python para Finanças "
								+ "foi realizado com sucesso! Até lá!");
					}

				} else {
					System.out.println("Todas as incrições foram esgotadas.");
				}
				break;
			case 3:
				for (int i = 0; i < cursoPHP.size(); i++) {
					valor3 = cursoPHP.size();
				}

				System.out.print("Nome do aluno: ");
				String nome3 = sc.next();
				if (valor3 <= 1) {
					if (cursoPHP.contains(nome3)) {
						System.out.println("Você já possui cadastro nesse curso.");
					} else {
						cursoPHP.add(nome3);
						System.out.println("Sua inscrição no curso de Linguagem PHP com MySQL foi "
								+ "realizado com sucesso! Até lá!");
					}

				} else {
					System.out.println("Todas as incrições foram esgotadas.");
				}
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}

			if (valor1 == 1 && valor2 == 1 && valor3 == 1) {
				System.out.println("Atenção! Todas as inscrições foram esgotadas!");
				break;
			}
			System.out.println("Continuar cadastrando? (s/n)");
			res = sc.next();
		} while (res.equalsIgnoreCase("s"));

		System.out.println("Encerrando o programa.");

	}

}
