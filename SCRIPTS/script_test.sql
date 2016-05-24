

INSERT INTO `isports_test`.`tbl_plano`
(`id_plano`,
`nome`,
`preco`)
VALUES
(1,'Plano Free',10.00);

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
(1,'Empresa teste','cnpjtest','123123','123123123','poa',
'RS', 'BR', 1);

INSERT INTO `isports_test`.`tbl_perfil`
(
`id_empresa`,
`nome`)
VALUES
(1,'Perfil Funcionário Empresa Test');


INSERT INTO `isports_test`.`tbl_usuario`
(`id_usuario`,
`id_perfil`,
`login`,
`senha`,
`nome`,
`admin`)
VALUES
(1,
1,
'duduceolin',
'123123',
'Eduardo ',
1);


INSERT INTO `isports_test`.`tbl_funcionalidade`
(`id_funcionalidade`,
`nome`,
`url`)
VALUES
(1,'funcionalidade 01', 'lalalal');
