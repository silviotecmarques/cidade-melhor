package br.com.schoolbit.cidademelhor.morador;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoradorRepository extends MongoRepository<MoradorModel, String> {
}
