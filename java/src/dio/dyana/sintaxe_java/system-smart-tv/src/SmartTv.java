public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("Novo Status: Ligada");
    }

    public void desligar(){
        ligada = false;
        System.out.println("Novo Status: Desligada");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("VOLUME: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("VOLUME: " + volume);
    }

    public void mudarCanal(Boolean opcao) {
        if (opcao==true) {
            canal++;
        } else {
            canal--;
        }
        
        System.out.println("CANAL: " + canal);
    }

    public void mudarCanal(int canal) {
        this.canal = canal;
        System.out.println("CANAL: " + canal);
    }
}
