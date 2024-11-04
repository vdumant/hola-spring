package mx.com.gm.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import lombok.Data;
import java.util.UUID;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idPersona;

    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    @Email
    private String email;

    private String telefono;
}
