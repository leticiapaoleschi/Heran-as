package Colecoes;

import java.util.ArrayList;


public class Exemplo3 {
	public static void main(String[] args) {
		String estoque1 = "camisetas";
		String estoque2 = "calças";
		String estoque3 = "sapatos";
		
		ArrayList<String>estoque = new ArrayList<>();
		
		System.out.println(estoque);
		
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		
		System.out.println(estoque);
		
		estoque.remove(estoque3);
		estoque.add("\n O estoque de sapatos acabou");
		System.out.println(estoque);
		
		estoque.add("\n O estoque de sapatos foi renovado");
		estoque.add(estoque3);
		estoque.remove(2);
		System.out.println(estoque);
		
		
		
		
		
		
		
		
	}

}
