package br.com.agtrbancaria;


import br.com.agtrbancaria.model.Transferencia;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AgendadorTransferenciaUtilTeste {

    public static Transferencia criaTransferencia(LocalDate dataTransferencia, BigDecimal valor){

        Transferencia transferencia = new Transferencia();
        transferencia.setContaDestino("10010-9");
        transferencia.setContaOrigem("30100-4");
        transferencia.setDataCadastro(LocalDate.now());
        transferencia.setDataTransferencia(dataTransferencia);
        transferencia.setValor(valor);

        return transferencia;
    }
}
