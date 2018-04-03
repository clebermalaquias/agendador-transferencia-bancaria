package br.com.agtrbancaria.model;

import br.com.agtrbancaria.enums.TipoTaxa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transferencia implements Serializable {

    private Long id;
    private LocalDate dataCadastro = LocalDate.now();
    private LocalDate dataTransferencia;
    private String contaDestino;
    private String contaOrigem;
    private BigDecimal valor;
    private BigDecimal taxa;
    private TipoTaxa tipo;


    public Transferencia() {

    }


    @Override
    public String toString() {
        return "Transferencia{" +
                "id=" + id +
                ", dataCadastro=" + dataCadastro +
                ", dataTransferencia=" + dataTransferencia +
                ", contaDestino='" + contaDestino + '\'' +
                ", contaOrigem='" + contaOrigem + '\'' +
                ", valor=" + valor +
                ", taxa=" + taxa +
                ", tipo=" + tipo +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataTransferencia() {
        return dataTransferencia;
    }


    public String getDataCadastroFormatada(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         return dataCadastro.format(formatter);
    }
    public String getDataTransferenciaFormatada(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataTransferencia.format(formatter);
    }

    public void setDataTransferencia(LocalDate dataTransferencia) {
        this.dataTransferencia = dataTransferencia;
    }

    public String getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(String contaDestino) {
        this.contaDestino = contaDestino;
    }

    public String getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(String contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getTaxa() {
        return taxa;
    }

    public void setTaxa(BigDecimal taxa) {
        this.taxa = taxa;
    }

    public TipoTaxa getTipo() {
        return tipo;
    }

    public void setTipo(TipoTaxa tipo) {
        this.tipo = tipo;
    }
}
