package Polimorfismo;

public class Exercicio2 {

	public static void main(String[] args) {
		Animal a = new Animal();
        Cachorro lulu = new Cachorro();
        Cavalo bob = new Cavalo();
        Preguica zoo = new Preguica();
        
        a.EmitirSom();
        lulu.EmitirSom();
       
        a.EmitirSom();
        bob.EmitirSom();
       
        a.EmitirSom();
        zoo.EmitirSom();
     
	}

}
