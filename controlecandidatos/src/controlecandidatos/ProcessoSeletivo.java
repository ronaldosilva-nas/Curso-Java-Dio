package controlecandidatos;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		
		imprimirSelecionados();
		selecaoCandidatos();
		
	}

	static void imprimirSelecionados(){
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
		for(int indice = 0; indice < candidatos.length; indice++){
			System.out.println("o candidato de número " + (indice+1) + " é o " + candidatos[indice]);
		}
	}

	static void selecaoCandidatos(){
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + "Solicitou este valor de salário " + salarioPretendido);
			if(salarioBase >= salarioPretendido){
				System.out.println("O candidato " + candidato + "foi selecionado para a vaga");
				candidatosSelecionados++;
			}
		}
	}

	static double valorPretendido(){
		return ThreadLocalRandom.current().nextDouble(1800, 2000);
	}

	static void analisarCandidatos(double salarioPretendido){
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido){
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if(salarioBase == salarioPretendido){
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}else{
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}