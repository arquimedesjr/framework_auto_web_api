#language:pt
#utf-8
Funcionalidade: Buscar no google o diretor e o filme e retorne a quantidade aproximada de resultados para a busca.

  Cenario: Capturar no google o data de nascimento 'Joe Russo'
    Dado que navego na url do google
    Quando insiro no campo de perquisa 'Joe Russo'
    E clico no botão 'Pesquisa Google'
    Então capturo a data de nascimento do diretor 'Joe Russo'

  Cenario: Capturar no google o data de nascimento 'Joss Whedon'
    Dado que navego na url do google
    Quando insiro no campo de perquisa 'Joss Whedon'
    E clico no botão 'Pesquisa Google'
    Então capturo a data de nascimento do 'Joss Whedon' 

  Cenario: Capturar no google o data de nascimento 'Anthony Russo'
    Dado que navego na url do google
    Quando insiro no campo de perquisa 'Anthony Russo'
    E clico no botão 'Pesquisa Google'
    Então capturo a data de nascimento do 'Anthony Russo'
