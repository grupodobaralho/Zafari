package unique;

public class Cliente {

	private String nome;

	public Cliente() {
	}

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();		
		str.append("\nNome do Cliente: ");
		str.append(nome);
		return str.toString();
	}

}
