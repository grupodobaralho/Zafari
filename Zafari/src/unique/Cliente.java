package unique;

public class Cliente {

	private String nome;
	private int codCliente;

	public Cliente() {
	}

	public Cliente(String nome, int codCliente) {
		this.nome = nome;
		this.codCliente = codCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int i) {
		this.codCliente = i;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();		
		str.append("\nNome do Cliente: ");
		str.append(nome);
		str.append("\nCodigo do Cliente: ");
		str.append(codCliente);
		return str.toString();
	}

}
