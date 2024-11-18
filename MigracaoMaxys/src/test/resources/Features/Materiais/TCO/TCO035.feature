 #language: pt
@test @TCO035 @dt_TCO035 @chrome
 Funcionalidade: TCO035 - Autorizador Restrito

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do TCO035
     E acessar o programa "TCO035" feature TCO035

   Cenário: Cadastro, edição e exclusão de Autorizador Restrito| Caminho feliz

     Quando clicar botão ToolBar "novo" feature TCO035
     E preencher Empresa feature TCO035
     E preencher Autorizador feature TCO035
     E preencher C.Custo feature TCO035
     Então seleciona Status "Ativo" feature TCO035

     Quando clicar botão ToolBar "salvar" feature TCO035
     E apresentar o modal H5 "modal-basic-title" feature TCO035
     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
     Então clicar botão "ok" do modal feature TCO035

     Quando recarregar o programa feature TCO035
     E informa Autorizador feature TCO035
     E realiza consulta feature TCO035
     E seleciona Autorizador feature TCO035
     Então seleciona Status "Inativo" feature TCO035

     Quando clicar botão ToolBar "salvar" feature TCO035
     E apresentar o modal H5 "modal-basic-title" feature TCO035
     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
     Então clicar botão "ok" do modal feature TCO035

     Quando recarregar o programa feature TCO035
     Então seleciona Autorizador feature TCO035

     Quando clicar botão ToolBar "excluir" feature TCO035
     E apresenta o modal H4 "modal-basic-title" feature TCO035
     E clicar botão "sim" do modal feature TCO035
     E apresentar o modal H5 "modal-basic-title" feature TCO035
     E apresentar a mensagem "Registro Excluído com Sucesso!" feature TCO035
     Então clicar botão "ok" do modal feature TCO035


#   Cenario: Cadastro, edição e exclusão de Autorizador Restrito | Teclas Atalho | Caminho feliz
#     Quando verificar se o código da caracteristica e tabela utilizado esta cadastrado feature TCT035
#     E preencher filtros e consultar pelo F4 feature TCT035
#     E pressionar tecla "f6" feature TCT035
#     E preencher todos os campos caracteristica tabela de classificação feature TCT035
#     E pressionar tecla "f10" feature TCT035
#     E apresentar o modal H5 "modal-basic-title" feature TCT035
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCT035
#     Então clicar botão "ok" do modal feature TCT035
#
#     Quando recarregar o programa feature TCT035
#     E preencher filtros e consultar pelo F4 feature TCT035
#     E selecionar o item cadastrado feature TCT035
#     E alterar os valores minimo, maximo e resultado padrão feature TCT035
#     E pressionar tecla "f10" feature TCT035
#     E apresentar o modal H5 "modal-basic-title" feature TCT035
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCT035
#     Então clicar botão "ok" do modal feature TCT035
#
#     Quando recarregar o programa feature TCT035
#     E preencher filtros e consultar pelo F4 feature TCT035
#     E selecionar o item cadastrado feature TCT035
#     E pressionar teclas shift + f6 para excluir cadastro de sigla feature TCT035
#     E apresenta o modal H4 "modal-basic-title" feature TCT035
#     E clicar botão "sim" do modal feature TCT035
#     E apresentar o modal H5 "modal-basic-title" feature TCT035
#     E apresentar a mensagem "Registro Excluído com Sucesso!" feature TCT035
#     Então clicar botão "ok" do modal feature TCT035
#     Então clicar botão Ok de Inconsistências feature TCT035