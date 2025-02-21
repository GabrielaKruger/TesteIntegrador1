#language: pt
@wip @GAC002 @dt_GAC002 @chrome

Funcionalidade: GAC002 - Preço por Região

  Cenário de Fundo:
    Dado inicialize a execução dos cenários do GAC002
    E acessar o programa "GAC002" feature GAC002

    @wip #Não faz pesquisa em campos de select,q aundo digita o nome solicitado
Cenário: Cadastro, Edição e Exclusão page Preço por Região | Caminho Feliz


  Quando preencher Empresa feature GAC002
  E preencher Produto feature GAC002
  E preencher Data Inicial feature GAC002
  Então preencher Data Final feature GAC002

  #Quando clicar botão ToolBar "novo" feature GAC002

  #Então clicar botão ToolBar "novo" feature GAC002

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


  Cenário: Cadastro, Edição e Exclusão page Preço por Região | Teclas Atalho


    Quando preencher Empresa feature GAC002
    E preencher Produto feature GAC002
    E preencher Data Inicial feature GAC002
    E preencher Data Final feature GAC002
    Então clicar botão ToolBar "novo" feature GAC002

    Quando preencher Empresa Preço de Grão feature GAC002
    E preencher Item Preço de Grão feature GAC002
  #E preencher Data Preço de Grão feature GAC002
    E preencher Unitário Preço de Grão feature GAC002
  #E preencher Qualidade Preço de Grão feature GAC002
    E selecionar Tipo de Cálculo Preço de Grão feature GAC002
    E selecionar Tipo de Preço Preço de Grão feature GAC002
    E preencher Acima Preço de Grão feature GAC002
    E preencher Abaixo Preço de Grão feature GAC002

    Quando pressionar tecla "f10" feature GAC002
    Então validar mensagem pop up "Registro salvo com sucesso" feature GAC002

    Quando pressionar teclas shift + f6 para excluir GAC002
    E apresenta o modal H4 "modal-basic-title" feature GAC002
    Então clicar botão "sim" do modal feature GAC002


  Cenário: Cadastro, Edição e Exclusão page Limite Fixação| Caminho Feliz

    Quando selecionar page "Limite Fixação <F7>" feature GAC002
    E preencher Empresa Limite feature GAC002
    E preencher Item Limite feature GAC002
    E preencher Condt. Pagamento Limite feature GAC002
    E selecionar Tipo Pessoa Limite feature GAC002
    Então clicar botão "Consultar" feature GAC002

    Quando preencher Empresa Limites Fixação feature GAC002
    E preencher Item Limites Fixação feature GAC002
    E preencher Tipo de Pessoa limites Fixação feature GAC002
    E preencher Condição de Pagamento Limites Fixação feature GAC002
    E preencher Peso mínimo Limites Fixação feature GAC002
    E preencher Peso máximo Limites Fixação feature GAC002
    E preencher Valor mínimo feature GAC002
    E preencher Valor máximo feature GAC002

    Quando clicar botão ToolBar "salvar" feature GAC002
    Então validar mensagem pop up "Registro salvo com sucesso" feature GAC002

    Quando clicar botão ToolBar "excluir" feature GAC002
    E apresenta o modal H4 "modal-basic-title" feature GAC002
    Então clicar botão "sim" do modal feature GAC002


@wip #em branco Tipo contrato
  Cenário: Cadastro, Edição e Exclusão page Preço Futuro| Caminho Feliz

  Quando selecionar page "Limite Fixação <F8>" feature GAC002
  E preencher Empresa Preço feature GAC002
  E preencher Produto Preço feature GAC002
  E preencher Tipo de Contrato Preçofeature GAC002
  E preencher Data Inicial Preço feature GAC002
  E preencher Data Final Preço feature GAC002
  Então preencher Entrega até Preço feature GAC002

  Quando preencher Empresa page Preço Futuro feature GAC002
  E preencher Item page Preço Futuro feature GAC002
  E preencher Data page Preço Futuro feature GAC002
  E preencher Entrega até page Preço Futuro feature GAC002
  E preencher Unitário page Preço Futuro feature GAC002
  E selecionar Tipo de Cálculo page Preço Futuro feature GAC002
  Então selecionar Tipo de Contrato page Preço Futuro feature GAC002

  Quando clicar botão ToolBar "salvar" feature GAC002
  Então validar mensagem pop up "Registro salvo com sucesso" feature GAC002

  Quando clicar botão ToolBar "excluir" feature GAC002
  E apresenta o modal H4 "modal-basic-title" feature GAC002
  Então clicar botão "sim" do modal feature GAC002


  Cenário: Cadastro, Edição e Exclusão page Condição de Pagamento| Caminho Feliz

    Quando preencher Empresa Condição de Pagamento feature GAC002
    E preencher Item  Condição de Pagamento feature GAC002
    E preencher Condição de Pagamento feature GAC002







