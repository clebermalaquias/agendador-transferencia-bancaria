package br.com.agtrbancaria.enums;


import br.com.agtrbancaria.interfaces.Taxavel;
import br.com.agtrbancaria.calculotaxa.TaxaA;
import br.com.agtrbancaria.calculotaxa.TaxaB;
import br.com.agtrbancaria.calculotaxa.TaxaC;
import br.com.agtrbancaria.calculotaxa.TaxaD;

public enum TipoTaxa {
    A(new TaxaA()),
    B(new TaxaB()),
    C(new TaxaC()),
    D(new TaxaD());

    private Taxavel taxa;

    private TipoTaxa(Taxavel taxa){
        this.taxa = taxa;
    }

    public Taxavel getTaxa() {
        return taxa;
    }

}
