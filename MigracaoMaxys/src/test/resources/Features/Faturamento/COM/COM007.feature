 #language: pt
 @wip @COM007 @dt_COM007 @chrome
 Funcionalidade: COM007 - Aprovação de Pedidos de Compra

   # Refluxos reportados na solicitação.
   Cenário de Fundo:
     Dado inicialize a execução dos cenários do COM007
     E acessar o programa "COM007" pela empresa "84" feature COM007

   Cenário: Aprovar Negociação de Compra - Uma Negociação

     Quando confirmar mensagem SQL de Consulta feature COM007
     E fechar janela de Solicitações em Aberto feature COM007
     Então selecionar Negociação feature COM007

     # Caso seja o último item do Lote a modal de validação não é apresentada

     # Uma única Negociação
     Quando apresentar o modal H4 "modal-basic-title" feature COM007
     E apresentar a mensagem parcial "Selecionar todo o lote de compras número" feature COM007
     Então clicar botão novo "nao" do modal feature COM007

     Quando acessar page "Validar" feature COM007
     E preencher Observação da Renegociação Cancelamento feature COM007
     Então aprovar Negociacao feature COM007

     # Confirmar Aprovação
     Quando apresentar o modal H4 "modal-basic-title" feature COM007
     E apresentar a mensagem parcial "Tem certeza que deseja Aprovar?" feature COM007
     Então clicar botão "sim" do modal feature COM007

     # Aprovação Realizada
     Quando apresentar o modal H5 "modal-basic-title" feature COM007
     E apresentar a mensagem parcial "aprovado(s) com sucesso." feature COM007
     Então clicar botão "Ok" do modal feature COM007


   Cenário: Aprovar Negociação de Compra - Lote de Compras

     Quando confirmar mensagem SQL de Consulta feature COM007
     E fechar janela de Solicitações em Aberto feature COM007
     Então selecionar Negociação feature COM007

     # Uma única Negociação
     # Reescrever para quando a modal estiver visivel  então interagir

     # Quando verificar se o modal H4 "modal-basic-title" é apresentado e selecionar "negociacao" feature COM007

     # Quando apresentar o modal H4 "modal-basic-title" feature COM007
     # E apresentar a mensagem parcial "Selecionar todo o lote de compras número" feature COM007
     # Então clicar botão "sim" do modal feature COM007

     Quando acessar page "Validar" feature COM007
     E preencher Observação da Renegociação Cancelamento feature COM007
     Então aprovar Negociacao feature COM007

     # Confirmar Aprovação
     Quando apresentar o modal H4 "modal-basic-title" feature COM007
     E apresentar a mensagem parcial "Tem certeza que deseja Aprovar?" feature COM007
     Então clicar botão "sim" do modal feature COM007

     # Aprovação Realizada
     Quando apresentar o modal H5 "modal-basic-title" feature COM007
     E apresentar a mensagem parcial "aprovado(s) com sucesso." feature COM007
     Então clicar botão "Ok" do modal feature COM007

   @wip # Finalizar - Duplo Clique não está acionando a modal
   Cenário: Aprovar Negociação de Compra - Detalhes Item da Negociação

     Quando confirmar mensagem SQL de Consulta feature COM007
     E fechar janela de Solicitações em Aberto feature COM007
     Então selecionar Negociação feature COM007

     # Uma única Negociação
     Quando apresentar o modal H4 "modal-basic-title" feature COM007
     E apresentar a mensagem parcial "Selecionar todo o lote de compras número" feature COM007
     Então clicar botão novo "nao" do modal feature COM007

     # Seleciona primeiro item no grid Itens
     Quando dar duplo clique no primeiro Item feature COM007
     E verifica se a modal com a mensagem "Item da Negociação" foi apresentada feature COM007
     Então fecha a modal feature COM007


    Cenário: Aprovar Negociação de Compra - Validar - Renegociar

     # Pedido de Compra
     Quando clicar botão ToolBar "novo" feature COM007
#     E preencher Clifor feature COM007
#     E preencher Condição Pagto feature COM007
#     E preencher Moeda feature COM007
#     E preencher Forma Pagamento feature COM007
#     E selecionar Tipo Taxa sendo "A" feature COM007
#     E preencher Dt início da correção feature COM007
#     Então preencher Taxa feature COM007

#      Itens do Pedido de Compra
#     Quando preencher os "3" Itens de Pedido de Compra feature COM007

     Quando clicar botão ToolBar "salvar" feature COM007
     E apresentar o modal H5 "modal-basic-title" feature COM007
     E apresentar a mensagem "MENSAGEM DE ALERTA POR MOTIVO FALTANDO" feature COM007
     Então clicar botão "ok" do modal feature COM007

     Quando clicar botão ToolBar "salvar" feature COM007
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM007

     Quando clicar botão ToolBar "ultimo registro" feature COM007
     E apresenta o modal "modal-basic-title" feature COM007
     Então clicar botão "ok" do modal feature COM007

     Quando clicar botão ToolBar "ultimo registro" feature COM007
     E clicar botão ToolBar "excluir" feature COM007
#     E apresenta o modal H4 "modal-basic-title" feature COM007
     E clicar botão "sim" do modal feature COM007
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM007


   Cenário: Autorização de Grãos (Bloqueio por tipo de contrato)| Teclas Atalho

     Quando pressionar tecla "f6" feature COM007
#     E preencher Empresa feature COM007
#     E preencher Tipo de Contrato feature COM007
#     E preencher Módulo feature COM007
#     E preencher Programa feature COM007
#     E preencher Motivo feature COM007
#     Então "desmarcar" Ativo feature COM007

     Quando pressionar tecla "f10" feature COM007
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM007

     Quando clicar botão ToolBar "ultimo registro" feature COM007
     E apresenta o modal "modal-basic-title" feature COM007
     Então clicar botão "ok" do modal feature COM007

     Quando clicar botão ToolBar "ultimo registro" feature COM007
     E pressionar teclas shift + f6 para excluir COM007
#     E apresenta o modal H4 "modal-basic-title" feature COM007
     E clicar botão "sim" do modal feature COM007
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature COM007


   @wip    # Refluxo Forms - Entra em loop ao não informar valores
   Cenário: Autorização de Grãos (Bloqueio por tipo de contrato)|  Negativo - Campos obrigatórios

     Quando clicar botão ToolBar "novo" feature COM007
#     E preencher Empresa feature COM007
#     E preencher Tipo de Contrato feature COM007
#     E preencher Módulo feature COM007
#     Então preencher Programa feature COM007

     Quando clicar botão ToolBar "salvar" feature COM007
     E apresentar o modal H5 "modal-basic-title" feature COM007
     E apresentar a mensagem "MENSAGEM DE ALERTA POR MOTIVO FALTANDO" feature COM007
     Então clicar botão "ok" do modal feature COM007

#     Quando preencher Motivo feature COM007
#     Então remover Programa feature COM007

     Quando clicar botão ToolBar "salvar" feature COM007
     E apresentar o modal H5 "modal-basic-title" feature COM007
     E apresentar a mensagem "MENSAGEM DE ALERTA POR PROGRAMA FALTANDO" feature COM007
     Então clicar botão "ok" do modal feature COM007

#     Quando preencher Programa feature COM007
#     Então remover Tipo de Contrato feature COM007

     Quando clicar botão ToolBar "salvar" feature COM007
     E apresentar o modal H5 "modal-basic-title" feature COM007
     E apresentar a mensagem "MENSAGEM DE ALERTA POR TIPO DE CONTRATO FALTANDO" feature COM007
     Então clicar botão "ok" do modal feature COM007

#     Quando preencher Tipo de Contrato feature COM007
#     Entao remover Empresa feature COM007

     Quando clicar botão ToolBar "salvar" feature COM007
     E apresentar o modal H5 "modal-basic-title" feature COM007
     E apresentar a mensagem "MENSAGEM DE ALERTA POR EMPRESA FALTANDO" feature COM007
     Então clicar botão "ok" do modal feature COM007

#     Quando preencher Tipo de Contrato feature COM007
     E clicar botão ToolBar "salvar" feature COM007
     E apresentar o modal H5 "modal-basic-title" feature COM007
     E apresentar a mensagem "Registros salvos com sucesso." feature COM007
     Então clicar botão "ok" do modal feature COM007

#     Quando selecionar a Autorização feature COM007
     E clicar botão ToolBar "excluir" feature COM007
#     E apresenta o modal H4 "modal-basic-title" feature COM007
     E clicar botão "sim" do modal feature COM007
     E apresenta o modal "modal-basic-title" feature COM007
     Então clicar botão "ok" do modal feature COM007