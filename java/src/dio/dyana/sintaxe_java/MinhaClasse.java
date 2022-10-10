package dio.dyana.sintaxe_java;

public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        
        String firstName = "Dyana";
        String lastName = "Lira";

        System.out.println(nomeCompleto(firstName, lastName));

    }

    public static String nomeCompleto(String primeiroNome, String ultimoNome) {
        return "NOME COMPLETO: " + primeiroNome.concat(" ").concat(ultimoNome);
    }
}
