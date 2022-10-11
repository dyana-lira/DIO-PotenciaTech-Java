import java.util.Scanner;

public class CalculoCircunferencia {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o comprimento do raio (cm): _");
        Double raio = sc.nextDouble();

        sc.close();

        System.out.printf("CIRCUNFERÊNCIA = %.2fcm", calculaCircunferencia(raio));

    }

    public static Double calculaCircunferencia(double raio) {
        final Double PI = 3.14159;
        
        return 2 * PI * raio;
    }
}
