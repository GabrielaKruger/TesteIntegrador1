# #language: pt
# @test @TGR009 @dt_TGR009 @chrome
# Funcionalidade: TGR009 - Produtos de Balança
#
#   Cenário de Fundo:
#     Dado inicialize a execução dos cenários do TGR009
#     E acessar o programa "TGR009" feature TGR009
#
#   Cenário: Cadastro e Exclusão de Produtos de Balança | Caminho feliz
#
#     Quando clicar botão ToolBar "ultimo registro" feature TGR009
#     E clicar botão ToolBar "novo" feature TGR009
#     E preencher Código feature TGR009
#     E preencher Descrição feature TGR009
#     E preencher Tipo de Pedido feature TGR009
#     E preencher Item Transgênico feature TGR009
#     E "marcar" Classificar feature TGR009
#     E "marcar" Segunda Classificação feature TGR009
#     E "marcar" Produto com restricao no bioma amazônico feature TGR009
#     E "marcar" Produto com certificação de qualidade POP 11 feature TGR009
#     Então "marcar" Ordem de carregamento obrigatória featue TGR009
#
#     Quando clicar botão ToolBar "salvar" feature TGR009
#     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR009
#
#     Quando clicar botão ToolBar "ultimo registro" feature TGR009
#     E clicar botão ToolBar "excluir" feature TGR009
#     E apresenta o modal H4 "modal-basic-title" feature TGR009
#     E clicar botão "sim" do modal feature TGR009
#     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR009
#
##
##   Cenário: Cadastro e Exclusão de Produtos de Balança | Teclas Atalho
##
##     Quando pressionar tecla "f6" feature TGR009
##     E preencher Empresa feature TGR009
##     E preencher Tipo de Contrato feature TGR009
##     E preencher Módulo feature TGR009
##     E preencher Programa feature TGR009
##     E preencher Motivo feature TGR009
##     Então "desmarcar" Ativo feature TGR009
##
##     Quando pressionar tecla "f10" feature TGR009
##     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR009
##
##     Quando clicar botão ToolBar "ultimo registro" feature TGR009
##     E apresenta o modal "modal-basic-title" feature TGR009
##     Então clicar botão "ok" do modal feature TGR009
##
##     Quando clicar botão ToolBar "ultimo registro" feature TGR009
##     E pressionar teclas shift + f6 para excluir TGR009
##     E apresenta o modal H4 "modal-basic-title" feature TGR009
##     E clicar botão "sim" do modal feature TGR009
##     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR009
##
##
##   @wip    # Refluxo Forms - Entra em loop ao não informar valores
##   Cenário: Produtos de Balança | Negativo - Campos obrigatórios
##
##     Quando clicar botão ToolBar "novo" feature TGR009
##     E preencher Empresa feature TGR009
##     E preencher Tipo de Contrato feature TGR009
##     E preencher Módulo feature TGR009
##     Então preencher Programa feature TGR009
##
##     Quando clicar botão ToolBar "salvar" feature TGR009
##     E apresentar o modal H5 "modal-basic-title" feature TGR009
##     E apresentar a mensagem "MENSAGEM DE ALERTA POR MOTIVO FALTANDO" feature TGR009
##     Então clicar botão "ok" do modal feature TGR009
##
##     Quando preencher Motivo feature TGR009
##     Então remover Programa feature TGR009
##
##     Quando clicar botão ToolBar "salvar" feature TGR009
##     E apresentar o modal H5 "modal-basic-title" feature TGR009
##     E apresentar a mensagem "MENSAGEM DE ALERTA POR PROGRAMA FALTANDO" feature TGR009
##     Então clicar botão "ok" do modal feature TGR009
##
##     Quando preencher Programa feature TGR009
##     Então remover Tipo de Contrato feature TGR009
##
##     Quando clicar botão ToolBar "salvar" feature TGR009
##     E apresentar o modal H5 "modal-basic-title" feature TGR009
##     E apresentar a mensagem "MENSAGEM DE ALERTA POR TIPO DE CONTRATO FALTANDO" feature TGR009
##     Então clicar botão "ok" do modal feature TGR009
##
##     Quando preencher Tipo de Contrato feature TGR009
##     Entao remover Empresa feature TGR009
##
##     Quando clicar botão ToolBar "salvar" feature TGR009
##     E apresentar o modal H5 "modal-basic-title" feature TGR009
##     E apresentar a mensagem "MENSAGEM DE ALERTA POR EMPRESA FALTANDO" feature TGR009
##     Então clicar botão "ok" do modal feature TGR009
##
##     Quando preencher Tipo de Contrato feature TGR009
##     E clicar botão ToolBar "salvar" feature TGR009
##     E apresentar o modal H5 "modal-basic-title" feature TGR009
##     E apresentar a mensagem "Registros salvos com sucesso." feature TGR009
##     Então clicar botão "ok" do modal feature TGR009
##
##     Quando selecionar a Autorização feature TGR009
##     E clicar botão ToolBar "excluir" feature TGR009
##     E apresenta o modal H4 "modal-basic-title" feature TGR009
##     E clicar botão "sim" do modal feature TGR009
##     E apresenta o modal "modal-basic-title" feature TGR009
##     Então clicar botão "ok" do modal feature TGR009
##
##   Cenário: Produtos de Balança - Outros | Negativo - Outras Configurações
##   Cenário: Produtos de Balança - Outros | Negativo - Amostra de Classificação de Algodão
##   Cenário: Produtos de Balança - Outros | Negativo - Item para Faturamento
##   Cenário: Produtos de Balança - Outros | Negativo - Layout Originação
#
