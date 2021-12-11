package com.citasms.citas_ms.repositories;
import com.citasms.citas_ms.models.Cita;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CitaRepository extends MongoRepository<Cita, String> {
    List <Cita> getByProfesionalId(String profesionalId);


}
