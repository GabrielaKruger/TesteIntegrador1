#language: pt
@wip @GAC002 @dt_GAC002 @chrome

Funcionalidade: GAC002 - Preço por Região

  Cenário de Fundo:
    Dado inicialize a execução dos cenários do GAC002
    E acessar o programa "GAC002" feature GAC002

Cenário: Cadastro, Edição e Exclusão page Preço por Região | Caminho Feliz


  Quando preencher Empresa feature GAC002
  E preencher Produto feature GAC002
  E preencher Data Inicial feature GAC002
  E preencher Data Final feature GAC002
  Então clicar botão ToolBar "novo" feature VFS015

  Quando preencher Empresa Preço de Grão feature GAC002
  E preencher Item Preço de Grão feature GAC002
  #E preencher Data Preço de Grão feature GAC002
  E preencher Unitário Preço de Grão feature GAC002
  #E preencher Qualidade Preço de Grão feature GAC002
  E selecionar Tipo de Cálculo Preço de Grão feature GAC002
  E selecionar Tipo de Preço Preço de Grão feature GAC002
  E preencher Acima Preço de Grão feature GAC002
  E preencher Abaixo Preço de Grão feature GAC002

  Quando clicar botão ToolBar "salvar" feature GAC002
  Então validar mensagem pop up "Registro salvo com sucesso" feature GAC002

  Quando clicar botão ToolBar "excluir" feature GAC002
  E apresenta o modal H4 "modal-basic-title" feature GAC002
  Então clicar botão "sim" do modal feature GAC002


  Cenário: Cadastro, Edição e Exclusão page Limite por Fixação | Caminho Feliz


    Quando preencher Empresa feature GAC002
    E preencher Item feature GAC002
    E preencher Condt. Pagamento feature GAC002
    E preencher Data Final feature GAC002
    Então clicar botão ToolBar "novo" feature VFS015

    Quando preencher Empresa Preço de Grão feature GAC002
    E preencher Item Preço de Grão feature GAC002
  #E preencher Data Preço de Grão feature GAC002
    E preencher Unitário Preço de Grão feature GAC002
  #E preencher Qualidade Preço de Grão feature GAC002
    E selecionar Tipo de Cálculo Preço de Grão feature GAC002
    E selecionar Tipo de Preço Preço de Grão feature GAC002
    E preencher Acima Preço de Grão feature GAC002
    E preencher Abaixo Preço de Grão feature GAC002

    Quando clicar botão ToolBar "salvar" feature GAC002
    Então validar mensagem pop up "Registro salvo com sucesso" feature GAC002

    Quando clicar botão ToolBar "excluir" feature GAC002
    E apresenta o modal H4 "modal-basic-title" feature GAC002
    Então clicar botão "sim" do modal feature GAC002







