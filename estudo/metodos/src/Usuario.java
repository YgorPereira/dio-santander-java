public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Em qual canal está? canal " + smartTv.canal);
        System.out.println("Em quanto está o volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Após o método ligar...");
        System.out.println("A TV está ligada? " + smartTv.ligada);

        // smartTv.desligar();
        // System.out.println("Após o método desligar...");
        // System.out.println("A TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Após o método aumentar volume...");
        System.out.println("Em quanto está o volume? " + smartTv.volume);

        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        System.out.println("Após o método abaixar volume...");
        System.out.println("Em quanto está o volume agora? " + smartTv.volume);

        smartTv.mudarCanal(17);
        System.out.println("Após o método mudarCanal...");
        System.out.println("Em qual canal está? canal " + smartTv.canal);

        smartTv.subirCanal();
        System.out.println("Após o método subirCanal...");
        System.out.println("Em qual canal está? canal " + smartTv.canal);

        smartTv.descerCanal();
        smartTv.descerCanal();
        System.out.println("Após o método descerCanal...");
        System.out.println("Em qual canal está? canal " + smartTv.canal);
    }
}
