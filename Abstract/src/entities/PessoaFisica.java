package entities;

public class PessoaFisica extends Contribuintes{

	private double gastosSaude;
	
	public PessoaFisica() {
	}

	public PessoaFisica(String name, double rendaAnual, double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public double taxa() {
		if(getRendaAnual() < 20000.00) {
			return getRendaAnual() * 0.15 - gastosSaude * 0.5;
		}
		else {
			return getRendaAnual() * 0.25 - gastosSaude * 0.5;
		}
		
	}
	
}
