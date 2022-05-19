package br.com.schoolbit.cidademelhor.morador;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "moradores")
public class MoradorModel {

    @Id
    private String id;

    private String nome;
    private String foto;
    private String telefone;
    private String email;
}
