 #language: pt
 @wip @TGR010 @dt_TGR010 @chrome
 Funcionalidade: TGR010 - Produtos de Balança


   # Refluxos reportados na solicitação.
   Cenário de Fundo:
     Dado inicialize a execução dos cenários do TGR010
     E acessar o programa "TGR010" pela empresa "84" feature TGR010

   Cenário: Cadastro e Exclusão de Produtos de Balança | Caminho feliz

#     Quando clicar botão ToolBar "ultimo registro" feature TGR010
#     E clicar botão ToolBar "novo" feature TGR010
#     E preencher Código feature TGR010
#     E preencher Descrição feature TGR010
#     E preencher Tipo de Pedido feature TGR010
#     E preencher Item Transgênico feature TGR010
#     E "marcar" Classificar feature TGR010
#     E "marcar" Segunda Classificação feature TGR010
#     E "marcar" Produto com restricao no bioma amazônico feature TGR010
#     E "marcar" Produto com certificação de qualidade POP 11 feature TGR010
#     Então "marcar" Ordem de carregamento obrigatória featue TGR010

     Quando clicar botão ToolBar "salvar" feature TGR010
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR010

     Quando clicar botão ToolBar "ultimo registro" feature TGR010
     E clicar botão ToolBar "excluir" feature TGR010
     E apresenta o modal H4 "modal-basic-title" feature TGR010
     E clicar botão "sim" do modal feature TGR010
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR010


   Cenário: Cadastro e Exclusão de Produtos de Balança | Teclas Atalho

     Quando pressionar tecla "f6" feature TGR010
#     E preencher Empresa feature TGR010
#     E preencher Tipo de Contrato feature TGR010
#     E preencher Módulo feature TGR010
#     E preencher Programa feature TGR010
#     E preencher Motivo feature TGR010
#     Então "desmarcar" Ativo feature TGR010

     Quando pressionar tecla "f10" feature TGR010
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR010

     Quando clicar botão ToolBar "ultimo registro" feature TGR010
     E apresenta o modal "modal-basic-title" feature TGR010
     Então clicar botão "ok" do modal feature TGR010

     Quando clicar botão ToolBar "ultimo registro" feature TGR010
     E pressionar teclas shift + f6 para excluir TGR010
     E apresenta o modal H4 "modal-basic-title" feature TGR010
     E clicar botão "sim" do modal feature TGR010
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR010


   @wip    # Refluxo Forms - Entra em loop ao não informar valores
   Cenário: Produtos de Balança | Negativo - Campos obrigatórios

     Quando clicar botão ToolBar "novo" feature TGR010
#     E preencher Empresa feature TGR010
#     E preencher Tipo de Contrato feature TGR010
#     E preencher Módulo feature TGR010
#     Então preencher Programa feature TGR010

     Quando clicar botão ToolBar "salvar" feature TGR010
     E apresentar o modal H5 "modal-basic-title" feature TGR010
     E apresentar a mensagem "MENSAGEM DE ALERTA POR MOTIVO FALTANDO" feature TGR010
     Então clicar botão "ok" do modal feature TGR010

#     Quando preencher Motivo feature TGR010
#     Então remover Programa feature TGR010

     Quando clicar botão ToolBar "salvar" feature TGR010
     E apresentar o modal H5 "modal-basic-title" feature TGR010
     E apresentar a mensagem "MENSAGEM DE ALERTA POR PROGRAMA FALTANDO" feature TGR010
     Então clicar botão "ok" do modal feature TGR010

#     Quando preencher Programa feature TGR010
#     Então remover Tipo de Contrato feature TGR010

     Quando clicar botão ToolBar "salvar" feature TGR010
     E apresentar o modal H5 "modal-basic-title" feature TGR010
     E apresentar a mensagem "MENSAGEM DE ALERTA POR TIPO DE CONTRATO FALTANDO" feature TGR010
     Então clicar botão "ok" do modal feature TGR010

#     Quando preencher Tipo de Contrato feature TGR010
#     Entao remover Empresa feature TGR010

     Quando clicar botão ToolBar "salvar" feature TGR010
     E apresentar o modal H5 "modal-basic-title" feature TGR010
     E apresentar a mensagem "MENSAGEM DE ALERTA POR EMPRESA FALTANDO" feature TGR010
     Então clicar botão "ok" do modal feature TGR010

#     Quando preencher Tipo de Contrato feature TGR010
     E clicar botão ToolBar "salvar" feature TGR010
     E apresentar o modal H5 "modal-basic-title" feature TGR010
     E apresentar a mensagem "Registros salvos com sucesso." feature TGR010
     Então clicar botão "ok" do modal feature TGR010

#     Quando selecionar a Autorização feature TGR010
     E clicar botão ToolBar "excluir" feature TGR010
     E apresenta o modal H4 "modal-basic-title" feature TGR010
     E clicar botão "sim" do modal feature TGR010
     E apresenta o modal "modal-basic-title" feature TGR010
     Então clicar botão "ok" do modal feature TGR010

   Cenário: Produtos de Balança - Outros | Negativo - Outras Configurações
   Cenário: Produtos de Balança - Outros | Negativo - Amostra de Classificação de Algodão
   Cenário: Produtos de Balança - Outros | Negativo - Item para Faturamento
   Cenário: Produtos de Balança - Outros | Negativo - Layout Originação