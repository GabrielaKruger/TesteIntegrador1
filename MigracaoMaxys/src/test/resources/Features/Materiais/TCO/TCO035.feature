 #language: pt
 @test @TCO035 @dt_TCO035 @chrome
 Funcionalidade: TCO035 - Autorizador Restrito

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do TCO035
     E acessar o programa "TCO035" pela empresa "84" feature TCO035

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
     E realizar consulta feature TCO035
     E selecionar Autorizador feature TCO035
     Então seleciona Status "Inativo" feature TCO035

     Quando clicar botão ToolBar "salvar" feature TCO035
     E apresentar o modal H5 "modal-basic-title" feature TCO035
     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
     Então clicar botão "ok" do modal feature TCO035

     Quando recarregar o programa feature TCO035
     E informa Autorizador feature TCO035
     E realizar consulta feature TCO035
     Então selecionar Autorizador feature TCO035

     Quando clicar botão ToolBar "excluir" feature TCO035
     E apresenta o modal H4 "modal-basic-title" feature TCO035
     Então clicar botão "sim" do modal feature TCO035

   @wip #Valores não são apresentados na LOV - Repassado para o desenvolvedor Guilherme
   Cenario: Cadastro, edição e exclusão de Autorizador Restrito | Teclas Atalho

     Quando pressionar tecla "f6" feature TCO035
     E selecionar a Empresa Grid feature TCO035
#     E selecionar o Autorizador Grid feature TCO035
     E selecionar o C.Custo Grid feature TCO035
     Então seleciona Status "Ativo" feature TCO035

     Quando clicar botão ToolBar "salvar" feature TCO035
     E apresentar o modal H5 "modal-basic-title" feature TCO035
     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
     Então clicar botão "ok" do modal feature TCO035

     Quando recarregar o programa feature TCO035
     E selecionar a Empresa Consulta feature TCO035
     E selecionar o Autorizador Consulta feature TCO035
     E selecionar o C.Custo Consulta feature TCO035
     E pressionar tecla "f7" feature TCO035
     E selecionar Autorizador feature TCO035
     Então seleciona Status "Inativo" feature TCO035

     Quando pressionar tecla "f10" feature TCO035
     E apresentar o modal H5 "modal-basic-title" feature TCO035
     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
     Então clicar botão "ok" do modal feature TCO035

     Quando recarregar o programa feature TCO035
     E selecionar o Autorizador Consulta feature TCO035
     E pressionar tecla "f7" feature TCO035
     Então selecionar Autorizador feature TCO035

     Quando pressionar tecla shift + f6 feature TCO035
     E apresenta o modal H4 "modal-basic-title" feature TCO035
     Então clicar botão "sim" do modal feature TCO035

    @wip # Não se comporta como o Forms - Campo Automatizador
   Cenário: Consulta, cadastro e exclusão| Negativo - Validação Campos obrigatórios Consulta

     Quando clicar botão ToolBar "novo" feature TCO035
#     E preencher Empresa Negativo feature TCO035
#     E preencher Autorizador Negativo feature TCO035
#     E preencher C.Custo Negativo feature TCO035
     Então seleciona Status "Ativo" feature TCO035

     Quando clicar botão ToolBar "salvar" feature TCO035
     E apresentar o modal H5 "modal-basic-title" feature TCO035
     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
     Então clicar botão "ok" do modal feature TCO035

     Quando recarregar o programa feature TCO035
     E informa Autorizador feature TCO035
     E realizar consulta feature TCO035
     E selecionar Autorizador feature TCO035
     Então seleciona Status "Inativo" feature TCO035

     Quando clicar botão ToolBar "salvar" feature TCO035
     E apresentar o modal H5 "modal-basic-title" feature TCO035
     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO035
     Então clicar botão "ok" do modal feature TCO035

     Quando recarregar o programa feature TCO035
     E informa Autorizador feature TCO035
     E realizar consulta feature TCO035
     Então selecionar Autorizador feature TCO035

     Quando clicar botão ToolBar "excluir" feature TCO035
     E apresenta o modal H4 "modal-basic-title" feature TCO035
     Então clicar botão "sim" do modal feature TCO035