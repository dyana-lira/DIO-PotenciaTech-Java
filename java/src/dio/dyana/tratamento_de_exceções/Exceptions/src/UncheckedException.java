import javax.swing.JOptionPane;

public class UncheckedException {
    public static void main(String[] args) throws Exception {

        Boolean continueLooping = true;

        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
    
            try {
                Double resultado = dividir(Double.parseDouble(a), Double.parseDouble(b));
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

                continueLooping = false;
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Informe apenas números! " + e.getMessage());
            } catch(ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Denominador não pode ser zero! " + e.getMessage());
            } finally {
                System.out.println("finally...");
            }
        } while(continueLooping);

        System.out.println("Ok");
    }

    public static Double dividir(Double a, Double  b) { return a / b; }

}
