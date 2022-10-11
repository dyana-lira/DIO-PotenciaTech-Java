import java.util.Scanner;

/**
 * <h1>Calculadora</h1>
 * <p>
 * A Calculadora realiza operações matemáticas entre dois números do tipo Double
 * </p>
 * 
 * @author Dyana Lira
 * @version 1.0
 * @since 10/10/2022
 */

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

    /**
     * <p>Método criado com o intuito <br>
     * de somar dois números do tipo Double</p>
     * @param n1 primeiro número que deve ser informado pelo user 
     * @param n2 segundo número que deve informado pelo user
     */
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
