package Heran�a;

public class Cavalo {

	public static void main(String[] args) {
		Animal cavalo = new Animal();
		
		 cavalo.getClass();
		 cavalo.setIdade(17);
		 cavalo.setNome("indio");
         
		 
		 {
			 System.out.print("Esse animal corre");
			 System.out.print("A idade do cavalo �: "+ cavalo.getIdade());
			 System.out.print("O nome do cavalo �: "+ cavalo.getNome());
		 }
	}

}
