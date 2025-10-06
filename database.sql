

CREATE TABLE IF NOT EXISTS usuario (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    nome_completo VARCHAR(200) NOT NULL,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    senha TEXT NOT NULL,
    telefone VARCHAR(20) NOT NULL
);


INSERT INTO usuario (nome_completo, username, email, senha, telefone)
VALUES
('João da Silva', 'joao123', 'joao.silva@example.com', 'senha123', '1234567890'),
('Maria Oliveira', 'maria456', 'maria.oliveira@example.com', 'senha456', '0987654321'),
('Carlos Souza', 'carlos789', 'carlos.souza@example.com', 'senha789', '1122334455'),
('Ana Pereira', 'ana321', 'ana.pereira@example.com', 'senha321', '2233445566'),
('Roberto Costa', 'roberto654', 'roberto.costa@example.com', 'senha654', '3344556677'),
('Patrícia Lima', 'patricia987', 'patricia.lima@example.com', 'senha987', '4455667788'),
('Felipe Rocha', 'felipe135', 'felipe.rocha@example.com', 'senha135', '5566778899'),
('Juliana Martins', 'juliana246', 'juliana.martins@example.com', 'senha246', '6677889900'),
('Rafael Mendes', 'rafael369', 'rafael.mendes@example.com', 'senha369', '7788990011');

 

ALTER TABLE usuario MODIFY username VARCHAR(255) NULL;



select * from usuario;
