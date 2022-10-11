import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("NOME: _");
        String nome = sc.nextLine();
        System.out.print("SOBRENOME: _");
        String sobrenome = sc.next();
        System.out.print("IDADE: _");
        int idade = sc.nextInt();
        System.out.print("ALTURA: _");
        Double altura = sc.nextDouble();

        System.out.println();
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos de idade");
        System.out.printf("Minha altura é %.2fcm %n", altura);

        sc.close();
    }
}
