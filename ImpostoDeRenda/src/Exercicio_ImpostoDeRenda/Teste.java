
package Exercicio_ImpostoDeRenda;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);

			ArrayList<Contribuinte> contribuintes = new ArrayList<Contribuinte>();

		        System.out.println("Quantas pessoas jurídicas irá cadastrar?");
			int N = sc.nextInt();

			for (int i = 0; i < N; i++) {

				PessoaJuridica p = new PessoaJuridica();

				System.out.println("Nome:");
				String nome = sc.nextLine();

				System.out.println("Renda bruta:");
				double rendaBruta = sc.nextDouble();
				sc.nextLine();

				System.out.println("CNPJ:");
				String cnpj = sc.nextLine();

				p.setNome(nome);
				p.setRendaBruta(rendaBruta);
				p.setCnpj(cnpj);

				contribuintes.add(p);

			}

			System.out.println("Quantas pessoas físicas irá cadastrar?");
			int M = sc.nextInt();

			for (int i = 0; i < M; i++) {

				PessoaFisica pf = new PessoaFisica();

				System.out.println("Nome: ");
				pf.setNome(sc.nextLine());

				System.out.println("Renda Bruta: ");

				pf.setRendaBruta(sc.nextDouble());

				sc.nextLine(); // Limpeza do buffer //
				System.out.println("CPF: ");
				pf.setCpf(sc.nextLine());

				contribuintes.add(pf);
			}

			for (Contribuinte contribuinte : contribuintes) {

				System.out.println(contribuinte);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao processar cadastro");
		}
	}
}
