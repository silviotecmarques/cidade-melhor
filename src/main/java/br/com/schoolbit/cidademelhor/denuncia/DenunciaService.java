package br.com.schoolbit.cidademelhor.denuncia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DenunciaService {

    @Autowired
    private DenunciaRepository denunciaRepository;

    public String salvar(DenunciaModel denunciaModel) {
        denunciaRepository.save(denunciaModel);
        return "Denúncia salva com sucesso";
    }

    public List<DenunciaModel> buscarTodos() {
        return denunciaRepository.findAll();
    }
}
