package br.com.schoolbit.cidademelhor.morador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moradores")
public class MoradorController {

    @Autowired
    private MoaradorService moaradorService;

    @PostMapping
    private String salvarMorador(@RequestBody MoradorModel moradorModel) {
        return moaradorService.salvar(moradorModel);
    }

    @GetMapping
    private List<MoradorModel> buscarTodos() {
        return moaradorService.buscarTodos();
    }

    @DeleteMapping
    private String deletarMorador(@RequestBody MoradorModel moradorModel) {
       return moaradorService.deletar(moradorModel);
    }

    @PutMapping
    private String atualizaMorador(@RequestBody MoradorModel moradorModel) {
        return moaradorService.atualiza(moradorModel);
    }
}
