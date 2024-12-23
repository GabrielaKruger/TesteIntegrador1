 #language: pt
 @wip @FCT007 @dt_FCT007 @chrome
 Funcionalidade: FCT007 - Aprovação Comercial

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do FCT007
     E acessar o programa "FCT007" feature FCT007

    @wip #Refluxo- botãos Toolbar
  Cenário: Cadastro e edição de Aprovação Comercial| Caminho feliz

     Quando marcar checkbox Empresa feature FCT007
     E preencher Observação feature FCT007
     E clicar botão "Crédito em Conta" feature FCT007
     E clicar botão Crédito em Conta "Fechar" feature FCT007
     Então clicar botão ToolBar "salvar" feature FCT007

     Quando apresentar o modal H5 "modal-basic-title" feature FCT007
     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature FCT007
     Então clicar botão "ok" do modal feature FCT007

     @wip # Refluxo- o processo não sai do grid
       # Refluxo- campo Item protegido com atualização
   Cenário: Exclusão de Aprovação Comercial| Caminho feliz

     Quando marcar checkbox Empresa feature FCT007
     E clicar botão ToolBar "excluir" feature FCT007

     Quando apresenta o modal H4 "modal-basic-title" feature FCT007
     Então recusar processo feature FCT007
     #Então clicar botão "sim" do modal feature FCT007
     #E apresenta o modal "modal-basic-title" feature FCT007
     #Então clicar botão "ok" do modal feature FCT007

     @wip #não apresenta o modal
   Cenário: Cadastro, edição e exclusão de Aprovação Comercial| Teclas Atalho

     Quando marcar checkbox Empresa feature FCT007
     E preencher Observação feature FCT007
     E clicar botão "Crédito em Conta" feature FCT007
     E clicar botão Crédito em Conta "Fechar" feature FCT007
     Então pressionar tecla "f10" feature FCT007

     Quando apresentar o modal H5 "modal-basic-title" feature FCT007
     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature FCT007
     Então clicar botão "ok" do modal feature FCT007

     @wip # Refluxo- o processo não sai do grid
   Cenario: Exclusão de Aprovação Comercial| Teclas de Atalho
     Quando marcar checkbox Empresa feature FCT007
     Então pressionar teclas shift + f6 para excluir FCT007


     Quando apresenta o modal H4 "modal-basic-title" feature FCT007
     Então recusar processo feature FCT007


   Cenario: Exclusão de Aprovação Comercial| Negativo

     Quando marcar checkbox Empresa feature FCT007
     E preencher Observação feature FCT007
     E clicar botão "Crédito em Conta" feature FCT007
     E clicar botão Crédito em Conta "Fechar" feature FCT007
     E preencher Usuário processo feature FCT007
     Então validar pop up feature FCT007
     #E clicar botão "sim" do modal feature FCT007
     #E apresenta o modal "modal-basic-title" feature FCT007
     #Então clicar botão "ok" do modal feature FCT007

     #Quando clicar botão ToolBar "salvar" feature TCO035
     #E apresentar o modal H5 "modal-basic-title" feature TCO035
     #E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
     #Então clicar botão "ok" do modal feature TCO035

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