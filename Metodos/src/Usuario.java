public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv SmartTv = new SmartTv();

        SmartTv.diminuirvolume();
        SmartTv.diminuirvolume();
        SmartTv.diminuirvolume();
        SmartTv.aumentarvolume();

        System.out.println("Canal atual: " + SmartTv.canal);

        SmartTv.mudarCanal(13);
        
        System.out.println("Canal atual: " + SmartTv.canal);

        System.out.println("Volume atual: " + SmartTv.volume);

        System.out.println("Tv Ligada? " + SmartTv.ligada);
        System.out.println("Canal atual: " + SmartTv.canal);
        System.out.println("Volume atual: " + SmartTv.volume);

        SmartTv.ligar ();
        System.out.println("Novo status -> Tv Ligada? " + SmartTv.ligada);

        SmartTv.desligar ();
        System.out.println("Novo status -> Tv Ligada? " + SmartTv.ligada);
        
    }
    
}
