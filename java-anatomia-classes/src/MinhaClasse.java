import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String firstName, lastName;

        System.out.print("FIRST NAME: _");
        firstName = scan.nextLine();
        System.out.print("LAST NAME: _");
        lastName = scan.nextLine();

        System.out.println(nomeCompleto(firstName, lastName));

    }

    public static String nomeCompleto(String primeiroNome, String ultimoNome) {
        return "NOME COMPLETO: " + primeiroNome.concat(" ").concat(ultimoNome);
    }
}
