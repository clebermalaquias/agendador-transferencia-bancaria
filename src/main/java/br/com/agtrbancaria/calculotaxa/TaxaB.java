package br.com.agtrbancaria.calculotaxa;

import br.com.agtrbancaria.interfaces.Taxavel;
import br.com.agtrbancaria.model.Transferencia;

import java.math.BigDecimal;
import java.time.temporal.ChronoUnit;


public class TaxaB implements Taxavel {

    /**
     * B: Operações do tipo B tem uma taxa de:
     *     $10 para pedidos com agendamento até 30 dias da data de cadastro
     *     $8 para os demais
     */
    @Override
    public BigDecimal calcularTaxa(Transferencia transferencia) {

       long diferencaDias = ChronoUnit.DAYS.between(transferencia.getDataCadastro(),transferencia.getDataTransferencia());

        if(diferencaDias <= 30L) {
            return new BigDecimal("10.00");
        } else {
            return new BigDecimal("8.00");
        }

    }
}
