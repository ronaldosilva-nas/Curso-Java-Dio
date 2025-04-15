public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero1 e igual ao numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero1 e diferente ao numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero1 e maior que o numero2? " + simNao);
    }
}
