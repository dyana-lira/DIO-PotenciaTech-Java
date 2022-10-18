import java.io.*;
import javax.swing.JOptionPane;

public class Exc_Personalizada1 {
    public static void main(String[] args) {
        String nomeDoArquivo = "ExcecaoPersonalizada_1/" +JOptionPane.showInputDialog("Nome do arquivo: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("Com exception ou não, o programa continua...");

    }


    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {
            //buscando o arquivo para iniciar a leitura
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            //inicia classe que irá fazer a escrita do conteúdo do arquivo no console 
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            /*faz a leitura e escrita de linha por linha do conteúdo do documento
             *até que a próxima linha não possua conteúdo.
            */
            do {
            
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();

        } catch (ImpossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado. Entre em contato com o suporte. " + ex.getClass());

        } finally {
            System.out.println("Finally...");
        }
    }


    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {

        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
    
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAberturaDeArquivoException extends Exception {

    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
        
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException [nomeDoArquivo=" + nomeDoArquivo + ", diretorio=" + diretorio
                + "]";
    }
}