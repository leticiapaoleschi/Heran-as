package Herança;

public class Animal {
private String nome;
private int idade;
private boolean som;

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public boolean isSom() {
	return som;
}
public void emitir() 
{
	this.som= true;
}
 {
	 System.out.print("esse animal emite som");
 }
}
