public class OperadoresLogicos {
    public static void main (String[] args) {

        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && condicao2){
            System.out.println("as duas condicoes sao verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("uma das condicoes e verdadeiras");
        }

        System.out.println("Fim");
    }
}
