package view;

import model.Animal;

public class MainAnimal {

	public static void main(String[] args) {
		
		Animal a = new Animal("Cholo", 2, "Cachorro");
		
	
		System.out.println(a.informacaoAnimal());
		a.emitirSom();
		
		a.setEspecie("Gato");
		a.setIdade(2);
		a.setNome("Laion");
		
		System.out.println(a.informacaoAnimal());
		System.out.println(a.emitirSom());
	}
}
