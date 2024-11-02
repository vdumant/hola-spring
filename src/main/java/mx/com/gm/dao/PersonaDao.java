package mx.com.gm.dao;

import mx.com.gm.domain.Persona;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface PersonaDao extends CrudRepository<Persona, UUID> {

}
