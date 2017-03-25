package unique;

public class ClientePJ extends Cliente{
	
	private String cnpj;	
	
	public ClientePJ(){
		super();		
	}

	public ClientePJ(String nome, String cnpj) {
		super(nome);
		// TODO Auto-generated constructor stub
		this.cnpj = cnpj;
	}


	public String getcnpj() {
		return cnpj;
	}

	public void setcnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append(super.toString());
		str.append("\nCnpj do Cliente: ");
		str.append(cnpj);
		return str.toString();
	}
}
