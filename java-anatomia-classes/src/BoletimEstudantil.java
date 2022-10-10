import java.util.Scanner;

public class BoletimEstudantil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("NOTA 1: _");
        float nota_um = scan.nextFloat();
        System.out.print("NOTA 2: _");
        float nota_dois = scan.nextFloat();

        float mediaFinal = calculaMedia(nota_um, nota_dois);

        System.out.print("MÉDIA: " + mediaFinal + " | ");

		if (mediaFinal < 4)
			System.out.println("REPROVADO");
		else if (mediaFinal > 4 && mediaFinal < 6)
			System.out.println("RECUPERAÇÂO");
		else
			System.out.println("APROVADO");
    }

    public static float calculaMedia(float n1, float n2) {
        return (n1 + n2) / 2;
    }
}
