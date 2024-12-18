# #language: pt
# @wip @TCO035 @dt_TCO024 @chrome
# Funcionalidade: TCO024 - Usuários Por Departamentos
#
#    # Refluxo: Erro ORA - Reportado card.
#   Cenário de Fundo:
#     Dado inicialize a execução dos cenários do TCO024
#     E acessar o programa "TCO024" feature TCO024
#
#   # Autorizador Por Departamento:
#   Cenário: Consultar Departamento, cadastrar e excluir Solicitante| Caminho feliz
#     Quando informar Departamento feature TCO024
#     Então realizar a consulta feature TCO024
#
#     Quando selecionar o Grid Solicitante feature TCO024
#     E clicar botão ToolBar "novo" feature TCO024
#     Então informar Solicitante feature TCO024
#
#     Quando selecionar o Grid Autorizador feature TCO024
#     E clicar botão ToolBar "novo" feature TCO024
#     E informar Autorizador feature TCO024
#     E informar Alcada feature TCO024
#     E informar Tipo Cargo feature TCO024
#     E "marcar" Aprovador de Necessidade feature TCO024
#     Então "marcar" Comprador feature TCO024
#
#     Quando clicar botão ToolBar "salvar" feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#     Quando informar Departamento feature TCO024
#     Então realizar a consulta feature TCO024
#
#     Quando selecionar o Grid Autorizador feature TCO024
#     Então  localiza Autorizador cadastrado feature TCO024
#
#     Quando clicar botão ToolBar "excluir" feature TCO024
#     E apresenta o modal H4 "modal-basic-title" feature TCO024
#     E clicar botão "sim" do modal feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#
#   Cenário: Consultar Departamento, cadastrar e excluir Solicitante| Teclas Atalho
#     Quando informar Departamento feature TCO024
#     Então realizar a consulta feature TCO024
#
#     Quando selecionar o Grid Solicitante feature TCO024
#     E pressionar tecla "f6" feature TCO024
#     Então informar Solicitante feature TCO024
#
#     Quando selecionar o Grid Autorizador feature TCO024
#     E pressionar tecla "f6" feature TCO024
#     E informar Autorizador feature TCO024
#     E informar Alcada feature TCO024
#     E informar Tipo Cargo feature TCO024
#     E "marcar" Aprovador de Necessidade feature TCO024
#     Então "marcar" Comprador feature TCO024
#
#     Quando pressionar tecla "f10" feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#     Quando informar Departamento feature TCO024
#     Então realizar a consulta feature TCO024
#
#     Quando selecionar o Grid Solicitante feature TCO024
#     Então  localiza Autorizador cadastrado feature TCO024
#
#     Quando pressionar teclas shift + f6 para excluir TCO024
#     E apresentar o modal H4 "modal-basic-title" feature TCO024
#     E clicar botão "sim" do modal feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#
#   Cenário: Consultar Departamento, cadastrar e excluir Solicitante| Campos Obrigatórios
#     Quando informar Departamento feature TCO024
#     Então realizar a consulta feature TCO024
#
#     Quando selecionar o Grid Autorizador feature TCO024
#     E clicar botão ToolBar "novo" feature TCO024
#     Então informar Alcada feature TCO024
#
#     Quando clicar botão ToolBar "salvar" feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     E apresentar a mensagem parcial "O Autorizador deve ser informado." feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#     Quando informar Autorizador feature TCO024
#     Então clicar botão ToolBar "salvar" feature TCO024
#
#     Quando apresenta o modal "modal-basic-title" feature TCO024
#     E apresentar a mensagem parcial "O Tipo do Cargo deve ser informado." feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#     Quando informar Tipo Cargo feature TCO024
#     E "marcar" Aprovador de Necessidade feature TCO024
#     Então "marcar" Comprador feature TCO024
#
#     Quando clicar botão ToolBar "salvar" feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#     Quando informar Departamento feature TCO024
#     Então realizar a consulta feature TCO024
#
#     Quando selecionar o Grid Autorizador feature TCO024
#     Então  localiza Autorizador cadastrado feature TCO024
#
#     Quando clicar botão ToolBar "excluir" feature TCO024
#     E apresentar o modal H4 "modal-basic-title" feature TCO024
#     E clicar botão "sim" do modal feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#
#   # Tipos de Cargos
#   Cenário: Cadastrar, editar e excluir Tipos de Cargos| Caminho Feliz
#     Quando acessa a page "Tipo de Cargos" feature TCO024
#     E clicar botão ToolBar "novo" feature TCO024
#     E informa Codigo feature TCO024
#     Então informa Descricao feature TCO024
#
#     Quando clicar botão ToolBar "salvar" feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#     Quando selecionar o Codigo cadastrado feature TCO024
#     Então clicar botão ToolBar "excluir" feature TCO024
#
#     Quando apresentar o modal H4 "modal-basic-title" feature TCO024
#     E clicar botão "sim" do modal feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#
#   Cenário: Cadastrar, editar e excluir Tipos de Cargos| Teclas Atalho
#     Quando acessa a page "Tipo de Cargos" feature TCO024
#     E pressionar tecla "f6" feature TCO024
#     E informa Codigo feature TCO024
#     Então informa Descricao feature TCO024
#
#     Quando pressionar tecla "f10" feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#     Quando selecionar o Codigo cadastrado feature TCO024
#     Então pressionar teclas shift + f6 para excluir TCO024
#
#     Quando apresentar o modal H4 "modal-basic-title" feature TCO024
#     E clicar botão "sim" do modal feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#
#   Cenário: Cadastrar Tipo de Cargos com Código já cadastrado| Negativo
#     Quando acessa a page "Tipos de Cargos" feature TCO024
#     E clicar botão ToolBar "novo" feature TCO024
#     Então informar Descricao feature TCO024
#
#     Quando clicar botão ToolBar "salvar" feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     E apresentar a mensagem "O campo (Código do Tipo de Cargo) deve ser informado." feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#     Quando remover Descrição informada feature TCO024
#     Então informar Codigo feature TCO024
#
#     Quando clicar botão ToolBar "salvar" feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     E apresentar a mensagem "O campo (Descrição do Tipo de Cargo) deve ser informado." feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#     Quando clicar botão ToolBar "excluir" feature TCO024
#     E apresentar o modal H4 "modal-basic-title" feature TCO024
#     E apresentar a mensagem parcial "Deseja Excluir o Tipo de Cargo" feature TCO024
#     Então clicar botão "sim" do modal feature TCO024
#
#
#   # Departamento
#   Cenário: Cadastrar, editar e excluir Departamentos| Caminho Feliz
#     Quando acessa a page "Departamentos" feature TCO024
#     E clicar botão ToolBar "novo" feature TCO024
#     E informa Codigo feature TCO024
#     Então informa Descricao feature TCO024
#
#     Quando clicar botão ToolBar "salvar" feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#     Quando clicar botão ToolBar "excluir" feature TCO024
#     E apresentar o modal H4 "modal-basic-title" feature TCO024
#     E clicar botão "sim" do modal feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#
#   Cenário: Cadastrar, editar e excluir Departamentos| Teclas Atalho
#     Quando acessa a page "Departamentos" feature TCO024
#     E pressionar tecla "f6" feature TCO024
#     E informa Codigo feature TCO024
#     Então informa Descricao feature TCO024
#
#     Quando pressionar tecla "f10" feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     E apresentar a mensagem "Registro(s) salvo(s) com sucesso." feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#     Quando pressionar teclas shift + f6 para excluir TCO024
#     E apresentar o modal H4 "modal-basic-title" feature TCO024
#     E clicar botão "sim" do modal feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#
#   Cenário: Cadastrar Departamento com Código já cadastrado| Negativo
#     Quando acessa a page "Departamentos" feature TCO024
#     E clicar botão ToolBar "novo" feature TCO024
#     Então informar Descrição TCO024
#
#     Quando clicar botão ToolBar "salvar" feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     E apresentar a mensagem "O campo (Código do Departamento de Compra) deve ser informado." feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#     Quando remover Descrição informada feature TCO024
#     Então informar Codigo feature TCO024
#
#     Quando clicar botão ToolBar "salvar" feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     E apresentar a mensagem "O campo (Descrição do Departamento de Compra) deve ser informado." feature TCO024
#     Então clicar botão "ok" do modal feature TCO024
#
#     Quando clicar botão ToolBar "excluir" feature TCO024
#     E apresentar o modal H4 "modal-basic-title" feature TCO024
#     E apresentar a mensagem parcial "Deseja Excluir o Tipo de Cargo" feature TCO024
#     E clicar botão "sim" do modal feature TCO024
#     E apresenta o modal "modal-basic-title" feature TCO024
#     Então clicar botão "ok" do modal feature TCO024