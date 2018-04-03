package br.com.agtrbancaria.interfaces;

import br.com.agtrbancaria.model.Transferencia;

import java.math.BigDecimal;

public interface Taxavel {

    BigDecimal calcularTaxa(Transferencia transferencia);
}
