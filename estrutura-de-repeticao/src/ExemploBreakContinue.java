public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        //Exemplo break e continue

        for(int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
            continue;
            //break;

            System.out.println(numero);
        }
    }
}
