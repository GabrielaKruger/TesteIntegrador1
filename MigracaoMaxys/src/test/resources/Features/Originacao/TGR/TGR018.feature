 #language: pt
 @test @TGR018 @dt_TGR018 @chrome
 Funcionalidade: TGR018 - Tipo de Modalidade Gão

   # Refluxo - Campos obrigatórios - Mensagem pop-up - Validar com Tailon sexta (28/02/2025)
   Cenário de Fundo:
     Dado inicialize a execução dos cenários do TGR018
     E acessar o programa "TGR018" feature TGR018

   Cenário: Cadastro de Tipo de Modalidades de Grãos| Caminho feliz

     Quando clicar botão ToolBar "ultimo registro" feature TGR018
     E clicar botão ToolBar "novo" feature TGR018
     E preencher Modalidade feature TGR018
     Então selecionar o Tipo Contrato feature TGR018

     Quando clicar botão ToolBar "salvar" feature TGR018
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR018

     Quando clicar botão ToolBar "ultimo registro" feature TGR018
     E clicar botão ToolBar "excluir" feature TGR018
     E apresenta o modal H4 "modal-basic-title" feature TGR018
     E clicar botão "sim" do modal feature TGR018
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR018

    @TGR018C2
   Cenário: Cadastro de Tipo de Modalidades de Gãos | Teclas Atalho

     Quando clicar botão ToolBar "ultimo registro" feature TGR018
     E pressionar tecla "f6" feature TGR018
     E preencher Modalidade feature TGR018
     Então selecionar o Tipo Contrato feature TGR018

     Quando pressionar tecla "f10" feature TGR018
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR018

     Quando clicar botão ToolBar "ultimo registro" feature TGR018
     E pressionar teclas shift + f6 para excluir TGR018
     E apresenta o modal H4 "modal-basic-title" feature TGR018
     E clicar botão "sim" do modal feature TGR018
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR018


#   @wip    # Refluxo Forms - Entra em loop ao não informar valores
#   Cenário: Cadastro de Tipo de Modalidades de Gãos|  Negativo - Campos obrigatórios
#
#     Quando clicar botão ToolBar "novo" feature TGR018
#     E preencher Empresa feature TGR018
#     E preencher Tipo de Contrato feature TGR018
#     E preencher Módulo feature TGR018
#     Então preencher Programa feature TGR018
#
#     Quando clicar botão ToolBar "salvar" feature TGR018
#     E apresentar o modal H5 "modal-basic-title" feature TGR018
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR MOTIVO FALTANDO" feature TGR018
#     Então clicar botão "ok" do modal feature TGR018
#
#     Quando preencher Motivo feature TGR018
#     Então remover Programa feature TGR018
#
#     Quando clicar botão ToolBar "salvar" feature TGR018
#     E apresentar o modal H5 "modal-basic-title" feature TGR018
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR PROGRAMA FALTANDO" feature TGR018
#     Então clicar botão "ok" do modal feature TGR018
#
#     Quando preencher Programa feature TGR018
#     Então remover Tipo de Contrato feature TGR018
#
#     Quando clicar botão ToolBar "salvar" feature TGR018
#     E apresentar o modal H5 "modal-basic-title" feature TGR018
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR TIPO DE CONTRATO FALTANDO" feature TGR018
#     Então clicar botão "ok" do modal feature TGR018
#
#     Quando preencher Tipo de Contrato feature TGR018
#     Entao remover Empresa feature TGR018
#
#     Quando clicar botão ToolBar "salvar" feature TGR018
#     E apresentar o modal H5 "modal-basic-title" feature TGR018
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR EMPRESA FALTANDO" feature TGR018
#     Então clicar botão "ok" do modal feature TGR018
#
#     Quando preencher Tipo de Contrato feature TGR018
#     E clicar botão ToolBar "salvar" feature TGR018
#     E apresentar o modal H5 "modal-basic-title" feature TGR018
#     E apresentar a mensagem "Registros salvos com sucesso." feature TGR018
#     Então clicar botão "ok" do modal feature TGR018
#
#     Quando selecionar a Autorização feature TGR018
#     E clicar botão ToolBar "excluir" feature TGR018
#     E apresenta o modal H4 "modal-basic-title" feature TGR018
#     E clicar botão "sim" do modal feature TGR018
#     E apresenta o modal "modal-basic-title" feature TGR018
#     Então clicar botão "ok" do modal feature TGR018