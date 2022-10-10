import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        System.out.print(" __");
        Double num1 = sc.nextDouble();
        System.out.print(" __");
        Double num2 = sc.nextDouble();

        sc.close();
        
        linha();
        System.out.println("SOMA: " + somar(num1, num2));
        System.out.println("MULTIPLICAÇÂO: " + multiplicar(num1, num2));
        System.out.println("SUBTRAÇÃO: " + subtrair(num1, num2));
        System.out.printf("DIVISÃO: %.1f %n", dividir(num1, num2));
        linha();
        

    } 

    public static Double somar(Double n1, Double n2) {
        return n1 + n2;
    }

    public static Double multiplicar(Double n1, Double n2) {
        return n1 * n2;
    }

    public static Double subtrair(Double n1, Double n2) {
        return n1 - n2;
    }

    public static Double dividir(Double n1, Double n2) {
        return n1 / n2;
    }

    public static void linha() {
        System.out.println("-----------------------------------------");
    }
}
