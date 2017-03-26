package unique;

public class ClientePF extends Cliente{
	
	private String cpf;	
	
	public ClientePF(){
		super();		
	}	

	public ClientePF(String nome, int codCliente, String cpf) {
		super(nome, codCliente);		
		// TODO Auto-generated constructor stub
		this.cpf = cpf;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString(){		
		StringBuilder str = new StringBuilder();
		str.append(super.toString());
		str.append("\nCpf do Cliente: ");
		str.append(cpf);
		return str.toString();
	}
}
