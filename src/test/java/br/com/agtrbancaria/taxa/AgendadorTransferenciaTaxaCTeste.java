package br.com.agtrbancaria.taxa;

import br.com.agtrbancaria.AgendadorTransferenciaUtilTeste;
import br.com.agtrbancaria.calculotaxa.TaxaC;
import br.com.agtrbancaria.model.Transferencia;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class AgendadorTransferenciaTaxaCTeste {


    @Test
    public  void testeTaxaCdataMaiorQueTrintaDias(){
        TaxaC taxaC = new TaxaC();
        LocalDate data = LocalDate.now().plusDays(40);
        Transferencia transferencia = AgendadorTransferenciaUtilTeste.criaTransferencia(data,new BigDecimal("100.00"));
        assertTrue("TaxaC com data Transferencia 40 dias e Valor 100.00 taxa tem que ser igual a 1.20",new BigDecimal("1.20").compareTo(taxaC.calcularTaxa(transferencia))==0);
    }

    @Test
    public  void testeTaxaCdataAteTrintaDias(){
        TaxaC taxaC = new TaxaC();
        LocalDate data = LocalDate.now().plusDays(30);
        Transferencia transferencia = AgendadorTransferenciaUtilTeste.criaTransferencia(data,new BigDecimal("100.00"));
        assertTrue("TaxaC com data Transferencia 30 dias e Valor 100.00 taxa tem que ser igual a 2.10",new BigDecimal("2.10").compareTo(taxaC.calcularTaxa(transferencia))==0);
    }


    @Test
    public  void testeTaxaCdataAteVinteCincoDias(){
        TaxaC taxaC = new TaxaC();
        LocalDate data = LocalDate.now().plusDays(25);
        Transferencia transferencia = AgendadorTransferenciaUtilTeste.criaTransferencia(data,new BigDecimal("100.00"));
        assertTrue("TaxaC com data Transferencia 25 dias e Valor 100.00 taxa tem que ser igual a 4.30",new BigDecimal("4.30").compareTo(taxaC.calcularTaxa(transferencia))==0);
    }

    @Test
    public  void testeTaxaCdataAteVinteDias(){
        TaxaC taxaC = new TaxaC();
        LocalDate data = LocalDate.now().plusDays(20);
        Transferencia transferencia = AgendadorTransferenciaUtilTeste.criaTransferencia(data,new BigDecimal("100.00"));
        assertTrue("TaxaC com data Transferencia 20 dias e Valor 100.00 taxa tem que ser igual a 5.40",new BigDecimal("5.40").compareTo(taxaC.calcularTaxa(transferencia))==0);
    }

    @Test
    public  void testeTaxaCdataAteQuinzeDias(){
        TaxaC taxaC = new TaxaC();
        LocalDate data = LocalDate.now().plusDays(15);
        Transferencia transferencia = AgendadorTransferenciaUtilTeste.criaTransferencia(data,new BigDecimal("100.00"));
        assertTrue("TaxaC com data Transferencia 15 dias e Valor 100.00 taxa tem que ser igual a 6.70",new BigDecimal("6.70").compareTo(taxaC.calcularTaxa(transferencia))==0);
    }


    @Test
    public  void testeTaxaCdataAteDezDias(){
        TaxaC taxaC = new TaxaC();
        LocalDate data = LocalDate.now().plusDays(10);
        Transferencia transferencia = AgendadorTransferenciaUtilTeste.criaTransferencia(data,new BigDecimal("100.00"));
        assertTrue("TaxaC com data Transferencia 10 dias e Valor 100.00 taxa tem que ser igual a 7.40",new BigDecimal("7.40").compareTo(taxaC.calcularTaxa(transferencia))==0);
    }

    @Test
    public  void testeTaxaCdataAteCincoDias(){
        TaxaC taxaC = new TaxaC();
        LocalDate data = LocalDate.now().plusDays(5);
        Transferencia transferencia = AgendadorTransferenciaUtilTeste.criaTransferencia(data,new BigDecimal("100.00"));
        assertTrue("TaxaC com data Transferencia 05 dias e Valor 100.00 taxa tem que ser igual a 8.30",new BigDecimal("8.30").compareTo(taxaC.calcularTaxa(transferencia))==0);
    }
}
