package br.com.vacinasmap;

public class Pessoa {

	private String nome;
	private String profissao;
	private int idade;
	private int cep;
	private int comordidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getComordidade() {
		return comordidade;
	}

	public void setComordidade(int comordidade) {
		this.comordidade = comordidade;
	}

	public void mostrarAgendaIdade() {
		
		System.out.println("\n \t\t\t[ COM BASE NA SUA IDADE SUA DATA DE VACINAÇÃO ]\n");
		if (this.idade >= 50) {
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------");
			System.out.println(" DE 16 DE JUNHO   |    Pessoas com 50 a 59 anos           ");
			System.out.println(" A 22 DE JUNHO    |                                              				    ");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------");

		} else if (this.idade >= 43 && this.idade <= 49) {

			System.out.println(
					"-----------------------------------------------------------------------------------------------------------");
			System.out.println("   DE 23 DE JUNHO   |           Pessoas com 43 a 49 anos	           ");
			System.out.println("    A 29 DE JUNHO   |                                            ");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------");

		}

		else if (this.idade >= 40 && this.idade <= 42) {

			System.out.println(
					"-----------------------------------------------------------------------------------------------------------");
			System.out.println(" DE 30 DE JUNHO  |      Pessoas com 40 a 42 anos	  ");
			System.out.println("  A 14 DE JULHO  |                                            ");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------");

		}

		else if (this.idade >= 35 && this.idade <= 39) {

			System.out.println(
					"-----------------------------------------------------------------------------------------------------------");
			System.out.println(" DE 19 A 28 DE AGOSTO    |      Pessoas com 35 a 39 anos         ");
			System.out.println(
					"  A 29 DE JULHO          |                                                 				 ");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------");

		}

		else if (this.idade >= 30 && this.idade <= 34) {

			System.out.println(
					"----------------------------------------------------------------------------------------------------------");
			System.out.println("  DE 29 DE JULHO       |        Pessoas de 30 a 34 anos            ");
			System.out
					.println("  A 08 DE AGOSTO       |                                                 				 ");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------");

		}

		else if (this.idade >= 25 && this.idade <= 29) {

			System.out.println(
					"----------------------------------------------------------------------------------------------------------");
			System.out.println(" DE 16 A 31 DE AGOSTO  |        Pessoas de 25 a 29 anos 	  ");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------");

		}

		else if (this.idade >= 18 && this.idade <= 24) {

			System.out.println(
					"----------------------------------------------------------------------------------------------------------");
			System.out.println(" DE 1 DE SETEMBRO     |         Pessoas de 18 a 24 anos		  ");
			System.out.println("  A 15 DE SETEMBRO    |                                                  					");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------");

		}

	}

}
