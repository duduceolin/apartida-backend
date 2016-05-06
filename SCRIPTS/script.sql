USE isports_test;

CREATE TABLE tbl_empresa(
 id_empresa INT(11) AUTO_INCREMENT PRIMARY KEY NOT NULL,
 nome VARCHAR(250) NOT NULL,
 cnpj  VARCHAR(20) NOT NULL,
 fone VARCHAR(30) NOT NULL,
 cep VARCHAR(20) NOT NULL,
 cidade VARCHAR(200) NOT NULL,
 estado VARCHAR(3) NOT NULL
)ENGINE = INNODB;

CREATE TABLE tbl_perfil(
id_perfil INT(11) AUTO_INCREMENT PRIMARY KEY NOT NULL,
id_empresa INT(11) NOT NULL,
nome VARCHAR(250) NOT NULL,
FOREIGN KEY (id_empresa) 
REFERENCES tbl_empresa(id_empresa)
ON DELETE CASCADE);

CREATE TABLE tbl_usuario(
id_usuario INT(11) AUTO_INCREMENT PRIMARY KEY NOT NULL,
id_perfil INT(11),
login VARCHAR(20) NOT NULL,
senha VARCHAR(20) NOT NULL,
nome VARCHAR(250) NOT NULL,
admin VARCHAR(1) NOT NULL DEFAULT 'N',
FOREIGN KEY (id_perfil) 
REFERENCES tbl_perfil(id_perfil)
ON DELETE CASCADE);

CREATE TABLE tbl_funcionalidade(
id_funcionalidade INT(11) AUTO_INCREMENT PRIMARY KEY NOT NULL,
nome VARCHAR(250) NOT NULL);

CREATE TABLE tbl_perfil_acesso(
id_perfil INT(11) NOT NULL,
id_funcionalidade INT(11) NOT NULL,
FOREIGN KEY (id_perfil) 
REFERENCES tbl_perfil(id_perfil)
ON DELETE CASCADE,
FOREIGN KEY (id_funcionalidade) 
REFERENCES tbl_funcionalidade(id_funcionalidade)
ON DELETE CASCADE);
