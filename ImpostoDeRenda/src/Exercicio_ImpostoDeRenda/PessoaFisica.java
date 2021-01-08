package Exercicio_ImpostoDeRenda;

public class PessoaFisica extends Contribuinte {

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double calculoImposto() {

		double renda = super.getRendaBruta();

		if (renda <= 1400) {

			return 0;

		}

		else if (renda >= 1400.01 && renda <= 2100) {

			return (10 * renda / 100) - 100;
		}

		else if (renda >= 2100.01 && renda <= 2800) {

			return (15 * renda / 100) - 270;
			
		} 
		else if (renda >= 2800.01 && renda <= 3600) {

			return (25 * renda / 100) - 500;
			
		} 
		else if (renda > 3600) {

			return (30 * renda / 100) - 700;
		}

		return 0;

	}

	public String toString() {

		String s = "Pessoa física[";
		s += super.toString();
		s += " ;cpf: "+cpf;
		s += " ;Imposto a ser pago: " + calculoImposto()+"]";
		return s;
	}
}
