package com.one.innovation.digital.web.api.repository;

import com.one.innovation.digital.web.api.model.UsuarioModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository{ /*Os dados de Save Delete Update, ja sao proprios da JPA REPOSITORY, mas para estudo, fazer manual*/
    public void save(UsuarioModel usuario){
        if (usuario.getId()==null) // SE USUARIO = INEXISTENTE SALVA! SENAO ATUALIZA
            System.out.println("SAVE - Recebendo usuario na camada repositorio");
        else
            System.out.println("UPDATE - Recebendo usuario na camada repositorio");
        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuario"));
        System.out.println(id);
    }

    public List<UsuarioModel> findAll(){//busca todos os ID de Usuarios
        System.out.println("LIST - listando os usuarios do sistema");
        List<UsuarioModel> usuarios = new ArrayList<>();
        usuarios.add(new UsuarioModel("andre", "admin"));
        usuarios.add(new UsuarioModel("vinicius", "souFeio"));
        return usuarios;
    }

    public UsuarioModel findById(Integer id){//Busca especifica de dados
        System.out.println(String.format("FIND/Id - Buscando Usuario especifico... Id: %d para localizar usuario no banco"));
        return new UsuarioModel("andre", "admin");
    }

    public UsuarioModel findByUsername (String username){
        System.out.println("FIND/username - Recebendo username especifico... Username: %s para localizar usuario em sistema");
        return new UsuarioModel("andre", "admin");
    }
}
