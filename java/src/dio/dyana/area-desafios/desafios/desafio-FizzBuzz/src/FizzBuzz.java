import java.util.*;
/**
 * Neste desafio, você terá que criar uma função que faça um número
 * como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz". 
 */

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        VerificarMultiplo(num);

        sc.close();
    }

    public static void VerificarMultiplo(int numero) {
        if(numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (numero % 3 == 0 || numero % 5 == 0) {
            if(numero % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println("Buzz");
            }
        } else {
            System.out.println(numero);
        }
    }
}
