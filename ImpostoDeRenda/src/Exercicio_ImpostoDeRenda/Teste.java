
package Exercicio_ImpostoDeRenda;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);

		try {

		

			ArrayList<Contribuinte> contribuintes = new ArrayList<Contribuinte>();

		        System.out.println("Quantas pessoas jurídicas irá cadastrar?");
			int N = sc.nextInt();

			for (int i = 0; i < N; i++) {

				PessoaJuridica p = new PessoaJuridica();

				System.out.println("Nome:");
				String nome = sc.next();

				System.out.println("Renda bruta:");
				double rendaBruta = sc.nextDouble();
				

				System.out.println("CNPJ:");
				String cnpj = sc.next();

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
				pf.setNome(sc.next());

				System.out.println("Renda Bruta: ");

				pf.setRendaBruta(sc.nextDouble());

				
				System.out.println("CPF: ");
				pf.setCpf(sc.next());

				contribuintes.add(pf);
			}

			for (Contribuinte contribuinte : contribuintes) {

				System.out.println(contribuinte);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao processar cadastro");
		}
		sc.close();
	}
}
