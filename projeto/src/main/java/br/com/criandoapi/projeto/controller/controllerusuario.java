package br.com.criandoapi.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 


import br.com.criandoapi.projeto.DAO.IUsuario;
import br.com.criandoapi.projeto.model.usuario;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/usuarios")
public class controllerusuario {

    @Autowired IUsuario dao;
    
    @GetMapping 
    public   List<usuario> ListaUsuarios (){
        return (List<usuario>) dao.findAll();
    }

    @PostMapping
    public usuario criarUsuario (@RequestBody usuario usuariO){
        usuario usuarioNovo = dao.save(usuariO);
        return usuarioNovo;
    }
}
 