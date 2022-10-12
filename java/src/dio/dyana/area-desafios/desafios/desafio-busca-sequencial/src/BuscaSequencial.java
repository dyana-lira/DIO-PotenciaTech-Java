import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.
        buscarElemento(numero, elementos);

        leitor.close();
    }

    public static void buscarElemento(int numero, int[] lista) {
        for(int i = 0; i < lista.length; i++) {
            if (numero == lista[i]){
                System.out.println("Achei " + numero + " na posicao " + i );
                break;
            }  else if (i == lista.length - 1) {
                System.out.println("Numero " + numero + " nao encontrado!");
            }
        }

    }
}
