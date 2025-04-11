 #language: pt
 @wip @TTB113 @dt_TTB113 @chrome
 Funcionalidade: TTB113 - Cadastro Alçada de Cadastro de Frete

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do TTB113
     E acessar o programa "TTB113" pela empresa "84" feature TTB113

     # Refluxo - Pages não apresentam massa de dados
   Cenário: Cadastro Alçada de Cadastro de Frete| Caminho feliz

     Quando clicar botão ToolBar "novo" feature TTB113
     E preencher Empresa feature TTB113
     E preencher Usuário feature TTB113
     E preencher Tipo Solic featue TTB113
     E preencher Cód. da Alçada feature TTB113
     Então prencher Data de Vencimento feature TTB113

     Quando clicar botão ToolBar "salvar" feature TTB113
     E apresentar o modal H5 "modal-basic-title" feature TTB113
     E apresentar a mensagem "Registros salvos com sucesso." feature TTB113
     Então clicar botão "ok" do modal feature TTB113

     Quando clicar botão ToolBar "excluir" feature TTB113
     E apresenta o modal H4 "modal-basic-title" feature TTB113
     E clicar botão "sim" do modal feature TTB113
     E apresenta o modal "modal-basic-title" feature TTB113
     Então clicar botão "ok" do modal feature TTB113

   @wip # Refluxo - Demora 10 segundo após recarregar
   Cenário: Cadastro, edição e exclusão de Autorizador Restrito| Teclas Atalho

     Quando pressionar tecla "f6" feature TTB113
     E preencher Empresa feature TTB113
     E preencher Usuário feature TTB113
     E preencher Tipo Solic featue TTB113
     E preencher Cód. da Alçada feature TTB113
     Então prencher Data de Vencimento feature TTB113

     Quando pressionar tecla "f10" feature TTB113
     E apresentar o modal H5 "modal-basic-title" feature TTB113
     E apresentar a mensagem "Registros salvos com sucesso." feature TTB113
     Então clicar botão "ok" do modal feature TTB113

     Quando pressionar teclas shift + f6 para excluir TTB113
     E apresenta o modal H4 "modal-basic-title" feature TTB113
     E clicar botão "sim" do modal feature TTB113
     E apresenta o modal "modal-basic-title" feature TTB113
     Então clicar botão "ok" do modal feature TTB113

   Cenário: Cadastro, edição e exclusão de Autorizador Restrito| Negativo - Campos Obrigatórios
     Quando clicar botão ToolBar "salvar" feature TTB113
     E apresentar o modal H5 "modal-basic-title" feature TTB113
     E apresentar a mensagem "É obrigatório informar o código da empresa!" feature TTB113
     Então clicar botão "ok" do modal feature TTB113

     Quando preencher Empresa feature TTB113
     E clicar botão ToolBar "salvar" feature TTB113
     E apresentar o modal H5 "modal-basic-title" feature TTB113
     E apresentar a mensagem "É obrigatório informar o código do Usuário." feature TTB113
     Então clicar botão "ok" do modal feature TTB113

     Quando preencher Usuário feature TTB113
     E clicar botão ToolBar "salvar" feature TTB113
     E apresentar o modal H5 "modal-basic-title" feature TTB113
     E apresentar a mensagem "É obrigatório informar o código da alçada." feature TTB113
     Então clicar botão "ok" do modal feature TTB113

     Quando preencher Cód. da Alçada feature TTB113
     E clicar botão ToolBar "salvar" feature TTB113
     E apresentar o modal H5 "modal-basic-title" feature TTB113
     E apresentar a mensagem "Registros salvos com sucesso." feature TTB113
     Então clicar botão "ok" do modal feature TTB113

     Quando clicar botão ToolBar "excluir" feature TTB113
     E apresenta o modal H4 "modal-basic-title" feature TTB113
     E clicar botão "sim" do modal feature TTB113
     E apresenta o modal "modal-basic-title" feature TTB113
     Então clicar botão "ok" do modal feature TTB113