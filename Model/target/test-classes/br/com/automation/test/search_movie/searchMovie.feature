#language:pt
#utf-8

Funcionalidade: Buscar no google o diretor e o filme e retorne a quantidade aproximada de resultados para a busca.

  Cenario: Capturar nome e ano de lancamento do filme
    Dado que navego na url do google
    Quando insiro no campo de perquisa 'Joe Russo filmes' 
    E clico no botão 'Pesquisa Google' 
    Então capturo a data de lancamento do filme do diteror
