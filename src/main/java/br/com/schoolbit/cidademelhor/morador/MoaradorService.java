package br.com.schoolbit.cidademelhor.morador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoaradorService {

    @Autowired
    private MoradorRepository moradorRepository;

    public String salvar(MoradorModel moradorModel) {
        moradorRepository.save(moradorModel);

        return "Morador salvo com sucesso";
    }

    public List<MoradorModel> buscarTodos() {
        return moradorRepository.findAll();
    }

    public String deletar(MoradorModel moradorModel) {
        moradorRepository.delete(moradorModel);

        return  "Morador deletado";
    }

    public String atualiza(MoradorModel moradorModel) {
        moradorRepository.save(moradorModel);

        return "Morador atualizado";
    }


}
