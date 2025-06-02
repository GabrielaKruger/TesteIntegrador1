# language: pt
@regressivo @Motorista @dt_motorista @gpe
Funcionalidade: Cadastro de Motorista

  @positivo @preenchimentoCompleto

  Cenário: Preencher filtros para listar cargas
    Dado acessar a tela de listagem de cargas
    Quando preencher Origem na feature ListarCargas
    E preencher Destino na feature ListarCargas
    E preencher Produto na feature ListarCargas
    E preencher Espécie na feature ListarCargas
   # Entao clicar no botão Buscar na feature ListarCargas