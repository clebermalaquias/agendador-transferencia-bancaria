package br.com.agtrbancaria.taxa;

import br.com.agtrbancaria.calculotaxa.TaxaA;
import br.com.agtrbancaria.model.Transferencia;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class AgendadorTransferenciaTaxaATeste {

    @Test
    public void testeTaxaA(){
        TaxaA taxaA = new TaxaA();
        assertTrue("TaxaA Valor 1000 taxa tem que ser igual a 32",new BigDecimal(32.00).compareTo(taxaA.calcularTaxa(criarTransferecnia()))==0);
    }


        public Transferencia criarTransferecnia(){

            Transferencia transferencia = new Transferencia();
            transferencia.setContaDestino("10010-9");
            transferencia.setContaOrigem("30100-4");
            transferencia.setDataCadastro(LocalDate.now());
            transferencia.setDataTransferencia(LocalDate.now());
            transferencia.setValor(new BigDecimal(1000.00));

            return transferencia;
        }

}
