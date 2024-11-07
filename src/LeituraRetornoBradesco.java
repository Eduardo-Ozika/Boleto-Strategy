import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LeituraRetornoBradesco{
    public static List<Boleto> lerArquivo(String caminhoArquivo) {
        try {
            List<String> linhas = Files.readAllLines(Path.of(caminhoArquivo));
            var boletos = new ArrayList<Boleto>(linhas.size());
            for (String linha : linhas) {
                String[] vetor = linha.split(";");
                var boleto = new Boleto();
                boleto.setId(Integer.parseInt(vetor[0]));
                boleto.setCodBanco(vetor[1]);
                boleto.setAgencia(vetor[2]);
                boleto.setContaBancaria(vetor[3]);
                boleto.setDataVencimento(LocalDate.parse(vetor[4], ProcessarBoletos.FORMATO_DATA));
                boleto.setDataPagamento(LocalDateTime.parse(vetor[5], ProcessarBoletos.FORMATO_DATA_HORA));
                boleto.setCpfCliente(vetor[6]);
                boleto.setValor(Double.parseDouble(vetor[7]));
                boleto.setJuros(Double.parseDouble(vetor[8]));
                boleto.setMulta(Double.parseDouble(vetor[9]));
                boletos.add(boleto);//adicionando
            }
            return boletos;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
