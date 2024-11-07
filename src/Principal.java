//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        final var processador = new ProcessarBoletos(LeituraRetornoBradesco::lerArquivo);
        //processador.processar("banco-brasil-1.csv");
        processador.processar("bradesco-1.csv");
    }
}