#language:pt
#utf-8

Funcionalidade: Buscar no google o diretor e o filme e retorne a quantidade aproximada de resultados para a busca.

  Cenario: Capturar no google o nome do Diretores do Vingadores
  
    Dado que navego na url do google
    Quando insiro no campo de perquisa 'diretor do vingadores' 
    E clico no botão 'Pesquisa Google' 
   	Então capturo o nomes do diretores