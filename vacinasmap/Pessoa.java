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
		if (this.idade >= 54) {
			System.out.println("-----------------------------------------------------------------------------------------------------------");
			System.out.println("  DE 9 A 19 DE JULHO        |       Pessoas de 54 até 59 anos              ");
			System.out.println("-----------------------------------------------------------------------------------------------------------");

		} else if (this.idade >= 50 && this.idade <= 53) {

			System.out.println("-----------------------------------------------------------------------------------------------------------");
			System.out.println("   20 DE JULHO              |       Pessoas de 50 até 53 anos             ");
			System.out.println("  A 3 DE AGOSTO          	|                                            ");
			System.out.println("-----------------------------------------------------------------------------------------------------------");

		}

		else if (this.idade >= 45 && this.idade <= 49) {

			System.out.println("-----------------------------------------------------------------------------------------------------------");
			System.out.println("  DE 4 A 18 DE AGOSTO     |        Pessoas de 45 até 49 anos	  ");
			System.out.println("-----------------------------------------------------------------------------------------------------------");

		}

		else if (this.idade >= 40 && this.idade <= 44) {

			System.out.println("-----------------------------------------------------------------------------------------------------------");
			System.out.println(" DE 19 A 28 DE AGOSTO    |      Pessoas de 40 até 44 anos             ");
			System.out.println("-----------------------------------------------------------------------------------------------------------");

		}

		else if (this.idade >= 35 && this.idade <= 39) {

			System.out.println("----------------------------------------------------------------------------------------------------------");
			System.out.println("  DE 29 DE AGOSTO          |        Pessoas de 35 até 39 anos             ");
			System.out.println("  A 7 DE SETEMBRO          |                                                  ");
			System.out.println("----------------------------------------------------------------------------------------------------------");

		}

		else if (this.idade >= 30 && this.idade <= 34) {

			System.out.println("----------------------------------------------------------------------------------------------------------");
			System.out.println(" DE 8 A 17 DE SETEMBRO  |       Pessoas de 30 até 34 anos	  ");
			System.out.println("----------------------------------------------------------------------------------------------------------");

		}

		else if (this.idade >= 25 && this.idade <= 29) {

			System.out.println("----------------------------------------------------------------------------------------------------------");
			System.out.println(" DE 18 A 27 DE SETEMBRO    |       Pessoas de 25 até 29 anos 	  ");
			System.out.println("----------------------------------------------------------------------------------------------------------");

		}

		else if (this.idade >= 18 && this.idade <= 24) {

			System.out.println("----------------------------------------------------------------------------------------------------------");
			System.out.println("  DE 28  DE SETEMBRO      |       Pessoas de 18 até 24 anos	  ");
			System.out.println("  A 18 DE OUTUBRO         |                                                ");
			System.out.println("----------------------------------------------------------------------------------------------------------");

		}
	}
}
