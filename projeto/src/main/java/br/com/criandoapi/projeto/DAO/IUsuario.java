package br.com.criandoapi.projeto.DAO;

import org.springframework.data.repository.CrudRepository;
import br.com.criandoapi.projeto.model.usuario;

public interface IUsuario extends CrudRepository<usuario,Integer> {
    
}
