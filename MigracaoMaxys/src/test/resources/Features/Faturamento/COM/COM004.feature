# #language: pt
# @test @COM004 @dt_COM004 @chrome
# Funcionalidade: COM004 - Compras Avulsas
#
#   Cenário de Fundo:
#     Dado inicialize a execução dos cenários do COM004
#     E acessar o programa "COM004" feature COM004
#
#   @910v2
#   Cenário: Pedido avulso - Moeda Dolar - Taxa Abertura
#
#     # Pedido de Compra
#     Quando clicar botão ToolBar "novo" feature COM004
#     E preencher Clifor feature COM004
#     E preencher Condição Pagto feature COM004
#     E preencher Moeda feature COM004
#     E preencher Forma Pagamento feature COM004
#     E selecionar Tipo Taxa sendo "Abertura" feature COM004
#     E preencher Dt início da correção feature COM004
#     Então preencher Taxa feature COM004
#
#     # Itens do Pedido de Compra
#     Quando preencher os "3" Itens de Pedido de Compra feature COM004
#
#     Quando clicar botão ToolBar "salvar" feature COM004
#     E apresentar o modal H5 "modal-basic-title" feature COM004
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR MOTIVO FALTANDO" feature COM004
#     Então clicar botão "ok" do modal feature COM004
#
##
##
##     Quando clicar botão ToolBar "salvar" feature COM004
##     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM004
##
##     Quando clicar botão ToolBar "ultimo registro" feature COM004
##     E apresenta o modal "modal-basic-title" feature COM004
##     Então clicar botão "ok" do modal feature COM004
##
##     Quando clicar botão ToolBar "ultimo registro" feature COM004
##     E clicar botão ToolBar "excluir" feature COM004
##     E apresenta o modal H4 "modal-basic-title" feature COM004
##     E clicar botão "sim" do modal feature COM004
##     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM004
##
##
##   Cenário: Autorização de Grãos (Bloqueio por tipo de contrato)| Teclas Atalho
##
##     Quando pressionar tecla "f6" feature COM004
##     E preencher Empresa feature COM004
##     E preencher Tipo de Contrato feature COM004
##     E preencher Módulo feature COM004
##     E preencher Programa feature COM004
##     E preencher Motivo feature COM004
##     Então "desmarcar" Ativo feature COM004
##
##     Quando pressionar tecla "f10" feature COM004
##     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM004
##
##     Quando clicar botão ToolBar "ultimo registro" feature COM004
##     E apresenta o modal "modal-basic-title" feature COM004
##     Então clicar botão "ok" do modal feature COM004
##
##     Quando clicar botão ToolBar "ultimo registro" feature COM004
##     E pressionar teclas shift + f6 para excluir COM004
##     E apresenta o modal H4 "modal-basic-title" feature COM004
##     E clicar botão "sim" do modal feature COM004
##     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM004
##
##
##   @wip    # Refluxo Forms - Entra em loop ao não informar valores
##   Cenário: Autorização de Grãos (Bloqueio por tipo de contrato)|  Negativo - Campos obrigatórios
##
##     Quando clicar botão ToolBar "novo" feature COM004
##     E preencher Empresa feature COM004
##     E preencher Tipo de Contrato feature COM004
##     E preencher Módulo feature COM004
##     Então preencher Programa feature COM004
##
##     Quando clicar botão ToolBar "salvar" feature COM004
##     E apresentar o modal H5 "modal-basic-title" feature COM004
##     E apresentar a mensagem "MENSAGEM DE ALERTA POR MOTIVO FALTANDO" feature COM004
##     Então clicar botão "ok" do modal feature COM004
##
##     Quando preencher Motivo feature COM004
##     Então remover Programa feature COM004
##
##     Quando clicar botão ToolBar "salvar" feature COM004
##     E apresentar o modal H5 "modal-basic-title" feature COM004
##     E apresentar a mensagem "MENSAGEM DE ALERTA POR PROGRAMA FALTANDO" feature COM004
##     Então clicar botão "ok" do modal feature COM004
##
##     Quando preencher Programa feature COM004
##     Então remover Tipo de Contrato feature COM004
##
##     Quando clicar botão ToolBar "salvar" feature COM004
##     E apresentar o modal H5 "modal-basic-title" feature COM004
##     E apresentar a mensagem "MENSAGEM DE ALERTA POR TIPO DE CONTRATO FALTANDO" feature COM004
##     Então clicar botão "ok" do modal feature COM004
##
##     Quando preencher Tipo de Contrato feature COM004
##     Entao remover Empresa feature COM004
##
##     Quando clicar botão ToolBar "salvar" feature COM004
##     E apresentar o modal H5 "modal-basic-title" feature COM004
##     E apresentar a mensagem "MENSAGEM DE ALERTA POR EMPRESA FALTANDO" feature COM004
##     Então clicar botão "ok" do modal feature COM004
##
##     Quando preencher Tipo de Contrato feature COM004
##     E clicar botão ToolBar "salvar" feature COM004
##     E apresentar o modal H5 "modal-basic-title" feature COM004
##     E apresentar a mensagem "Registros salvos com sucesso." feature COM004
##     Então clicar botão "ok" do modal feature COM004
##
##     Quando selecionar a Autorização feature COM004
##     E clicar botão ToolBar "excluir" feature COM004
##     E apresenta o modal H4 "modal-basic-title" feature COM004
##     E clicar botão "sim" do modal feature COM004
##     E apresenta o modal "modal-basic-title" feature COM004
##     Então clicar botão "ok" do modal feature COM004