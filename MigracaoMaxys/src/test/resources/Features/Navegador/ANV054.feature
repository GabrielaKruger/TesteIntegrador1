 #language: pt
 @wip @ANV054 @dt_ANV054 @chrome
 Funcionalidade: ANV054 - CADASTRO DE ACESSOS POR PAGE


   Cenário de Fundo:
     Dado inicialize a execução dos cenários do ANV054
     E acessar o programa "ANV054" pela empresa "84" feature ANV054

   Cenário: Cadastro de Acessos Por Page | Caminho feliz

     Quando informar o campo empresa feature ANV054
     E informar o programa feature ANV054
     E selecionar duplicacao de papel feature ANV054
     Então clicar botao consultar feature ANV054

     Quando clicar botão Toolbar "novo" feature ANV054
     E preencher campo empresa feature ANV054
     E informar no grid papel feature ANV054
     E informar no grid programa feature ANV054
     E informar no grid pagina feature ANV054
     E selecionar no grid tipo de acesso Consulta feature ANV054
     E clicar botão Toolbar "salvar" feature ANV054
#     Entao apresentar a mensagem "Registro salvo com sucesso" feature ANV054

     #Excluir item cadastrado caminho feliz
     Quando selecionar pagina cadastrada feature ANV054
     E clicar botão Toolbar "excluir" feature ANV054
     E apresenta o modal H4 "modal-basic-title" feature ANV054
     E clicar botão "sim" do modal feature ANV054
#     Entao apresentar a mensagem "Registro salvo com sucesso" feature ANV054

   Cenário: Cadastro de Acessos Por Page | Teclas Atalho | Caminho feliz

     Quando informar o campo empresa feature ANV054
     E informar o programa feature ANV054
     E selecionar duplicacao de papel feature ANV054
     Então clicar botao consultar feature ANV054

     Quando pressionar tecla "f6" feature ANV054
     E preencher campo empresa feature ANV054
     E informar no grid papel feature ANV054
     E informar no grid programa feature ANV054
     E informar no grid pagina feature ANV054
     E selecionar no grid tipo de acesso Consulta feature ANV054
     E pressionar tecla "f10" feature ANV054
#     Entao apresentar a mensagem "Registro salvo com sucesso" feature ANV054

     #Excluir item cadastrado caminho feliz
     Quando selecionar pagina cadastrada feature ANV054
     E pressionar teclas shift + f6 para excluir feature ANV054
     E apresenta o modal H4 "modal-basic-title" feature ANV054
     E clicar botão "sim" do modal feature ANV054
#     Entao apresentar a mensagem "Registro salvo com sucesso" feature ANV054