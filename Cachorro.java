package Heran�a;

public class Cachorro {

	public static void main(String[] args) {
	 Animal cachorro = new Animal();
	 
	 cachorro.getClass();
	 cachorro.setIdade(4);
	 cachorro.setNome("lulu");
	 
	 {
		 System.out.print("a idade do cachorro �: "+ cachorro.getIdade());
		 System.out.print("o nome do cachorro �: "+ cachorro.getNome());
		 System.out.print("esse cachorro corre");
	 }
	 

	 

	}

}
