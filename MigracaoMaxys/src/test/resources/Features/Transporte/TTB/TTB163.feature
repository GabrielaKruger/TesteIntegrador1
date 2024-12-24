 #language: pt
 @test @TTB163 @dt_TTB163 @chrome
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
     Então prencher Data de Vencimento feature TTB163

     Quando clicar botão ToolBar "salvar" feature TTB163
     E apresentar o modal H5 "modal-basic-title" feature TTB163
     E apresentar a mensagem "Registros salvos com sucesso." feature TTB163
     Então clicar botão "ok" do modal feature TTB163

     Quando clicar botão ToolBar "excluir" feature TTB163
     E apresenta o modal H4 "modal-basic-title" feature TTB163
     E clicar botão "sim" do modal feature TTB163
     E apresenta o modal "modal-basic-title" feature TTB163
     Então clicar botão "ok" do modal feature TTB163

   @wip # Refluxo - Demora 10 segundo após recarregar
   Cenário: Cadastro, edição e exclusão de Autorizador Restrito| Teclas Atalho

     Quando pressionar tecla "f6" feature TTB163
     E preencher Empresa feature TTB163
     E preencher Usuário feature TTB163
     E preencher Tipo Solic featue TTB163
     E preencher Cód. da Alçada feature TTB163
     Então prencher Data de Vencimento feature TTB163

     Quando pressionar tecla "f10" feature TTB163
     E apresentar o modal H5 "modal-basic-title" feature TTB163
     E apresentar a mensagem "Registros salvos com sucesso." feature TTB163
     Então clicar botão "ok" do modal feature TTB163

     Quando pressionar teclas shift + f6 para excluir TTB163
     E apresenta o modal H4 "modal-basic-title" feature TTB163
     E clicar botão "sim" do modal feature TTB163
     E apresenta o modal "modal-basic-title" feature TTB163
     Então clicar botão "ok" do modal feature TTB163

   Cenário: Cadastro, edição e exclusão de Autorizador Restrito| Negativo - Campos Obrigatórios
     Quando clicar botão ToolBar "salvar" feature TTB163
     E apresentar o modal H5 "modal-basic-title" feature TTB163
     E apresentar a mensagem "É obrigatório informar o código da empresa!" feature TTB163
     Então clicar botão "ok" do modal feature TTB163

     Quando preencher Empresa feature TTB163
     E clicar botão ToolBar "salvar" feature TTB163
     E apresentar o modal H5 "modal-basic-title" feature TTB163
     E apresentar a mensagem "É obrigatório informar o código do Usuário." feature TTB163
     Então clicar botão "ok" do modal feature TTB163

     Quando preencher Usuário feature TTB163
     E clicar botão ToolBar "salvar" feature TTB163
     E apresentar o modal H5 "modal-basic-title" feature TTB163
     E apresentar a mensagem "É obrigatório informar o código da alçada." feature TTB163
     Então clicar botão "ok" do modal feature TTB163

     Quando preencher Cód. da Alçada feature TTB163
     E clicar botão ToolBar "salvar" feature TTB163
     E apresentar o modal H5 "modal-basic-title" feature TTB163
     E apresentar a mensagem "Registros salvos com sucesso." feature TTB163
     Então clicar botão "ok" do modal feature TTB163

     Quando clicar botão ToolBar "excluir" feature TTB163
     E apresenta o modal H4 "modal-basic-title" feature TTB163
     E clicar botão "sim" do modal feature TTB163
     E apresenta o modal "modal-basic-title" feature TTB163
     Então clicar botão "ok" do modal feature TTB163