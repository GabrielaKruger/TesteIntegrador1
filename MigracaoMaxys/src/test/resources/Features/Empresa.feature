# language: pt
@regressivo @Empresa @dtempresa @gpe
Funcionalidade: Cadastro de Empresa

  @positivo @preenchimentoCompleto
  Cenário: Cadastrar nova empresa
    Dado acessar a tela de nova empresa
    Quando preencher Razão Social feature Empresa
    E preencher Nome Fantasia feature Empresa
    E preencher CNPJ feature Empresa
    E preencher Inscrição Estadual feature Empresa
    E preencher Endereço feature Empresa
    E preencher Cidade feature Empresa
    E preencher Estado feature Empresa
    E preencher Telefone feature Empresa
    E preencher Email feature Empresa
    E preencher Data de Fundação feature Empresa
    E marcar checkbox Ativo feature Empresa

    Então clicar no botão Salvar feature Empresa
