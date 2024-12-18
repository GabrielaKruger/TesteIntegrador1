# #language: pt
# @test @FCT006 @dt_FCT006 @chrome
# Funcionalidade: FCT006 - Autorização de Processos
#
#   Cenário de Fundo:
#     Dado inicialize a execução dos cenários do FCT006
#     E acessar o programa "FCT006" feature FCT006
#
#   Cenário: Autorização e Recusa de Processos| Caminho feliz
#     Quando informar Empresa feature FCT006
#     E informa Data Pagamento feature FCT006
#     Então realizar a consulta feature FCT006
#
#     Quando selecionar o processo feature FCT006
#     E informar Observação feature FCT006
#
#     Quando clicar botão ToolBar "salvar" feature FCT006
#     E apresenta o modal "modal-basic-title" feature FCT006
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature FCT006
#     Então clicar botão "ok" do modal feature FCT006
#