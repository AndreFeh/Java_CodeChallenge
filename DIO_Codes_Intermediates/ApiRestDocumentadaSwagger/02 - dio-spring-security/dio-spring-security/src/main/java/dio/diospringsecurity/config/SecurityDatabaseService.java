package dio.diospringsecurity.config;

import dio.diospringsecurity.entity.User;
import dio.diospringsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class SecurityDatabaseService  implements UserDetailsService { /*retorna a implementação de Spring Security*/
    @Autowired
    private UserRepository userRepository; // como o Repositorio tem a JPA Repository, ja tem os metodos implementados
    @Override
    public UserDetails loadUserByUsername(String username) {
        User userEntity = userRepository.findByUsername(username); /*retorna um usuario atraves de seu username*/
        if (userEntity == null) {
            throw new UsernameNotFoundException(username);
        }
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();    //Gerado atraves do Username
        userEntity.getRoles().forEach(role -> {                                 //Vincula o Username com a Role para Segurança
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
        });
        UserDetails user = new org.springframework.security.core.userdetails.User(userEntity.getUsername(),
                userEntity.getPassword(),
                authorities);
        return user;
    }
}
