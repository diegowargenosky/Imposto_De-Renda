
package programaTeste;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

import entidades.Contribuinte;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

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
				sc.nextLine();
				
				String nome = sc.nextLine();
				
	                        System.out.println("CNPJ:");
				
				String cnpj = sc.nextLine();

				System.out.println("Renda bruta:");
				double rendaBruta = sc.nextDouble();
			

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
				sc.nextLine();
				String nome = sc.nextLine();
				
				System.out.println("CPF: ");
				String cpf = sc.nextLine();

				System.out.println("Renda Bruta: ");

				double rendaBruta = sc.nextDouble();
				
				pf.setNome(nome);
				pf.setCpf(cpf);
				pf.setRendaBruta(rendaBruta);

				
			

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
