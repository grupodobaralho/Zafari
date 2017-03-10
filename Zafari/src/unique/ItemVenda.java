package unique;

public class ItemVenda {
	
	private Produto produto;
	private int quantidade;
	private double valorTotal;
	
	public ItemVenda(Produto produto){		
		this.produto = produto;
		this.quantidade = 1;
		calculaValorTotal();
	}
	public ItemVenda(Produto produto, int quantidade){
		this.produto = produto;		
		this.quantidade = quantidade;
		calculaValorTotal();
	}
	public Produto getProduto() {
		return produto;
	}	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		calculaValorTotal();
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void calculaValorTotal(){
		double valorUnitario = produto.getPreco();		
		valorTotal = valorUnitario * quantidade;
	}
	
	public String toString (){
		String aux = "";
		aux += produto.getNome() + "	  srl: "+ produto.getSerial() + "   |   qnt: " + quantidade + 
				"	Valor: R$" + valorTotal;
		return aux;
	}

}
