package br.com.vacinasmap;

import java.util.Scanner;


public class Principal {

	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Comorbidades c = new Comorbidades();
			Agenda agenda = new Agenda();
			Pessoa pessoa1 = new Pessoa();
			Profissoes profissao = new Profissoes();
			PostosVacinacao postos = new PostosVacinacao();
			int opc = 0;

			do {
				System.out.println(
						"=======================================================================================================");
				System.out.println(
						"\n                        \t\t   Vacina|S|\n " + "                           \t\t       Ma|P|\n");
				System.out.println(
						"=======================================================================================================");
				System.out.println(" [ 1 ]   ME VACINAR                   ");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------");
				System.out.println(" [ 2 ]   AGENDA DE VACINAÇÃO          ");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------");
				System.out.println(" [ 3 ]   VER POSTOS DE VACINAÇÃO          ");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------");
				System.out.println(" [ 0 ]   FINALIZAR SISTEMA          ");
				System.out.println(
						"---------------------------------------------------------------------------------------------------------");
				System.out.print(" [Escolha um das Opções]:   ");

				opc = scan.nextInt();
					
			
			if (opc == 1) {
				System.out.println(
						"---------------------------------------------------------------------------------------------------------");
				System.out.print(" [Digite sua Idade]:   ");
				pessoa1.setIdade(scan.nextInt());
				System.out.println(
						"------------------------------------------------------------------------------------------------------");

				if (pessoa1.getIdade() > 59) {
					System.out.println(" Você já deveria ter sido vacinado.\n"
							+ " Vá a um posto de vacinação o mais rápido possível.");
					System.out.println(
							"--------------------------------------------------------------------------------------------------------");
					
					System.out.println(" Pesquisar Postos de Vacinação próximo de você."  );
					System.out.println(
							"------------------------------------------------------------------------------------------------------");
					System.out.print(" [Digite o CEP]:   ");
					postos.setCep(scan.nextLong());
					System.out.println(
							"------------------------------------------------------------------------------------------------------");
					
					postos.mostrarPostos();
					System.out.println(
							"------------------------------------------------------------------------------------------------------");
				} else {
					do {
					System.out.println(" Você possui alguma das comorbidades abaixo?");
					System.out.println(
							"--------------------------------------------------------------------------------------------------------");
					c.mostrarComorbidades();

					System.out.print("         [1] SIM       [2] NÃO  :    ");
					pessoa1.setComordidade(scan.nextInt());
					System.out.println(
							"--------------------------------------------------------------------------------------------------------");
					}while(pessoa1.getComordidade() != 1 && pessoa1.getComordidade() != 2);
					if (pessoa1.getComordidade() == 1) {
						System.out.println(" Você já deveria ter sido vacinado.\n"
								+ " Vá a um posto de vacinação o mais rápido possível.");
						System.out.println(
								"--------------------------------------------------------------------------------------------------------");
						System.out.println(" Pesquisar Postos de Vacinação próximo de você."  );
						System.out.println(
								"------------------------------------------------------------------------------------------------------");

						System.out.print(" [Digite o CEP]:   ");
						postos.setCep(scan.nextLong());
						System.out.println(
								"------------------------------------------------------------------------------------------------------");
						postos.mostrarPostos();
						System.out.println(
								"------------------------------------------------------------------------------------------------------");

					} else if (pessoa1.getComordidade() == 2) {
						do {
						System.out.println(" Sua profissão se encaixa em alguma dessas Áreas?");
						System.out.println(
								"--------------------------------------------------------------------------------------------------------");
						
						profissao.mostrarAreasPro();
						System.out.println(
								"---------------------------------------------------------------------------------------------------------");
						System.out.print("         [1] SIM       [2] NÃO  :    ");
						opc = scan.nextInt();
						System.out.println(
								"---------------------------------------------------------------------------------------------------------");
						}while(opc != 1 && opc != 2);
						if (opc == 1) {
							System.out.println(" Você já deveria ter sido vacinado.\n"
									+ " Vá a um posto de vacinação o mais rápido possível.");
							System.out.println(
									"------------------------------------------------------------------------------------------------------");
							System.out.println(" Pesquisar Postos de Vacinação próximo de você."  );
							System.out.println(
									"------------------------------------------------------------------------------------------------------");

							System.out.print(" [Digite o CEP]:   ");
							postos.setCep(scan.nextLong());
							System.out.println(
									"------------------------------------------------------------------------------------------------------");
							postos.mostrarPostos();
							System.out.println(
									"------------------------------------------------------------------------------------------------------");

						} else if (opc == 2) {
							pessoa1.mostrarAgendaIdade();
						}

					} else {
						System.out.println(" Opção Inválida!");
					}

				}

			} else if (opc == 2) {
				agenda.mostrarAgenda();
			} else if (opc == 3) {
				
				System.out.println(
						"------------------------------------------------------------------------------------------------------");

				System.out.println(" Pesquisar Postos de Vacinação próximo de você."  );
				System.out.println(
						"------------------------------------------------------------------------------------------------------");
				System.out.print(" [Digite o CEP]:   ");
				postos.setCep(scan.nextLong());
				System.out.println(
						"------------------------------------------------------------------------------------------------------");
				
				postos.mostrarPostos();
			}
										
			
			
			else if (opc == 0) {
				System.out.println(
						"------------------------------------------------------------------------------------------------------");

				System.out.println("\n\n\n       \t\t\t[ SISTEMA FINALIZADO, OBRIGADO PELA PREFERÊNCIA ]");
				System.out.println(
						"\n\n\n------------------------------------------------------------------------------------------------------");

			} 
			
			} while (opc != 0);

			scan.close();

		

	}

}
