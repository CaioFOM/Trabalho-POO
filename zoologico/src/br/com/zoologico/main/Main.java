package br.com.zoologico.main;

import br.com.zoologico.animal.Mamifero;
import br.com.zoologico.animal.Ave;

public class Main {
	
	public static void main(String[] args) {
		
		Ave objAve = new Ave("Arara", 4, "Masculino", "Azul", "Media");
		objAve.exibirRaca();
		objAve.exibirIdade();
		objAve.exibirSexo();
		objAve.voar();
		
		System.out.println("===========================================");
		
		Mamifero objMamifero = new Mamifero("Elefante", 6, "Feminino", "Placentario", " Herbivoro");
		objMamifero.exibirRaca();
		objMamifero.exibirIdade();
		objMamifero.exibirSexo();
		objMamifero.engravidar();
		
	}
	
	
	
}