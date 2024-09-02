package br.com.zoologico.animal;


public class Mamifero extends Animal {

	private String tipoGestacao;
	private String tipoAlimentacao;

	
	public Mamifero(String raca, int idade, String sexo, String tipoGestacao, String tipoAlimentacao) {
		super(raca, idade, sexo);
		this.tipoGestacao = tipoGestacao;
		this.tipoAlimentacao = tipoAlimentacao;
		
	}
	
	public void engravidar() {
		
		System.out.println("Engravidou");
	}
	
}