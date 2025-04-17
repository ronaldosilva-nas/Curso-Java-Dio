public class ResultadoEscolarTernario {
    public static void main(String[] args) {
        
        //condições ternárias

        //exemplo 1

        /*int nota = 5;
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);*/

        //exemplo 2

        int nota = 10;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
