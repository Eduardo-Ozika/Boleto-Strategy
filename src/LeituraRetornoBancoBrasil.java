import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LeituraRetornoBancoBrasil {
    public static List<Boleto> lerArquivo(final String caminhoArquivo) {
        try {
            List<String> linhas = Files.readAllLines(Path.of(caminhoArquivo));
            var boletos = new ArrayList<Boleto>(linhas.size());
            for (String linha : linhas) {
                String[] vetor = linha.split(";");
                var boleto = new Boleto();
                boleto.setId(Integer.parseInt(vetor[0]));
                boleto.setCodBanco(vetor[1]);
                boleto.setDataVencimento(LocalDate.parse(vetor[2], ProcessarBoletos.FORMATO_DATA));
                boleto.setDataPagamento(LocalDate.parse(vetor[3], ProcessarBoletos.FORMATO_DATA).atStartOfDay());
                boleto.setCpfCliente(vetor[4]);
                boleto.setValor(Double.parseDouble(vetor[5]));
                boleto.setJuros(Double.parseDouble(vetor[6]));
                boleto.setMulta(Double.parseDouble(vetor[7]));
                boletos.add(boleto);//adicionando
            }
            return boletos;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
