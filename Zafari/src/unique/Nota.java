package unique;

import java.util.ArrayList;
import java.util.List;

public class Nota {
	
	private Cliente cliente;
	private List<ItemVenda> itensVenda;
	private double valorFinal;
	
	public Nota(){
		valorFinal = 0;	
		cliente = null;
		itensVenda = new ArrayList<ItemVenda>();
	}
	
	public boolean incluirItemVenda(ItemVenda itemvenda){
		if(itemvenda!=null){
			itensVenda.add(itemvenda);
			valorFinal += itemvenda.getValorTotal();
			return true;
		}
		return false;		
	}
	
	public boolean removerItemVenda(ItemVenda itemvenda){
		for(ItemVenda a : itensVenda){
			if(a.equals(itemvenda)){
				valorFinal = valorFinal - a.getValorTotal();
				itensVenda.remove(a);
				return true;
			}			
		}
		return false;
	}
	
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public String imprimirNota(){
		String listaItensVenda = "";
		for (ItemVenda a : itensVenda)
		{
			listaItensVenda += a.toString() + "\n";			
		}		
		listaItensVenda += "Total:	R$" + valorFinal + "\n";
		if(cliente==null){
			return listaItensVenda;
		} else{
			listaItensVenda += "CPF do comprador:	" + cliente.getCpf();
			return listaItensVenda;
		}
		
	}
}
