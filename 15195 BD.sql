create table usuarioCadastro
(
CodUsuario int primary key identity (1,1),
login varchar(20) not null,
senha varchar(20) not null,
Nome varchar(100) not null,
endereco varchar(100) not null,
RG varchar(20) not null,
idade varchar(3) not null,
CPF varchar(20) not null,
email varchar(100) not null,
cidade varchar(100) not null,
UF char(2) not null,
dataNascimento varchar not null,
categoriaPlano varchar(100) not null,
telefone varchar(20) not null,
)

Select * from usuarioCadastro
drop table usuarioCadastro

create table produto
(
codProduto int primary key identity,
nome varchar(50) not null,
preco money not null,
descricao ntext not null,
endImagem varchar(100) not null,
endImagem2 varchar(100) not null
)

select * from produto
drop table produto