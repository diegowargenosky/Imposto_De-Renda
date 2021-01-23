package entidades;

public class PessoaJuridica extends Contribuinte {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calculoImposto() {

		return 10 * super.getRendaBruta() / 100;

	}

	public String toString() {

		String s = "Pessoa jur�dica[";
		s += super.toString();
		s += " ;cnpj: " + cnpj;
		s += " ;Imposto a ser pago: " + calculoImposto() + "]";
		return s;
	}

}
