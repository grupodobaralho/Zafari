package unique;

import java.util.Random;

public class App {
	
	public static void main(String[] args){
		
		Random rand = new Random();
		
		//Preparando simulacao:
		
		Produto produto = new Produto(2.5, "Chocolate", "12340");
		Produto produto1 = new Produto(4.95, "Coca-cola 2L", "12341");
		Produto produto2 = new Produto(7.5, "Agua de Coco", "12342");
		Produto produto3 = new Produto(3.5, "Cachorro-quente", "12343");
		Produto produto4 = new Produto(12.5, "Frango", "12344");
		Produto produto5 = new Produto(1.25, "Agua 1L", "12345");
		Produto produto6 = new Produto(3.12, "Cookies", "12346");
		Produto produto7 = new Produto(4.5, "Batata Frita", "12347");
		Produto produto8 = new Produto(5.95, "Maionese", "12348");
		Produto produto9 = new Produto(5.95, "Catch-UP", "12349");
		Produto produto10 = new Produto(2.5, "Picole de Manga", "66612");
		
		Nota nota = new Nota();			
		
		//Teste com cliente:	
		
		//---Passando os produtos comprados:
		
		ItemVenda chocolate = new ItemVenda(produto,4);
		nota.incluirItemVenda(chocolate);
		
		ItemVenda cachorroQuente = new ItemVenda(produto3,2);
		nota.incluirItemVenda(cachorroQuente);
		
		ItemVenda maionese = new ItemVenda(produto8,1);
		nota.incluirItemVenda(maionese);
		
		ItemVenda catchUp = new ItemVenda(produto10,1);
		nota.incluirItemVenda(catchUp);
		
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//Exemplo com pessoa Física
		
		//-CPF na nota senhor?
		//-Sim		
		
		ClientePF clientePF = new ClientePF();	
		
		clientePF.setCodCliente(rand.nextInt(89999) + 10000);
		
		//-Informe nome e cpf por gentileza:
		//Aragorn
		//-789456123
		
		clientePF.setCpf("789456123");
		clientePF.setNome("Aragorn");		
		
		nota.setCliente(clientePF);
		
		System.out.println(nota.imprimirNota()+"\n=========================================================\n");
		
		//Obrigado pela preferencia, O Zaffari agradece.	
		
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//Exemplo com pessoa Jurídica
		
		//-CPF na nota senhor?
		//-Pessoa Jurídica
		
		ClientePJ clientePJ = new ClientePJ();
		
		clientePJ.setCodCliente(rand.nextInt(89999) + 10000);
		
		//Informe o nome e cnpj por favor
		//Grupo do Baralho
		//11222333444455
		
		clientePJ.setNome("Grupo do Baralho");
		clientePJ.setcnpj("11222333444455");
		
		nota.setCliente(clientePJ);
		
		System.out.println(nota.imprimirNota()+"\n=========================================================\n");
		
		//Obrigado pela preferencia, O Zafari agradece.		
			
	}
}
