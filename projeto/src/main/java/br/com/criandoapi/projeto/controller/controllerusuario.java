package br.com.criandoapi.projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controllerusuario {
    
    @GetMapping("/usuarios")
    public  String texto (){
        return "Hello World";
    }
}
