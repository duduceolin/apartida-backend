USE isports_test;

CREATE TABLE tbl_plano(
 id_plano BIGINT AUTO_INCREMENT PRIMARY KEY UNIQUE NOT NULL,
 nome VARCHAR(250) NOT NULL,
 preco DOUBLE NOT NULL
)ENGINE = INNODB;

CREATE TABLE tbl_empresa(
 id_empresa BIGINT AUTO_INCREMENT PRIMARY KEY UNIQUE NOT NULL,
 id_plano BIGINT  NOT NULL,
 nome VARCHAR(250) NOT NULL,
 cnpj  VARCHAR(20) NOT NULL,
 fone VARCHAR(30) NOT NULL,
 cep VARCHAR(20) NOT NULL,
 cidade VARCHAR(200) NOT NULL,
 estado VARCHAR(200) NOT NULL,
 pais VARCHAR(200) NOT NULL,
FOREIGN KEY (id_plano) 
REFERENCES tbl_plano(id_plano)
ON DELETE CASCADE)ENGINE = INNODB;

CREATE TABLE tbl_perfil(
id_perfil BIGINT  AUTO_INCREMENT PRIMARY KEY UNIQUE NOT NULL,
id_empresa BIGINT  NOT NULL,
nome VARCHAR(250) NOT NULL,
is_admin VARCHAR(1) NOT NULL DEFAULT 'N',
FOREIGN KEY (id_empresa) 
REFERENCES tbl_empresa(id_empresa)
ON DELETE CASCADE)ENGINE = INNODB;

CREATE TABLE tbl_usuario(
id_usuario BIGINT AUTO_INCREMENT PRIMARY KEY UNIQUE NOT NULL,
id_perfil BIGINT,
login VARCHAR(20) UNIQUE NOT NULL,
senha VARCHAR(20) NOT NULL,
nome VARCHAR(250) UNIQUE NOT NULL,
FOREIGN KEY (id_perfil) 
REFERENCES tbl_perfil(id_perfil)
ON DELETE CASCADE)ENGINE = INNODB;

CREATE TABLE tbl_funcionalidade(
id_funcionalidade BIGINT AUTO_INCREMENT PRIMARY KEY UNIQUE NOT NULL,
nome VARCHAR(250) NOT NULL,
url VARCHAR(250) NOT NULL,
menu_pai BIGINT)ENGINE = INNODB;

CREATE TABLE tbl_perfil_acesso(
id_perfil_acesso BIGINT AUTO_INCREMENT PRIMARY KEY UNIQUE NOT NULL,
id_perfil BIGINT NOT NULL,
id_funcionalidade BIGINT NOT NULL,
FOREIGN KEY (id_perfil) 
REFERENCES tbl_perfil(id_perfil)
ON DELETE CASCADE,
FOREIGN KEY (id_funcionalidade) 
REFERENCES tbl_funcionalidade(id_funcionalidade)
ON DELETE CASCADE)ENGINE = INNODB;

CREATE TABLE tbl_plano_acesso(
id_plano_acesso BIGINT AUTO_INCREMENT PRIMARY KEY UNIQUE NOT NULL,
id_plano BIGINT NOT NULL,
id_funcionalidade BIGINT NOT NULL,
FOREIGN KEY (id_plano) 
REFERENCES tbl_plano(id_plano)
ON DELETE CASCADE,
FOREIGN KEY (id_funcionalidade) 
REFERENCES tbl_funcionalidade(id_funcionalidade)
ON DELETE CASCADE)ENGINE = INNODB;