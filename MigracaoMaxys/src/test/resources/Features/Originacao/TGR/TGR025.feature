# #language: pt
# @test @ @dt_TGR025 @chrome
# Funcionalidade: TGR025 - Bloqueio Avulso
#
#   # Segunda Page - Ajustar
#   Cenário de Fundo:
#     Dado inicialize a execução dos cenários do TGR025
#     E acessar o programa "TGR025" feature TGR025
#
#   Cenário: Autorização de Grãos (Bloqueio por tipo de contrato)| Caminho feliz
#
#     Quando clicar botão ToolBar "novo" feature TGR025
#     E preencher Empresa feature TGR025
#     E preencher Tipo de Contrato feature TGR025
#     E preencher Módulo feature TGR025
#     E preencher Programa feature TGR025
#     E preencher Motivo feature TGR025
#     Então selecionar Ativo feature TGR025
#
#     Quando clicar botão ToolBar "salvar" feature TGR025
#     E apresentar o modal H5 "modal-basic-title" feature TGR025
#     E apresentar a mensagem "Registros salvos com sucesso." feature TGR025
#     Então clicar botão "ok" do modal feature TGR025
#
##     Quando selecionar a Autorização feature TGR025
#     E clicar botão ToolBar "excluir" feature TGR025
#     E apresenta o modal H4 "modal-basic-title" feature TGR025
#     E clicar botão "sim" do modal feature TGR025
#     E apresenta o modal "modal-basic-title" feature TGR025
#     Então clicar botão "ok" do modal feature TGR025
#
#   Cenário: Autorização de Grãos (Bloqueio por tipo de contrato)| Teclas Atalho
#
#     Quando pressionar tecla "f6" feature TGR025
#     E preencher Empresa feature TGR025
##     E preencher Tipo de Contrato feature TGR025
##     E preencher Módulo featue TGR025
##     E preencher Programa feature TGR025
##     E preencher Motivo feature TGR025
##     Então seleciona se Ativo feature TGR025
#
#     Quando pressionar tecla "f10" feature TGR025
#     E apresentar o modal H5 "modal-basic-title" feature TGR025
#     E apresentar a mensagem "Registros salvos com sucesso." feature TGR025
#     Então clicar botão "ok" do modal feature TGR025
#
##     Quando selecionar a Autorização feature TGR025
#     Quando pressionar teclas shift + f6 para excluir TGR025
#     E apresenta o modal H4 "modal-basic-title" feature TGR025
#     E clicar botão "sim" do modal feature TGR025
#     E apresenta o modal "modal-basic-title" feature TGR025
#     Então clicar botão "ok" do modal feature TGR025
#
#
#   Cenário: Autorização de Grãos (Bloqueio por tipo de contrato)|  Negativo - Campos obrigatórios
#
#     Quando clicar botão ToolBar "novo" feature TGR025
#     E preencher Empresa feature TGR025
##     E preencher Tipo de Contrato feature TGR025
##     E preencher Módulo featue TGR025
##     Então preencher Programa feature TGR025
#
#     Quando clicar botão ToolBar "salvar" feature TGR025
#     E apresentar o modal H5 "modal-basic-title" feature TGR025
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR MOTIVO FALTANDO" feature TGR025
#     Então clicar botão "ok" do modal feature TGR025
#
##     Quando preencher Motivo feature TGR025
##     Entao remover Programa feature TGR025
#
#     Quando clicar botão ToolBar "salvar" feature TGR025
#     E apresentar o modal H5 "modal-basic-title" feature TGR025
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR PROGRAMA FALTANDO" feature TGR025
#     Então clicar botão "ok" do modal feature TGR025
#
##     Quando preencher Programa feature TGR025
##     Entao remover Tipo de Contrato feature TGR025
#
#     Quando clicar botão ToolBar "salvar" feature TGR025
#     E apresentar o modal H5 "modal-basic-title" feature TGR025
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR TIPO DE CONTRATO FALTANDO" feature TGR025
#     Então clicar botão "ok" do modal feature TGR025
#
##     Quando preencher Tipo de Cotnrato feature TGR025
##     Entao remover Empresa feature TGR025
#
#     Quando clicar botão ToolBar "salvar" feature TGR025
#     E apresentar o modal H5 "modal-basic-title" feature TGR025
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR EMPRESA FALTANDO" feature TGR025
#     Então clicar botão "ok" do modal feature TGR025
#
##     Quando preencher Tipo de Cotnrato feature TGR025
#     E clicar botão ToolBar "salvar" feature TGR025
#     E apresentar o modal H5 "modal-basic-title" feature TGR025
#     E apresentar a mensagem "Registros salvos com sucesso." feature TGR025
#     Então clicar botão "ok" do modal feature TGR025
#
##     Quando selecionar a Autorização feature TGR025
#     E clicar botão ToolBar "excluir" feature TGR025
#     E apresenta o modal H4 "modal-basic-title" feature TGR025
#     E clicar botão "sim" do modal feature TGR025
#     E apresenta o modal "modal-basic-title" feature TGR025
#     Então clicar botão "ok" do modal feature TGR025