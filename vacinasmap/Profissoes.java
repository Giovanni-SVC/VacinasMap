package br.com.vacinasmap;

public class Profissoes {

	String[] profissoes = {
			 "Trabalhador de saúde, indígenas e quilombolas",
			 "Trabalhador de saúde, indígenas e quilombolas",
			 "Profissionais de segurança pública  e administração penitenciária",
			 "Profissionais da educação","Metroviários e ferroviários",
			 "Motoristas e cobradores de ônibus", "Profissionais do transporte aéreo ",
			 "Profissionais do transporte portuário"
		};
		
		public void mostrarAreasPro() {
			System.out.println("\n \t\t\t\t[ AREA DE ATUAÇÃO / PROFISSÕES ]\n");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------");
			for(int i=0; i<profissoes.length; i++ ) {
				
				System.out.println(" ["+(i+1)+"] : "+ profissoes[i]);
			}
			
		}
		
}
