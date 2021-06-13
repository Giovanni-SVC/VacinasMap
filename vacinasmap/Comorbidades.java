package br.com.vacinasmap;

public class Comorbidades {
	
	String[] comorbidades = { 
			"Insuficiência cardíaca", "Cor-pumonale e Hipertensão pulmonar",
			"Miocardiopatias / Pericardiopatias", "Síndrome coronarianas", "Valvopatias",
			"Doença de Aorta, dos Grandes Vasos e Fistulas arteriovenosas",
			"Cardiopatias congênitas no adulto / Cardiopatia hipertensiva",
			"Próteses valvares e Dispositivos cardíacos implantados", "Diabetes mellitus",
			"Pneumopatias crônicas graves", "Hipertensão artéria estágio 3",
			"Hipertensão estágios 1 e 2 com lesão e órgão alvo", "Doença Cerebrovascular", "Doença renal crônica",
			"Imunossuprimidos (inclui pacientes oncológicos)", "Anemia falciforme", "Obesidade mórbida",
			"Cirrose Hepática", "HIV" 
			};
	public void mostrarComorbidades() {
		System.out.println("\n \t\t\t\t\t[ COMORBIDADES ]\n");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		for(int i=0; i<comorbidades.length; i++ ) {
			
			System.out.println(" ["+(i+1)+"] : "+ comorbidades[i]);
		}
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
	}
}
