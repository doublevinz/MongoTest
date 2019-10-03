package org.vincenzo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vincenzo.models.Soggetto;
import org.vincenzo.models.SoggettoDTO;
import java.time.ZoneId;
import java.util.Date;

@Service
public class SoggettoService {

    @Autowired
    SoggettoRepository soggettoRepository;

    public Soggetto save(SoggettoDTO soggettoDTO){
        Soggetto soggetto= new Soggetto();

        soggetto.setCode(soggettoDTO.getCode());
        soggetto.setFullName(soggettoDTO.getFullname());
        Date data = Date.from(soggettoDTO.getStarterDate().atStartOfDay(ZoneId.of("Europe/Rome")).toInstant());
        soggetto.setStarterDate(data);

        return soggettoRepository.insert(soggetto);
    }

}