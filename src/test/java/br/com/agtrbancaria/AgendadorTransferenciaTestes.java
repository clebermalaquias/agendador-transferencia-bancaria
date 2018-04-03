package br.com.agtrbancaria;


import br.com.agtrbancaria.enums.TipoTaxa;
import br.com.agtrbancaria.model.Transferencia;
import br.com.agtrbancaria.service.TransferenciaService;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class AgendadorTransferenciaTestes {


    @Test
    public void criarTransferenciaService(){

        TransferenciaService transferenciaService = new TransferenciaService();

        Transferencia transferencia = new Transferencia();
        transferencia.setValor(new BigDecimal("100.00"));
        transferencia.setContaOrigem("12345-6");
        transferencia.setContaDestino("65432-1");
        transferencia.setDataTransferencia(LocalDate.now());
        transferencia.setTipo(TipoTaxa.A);

        transferenciaService.novaTransferencia(transferencia);
        assertNotNull(transferenciaService.obterTransferencias());
        assertTrue("A lista de transferencia tem que ter 1 elemento",transferenciaService.obterTransferencias().size()==1);

    }

    @Test
    public void criarTransferenciaServiceRetorno(){

        TransferenciaService transferenciaServiceImpl = new TransferenciaService();

        Transferencia transferencia = new Transferencia();
        transferencia.setValor(new BigDecimal("100.00"));
        transferencia.setContaOrigem("12345-6");
        transferencia.setContaDestino("65432-1");
        transferencia.setDataTransferencia(LocalDate.now());
        transferencia.setTipo(TipoTaxa.A);
        assertNotNull(transferenciaServiceImpl.novaTransferencia(transferencia));
        assertEquals("A chamada do metodo tem que retorna uma mensagem sucesso","Sucesso",transferenciaServiceImpl.novaTransferencia(transferencia).getMensagem());

    }
}
