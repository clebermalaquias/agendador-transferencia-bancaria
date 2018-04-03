package br.com.agtrbancaria.calculotaxa;

import br.com.agtrbancaria.interfaces.Taxavel;
import br.com.agtrbancaria.model.Transferencia;

import java.math.BigDecimal;


public class TaxaD implements Taxavel {

    /**
     * Operações do tipo D tem a taxa igual a A, B ou C dependendo do valor da  transferência.
         Valores até $25.000 seguem a taxação tipo A
         Valores de $25.001 até $120.000 seguem a taxação tipo B
         Valores maiores que $120.000 seguem a taxação tipo C
     */
    @Override
    public BigDecimal calcularTaxa(Transferencia transferencia) {

        Taxavel taxavel = null;


        if (transferencia.getValor().compareTo(new BigDecimal("25000.00")) <= 0) {

            taxavel = new TaxaA();

        }else if (transferencia.getValor().compareTo(new BigDecimal("25000.00")) > 0 &&
                  transferencia.getValor().compareTo(new BigDecimal("120000.00")) <= 0) {

            taxavel = new TaxaB();

        }else {

            taxavel = new TaxaC();

        }

        return taxavel.calcularTaxa(transferencia);
    }



}
