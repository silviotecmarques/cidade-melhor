package br.com.schoolbit.cidademelhor.denuncia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/denuncias")
public class DenunciaController {

    @Autowired
    private DenunciaService denunciaService;

    @PostMapping
    public String salvarDenuncia(@RequestBody DenunciaModel denunciaModel) {
        return denunciaService.salvar(denunciaModel);
    }

    @GetMapping
    public List<DenunciaModel> buscarTodos() {
        return denunciaService.buscarTodos();
    }
}
