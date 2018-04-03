package br.com.agtrbancaria.taxa;

import br.com.agtrbancaria.AgendadorTransferenciaUtilTeste;
import br.com.agtrbancaria.calculotaxa.TaxaD;
import br.com.agtrbancaria.model.Transferencia;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class AgendadorTransferenciaTaxaDTeste {


    @Test
    public  void testeTaxaDValorAte25000(){
        TaxaD taxaD = new TaxaD();
        LocalDate data = LocalDate.now();
        Transferencia transferencia = AgendadorTransferenciaUtilTeste.criaTransferencia(data,new BigDecimal("25000.00"));
        assertTrue("TaxaD com Valor até 25.000.00 taxa tem que ser igual a TaxaA( 3% + 2.00) que é 752.00",new BigDecimal("752.00").compareTo(taxaD.calcularTaxa(transferencia))==0);
    }


    @Test
    public  void testeTaxaDValor25001(){
        TaxaD taxaD = new TaxaD();
        LocalDate data = LocalDate.now();
        Transferencia transferencia = AgendadorTransferenciaUtilTeste.criaTransferencia(data,new BigDecimal("25000.01"));
        assertTrue("TaxaD com Valor até 25.001 taxa tem que ser igual a TaxaB( 10.00 ) que é 10.00",new BigDecimal("10.00").compareTo(taxaD.calcularTaxa(transferencia))==0);
    }


    @Test
    public  void testeTaxaDValor120000(){
        TaxaD taxaD = new TaxaD();
        LocalDate data = LocalDate.now();
        Transferencia transferencia = AgendadorTransferenciaUtilTeste.criaTransferencia(data,new BigDecimal("120000.00"));
        assertTrue("TaxaD com Valor até 120.000 taxa tem que ser igual a TaxaB( 10.00 ) que é 10.00",new BigDecimal("10.00").compareTo(taxaD.calcularTaxa(transferencia))==0);
    }

    @Test
    public  void testeTaxaDValorMaiorQue120000(){
        TaxaD taxaD = new TaxaD();
        LocalDate data = LocalDate.now();
        Transferencia transferencia = AgendadorTransferenciaUtilTeste.criaTransferencia(data,new BigDecimal("200000.00"));
        assertTrue("TaxaD com Valor maior 120.000 taxa tem que ser igual a TaxaC( %8.30 ) que é 16600.00",new BigDecimal("16600.00").compareTo(taxaD.calcularTaxa(transferencia))==0);
        System.out.println(taxaD.calcularTaxa(transferencia));
    }
}
