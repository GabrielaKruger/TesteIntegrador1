# language: pt
@regressivo @Motorista @dt_motorista @gpe
Funcionalidade: Cadastro de Motorista

  @positivo @preenchimentoCompleto

  Cenário: Preencher filtros para listar cargas
    Dado acessar a tela de listagem de cargas

#    Quando clicar botão Inserir Carga feature ListarCargas
#    E preencher Destino para adicionar na feature ListarCargas
#    E preencher Produto para adicionar na feature ListarCargas
#    E preencher Espécie para adicionar na feature ListarCargas
#    E clicar botão salvar


    Quando preencher Origem na feature ListarCargas
    E preencher Destino na feature ListarCargas
    E preencher Produto na feature ListarCargas
    E preencher Espécie na feature ListarCargas
   # Entao clicar no botão Buscar na feature ListarCargas

#  Então clicar botão excluir para excluir carga feature ListarCargas