public class CaixaEletronico {
    public static void main(String[] args) {

        //controle de fluxo simples
        
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }
}
