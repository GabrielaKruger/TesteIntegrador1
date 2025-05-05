 #language: pt
 @test @TTB113 @1403 @dt_TTB113 @chrome
 Funcionalidade: TTB113 - Liberação clifor pagador

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do TTB113
     E acessar o programa "TTB113" pela empresa "84" feature TTB113

#     Page liberação clifor pagador é necessário para a utilização na tela
#     TTB026 acessando na page TCF001
#     Primeiro parâmetro - não bloquear clifor tipo "cliente pagador" em cadastros/alteração


   Cenário: Liberação clifor pagador | Caminho feliz

     Quando acessar primeira page "Liberação Clifor Pagador" feature TTB113
     E marcar checkbox do clifor pagador feature TTB113
     E clicar botão Desbloqueia Selecionados feature TTB113
     E apresenta o modal H4 "modal-basic-title" feature TTB113
     Então clicar botão "ok" do modall feature TTB113



   Cenário: Liberação de clifor pagador| Caminho Negativo

     Quando clicar botão ToolBar "novo" feature TTB113
     E clicar botão ToolBar "salvar" feature TTB113
     E apresenta o modal H4 "modal-basic-title" feature TTB113
     E apresentar a mensagem "Confirma o desbloqueio dos clifors selecionados?" feature TTB113
     Então clicar botão "ok" do modall feature TTB113



   #Segunda page começa aqui


   Cenário: Liberação clifor pagador (crédito) | Caminho feliz

     Quando acessar page "Liberação clifor pagador (crédito)" feature TTB113
     E clicar opção vazia teste " " feature TTB113
     E clicar botão consultar feature TTB113
     E marcar checkbox do clifor feature TTB113
     E selecionar "Não Autorizado" no campo Status de liberação feature TTB113
     E preencher o motivo de recusa autorizacao feature TTB113
     E clicar botão ToolBar "salvar" feature TTB113
     Então clicar botão "ok" do modall feature TTB113



   Cenário: Liberação clifor pagador (crédito) | Teclas Atalho
     Quando acessar page "Liberação clifor pagador (crédito)" feature TTB113
     E clicar botão consultar feature TTB113
     E marcar checkbox do clifor feature TTB113
     E clicar botão ToolBar "salvar" feature TTB113
     Então clicar botão "ok" do modall feature TTB113



   Cenário: Liberação clifor pagador (crédito) | Caminho Negativo

     Quando acessar page "Liberação clifor pagador (crédito)" feature TTB113
     E clicar botão consultar feature TTB113
     E clicar botão ToolBar "salvar" feature TTB113
     Então clicar botão "ok" do modal feature TTB113



   Cenário: Liberação clifor pagador (crédito) | Caminho Negativo II

     Quando acessar page "Liberação clifor pagador (crédito)" feature TTB113
     E preencher clifor feature TTB113
     E clicar botão ToolBar "salvar" feature TTB113
     Então clicar botão "ok" do modal feature TTB113





















