package br.com.zoologico.animal;

public class Animal {

		private String raca;
		private int idade;
		private String sexo;
		
		public Animal(String raca, int idade, String sexo) {
			super();
			this.raca = raca;
			this.idade = idade;
			this.sexo = sexo;
		}
		public void exibirRaca() {
			System.out.println(raca+ " é a raça desse animal");
		}
		public void exibirIdade() {
			System.out.println(idade+ " é a idade desse animal");
		}
		public void  exibirSexo() {
			System.out.println(sexo+ " é o sexo desse animal");
		}
}
