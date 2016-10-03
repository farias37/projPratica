create table usuarioCadastro
(
CodUsuario int primary key,
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
dataNascimento datetime not null,
categoriaPlano varchar(100) not null,
formaPagamento varchar(100) not null,
)

Create table produto
(
codProduto int primary key,
preco varchar(20)
)

Create table ingresso
(
codProduto int primary key,
preco varchar(20) not null,
assento varchar(4) not null,
)

Create table camiseta
(
codProduto int primary key,
preco varchar(20) not null,
tamanho char(2) not null
)

Create table colecionaveis
(
codProduto int primary key,
preco varchar(20) not null
)

select * from usuarioCadastro
select * from produto
select * from ingresso
select * from camiseta
select * from colecionaveis

insert into usuarioCadastro values('15171', 'farias37', 'senha', 'Gabriel', 'Rua X', '270-720-8', '16', '13080', 'gafarias@gmail.com', 'Campinas',
'SP', '12-02-2000', 'Ouro', 'Boleto')

