package unique;

public class ClientePF extends Cliente{
	
	private String cpf;	
	
	public ClientePF(){
		super();		
	}	

	public ClientePF(String nome, String cpf) {
		super(nome);		
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
