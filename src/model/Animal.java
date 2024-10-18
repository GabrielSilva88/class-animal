package model;

public class Animal {
	
	/*
	 * Classe Animal:
	 * Crie uma classe Animal com os atributos nome, idade e especie.
	 * Encapsule os atributos e implemente métodos para emitir um som característico do animal e para imprimir todas as informações do animal.
	 */

	private String nome;
	private int idade;
	private String especie;

	// get & set metodo modificadores.
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

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	
	public String emitirSom() {
		
		return "Sim, " + getEspecie() + " emitir um som característico";
	}
	
	// Construtor
	
	public Animal(String nome, int idade, String especie) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
	}
	
	public String informacaoAnimal() {
		return "Dados do Animal \nNome: " + nome +"\nIdade"+ idade + "Especie: " + especie; 
	}
	
}
