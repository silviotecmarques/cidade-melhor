package br.com.schoolbit.cidademelhor.bairro;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "bairros")
public class BairroModel {

    @Id
    private String id;

    private String nomeBairro;
    private String nomeRua;
    private Endereco endereco;

}