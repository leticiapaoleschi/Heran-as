package Herança;

public class Cachorro {

	public static void main(String[] args) {
	 Animal cachorro = new Animal();
	 
	 cachorro.getClass();
	 cachorro.setIdade(4);
	 cachorro.setNome("lulu");
	 
	 {
		 System.out.print("a idade do cachorro é: "+ cachorro.getIdade());
		 System.out.print("o nome do cachorro é: "+ cachorro.getNome());
		 System.out.print("esse cachorro corre");
	 }
	 

	 

	}

}
