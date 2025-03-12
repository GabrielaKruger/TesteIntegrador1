#language: pt
@wip @ANV053 @dt_ANV053 @chrome

Funcionalidade: ANV053 - Pesagens bloqueadas/Peso manual

  Cenário de Fundo:
    Dado inicialize a execução dos cenários do ANV053
    E acessar o programa "ANV053" pela empresa "84" feature ANV053

  @wip #erro: pagina fica em branco para cadastrar acesso
  Cenário: Edição de Acesso/Recurso com todos os filtros preenchidos | Caminho Feliz

    Quando preencher Empresa feature ANV053
    E preencher Usuário feature ANV053
    E preencher Programa feature ANV053
    E selecionar Tipo de Acesso feature ANV053
    E selecionar Exclusão feature ANV053
    E selecionar Inclusão feature ANV053
    #E selecionar Alteração feature ANV053
    E selecionar Emp.Logada feature ANV053
    E selecionar Emp.Usuário feature ANV053
    Então clicar botão "Consultar" para consultar feature ANV053

    Quando selecionar Empresa cadastrada feature ANV053
    E preencher Empresa Regras de Acesso feature ANV053
    E preencher Usuário Regras de Acesso feature ANV053

    Quando apresentar a mensagem parcial "Deseja cadastrar" feature ANV053
    Então clicar botão "nao" do modal feature ANV053

    E preencher Programa Regras de Acesso feature ANV053
    E selecionar Tipo de Acesso Regras de Acesso feature ANV053
    E selecionar Exclusão Regras de Acesso feature ANV053
    E selecionar Inclusão Regras de Acesso feature ANV053
    E selecionar Alteração "Permitir" Regras de Acesso feature ANV053
    E clicar botão ToolBar "salvar" feature ANV053
    Quando apresentar a mensagem parcial "Deseja gravar" feature ANV053
    Então clicar botão "nao" do modal feature ANV053
    #Então validar mensagem pop up "Registro salvo com sucesso" feature ANV053

#Quando selecionar Programa não repetido feature ANV053
#Então clicar botão ToolBar "excluir" feature ANV053

#Quando apresenta o modal H4 "modal-basic-title" feature ANV053
#E clicar botão "sim" do modal feature ANV053
#E apresentar a mensagem parcial "Excluído com Sucesso!" feature ANV053
#Então clicar botão "ok" do modal feature ANV053


  Cenário: Edição de Acesso/Recurso com todos os filtros preenchidos | Teclas Atalho

    Quando preencher Empresa feature ANV053
    E preencher Usuário feature ANV053
    E preencher Programa feature ANV053
    E selecionar Tipo de Acesso feature ANV053
    E selecionar Exclusão feature ANV053
    E selecionar Inclusão feature ANV053
    #E selecionar Alteração feature ANV053
    E selecionar Emp.Logada feature ANV053
    E selecionar Emp.Usuário feature ANV053
    Então pressionar tecla "f8" feature ANV053

    Quando selecionar Empresa cadastrada feature ANV053
    E preencher Empresa Regras de Acesso feature ANV053
    E preencher Usuário Regras de Acesso feature ANV053
    E preencher Programa Regras de Acesso feature ANV053
    E selecionar Tipo de Acesso Regras de Acesso feature ANV053
    E selecionar Exclusão Regras de Acesso feature ANV053
    E selecionar Inclusão Regras de Acesso feature ANV053
    E selecionar Alteração "Negar" Regras de Acesso feature ANV053
    E pressionar tecla "f10" feature ANV053
  #  Então validar mensagem pop up "Registro salvo com sucesso" feature ANV053


  Cenário: Validar botões Recurso  | Negativo

    Quando preencher Empresa feature ANV053
    E preencher Usuário feature ANV053
    E preencher Programa feature ANV053
    E selecionar Tipo de Acesso feature ANV053
    E selecionar Exclusão feature ANV053
    E selecionar Inclusão feature ANV053
    E selecionar Emp.Logada feature ANV053
    E selecionar Emp.Usuário feature ANV053
    Então clicar botão "Consultar" para consultar feature ANV053

    Quando clicar botão "Abas" para abrir abas feature ANV053
    E clicar botão "Fechar" para fechar feature ANV053
    Então clicar botão "Permissões Unificadas" para as verificar permissões feature ANV053

    Quando preencher Empresa Consulta de Permissões feature ANV053
    E preencher Usuário Consulta de Permissões feature ANV053
    E preencher Programa Consulta de Permissões feature ANV053
    E clicar botão "Consultar" Consulta de Permissões ANV053
    Então clicar botão "Fechar" Consulta ANV053