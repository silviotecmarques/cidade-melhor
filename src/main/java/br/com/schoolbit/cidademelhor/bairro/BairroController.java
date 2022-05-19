package br.com.schoolbit.cidademelhor.bairro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bairros")
public class BairroController {

    @Autowired
    private BairroService bairroService;

    @PostMapping
    //@ResponseStatus(HttpStatus.CREATED)
    public String salvarBairro(@RequestBody BairroModel bairroModel) {
        return bairroService.salvar(bairroModel);
    }

    @GetMapping
    public List<BairroModel> buscarTodos() {
        return bairroService.buscarTodos();
    }

    @DeleteMapping
    public void deletaTodos() {
         bairroService.deletaTodos();
    }
}