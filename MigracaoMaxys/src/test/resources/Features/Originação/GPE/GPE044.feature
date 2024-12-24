# #language: pt
# @wip @GPE044 @dt_GPE044 @chrome
# Funcionalidade: GPE044 - Liberção de Pré - Contrato
#
#   Cenário de Fundo:
#     Dado inicialize a execução dos cenários do GPE044
#     E acessar o programa "GPE044" feature GPE044
#
#   Cenário: Liberaçaõ e Rercusa de Pré - Contrato| Caminho feliz
#
#      #Filtros
#     Quando preencher Clifor feature GPE044
#     E preencher Endereço feature GPE004
#     E preencher Empresa feature GPE044
#     E preencher Item feature GPE044
#     E preencher Pré-Contrato feature GPE044
#     E preencher Data de Emissão feature GPE044
#     E preencher Até feature GPE044
#     Então realizar a Consulta feature GPE044
#
#     Quando selecionar no grid Pré-Contrato feature GPE044
#     E preencher Motivo feature GPE044
#     Então realizar Liberação feature GPE044
#
#     Quando apresentar o modal H5 "modal-basic-title" feature GPE044
#     E apresentar a mensagem parcial "liberado com sucesso." feature GPE044
#     Então clicar botão "ok" do modal feature GPE044
#
#     Quando selecionar no grid Pré-Contrato feature GPE044
#     E preencher Motivo feature GPE044
#     Então realizar Recusa feature GPE044
#
#     Quando apresentar o modal H5 "modal-basic-title" feature GPE044
#     E apresentar a mensagem parcial "recusada com sucesso." feature GPE044
#     Então clicar botão "ok" do modal feature GPE044
#
#   Cenário: Liberaçaõ e Rercusa de Pré - Contrato| Teclas Atalho
#
#      #Filtros
#     Quando preencher Clifor feature GPE044
#     E preencher Endereço feature GPE004
#     E preencher Empresa feature GPE044
#     E preencher Item feature GPE044
#     E preencher Pré-Contrato feature GPE044
#     E preencher Data de Emissão feature GPE044
#     E preencher Até feature GPE044
#     Então realizar a Consulta feature GPE044
#
#     Quando selecionar no grid Pré-Contrato feature GPE044
#     E preencher Motivo feature GPE044
#     Então realizar Liberação feature GPE044
#
#     Quando apresentar o modal H5 "modal-basic-title" feature GPE044
#     E apresentar a mensagem parcial "liberado com sucesso." feature GPE044
#     Então clicar botão "ok" do modal feature GPE044
#
#     Quando selecionar no grid Pré-Contrato feature GPE044
#     E preencher Motivo feature GPE044
#     Então realizar Recusa feature GPE044
#
#     Quando apresentar o modal H5 "modal-basic-title" feature GPE044
#     E apresentar a mensagem parcial "recusada com sucesso." feature GPE044
#     Então clicar botão "ok" do modal feature GPE044
#
#
#   @wip # Refluxo- o processo não sai do grid
#   Cenario: Exclusão de Aprovação Comercial| Teclas de Atalho
#     Quando marcar checkbox Empresa feature GPE044
#     Então pressionar teclas shift + f6 para excluir GPE044
#
#
#     Quando apresenta o modal H4 "modal-basic-title" feature GPE044
#     Então recusar processo feature GPE044
#
#
#   Cenario: Exclusão de Aprovação Comercial| Negativo
#
#     Quando marcar checkbox Empresa feature GPE044
#     E preencher Observação feature GPE044
#     E clicar botão "Crédito em Conta" feature GPE044
#     E clicar botão Crédito em Conta "Fechar" feature GPE044
#     E preencher Usuário processo feature GPE044
#     Então validar pop up feature GPE044
#     #E clicar botão "sim" do modal feature GPE044
#     #E apresenta o modal "modal-basic-title" feature GPE044
#     #Então clicar botão "ok" do modal feature GPE044
#
#     #Quando clicar botão ToolBar "salvar" feature TCO035
#     #E apresentar o modal H5 "modal-basic-title" feature TCO035
#     #E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
#     #Então clicar botão "ok" do modal feature TCO035
#
##     Quando recarregar o programa feature TCO035
##     E informa Autorizador feature TCO035
##     E realizar consulta feature TCO035
##     E selecionar Autorizador feature TCO035
##     Então seleciona Status "Inativo" feature TCO035
##
##     Quando clicar botão ToolBar "salvar" feature TCO035
##     E apresentar o modal H5 "modal-basic-title" feature TCO035
##     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
##     Então clicar botão "ok" do modal feature TCO035
##
##     Quando recarregar o programa feature TCO035
##     E informa Autorizador feature TCO035
##     E realizar consulta feature TCO035
##     Então selecionar Autorizador feature TCO035
##
##     Quando clicar botão ToolBar "excluir" feature TCO035
##     E apresenta o modal H4 "modal-basic-title" feature TCO035
##     Então clicar botão "sim" do modal feature TCO035
##
##   @wip #Valores não são apresentados na LOV - Repassado para o desenvolvedor Guilherme
##   Cenario: Cadastro, edição e exclusão de Autorizador Restrito | Teclas Atalho
##
##     Quando pressionar tecla "f6" feature TCO035
##     E selecionar a Empresa Grid feature TCO035
###     E selecionar o Autorizador Grid feature TCO035
##     E selecionar o C.Custo Grid feature TCO035
##     Então seleciona Status "Ativo" feature TCO035
##
##     Quando clicar botão ToolBar "salvar" feature TCO035
##     E apresentar o modal H5 "modal-basic-title" feature TCO035
##     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
##     Então clicar botão "ok" do modal feature TCO035
##
##     Quando recarregar o programa feature TCO035
##     E selecionar a Empresa Consulta feature TCO035
##     E selecionar o Autorizador Consulta feature TCO035
##     E selecionar o C.Custo Consulta feature TCO035
##     E pressionar tecla "f7" feature TCO035
##     E selecionar Autorizador feature TCO035
##     Então seleciona Status "Inativo" feature TCO035
##
##     Quando pressionar tecla "f10" feature TCO035
##     E apresentar o modal H5 "modal-basic-title" feature TCO035
##     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
##     Então clicar botão "ok" do modal feature TCO035
##
##     Quando recarregar o programa feature TCO035
##     E selecionar o Autorizador Consulta feature TCO035
##     E pressionar tecla "f7" feature TCO035
##     Então selecionar Autorizador feature TCO035
##
##     Quando pressionar tecla shift + f6 feature TCO035
##     E apresenta o modal H4 "modal-basic-title" feature TCO035
##     Então clicar botão "sim" do modal feature TCO035
##
##    @wip # Não se comporta como o Forms - Campo Automatizador
##   Cenário: Consulta, cadastro e exclusão| Negativo - Validação Campos obrigatórios Consulta
##
##     Quando clicar botão ToolBar "novo" feature TCO035
###     E preencher Empresa Negativo feature TCO035
###     E preencher Autorizador Negativo feature TCO035
###     E preencher C.Custo Negativo feature TCO035
##     Então seleciona Status "Ativo" feature TCO035
##
##     Quando clicar botão ToolBar "salvar" feature TCO035
##     E apresentar o modal H5 "modal-basic-title" feature TCO035
##     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
##     Então clicar botão "ok" do modal feature TCO035
##
##     Quando recarregar o programa feature TCO035
##     E informa Autorizador feature TCO035
##     E realizar consulta feature TCO035
##     E selecionar Autorizador feature TCO035
##     Então seleciona Status "Inativo" feature TCO035
##
##     Quando clicar botão ToolBar "salvar" feature TCO035
##     E apresentar o modal H5 "modal-basic-title" feature TCO035
##     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
##     Então clicar botão "ok" do modal feature TCO035
##
##     Quando recarregar o programa feature TCO035
##     E informa Autorizador feature TCO035
##     E realizar consulta feature TCO035
##     Então selecionar Autorizador feature TCO035
##
##     Quando clicar botão ToolBar "excluir" feature TCO035
##     E apresenta o modal H4 "modal-basic-title" feature TCO035
##     Então clicar botão "sim" do modal feature TCO035