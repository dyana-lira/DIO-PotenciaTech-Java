import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

/**
 * <h2>Desafio</h2>
 * Tente resolver as exceções no método que lê o arquivo.
 */

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "texto.txt";


        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo que deseja imprimir. " + e.getClass());
            //e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro inesperado. Entre em contato com o suporte. " + e.getClass());
            //e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();
            
        } while (line != null); {
            bw.flush();
            br.close();
        }

    }
    
}
