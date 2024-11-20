package dio.diospringsecurity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController { // Niveis de Visibilidade
    @GetMapping
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }

//    EM VEZ DE ATRIBUIR @PREAUTHORIZE, DEFINIR NO WebConfig --> HttpSecurity
    @GetMapping("/users")
    /*@PreAuthorize("hasAnyRole('MANAGERS','USERS')") // Verificar se esta alinhado com WEB CONFIG*/
    public String users() {
        return "Authorized user";
    }
    @GetMapping("/managers")
    /*@PreAuthorize("hasRole('MANAGERS')") // Verificar se esta alinhado com WEB CONFIG*/
    public String managers() {
        return "Authorized manager";
    }
}
