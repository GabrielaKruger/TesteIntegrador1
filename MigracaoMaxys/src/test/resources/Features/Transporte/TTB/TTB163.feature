 #language: pt
 @wip @TTB163 @dt_TTB163 @chrome
 Funcionalidade: TTB163 - Cadastro Alçada de Cadastro de Frete

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do TTB163
     E acessar o programa "TTB163" feature TTB163

     # Refluxo - Pages não apresentam massa de dados
  Cenário: Cadastro Alçada de Cadastro de Frete| Caminho feliz

     Quando clicar botão ToolBar "novo" feature TTB163
     E preencher Empresa feature TTB163
     E preencher Usuário feature TTB163
     E preencher Tipo Solic featue TTB163
     E preencher Cód. da Alçada feature TTB163
     Então prencher Data de Vencimento feature TT163

     Quando clicar botão ToolBar "salvar" feature TTB163
     E apresentar o modal H5 "modal-basic-title" feature TTB163
     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TTB163
     Então clicar botão "ok" do modal feature TTB163

#     Quando selecionar Empresa feature TTB163
     Então clicar botão ToolBar "excluir" feature TTB163

     #Quando apresenta o modal H4 "modal-basic-title" feature TTB163
     Então clicar botão "sim" do modal feature TTB163

  # Cenário: Cadastro, edição e exclusão de Autorizador Restrito| Caminho feliz

   #  Quando clicar botão ToolBar "novo" feature TTB163
    # E selecionar botão Empresa feature TTB163
     #E preencher Observação feature TTB163
     #E clicar Crédito em Conta feature TTB163
     #E clicar Fechar feature TTB163

     #Quando clicar botão ToolBar "salvar" feature TTB163
     #E apresentar o modal H5 "modal-basic-title" feature TTB163
     #E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TTB163
     #Então clicar botão "ok" do modal feature TTB163

#     Quando recarregar o programa feature TTB163
#     E informa Autorizador feature TTB163
#     E realizar consulta feature TTB163
#     E selecionar Autorizador feature TTB163
#     Então seleciona Status "Inativo" feature TTB163
#
#     Quando clicar botão ToolBar "salvar" feature TTB163
#     E apresentar o modal H5 "modal-basic-title" feature TTB163
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TTB163
#     Então clicar botão "ok" do modal feature TTB163
#
#     Quando recarregar o programa feature TTB163
#     E informa Autorizador feature TTB163
#     E realizar consulta feature TTB163
#     Então selecionar Autorizador feature TTB163
#
#     Quando clicar botão ToolBar "excluir" feature TTB163
#     E apresenta o modal H4 "modal-basic-title" feature TTB163
#     Então clicar botão "sim" do modal feature TTB163
#
#   @wip #Valores não são apresentados na LOV - Repassado para o desenvolvedor Guilherme
#   Cenario: Cadastro, edição e exclusão de Autorizador Restrito | Teclas Atalho
#
#     Quando pressionar tecla "f6" feature TTB163
#     E selecionar a Empresa Grid feature TTB163
##     E selecionar o Autorizador Grid feature TTB163
#     E selecionar o C.Custo Grid feature TTB163
#     Então seleciona Status "Ativo" feature TTB163
#
#     Quando clicar botão ToolBar "salvar" feature TTB163
#     E apresentar o modal H5 "modal-basic-title" feature TTB163
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TTB163
#     Então clicar botão "ok" do modal feature TTB163
#
#     Quando recarregar o programa feature TTB163
#     E selecionar a Empresa Consulta feature TTB163
#     E selecionar o Autorizador Consulta feature TTB163
#     E selecionar o C.Custo Consulta feature TTB163
#     E pressionar tecla "f7" feature TTB163
#     E selecionar Autorizador feature TTB163
#     Então seleciona Status "Inativo" feature TTB163
#
#     Quando pressionar tecla "f10" feature TTB163
#     E apresentar o modal H5 "modal-basic-title" feature TTB163
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TTB163
#     Então clicar botão "ok" do modal feature TTB163
#
#     Quando recarregar o programa feature TTB163
#     E selecionar o Autorizador Consulta feature TTB163
#     E pressionar tecla "f7" feature TTB163
#     Então selecionar Autorizador feature TTB163
#
#     Quando pressionar tecla shift + f6 feature TTB163
#     E apresenta o modal H4 "modal-basic-title" feature TTB163
#     Então clicar botão "sim" do modal feature TTB163
#
#    @wip # Não se comporta como o Forms - Campo Automatizador
#   Cenário: Consulta, cadastro e exclusão| Negativo - Validação Campos obrigatórios Consulta
#
#     Quando clicar botão ToolBar "novo" feature TTB163
##     E preencher Empresa Negativo feature TTB163
##     E preencher Autorizador Negativo feature TTB163
##     E preencher C.Custo Negativo feature TTB163
#     Então seleciona Status "Ativo" feature TTB163
#
#     Quando clicar botão ToolBar "salvar" feature TTB163
#     E apresentar o modal H5 "modal-basic-title" feature TTB163
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TTB163
#     Então clicar botão "ok" do modal feature TTB163
#
#     Quando recarregar o programa feature TTB163
#     E informa Autorizador feature TTB163
#     E realizar consulta feature TTB163
#     E selecionar Autorizador feature TTB163
#     Então seleciona Status "Inativo" feature TTB163
#
#     Quando clicar botão ToolBar "salvar" feature TTB163
#     E apresentar o modal H5 "modal-basic-title" feature TTB163
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TTB163
#     Então clicar botão "ok" do modal feature TTB163
#
#     Quando recarregar o programa feature TTB163
#     E informa Autorizador feature TTB163
#     E realizar consulta feature TTB163
#     Então selecionar Autorizador feature TTB163
#
#     Quando clicar botão ToolBar "excluir" feature TTB163
#     E apresenta o modal H4 "modal-basic-title" feature TTB163
#     Então clicar botão "sim" do modal feature TTB163