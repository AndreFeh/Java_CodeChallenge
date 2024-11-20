package com.one.innovation.digital.web.api.controller;

import com.one.innovation.digital.web.api.model.UsuarioModel;
import com.one.innovation.digital.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
//    O controller so serve como ponte entre o Repositorio e a Aplicação
//    Para regras de negocio, é indicado a camada USUARIO_SERVICE
    @Autowired
    UserRepository userRepo; //Logicas de negocio

    @GetMapping // GET ALL
    public List<UsuarioModel> getUsers(){
        return userRepo.findAll();
    }

    @GetMapping("{username}") // Busca por Nome
    public UsuarioModel getOne(@PathVariable("username")String username){
        return userRepo.findByUsername(username);
    }

    @GetMapping("{id}") // Busca por Id
    public UsuarioModel getId(@PathVariable("id") Integer id){
        return userRepo.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        userRepo.deleteById(id);
    }

    @PostMapping
    public void postUser(UsuarioModel usuario){
        userRepo.save(usuario);
    }
}
