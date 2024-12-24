#language: pt
@wip @FCT007 @dt_FCT007 @chrome
Funcionalidade: FCT007 - Aprovação Comercial

  Cenário de Fundo:
    Dado inicialize a execução dos cenários do FCT007
    E acessar o programa "FCT007" feature FCT007

  @wip #Refluxo- botãos Toolbar não habilitados
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
  Cenário: Exclusão de Aprovação Comercial| Teclas de Atalho
    Quando marcar checkbox Empresa feature FCT007
    Então pressionar teclas shift + f6 para excluir FCT007

    Quando apresenta o modal H4 "modal-basic-title" feature FCT007
    Então recusar processo feature FCT007


  Cenário: Validação botões | Negativo

    Quando marcar checkbox Empresa feature FCT007
    E preencher Observação feature FCT007
    E clicar botão "Crédito em Conta" feature FCT007
    E clicar botão Crédito em Conta "Fechar" feature FCT007
    E clicar botão em "Detalhes" feature FCT007
    E clicar botão o "Contrato" feature FCT007

    Quando apresentar o modal H5 "modal-basic-title" feature FCT007
    E apresentar a mensagem "A consulta não retornou nenhum registro." feature FCT007
    E clicar botão "ok" do modal feature FCT007
    Então clicar botão e "Voltar" feature FCT007
