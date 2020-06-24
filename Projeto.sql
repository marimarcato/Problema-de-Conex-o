create database if not exists projetocampeonatobrasileirao;
use projetocampeonatobrasileirao;

create table if not exists times(
cod_time int auto_increment,
posicao int(4), 
nome varchar(25) not null,
pontos int(2),
vitorias int (2),
empates int (2),
derrotas int (2),
cartoes_amarelos int (2) ,
cartoes_vermelhos int (2),
gols_feitos int (2) ,
gols_tomados int (2) ,
saldo_gols int (2),
num_Partida int (2),
primary key(cod_time)
);

describe times;
SELECT * FROM times;  

/*insert into times (posicao, nome, pontos, vitorias, empates, derrotas, cartoes_amarelos,
 cartoes_vermelhos, gols_feitos, gols_tomados, saldo_gols, num_Partida)
values 

(1, 'São Paulo', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(2, 'Palmeiras', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(3, 'Santos', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(4, 'corinthians', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);/*
*/


select times.posicao, times.nome, times.pontos, times.jogos, times.vitorias, times.empates, times.cartoes_amarelos,
times.cartoes_vermelhos, times.gols_feitos, times.gols_tomados, times.saldo_gols from times join rodada on times.id_rodada = rodada.id_rodada;