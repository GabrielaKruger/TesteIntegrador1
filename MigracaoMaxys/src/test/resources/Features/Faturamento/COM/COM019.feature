 #language: pt
 @wip @COM019 @dt_COM019 @chrome
 Funcionalidade: COM019 - Aprovação de Pedidos de Compra


   # Refluxos reportados na solicitação da tela.
   Cenário de Fundo:
     Dado inicialize a execução dos cenários do COM019
     E acessar o programa "COM019" pela empresa "84" feature COM019

   Cenário: Pedidos Pendentes de Compra - Liberação

     Quando confirmar mensagem SQL de Consulta feature COM019

     E clicar botão ToolBar "novo" feature COM019
     E preencher Clifor feature COM019
     E preencher Condição Pagto feature COM019
     E preencher Moeda feature COM019
     E preencher Forma Pagamento feature COM019
     E selecionar Tipo Taxa sendo "A" feature COM019
     E preencher Dt início da correção feature COM019
     Então preencher Taxa feature COM019

   Cenário: Pedidos Pendentes de Compra - Recusar
   Cenário: Pedidos Pendentes de Compra - Retornar
   Cenário: Pedidos Pendentes de Compra - Validação Centro de Custo


     # Pedido de Compra
     Quando clicar botão ToolBar "novo" feature COM019
     E preencher Clifor feature COM019
     E preencher Condição Pagto feature COM019
     E preencher Moeda feature COM019
     E preencher Forma Pagamento feature COM019
     E selecionar Tipo Taxa sendo "A" feature COM019
     E preencher Dt início da correção feature COM019
     Então preencher Taxa feature COM019

     # Itens do Pedido de Compra
     Quando preencher os "3" Itens de Pedido de Compra feature COM019

     Quando clicar botão ToolBar "salvar" feature COM019
     E apresentar o modal H5 "modal-basic-title" feature COM019
     E apresentar a mensagem "MENSAGEM DE ALERTA POR MOTIVO FALTANDO" feature COM019
     Então clicar botão "ok" do modal feature COM019

#
#
#     Quando clicar botão ToolBar "salvar" feature COM019
#     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM019
#
#     Quando clicar botão ToolBar "ultimo registro" feature COM019
#     E apresenta o modal "modal-basic-title" feature COM019
#     Então clicar botão "ok" do modal feature COM019
#
#     Quando clicar botão ToolBar "ultimo registro" feature COM019
#     E clicar botão ToolBar "excluir" feature COM019
#     E apresenta o modal H4 "modal-basic-title" feature COM019
#     E clicar botão "sim" do modal feature COM019
#     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM019
#
#
#   Cenário: Autorização de Grãos (Bloqueio por tipo de contrato)| Teclas Atalho
#
#     Quando pressionar tecla "f6" feature COM019
#     E preencher Empresa feature COM019
#     E preencher Tipo de Contrato feature COM019
#     E preencher Módulo feature COM019
#     E preencher Programa feature COM019
#     E preencher Motivo feature COM019
#     Então "desmarcar" Ativo feature COM019
#
#     Quando pressionar tecla "f10" feature COM019
#     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM019
#
#     Quando clicar botão ToolBar "ultimo registro" feature COM019
#     E apresenta o modal "modal-basic-title" feature COM019
#     Então clicar botão "ok" do modal feature COM019
#
#     Quando clicar botão ToolBar "ultimo registro" feature COM019
#     E pressionar teclas shift + f6 para excluir COM019
#     E apresenta o modal H4 "modal-basic-title" feature COM019
#     E clicar botão "sim" do modal feature COM019
#     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM019
#
#
#   @wip    # Refluxo Forms - Entra em loop ao não informar valores
#   Cenário: Autorização de Grãos (Bloqueio por tipo de contrato)|  Negativo - Campos obrigatórios
#
#     Quando clicar botão ToolBar "novo" feature COM019
#     E preencher Empresa feature COM019
#     E preencher Tipo de Contrato feature COM019
#     E preencher Módulo feature COM019
#     Então preencher Programa feature COM019
#
#     Quando clicar botão ToolBar "salvar" feature COM019
#     E apresentar o modal H5 "modal-basic-title" feature COM019
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR MOTIVO FALTANDO" feature COM019
#     Então clicar botão "ok" do modal feature COM019
#
#     Quando preencher Motivo feature COM019
#     Então remover Programa feature COM019
#
#     Quando clicar botão ToolBar "salvar" feature COM019
#     E apresentar o modal H5 "modal-basic-title" feature COM019
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR PROGRAMA FALTANDO" feature COM019
#     Então clicar botão "ok" do modal feature COM019
#
#     Quando preencher Programa feature COM019
#     Então remover Tipo de Contrato feature COM019
#
#     Quando clicar botão ToolBar "salvar" feature COM019
#     E apresentar o modal H5 "modal-basic-title" feature COM019
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR TIPO DE CONTRATO FALTANDO" feature COM019
#     Então clicar botão "ok" do modal feature COM019
#
#     Quando preencher Tipo de Contrato feature COM019
#     Entao remover Empresa feature COM019
#
#     Quando clicar botão ToolBar "salvar" feature COM019
#     E apresentar o modal H5 "modal-basic-title" feature COM019
#     E apresentar a mensagem "MENSAGEM DE ALERTA POR EMPRESA FALTANDO" feature COM019
#     Então clicar botão "ok" do modal feature COM019
#
#     Quando preencher Tipo de Contrato feature COM019
#     E clicar botão ToolBar "salvar" feature COM019
#     E apresentar o modal H5 "modal-basic-title" feature COM019
#     E apresentar a mensagem "Registros salvos com sucesso." feature COM019
#     Então clicar botão "ok" do modal feature COM019
#
#     Quando selecionar a Autorização feature COM019
#     E clicar botão ToolBar "excluir" feature COM019
#     E apresenta o modal H4 "modal-basic-title" feature COM019
#     E clicar botão "sim" do modal feature COM019
#     E apresenta o modal "modal-basic-title" feature COM019
#     Então clicar botão "ok" do modal feature COM019