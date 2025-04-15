package edu.ronaldo.segundaaula;
public class MinhaClasse {
    
    // Assunto da primeira e segunda aula

    public static void main (String [] args) {
        
        System.out.print ("Olá, mundo!");

    // Assunto da terceira aula

        String primeiroNome = "Ronaldo";

        String segundoNome = "Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);

        //int anoFrabricacao = 2022;

        //boolean verdadeira = false;

        // realizando a manipulação das variáveis e a alteração das variáveis

        //anoFrabricacao = 2018;
    }

    // ainda assuntos da terceira aula "CRIANDO MÉTODOS"

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
