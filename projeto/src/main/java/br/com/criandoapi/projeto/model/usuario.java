package br.com.criandoapi.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class usuario {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

     @Column(name = "nome_completo")  
    private String nomeCompleto;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

     public void setNomeCompleto(String nomeCompleto) {
         this.nomeCompleto = nomeCompleto;
     }

     
    @Column(name ="email", length = 50, nullable = true)
    private String email;

    @Column(name ="senha", columnDefinition = "TEXT", nullable = true)
    private String senha;

    @Column(name ="telefone", length = 15, nullable = true)
    private String telefone;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
