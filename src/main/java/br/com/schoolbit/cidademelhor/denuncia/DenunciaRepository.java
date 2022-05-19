package br.com.schoolbit.cidademelhor.denuncia;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DenunciaRepository extends MongoRepository<DenunciaModel, String> {

}
