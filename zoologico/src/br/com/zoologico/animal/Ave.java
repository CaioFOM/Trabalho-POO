package br.com.zoologico.animal;


public class Ave extends Animal {

	private String corDaPena;
	private String tamanhoDaAsa;

	public Ave(String raca, int idade, String sexo, String corDaPena, String tamanhoDaAsa) {
		super(raca, idade, sexo);
		this.corDaPena = corDaPena;
		this.tamanhoDaAsa = tamanhoDaAsa;
		
	}
	
	public void voar() {
		
		System.out.println("Pode voar");
	}

}