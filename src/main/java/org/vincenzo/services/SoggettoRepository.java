package org.vincenzo.services;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.vincenzo.models.Soggetto;

@Repository
public interface SoggettoRepository extends MongoRepository<Soggetto,String> {



}
