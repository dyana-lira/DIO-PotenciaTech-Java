public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + (smartTv.ligada ? "SIM" : "NÃO"));
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        

        smartTv.mudarCanal(false);
        smartTv.mudarCanal(true);
        smartTv.mudarCanal(true);
        smartTv.mudarCanal(true);
        smartTv.mudarCanal(true);
        smartTv.mudarCanal(true);


    }
}
