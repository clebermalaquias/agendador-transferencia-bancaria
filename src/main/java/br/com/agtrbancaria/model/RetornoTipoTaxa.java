package br.com.agtrbancaria.model;

import br.com.agtrbancaria.enums.TipoTaxa;

public class RetornoTipoTaxa {

    private TipoTaxa[] tipoTaxas;

    public RetornoTipoTaxa(TipoTaxa[] tipoTaxas) {
        this.tipoTaxas = tipoTaxas;
    }

    public TipoTaxa[] getTipoTaxas() {
        return tipoTaxas;
    }
}
