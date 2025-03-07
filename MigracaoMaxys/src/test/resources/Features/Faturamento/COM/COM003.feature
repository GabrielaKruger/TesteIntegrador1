 #language: pt
 @wip @COM003 @dt_COM003 @chrome
 Funcionalidade: COM003 - Compras Avulsas

   # Refluxo Angular - Tp Compra Carregar automaticamente
   Cenário de Fundo:
     Dado inicialize a execução dos cenários do COM003
     E acessar o programa "COM003" feature COM003

   @910v2
   Cenário: Pedido avulso - Moeda Dolar - Taxa Abertura

     # Pedido de Compra
     Quando clicar botão ToolBar "novo" feature COM003
     E preencher Clifor feature COM003
     E preencher Condição Pagto feature COM003
     E preencher Moeda feature COM003
     E preencher Forma Pagamento feature COM003
     E selecionar Tipo Taxa sendo "A" feature COM003
     E preencher Dt início da correção feature COM003
     Então preencher Taxa feature COM003

     # Itens do Pedido de Compra
     Quando preencher os "3" Itens de Pedido de Compra feature COM003

     Quando clicar botão ToolBar "salvar" feature COM003
     E apresentar o modal H5 "modal-basic-title" feature COM003
     E apresentar a mensagem "MENSAGEM DE ALERTA POR MOTIVO FALTANDO" feature COM003
     Então clicar botão "ok" do modal feature COM003

#
#
#     Quando clicar botão ToolBar "salvar" feature COM003
#     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM003
#
#     Quando clicar botão ToolBar "ultimo registro" feature COM003
#     E apresenta o modal "modal-basic-title" feature COM003
#     Então clicar botão "ok" do modal feature COM003
#
#     Quando clicar botão ToolBar "ultimo registro" feature COM003
#     E clicar botão ToolBar "excluir" feature COM003
#     E apresenta o modal H4 "modal-basic-title" feature COM003
#     E clicar botão "sim" do modal feature COM003
#     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM003
#
#
#   Cenário: Autorização de Grãos (Bloqueio por tipo de contrato)| Teclas Atalho
#
#     Quando pressionar tecla "f6" feature COM003
#     E preencher Empresa feature COM003
#     E preencher Tipo de Contrato feature COM003
#     E preencher Módulo feature COM003
#     E preencher Programa feature COM003
#     E preencher Motivo feature COM003
#     Então "desmarcar" Ativo feature COM003
#
#     Quando pressionar tecla "f10" feature COM003
#     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM003
#
#     Quando clicar botão ToolBar "ultimo registro" feature COM003
#     E apresenta o modal "modal-basic-title" feature COM003
#     Então clicar botão "ok" do modal feature COM003
#
#     Quando clicar botão ToolBar "ultimo registro" feature COM003
#     E pressionar teclas shift + f6 para excluir COM003
#     E apresenta o modal H4 "modal-basic-title" feature COM003
#     E clicar botão "sim" do modal feature COM003
#     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM003
#
#
#   @wip    # Refluxo Forms - Entra em loop ao não informar valores
#   Cenário: Autorização de Grãos (Bloqueio por tipo de contrato)|  Negativo - Campos obrigatórios
#
#     Quando clicar botão ToolBar "novo" feature COM003
#     E preencher Empresa feature COM003
#     E preencher Tipo de Contrato feature COM003
#     E preencher Módulo feature COM003
#     Então preencher Programa feature COM003
#
#     Quando clicar botão ToolBar "salvar" feature COM003
#     E apresentar o modal H5 "modal-basic-title" feature COM003
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR MOTIVO FALTANDO" feature COM003
#     Então clicar botão "ok" do modal feature COM003
#
#     Quando preencher Motivo feature COM003
#     Então remover Programa feature COM003
#
#     Quando clicar botão ToolBar "salvar" feature COM003
#     E apresentar o modal H5 "modal-basic-title" feature COM003
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR PROGRAMA FALTANDO" feature COM003
#     Então clicar botão "ok" do modal feature COM003
#
#     Quando preencher Programa feature COM003
#     Então remover Tipo de Contrato feature COM003
#
#     Quando clicar botão ToolBar "salvar" feature COM003
#     E apresentar o modal H5 "modal-basic-title" feature COM003
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR TIPO DE CONTRATO FALTANDO" feature COM003
#     Então clicar botão "ok" do modal feature COM003
#
#     Quando preencher Tipo de Contrato feature COM003
#     Entao remover Empresa feature COM003
#
#     Quando clicar botão ToolBar "salvar" feature COM003
#     E apresentar o modal H5 "modal-basic-title" feature COM003
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR EMPRESA FALTANDO" feature COM003
#     Então clicar botão "ok" do modal feature COM003
#
#     Quando preencher Tipo de Contrato feature COM003
#     E clicar botão ToolBar "salvar" feature COM003
#     E apresentar o modal H5 "modal-basic-title" feature COM003
#     E apresentar a mensagem "Registros salvos com sucesso." feature COM003
#     Então clicar botão "ok" do modal feature COM003
#
#     Quando selecionar a Autorização feature COM003
#     E clicar botão ToolBar "excluir" feature COM003
#     E apresenta o modal H4 "modal-basic-title" feature COM003
#     E clicar botão "sim" do modal feature COM003
#     E apresenta o modal "modal-basic-title" feature COM003
#     Então clicar botão "ok" do modal feature COM003