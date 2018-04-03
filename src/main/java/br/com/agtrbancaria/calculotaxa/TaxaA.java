package br.com.agtrbancaria.calculotaxa;

import br.com.agtrbancaria.interfaces.Taxavel;
import br.com.agtrbancaria.model.Transferencia;

import java.math.BigDecimal;


public class TaxaA implements Taxavel {

    /**
     *  Operações do tipo A tem uma taxa de $2 mais 3% do valor da transferência
     */
    @Override
    public BigDecimal calcularTaxa(Transferencia transferencia) {
        BigDecimal valorTotalPorcentage = transferencia.getValor().divide(new BigDecimal("100")).multiply(new BigDecimal("3"));

        return valorTotalPorcentage.add(new BigDecimal("2"));
    }
}
