package entities;

public class PessoaJuridica extends Contribuintes{

	private Integer nFuncionarios;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(String name, double rendaAnual, Integer nFuncionarios) {
		super(name, rendaAnual);
		this.nFuncionarios = nFuncionarios;
	}

	public Integer getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}
	
	@Override
	public double taxa() {
		if(getRendaAnual() < 10.0) {
			return getRendaAnual() * 0.16;
		}
		else {
			return getRendaAnual() * 0.14;
		}
	}


	
}
