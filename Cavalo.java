package Herança;

public class Cavalo {

	public static void main(String[] args) {
		Animal cavalo = new Animal();
		
		 cavalo.getClass();
		 cavalo.setIdade(17);
		 cavalo.setNome("indio");
         
		 
		 {
			 System.out.print("Esse animal corre");
			 System.out.print("A idade do cavalo é: "+ cavalo.getIdade());
			 System.out.print("O nome do cavalo é: "+ cavalo.getNome());
		 }
	}

}
