
delete from isports_test.tbl_plano_acesso;
delete from isports_test.tbl_plano;
delete from isports_test.tbl_empresa;
delete from isports_test.tbl_perfil;
delete from isports_test.tbl_usuario;
delete from isports_test.tbl_funcionalidade;


INSERT INTO `isports_test`.`tbl_plano`
(`id_plano`,
`nome`,
`preco`)
VALUES
(1,'Plano Free', 0);

INSERT INTO `isports_test`.`tbl_plano`
(`id_plano`,
`nome`,
`preco`)
VALUES
(2,'Plano Platinum',10.00);

INSERT INTO `isports_test`.`tbl_plano`
(`id_plano`,
`nome`,
`preco`)
VALUES
(3,'Plano Gold',20.00);

INSERT INTO `isports_test`.`tbl_empresa`
(`id_empresa`,
`nome`,
`cnpj`,
`fone`,
`cep`,
`cidade`,
`estado`,
`pais`,
`id_plano`)
VALUES
(1,'HD Sports','61.667.265/0001-32','(51)3220-1717','90460-001','Porto Alegre','RS', 'BR', 1);

INSERT INTO `isports_test`.`tbl_empresa`
(`id_empresa`,
`nome`,
`cnpj`,
`fone`,
`cep`,
`cidade`,
`estado`,
`pais`,
`id_plano`)
VALUES
(2,'Soccer City','31.333.265/0001-55','(51)3226-1618','90450-001','Porto Alegre','RS', 'BR', 2);

INSERT INTO `isports_test`.`tbl_perfil`
(`id_perfil`,
`id_empresa`,
`nome`)
VALUES
(1,2,'Funcionário HD');

INSERT INTO `isports_test`.`tbl_perfil`
(`id_perfil`,
`id_empresa`,
`nome`)
VALUES
(2,2,'Gerente HD');

INSERT INTO `isports_test`.`tbl_perfil`
(`id_perfil`,
`id_empresa`,
`nome`,
`is_admin`)
VALUES
(3,2,'Admin HD', 'S');

INSERT INTO `isports_test`.`tbl_usuario`
(`id_usuario`,
`id_perfil`,
`login`,
`senha`,
`nome`)
VALUES
(1,
1,
'dev01',
'123',
'Eduardo Ceolin ');

INSERT INTO `isports_test`.`tbl_usuario`
(`id_usuario`,
`id_perfil`,
`login`,
`senha`,
`nome`)
VALUES
(2,
2,
'dev02',
'123',
'Eduardo Fernandes ');

INSERT INTO `isports_test`.`tbl_usuario`
(`id_usuario`,
`id_perfil`,
`login`,
`senha`,
`nome`)
VALUES
(3,
3,
'devadmin',
'123',
'Eduardo F. C.');



INSERT INTO `isports_test`.`tbl_funcionalidade`
(`id_funcionalidade`,
`nome`,
`url`, menu_pai)
VALUES
(1,'Gerenciar perfis', '', null);

INSERT INTO `isports_test`.`tbl_funcionalidade`
(`id_funcionalidade`,
`nome`,
`url`, menu_pai)
VALUES
(2,'Listar perfis', 'ListarPerfis', 1);

INSERT INTO `isports_test`.`tbl_funcionalidade`
(`id_funcionalidade`,
`nome`,
`url`, menu_pai)
VALUES
(3,'Cadastrar perfil', 'CadastrarPerfil', 1);


INSERT INTO `isports_test`.`tbl_plano_acesso`
(`id_plano_acesso`,
`id_plano`,
`id_funcionalidade`)
VALUES
(1,
2,
1);

INSERT INTO `isports_test`.`tbl_plano_acesso`
(`id_plano_acesso`,
`id_plano`,
`id_funcionalidade`)
VALUES
(2,
2,
2);

INSERT INTO `isports_test`.`tbl_plano_acesso`
(`id_plano_acesso`,
`id_plano`,
`id_funcionalidade`)
VALUES
(3,
2,
3);