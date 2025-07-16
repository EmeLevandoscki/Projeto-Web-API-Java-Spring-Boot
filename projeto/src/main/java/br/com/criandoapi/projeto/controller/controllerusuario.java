package br.com.criandoapi.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.criandoapi.projeto.DAO.IUsuario;
import br.com.criandoapi.projeto.model.usuario;


@RestController
public class controllerusuario {

    @Autowired IUsuario dao;
    
    @GetMapping("/usuarios")
    public   List<usuario> ListaUsuarios (){
        return (List<usuario>) dao.findAll();
    }
}
