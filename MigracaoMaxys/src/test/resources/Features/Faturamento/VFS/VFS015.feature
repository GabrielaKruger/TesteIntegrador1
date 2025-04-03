#language: pt
@test @VFS015 @dt_VFS015 @chrome

Funcionalidade: VFS015 - Clientes para Remessa contra Ordem

  Cenário de Fundo:
    Dado inicialize a execução dos cenários do VFS015
    E acessar o programa "VFS015" pela empresa "84" feature VFS015

  Cenário: Consultar Clientes para Remessa com os filtros preenchidos | Caminho Feliz

    Quando selecionar Faturamento feature VFS015
    E preencher Lançamento feature VFS015
    E preencher Nota Fiscal feature VFS015
    E preencher Série feature VFS015
    E preencher NF Fornecedor feature VFS015
    E preencher Data Emissão feature VFS015
    E preencher Empresa feature VFS015
    E preencher Clifor feature VFS015
    E preencher Contrato Grão feature VFS015
    Então clicar botão "Consultar" para consultar feature VFS015

  @vfs015Refluxo
  Cenário: Cadastro, Edição e Exclusão Clifor Remessas | Caminho Feliz

    Quando clicar Clifor de Remessas feature VFS015
    E preencher Empresa Clifor de Remessas feature VFS015
    E pressionar tecla "f6" feature VFS015
    E preencher Clifor não repetido Clifor de Remessas feature VFS015
    E preencher Empresa não repetido Clifor de Remessas feature VFS015
    E clicar botão ToolBar "salvar" feature VFS015
    Então validar mensagem pop up "Registro salvo com sucesso" feature VFS015

    Quando clicar botão ToolBar "excluir" feature VFS015
    E apresenta o modal H4 "modal-basic-title" feature VFS015
    Então clicar botão "sim" do modal feature VFS015


  Cenário: Consultar Clientes para Remessa com os filtros preenchidos | Teclas Atalho

    Quando selecionar Faturamento feature VFS015
    E preencher Lançamento feature VFS015
    E preencher Nota Fiscal feature VFS015
    E preencher Série feature VFS015
    E preencher NF Fornecedor feature VFS015
    E preencher Data Emissão feature VFS015
    E preencher Empresa feature VFS015
    E preencher Clifor feature VFS015
    E preencher Contrato Grão feature VFS015
    Então pressionar tecla "f7" feature VFS015

  @vfs015Refluxo
  Cenário: Cadastro, Edição e Exclusão Clifor Remessas | Teclas Atalho

    Quando clicar Clifor de Remessas feature VFS015
    E preencher Empresa Clifor de Remessas feature VFS015
    E pressionar tecla "f6" feature VFS015
    E preencher Clifor não repetido Clifor de Remessas feature VFS015
    E preencher Empresa não repetido Clifor de Remessas feature VFS015
    E pressionar tecla "f10" feature VFS015
    Quando validar mensagem pop up "Registro salvo com sucesso" feature VFS015

    Quando pressionar teclas shift + f6 para excluir VFS015
    E apresenta o modal H4 "modal-basic-title" feature VFS015
    Então clicar botão "sim" do modal feature VFS015


  Cenário: Preencher Clifor já cadastrado | Negativo

    Quando selecionar Faturamento feature VFS015
    E preencher Lançamento feature VFS015
    E preencher Nota Fiscal feature VFS015
    E preencher Série feature VFS015
    E preencher NF Fornecedor feature VFS015
    E preencher Data Emissão feature VFS015
    E preencher Empresa feature VFS015
    E preencher Clifor feature VFS015
    E preencher Contrato Grão feature VFS015
    Então clicar botão "Consultar" para consultar feature VFS015

    Quando clicar Clifor de Remessas feature VFS015
    E preencher Empresa Clifor de Remessas feature VFS015
    E clicar botão ToolBar "novo" feature VFS015
    Quando preencher Clifor "985988" Clifor de Remessas feature VFS015

    Quando apresentar a mensagem "está cadastrado!" feature VFS015
    Então clicar botão "ok" do modal feature VFS015









