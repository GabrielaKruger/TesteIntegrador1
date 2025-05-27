# language: pt
@regressivo @Motorista @dt_motorista @gpe
Funcionalidade: Cadastro de Motorista

  @positivo @preenchimentoCompleto
  Cenário: Cadastrar novo motorista
    Dado acessar a tela de novo motorista
    Quando preencher Nome Completo feature Motorista
    E preencher Endereço feature Motorista
    E preencher Cidade feature Motorista
    E preencher CNH feature Motorista
    E preencher Estado feature Motorista
    E preencher CPF feature Motorista
    E preencher Celular feature Motorista
    E preencher País feature Motorista
    Entao preencher Número feature Motorista

    E clicar no botão Salvar feature Motorista
