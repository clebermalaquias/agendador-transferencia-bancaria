package br.com.agtrbancaria.calculotaxa;

import br.com.agtrbancaria.interfaces.Taxavel;
import br.com.agtrbancaria.model.Transferencia;

import java.math.BigDecimal;
import java.time.temporal.ChronoUnit;


public class TaxaC implements Taxavel {


    /**
     * C: Operações do tipo C tem uma taxa regressiva conforme a data de agendamento:

     maior que 30 dias da data de cadastro ­ 1.2%

     até 30 dias da data de cadastro ­ 2.1%

     até 25 dias da data de cadastro ­ 4.3%

     até 20 dias da data de cadastro ­ 5.4%

     até 15 dias da data de cadastro ­ 6.7%

     até 10 dias da data de cadastro ­ 7.4%

     até 5 dias da data de cadastro ­ 8.3%
     */
    @Override
     public BigDecimal calcularTaxa(Transferencia transferencia) {


        long diferencaDias = ChronoUnit.DAYS.between(transferencia.getDataCadastro(),transferencia.getDataTransferencia());
        BigDecimal taxa = null;

        if(diferencaDias <= 5){
            taxa = new BigDecimal("8.3");
        }else if (diferencaDias <= 10){
            taxa = new BigDecimal("7.4");
        }else if (diferencaDias <= 15){
            taxa = new BigDecimal("6.7");
        }else if (diferencaDias <= 20){
            taxa = new BigDecimal("5.4");
        }else if (diferencaDias <= 25){
            taxa = new BigDecimal("4.3");
        }else if (diferencaDias <= 30){
            taxa = new BigDecimal("2.1");
        }else{
            taxa = new BigDecimal("1.2");
        }


        return transferencia.getValor().divide(new BigDecimal("100")).multiply(taxa);
    }
}
