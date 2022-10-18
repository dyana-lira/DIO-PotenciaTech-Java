import javax.swing.JOptionPane;

public class ExcecaoPersonalizada2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 0};

        for (int i = 0; i < denominador.length; i++) {

            try {
                if(numerador[i] %2 != 0) {
                    throw new DivisaoNaoExataException("Divisão não exata", numerador[i], denominador[i]);
                }
    
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);

            } catch (DivisaoNaoExataException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException ae) {
                JOptionPane.showMessageDialog(null, "Revise os números informados - Dica: Não possível dividir por 0 " + ae.getMessage());
            } catch (IndexOutOfBoundsException ie) {
                JOptionPane.showMessageDialog(null, "O index está fora do intervalo disponível. - Causa: " + ie.getMessage());
            }

            System.out.println("O programa continua...");
        }    
    }
}