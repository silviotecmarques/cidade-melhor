package br.com.schoolbit.cidademelhor.denuncia;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "denuncias")
public class DenunciaModel {

    @Id
    private String id;

    private String morador;
    private Midia midia;
    private String data;
    private String descricao;
    private String bairro;
    private String numero;


}
