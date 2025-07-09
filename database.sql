

CREATE TABLE IF NOT EXISTS usuario (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    nome_completo VARCHAR(200) NOT NULL,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    senha TEXT NOT NULL,
    telefone VARCHAR(20) NOT NULL
);


insert into usuario (nome_completo, username, email, senha, telefone) 
VALUES ('João da Silva', 'joao123', 'joao@example.com', 'senha_secreta', 987654321);


select * from usuario;