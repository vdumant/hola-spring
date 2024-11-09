package mx.com.gm.dao;

import java.util.UUID;
import mx.com.gm.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, UUID> {

    Usuario findByUsername(String username);
}
