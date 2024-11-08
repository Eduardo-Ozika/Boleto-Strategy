import java.time.LocalDate;
import java.time.LocalDateTime;

public class Boleto {
    int id;
    String codBanco, cpfCliente, agencia, contaBancaria;
    double valor, multa, juros;
    LocalDate dataVencimento;
    LocalDateTime dataPagamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "id=" + id +
                ", codBanco='" + codBanco + '\'' +
                ", cpfCliente='" + cpfCliente + '\'' +
                ", agencia='" + agencia + '\'' +
                ", contaBancaria='" + contaBancaria + '\'' +
                ", valor=" + valor +
                ", multa=" + multa +
                ", juros=" + juros +
                ", dataVencimento=" + dataVencimento +
                ", dataPagamento=" + dataPagamento +
                '}';
    }
}
