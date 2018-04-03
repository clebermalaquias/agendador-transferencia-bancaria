package br.com.agtrbancaria.service;

import br.com.agtrbancaria.enums.TipoTaxa;
import br.com.agtrbancaria.model.RetornoTransferencia;
import br.com.agtrbancaria.model.Transferencia;
import br.com.agtrbancaria.repository.TransferenciaRepository;

import java.math.BigDecimal;
import java.util.List;

public class TransferenciaService {

    private TransferenciaRepository transferenciaRepository = new TransferenciaRepository();

    public RetornoTransferencia novaTransferencia(Transferencia transferencia) {

        RetornoTransferencia retornoTransferencia = new RetornoTransferencia();

        try {

            BigDecimal taxaCalculada = transferencia.getTipo().getTaxa().calcularTaxa(transferencia);
            transferencia.setTaxa(taxaCalculada);
            transferenciaRepository.novaTransferencia(transferencia);
            retornoTransferencia.setCodigoRetorno(200);
            retornoTransferencia.setMensagem("Sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            retornoTransferencia.setCodigoRetorno(500);
            retornoTransferencia.setMensagem("Falha ao efeturar nova transferencia");
        }

        return retornoTransferencia;
    }


    public List<Transferencia> obterTransferencias(){
        return transferenciaRepository.obterTransferencias();
    }


    public TipoTaxa[] listarTipoTaxa() {
        return TipoTaxa.values();
    }
}
