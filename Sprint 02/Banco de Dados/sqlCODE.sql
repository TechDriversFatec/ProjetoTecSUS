--Criação de Tabelas
CREATE TABLE enderecoConce(
cepConce int not null,
ruaConce varchar(200) not null,
numeroConce int not null,
bairroConce varchar(200) not null,
cidadeConce varchar(100) not null,
ufConce char(2) not null,
complementoConce varchar(200),
cnpjConcecionaria char(18) not null);

CREATE TABLE enderecoEntrega( 
numeroEntrega int not null,
cepEntrega char(10) not null,
ruaEntrega varchar(200) not null,
bairroEntrega varchar(200) not null,
cidadeEntrega varchar(100) not null,
ufEntrega char(2) not null,
complementoEntrega varchar(200),
cpfCnpjCiCliente char(20) not null);

CREATE TABLE descricaoConsumo(
numMedidor int not null,
descricao varchar(50) not null,
leituraAnterior float not null,
leituraAtual float not null,
constMult float not null,
qtdeKwhMes float not null);

CREATE TABLE concecionaria(
cnpjConcecionaria char(18) not null,
ieConcecionaria char(15) not null,
nomeEmp varchar(200) not null,
nomeFan varchar(200));

CREATE TABLE cliente(
cpfCnpjCiCliente char(20) not null,
nomeCliente varchar(200) not null,
ieCliente char(15) not null,
cnpjConcecionaria char(18) not null);

CREATE TABLE localConsumo(
nomeLC varchar(200) not null,
cpfCnpjCiLC char(20) not null,
ieLC char(15) not null,
ruaLC varchar(200) not null,
numetoLC int not null,
cepLC char(10) not null,
bairroLC varchar(100) not null,
cidadeLC varchar(100) not null,
ufLC char(2) not null,
cpfCnpjCiCliente char(20) not null);

CREATE TABLE dadosInstalacao(
codIdent int not null,
codFiscalOpe int not null,
grupoSub varchar(100) not null,
classeSub varchar(100) not null,
tpFornecimento varchar(100) not null,
modalidadeTari varchar(100) not null,
roteiroLeitura varchar(100) not null,
numMedidor int not null,
tensaoNominal varchar(20) not null,
cpfCnpjCiCliente char(20) not null);

CREATE TABLE consumoMensal(
numInstalacao int not null,
consumoDoMes int not null,
vencimento date not null,
contaDoMes date not null,
valorTotal float not null);

CREATE TABLE periodoFaturamento(
emissao date not null,
leituraAnterior date not null,
diasDeFaturamento varchar(30) not null,
previsaoProximaLeitura date not null,
numInstalacao int not null);

CREATE TABLE detalhesFaturamento(
cci int not null,
descricaoProduto varchar(50) not null,
quantidadeKWh float not null,
tarifaAplic float not null,
valorFornec float not null,
tarifaImpostos float not null,
baseCalculoICMS float not null,
valorICMS float not null,
baseCalculoPisCofins float not null,
valorPis float not null,
valorCofins float not null,
valorTotal float not null,
numMedidor int not null);

--Inserção de chaves Primárias
ALTER TABLE concecionaria
add primary key (cnpjConcecionaria);

ALTER TABLE cliente
add primary key (cpfCnpjCiCliente);

ALTER TABLE dadosInstalacao
add primary key (codIdent);

Alter TABLE consumoMensal
add primary key (numInstalacao);

Alter TABLE descricaoConsumo
add primary key (numMedidor);

Alter TABLE detalhesFaturamento
add primary key (valorTotal);

--Inserção de chaves Estrangeiras
ALTER TABLE enderecoConce
add foreign key (cnpjConcecionaria)
references concecionaria(cnpjConcecionaria);

ALTER TABLE cliente
add foreign key (cnpjConcecionaria)
references concecionaria(cnpjConcecionaria);

ALTER TABLE enderecoEntrega
add foreign key (cpfCnpjCiCliente)
references cliente(cpfCnpjCiCliente);

ALTER TABLE enderecoEntrega
add foreign key (cpfCnpjCiCliente)
references cliente(cpfCnpjCiCliente);

ALTER TABLE dadosInstalacao
add foreign key (cpfCnpjCiCliente)
references cliente(cpfCnpjCiCliente);

ALTER TABLE localConsumo
add foreign key (cpfCnpjCiCliente)
references cliente(cpfCnpjCiCliente);

ALTER TABLE periodoFaturamento
add foreign key (numInstalacao)
references consumoMensal(numInstalacao);

ALTER TABLE detalhesFaturamento
add foreign key (numMedidor)
references descricaoConsumo(numMedidor);

ALTER TABLE consumoMensal
add foreign key (valorTotal)
references detalhesFaturamento(valorTotal);