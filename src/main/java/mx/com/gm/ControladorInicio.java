package mx.com.gm;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {
        var mensaje = "Hola mundo con thymeleaf";
        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("juan@mail.com");
        persona.setTelefono("123456789");

        var persona2 = new Persona();
        persona2.setNombre("Luis");
        persona2.setApellido("Calle");
        persona2.setEmail("luis@mail.com");
        persona2.setTelefono("0987654321");

        var personas = Arrays.asList();

        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("personas", personas);

        log.info("ejecutando controlador Spring MVC");
        return "index";
    }

}
