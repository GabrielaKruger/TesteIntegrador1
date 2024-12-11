 #language: pt
 @wip @GPE001 @dt_GPE001 @chrome
 Funcionalidade: GPE001 - Autorizador Restrito

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do GPE001
     E acessar o programa "GPE001" feature GPE001

   Cenário: Impressão/Favorecidos - Valor Pagamento Maior

     #Pedidos/contratos de grão
     Quando preencher Clifor page contratos de grao feature GPE001

     #Page Dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento feature GPE001
     E preencher Ano safra feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado feature GPE001
     E preencher Preço Unitário feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "Contrato salvo com sucesso." feature GPE001
     Então clicar botão "ok" do modal feature GPE001

     #Quando clicar botão ToolBar "salvar" feature GPE001
     #E apresentar o modal H5 "modal-basic-title" feature GPE001
     #E apresentar a mensagem parcial "É necessário informar os dados do Vencimento do ICMS" feature GPE001
     #Então clicar botão "ok" do modal feature GPE001

     #Quando acessar page "Vencimento ICMS" feature GPE001
     #E preencher Dia feature GPE001
     #Então preencher Condição de pagamento feature GPE001

   Cenário: Impressão de Contrato - Page Favorecidos/Impressão

    #Pedidos/contratos de grão
     Quando preencher Clifor page contratos de grao feature GPE001

     #Page dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento feature GPE001
     E preencher Ano safra feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado feature GPE001
     Então preencher Preço Unitário feature GPE001

     Quando acessar page feature GPE001
     E preencher Clifor2 page Favorecidos feature GPE001
     Então preencher Valor pagamento feature GPE001

     Quando clicar botão ToolBar "salvar" feature GPE001
     E apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "O valor dos pagamentos é diferente do valor líquido do contrato. Favor verifique." feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   Cenário: Impressão de Contrato - Page Favorecidos/Impressão

      #Pedidos/contratos de grão
     Quando preencher Clifor2 "991422" feature GPE001

     #Page dados
     Quando seleciona Tipo de Contrato "FIXO" feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento feature GPE001
     E preencher Ano safra feature GPE001
     E seleciona Tipos de Cálculo "3- SACA 60 KG X PRECO" feature GPE001
     E preencher PesoEVolume Contratado feature GPE001
     Então preencher Preço Unitário feature GPE001

     Quando acessar page "Favorecidos/Impressão" feature GPE001
     E preencher Clifor "991422" page favorecidos feature GPE001
     E preencher Valor pagamento feature GPE001
     E preencher Data pagamento feature GPE001
     Então seleciona "Recibo" feature GPE001

     Quando clicar botão ToolBar "salvar" feature GPE001
     E apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "O valor dos pagamentos é diferente do valor líquido do contrato. Favor verifique." feature GPE001
     Então clicar botão "ok" do modal feature GPE001







#
#     Quando recarregar o programa feature TCO035
#     E informa Autorizador feature TCO035
#     E realizar consulta feature TCO035
#     E selecionar Autorizador feature TCO035
#     Então seleciona Status "Inativo" feature TCO035
#
#     Quando clicar botão ToolBar "salvar" feature TCO035
#     E apresentar o modal H5 "modal-basic-title" feature TCO035
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
#     Então clicar botão "ok" do modal feature TCO035
#
#     Quando recarregar o programa feature TCO035
#     E informa Autorizador feature TCO035
#     E realizar consulta feature TCO035
#     Então selecionar Autorizador feature TCO035
#
#     Quando clicar botão ToolBar "excluir" feature TCO035
#     E apresenta o modal H4 "modal-basic-title" feature TCO035
#     Então clicar botão "sim" do modal feature TCO035
#
#   @wip #Valores não são apresentados na LOV - Repassado para o desenvolvedor Guilherme
#   Cenario: Cadastro, edição e exclusão de Autorizador Restrito | Teclas Atalho
#
#     Quando pressionar tecla "f6" feature TCO035
#     E selecionar a Empresa Grid feature TCO035
##     E selecionar o Autorizador Grid feature TCO035
#     E selecionar o C.Custo Grid feature TCO035
#     Então seleciona Status "Ativo" feature TCO035
#
#     Quando clicar botão ToolBar "salvar" feature TCO035
#     E apresentar o modal H5 "modal-basic-title" feature TCO035
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
#     Então clicar botão "ok" do modal feature TCO035
#
#     Quando recarregar o programa feature TCO035
#     E selecionar a Empresa Consulta feature TCO035
#     E selecionar o Autorizador Consulta feature TCO035
#     E selecionar o C.Custo Consulta feature TCO035
#     E pressionar tecla "f7" feature TCO035
#     E selecionar Autorizador feature TCO035
#     Então seleciona Status "Inativo" feature TCO035
#
#     Quando pressionar tecla "f10" feature TCO035
#     E apresentar o modal H5 "modal-basic-title" feature TCO035
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
#     Então clicar botão "ok" do modal feature TCO035
#
#     Quando recarregar o programa feature TCO035
#     E selecionar o Autorizador Consulta feature TCO035
#     E pressionar tecla "f7" feature TCO035
#     Então selecionar Autorizador feature TCO035
#
#     Quando pressionar tecla shift + f6 feature TCO035
#     E apresenta o modal H4 "modal-basic-title" feature TCO035
#     Então clicar botão "sim" do modal feature TCO035
#
#    @wip # Não se comporta como o Forms - Campo Automatizador
#   Cenário: Consulta, cadastro e exclusão| Negativo - Validação Campos obrigatórios Consulta
#
#     Quando clicar botão ToolBar "novo" feature TCO035
##     E preencher Empresa Negativo feature TCO035
##     E preencher Autorizador Negativo feature TCO035
##     E preencher C.Custo Negativo feature TCO035
#     Então seleciona Status "Ativo" feature TCO035
#
#     Quando clicar botão ToolBar "salvar" feature TCO035
#     E apresentar o modal H5 "modal-basic-title" feature TCO035
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
#     Então clicar botão "ok" do modal feature TCO035
#
#     Quando recarregar o programa feature TCO035
#     E informa Autorizador feature TCO035
#     E realizar consulta feature TCO035
#     E selecionar Autorizador feature TCO035
#     Então seleciona Status "Inativo" feature TCO035
#
#     Quando clicar botão ToolBar "salvar" feature TCO035
#     E apresentar o modal H5 "modal-basic-title" feature TCO035
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
#     Então clicar botão "ok" do modal feature TCO035
#
#     Quando recarregar o programa feature TCO035
#     E informa Autorizador feature TCO035
#     E realizar consulta feature TCO035
#     Então selecionar Autorizador feature TCO035
#
#     Quando clicar botão ToolBar "excluir" feature TCO035
#     E apresenta o modal H4 "modal-basic-title" feature TCO035
#     Então clicar botão "sim" do modal feature TCO035