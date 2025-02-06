 #language: pt
 @wip @ANV054 @dt_ANV054 @chrome
 Funcionalidade: ANV054 - CADASTRO DE ACESSOS POR PAGE


   Cenário de Fundo:
     Dado inicialize a execução dos cenários do ANV054
     E acessar o programa "ANV054" feature ANV054


   Cenário: Cadastro de Acessos Por Page | Caminho feliz

     Quando informar o campo empresa feature ANV054
     E informar o programa feature ANV054
     E selecionar duplicacao de papel feature ANV054
     Então clicar botao consultar feature ANV054

     Quando selecionar Grid feature ANV054
     E informar no grid papel feature ANV054
     E informar no grid programa feature ANV054
     E informar no grid pagina feature ANV054
     E selecionar no grid tipo de acesso "C" feature ANV054
#     Então clicar botao consultar feature ANV054