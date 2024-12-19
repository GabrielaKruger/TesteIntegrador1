 #language: pt
 @wip @FCT006 @dt_FCT006 @chrome
 Funcionalidade: FCT006 - Autorização de Processos

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do FCT006
     E acessar o programa "FCT006" feature FCT006

    #Refluxo Forms - Mensagem: "A consulta retornou mais de um contrato nos itens de processo." não deve ser exibida
   Cenário: Autorização e Recusa de Processos| Caminho feliz - Autorização
     Quando informar Empresa feature FCT006
     # E informa Data Pagamento feature FCT006
     E realizar a consulta feature FCT006
     E apresenta o modal "modal-basic-title" feature FCT006
     E apresentar a mensagem parcial "A consulta retornou mais de um contrato nos itens de processo." feature FCT006
     Então clicar botão "ok" do modal feature FCT006

     # Remover quando o refluxo for corrigido
     E apresenta o modal "modal-basic-title" feature FCT006
     E apresentar a mensagem parcial "A consulta retornou mais de um contrato nos itens de processo." feature FCT006
     Então clicar botão "ok" do modal feature FCT006

     Quando selecionar o processo feature FCT006
     E informar Observação feature FCT006

     Quando Autoriza Processo feature FCT006
     E apresenta o modal "modal-basic-title" feature FCT006
     E apresentar a mensagem "Registro salvo com sucesso." feature FCT006
     Então clicar botão "ok" do modal feature FCT006


   Cenário: Autorização e Recusa de Processos| Caminho feliz - Recusa
     Quando informar Empresa feature FCT006
     # E informa Data Pagamento feature FCT006
     E realizar a consulta feature FCT006
     # Remover quando o refluxo for corrigido
     E apresenta o modal "modal-basic-title" feature FCT006
     E apresentar a mensagem parcial "A consulta retornou mais de um contrato nos itens de processo." feature FCT006
     Então clicar botão "ok" do modal feature FCT006

     # Remover quando o refluxo for corrigido
     E apresenta o modal "modal-basic-title" feature FCT006
     E apresentar a mensagem parcial "A consulta retornou mais de um contrato nos itens de processo." feature FCT006
     Então clicar botão "ok" do modal feature FCT006

     Quando Rescusa Processo feature FCT006
     E apresenta o modal H4 "modal-basic-title" feature FCT006
     E clicar botão "sim" do modal feature FCT006
     E apresenta o modal "modal-basic-title" feature FCT006
     Então clicar botão "ok" do modal feature FCT006

   Cenário: Autorização e Recusa de Processos| Teclas Atalho
     Quando informar Empresa feature FCT006
     E informa Data Pagamento feature FCT006
     Então realizar a consulta feature FCT006

     Quando selecionar o processo feature FCT006
     E informar Observação feature FCT006

     # Autoriza o Processo
     Quando Autoriza Processo por "f10" feature FCT006
     E apresenta o modal "modal-basic-title" feature FCT006
     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature FCT006
     Então clicar botão "ok" do modal feature FCT006

     # Recusa processo ?? - Validar quando a base for liberada
#     Quando pressionar teclas shift + f6 para excluir FCT006
#     E apresenta o modal H4 "modal-basic-title" feature FCT006
#     E clicar botão "sim" do modal feature FCT006
#     E apresenta o modal "modal-basic-title" feature FCT006
#     Então clicar botão "ok" do modal feature FCT006

   Cenário: Autorização e Recusa de Processos| Dossiê
     Quando informar Empresa feature FCT006
     E informa Data Pagamento feature FCT006
     Então realizar a consulta feature FCT006

     Quando selecionar o processo feature FCT006
     Então clicar botão "Dossiê" feature FCT006

     Quando apresenta o modal "modal-basic-title" feature FCT006
#     E apresentar a mensagem parcial "O Autorizador deve ser informado." feature FCT006
     Então clicar botão "ok" do modal feature FCT006


   Cenário: Autorização e Recusa de Processos| Contas Orig.
     Quando informar Empresa feature FCT006
     E informa Data Pagamento feature FCT006
     Então realizar a consulta feature FCT006

     Quando selecionar o processo feature FCT006
     Então clicar botão "Contas Orig." feature FCT006

     Quando apresenta o modal "modal-basic-title" feature FCT006
#     E apresentar a mensagem parcial "O Autorizador deve ser informado." feature FCT006
     Então clicar botão "ok" do modal feature FCT006


   Cenário: Autorização e Recusa de Processos| Crédito em Conta
     Quando informar Empresa feature FCT006
     E informa Data Pagamento feature FCT006
     Então realizar a consulta feature FCT006

     Quando selecionar o processo feature FCT006
     Então clicar botão "Crédito em Conta" feature FCT006

     # Ajustar para quando exibir a modal e clicar no botão Ok
     Quando apresenta o modal "modal-basic-title" feature FCT006
#     E apresentar a mensagem parcial "O Autorizador deve ser informado." feature FCT006
     Então clicar botão "ok" do modal feature FCT006


   Cenário: Autorização e Recusa de Processos| Crédito
     Quando informar Empresa feature FCT006
     E informa Data Pagamento feature FCT006
     Então realizar a consulta feature FCT006

     Quando selecionar o processo feature FCT006
     Então clicar botão "Crédito" feature FCT006

     Quando apresenta o modal "modal-basic-title" feature FCT006
#     E apresentar a mensagem parcial "O Autorizador deve ser informado." feature FCT006
     Então clicar botão "ok" do modal feature FCT006


   Cenário: Autorização e Recusa de Processos| Perfil
     Quando informar Empresa feature FCT006
     E informa Data Pagamento feature FCT006
     Então realizar a consulta feature FCT006

     Quando selecionar o processo feature FCT006
     Então clicar botão "Perfil" feature FCT006

     Quando apresenta o modal "modal-basic-title" feature FCT006
#     E apresentar a mensagem parcial "O Autorizador deve ser informado." feature FCT006
     Então clicar botão "ok" do modal feature FCT006


   Cenário: Autorização e Recusa de Processos| Detalhes
     Quando informar Empresa feature FCT006
     E informa Data Pagamento feature FCT006
     Então realizar a consulta feature FCT006

     Quando selecionar o processo feature FCT006
     Então clicar botão "Crédito" feature FCT006

     # Ajustar para clicar em Todos os botões e validar a Page de Detalhes
     Quando apresenta o modal "modal-basic-title" feature FCT006
#     E apresentar a mensagem parcial "O Autorizador deve ser informado." feature FCT006
     Então clicar botão "ok" do modal feature FCT006