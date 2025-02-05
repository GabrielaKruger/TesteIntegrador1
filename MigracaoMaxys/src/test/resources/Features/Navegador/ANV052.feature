#language: pt
@test @ANV052 @dt_ANV052 @chrome

Funcionalidade: ANV052 - Pesagens bloqueadas/Peso manual

  Cenário de Fundo:
    Dado inicialize a execução dos cenários do ANV052
    E acessar o programa "ANV052" feature ANV052

  Cenário: Cadastro, Edição e Exclusão de Programa/Recurso | Caminho Feliz

    Quando preencher Programa feature ANV052
    E preencher Descrição feature ANV052
    E preencher Arquivo feature ANV052
    E selecionar Tipo Programa feature ANV052
    #E selecionar Exclusão feature ANV052, Não é necessário informar
    #E selecionar Inclusão feature ANV052
    #E selecionar Alteração feature ANV052
    Então clicar botão "Consultar" para consultar feature ANV052

    Quando clicar botão ToolBar "novo" feature ANV052
    E preencher Programa não repetido page Programa feature ANV052
    E preencher Descrição page Programa feature ANV052
    E preencher Arquivo page Programa feature ANV052
    E selecionar Tipo Programa page Programa feature ANV052
    E selecionar Exclusão page Programa feature ANV052
    E selecionar Inclusão page Programa feature ANV052
    E selecionar Alteração page Programa feature ANV052
    Então clicar botão ToolBar "salvar" feature ANV052

    Quando validar mensagem pop up "Registro salvo com sucesso" feature ANV052
    Então clicar botão ToolBar "excluir" feature ANV052

    Quando apresenta o modal H4 "modal-basic-title" feature ANV052
    E clicar botão "sim" do modal feature ANV052
    Então validar mensagem pop up "Registro salvo com sucesso" feature ANV052



  Cenário: Cadastro, Edição e Exclusão de Programa/Recurso | Teclas Atalho

    Quando preencher Programa feature ANV052
    E preencher Descrição feature ANV052
    E preencher Arquivo feature ANV052
    E selecionar Tipo Programa feature ANV052
    E selecionar Exclusão feature ANV052
    E selecionar Inclusão feature ANV052
    E selecionar Alteração feature ANV052
    Então pressionar tecla "f8" feature ANV052

    Quando clicar botão ToolBar "novo" feature ANV052
    E preencher Programa não repetido page Programa feature ANV052
    E preencher Descrição page Programa feature ANV052
    E preencher Arquivo page Programa feature ANV052
    E selecionar Tipo Programa page Programa feature ANV052
    E selecionar Exclusão page Programa feature ANV052
    E selecionar Inclusão page Programa feature ANV052
    E selecionar Alteração page Programa feature ANV052
    Então pressionar tecla "f10" feature ANV052

    Quando validar mensagem pop up "Registro salvo com sucesso" feature ANV052
    Então pressionar teclas shift + f6 para excluir ANV052

    Quando apresenta o modal H4 "modal-basic-title" feature ANV052
    E clicar botão "sim" do modal feature ANV052
    Então validar mensagem pop up "Registro salvo com sucesso" feature ANV052


  Cenário: Cadastro de Programa/Recurso | Caminho Feliz

    Quando preencher Programa feature ANV052
    E preencher Descrição feature ANV052
    E preencher Arquivo feature ANV052
    E selecionar Tipo Programa feature ANV052
    #E selecionar Exclusão feature ANV052
    #E selecionar Inclusão feature ANV052
    #E selecionar Alteração feature ANV052
    Então clicar botão "Consultar" para consultar feature ANV052

    Quando clicar botão ToolBar "novo" feature ANV052
    E preencher Programa "abt072" page Programa feature ANV052
    E preencher Descrição page Programa feature ANV052
    E preencher Arquivo "ABT072" page Programa feature ANV052
    E selecionar Tipo Programa page Programa feature ANV052
    E selecionar Exclusão page Programa feature ANV052
    E selecionar Inclusão page Programa feature ANV052
    E selecionar Alteração page Programa feature ANV052
    Então clicar botão ToolBar "salvar" feature ANV052


  Cenário: Validar botões Recurso  | Negativo

    Quando preencher Programa feature ANV052
    E preencher Descrição feature ANV052
    E preencher Arquivo feature ANV052
    E selecionar Tipo Programa feature ANV052
    #E selecionar Exclusão feature ANV052
    #E selecionar Inclusão feature ANV052
    #E selecionar Alteração feature ANV052
    Quando clicar botão "Consultar" para consultar feature ANV052
    E clicar botão "Abas" para abrir abas feature ANV052
    Então clicar botão "Fechar" para fechar feature ANV052




