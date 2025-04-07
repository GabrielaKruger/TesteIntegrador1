 #language: pt
 @test @TGR025 @dt_TGR025 @chrome
 Funcionalidade: TGR025 - Bloqueio Avulso

   # Refluxos reportados na solicitação.
   Cenário de Fundo:
     Dado inicialize a execução dos cenários do TGR025
     E acessar o programa "TGR025" pela empresa "84" feature TGR025

   Cenário: Autorização de Grãos (Bloqueio por tipo de contrato)| Caminho feliz

     Quando clicar botão ToolBar "novo" feature TGR025
     E preencher Empresa feature TGR025
     E preencher Tipo de Contrato feature TGR025
     E preencher Módulo feature TGR025
     E preencher Programa feature TGR025
     E preencher Motivo feature TGR025
     Então "desmarcar" Ativo feature TGR025

     Quando clicar botão ToolBar "salvar" feature TGR025
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR025

     Quando clicar botão ToolBar "ultimo registro" feature TGR025
     E apresenta o modal "modal-basic-title" feature TGR025
     Então clicar botão "ok" do modal feature TGR025

     Quando clicar botão ToolBar "ultimo registro" feature TGR025
     E clicar botão ToolBar "excluir" feature TGR025
     E apresenta o modal H4 "modal-basic-title" feature TGR025
     E clicar botão "sim" do modal feature TGR025
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR025


   Cenário: Autorização de Grãos (Bloqueio por tipo de contrato)| Teclas Atalho

     Quando pressionar tecla "f6" feature TGR025
     E preencher Empresa feature TGR025
     E preencher Tipo de Contrato feature TGR025
     E preencher Módulo feature TGR025
     E preencher Programa feature TGR025
     E preencher Motivo feature TGR025
     Então "desmarcar" Ativo feature TGR025

     Quando pressionar tecla "f10" feature TGR025
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR025

     Quando clicar botão ToolBar "ultimo registro" feature TGR025
     E apresenta o modal "modal-basic-title" feature TGR025
     Então clicar botão "ok" do modal feature TGR025

     Quando clicar botão ToolBar "ultimo registro" feature TGR025
     E pressionar teclas shift + f6 para excluir TGR025
     E apresenta o modal H4 "modal-basic-title" feature TGR025
     E clicar botão "sim" do modal feature TGR025
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR025


   Cenário: Autorização de Grãos (Bloqueio por tipo de contrato)|  Negativo - Campos obrigatórios

     Quando clicar botão ToolBar "novo" feature TGR025
     Então não preenche Emprea feature TGR025

     Quando clicar botão ToolBar "salvar" feature TGR025
     Então apresentar a mensagem "O registro deve ser informado ou excluído" no pop-up feature TGR025

     Quando preencher Empresa feature TGR025
     Então não preencher Tipo de Contrato feature TGR025

     Quando clicar botão ToolBar "salvar" feature TGR025
     Então apresentar a mensagem "O registro deve ser informado ou excluído" no pop-up feature TGR025

     Quando preencher Tipo de Contrato feature TGR025
     Então não preencher Módulo feature TGR025

     Quando clicar botão ToolBar "salvar" feature TGR025
     Então apresentar a mensagem "O registro deve ser informado ou excluído" no pop-up feature TGR025

     Quando preencher Módulo feature TGR025
     Então não preencher Programa feature TGR025

     Quando clicar botão ToolBar "salvar" feature TGR025
     Então apresentar a mensagem "O registro deve ser informado ou excluído" no pop-up feature TGR025

     Quando preencher Programa feature TGR025
     Então não preencher Motivo feature TGR025

     Quando clicar botão ToolBar "salvar" feature TGR025
     Então apresentar a mensagem "O registro deve ser informado ou excluído" no pop-up feature TGR025

     Quando preencher Motivo feature TGR025
     Então "desmarcar" Ativo feature TGR025

     Quando clicar botão ToolBar "salvar" feature TGR025
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR025

     # Mensagem é exibida em Forms, logo a migração está correta.
     # Mensgem: Motivo de Bloqueio (42) não cadastrado ou com Status de Solicitante diferente de ("G"). Verifique TVE017.
     Quando clicar botão ToolBar "ultimo registro" feature TGR025
     E apresenta o modal "modal-basic-title" feature TGR025
     Então clicar botão "ok" do modal feature TGR025

     Quando clicar botão ToolBar "ultimo registro" feature TGR025
     E clicar botão ToolBar "excluir" feature TGR025
     E apresenta o modal H4 "modal-basic-title" feature TGR025
     E clicar botão "sim" do modal feature TGR025
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR025