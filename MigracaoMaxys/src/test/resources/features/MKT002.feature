#language: pt
@test @Pricing @dt_MKT002 @MKT @MKT002 @chrome
Funcionalidade: MKT002 - Ofertas Originação

  # Teste MKT002

  Cenario de Fundo:
    Dado inicialize a execução dos cenários do MKT002
    Então acessar o programa "MKT002" feature MKT002

  Cenario: Cadastro de Tipos de Informação de Precificação | Caminho feliz
    Então acessa o programa "MKT003"

#    Quando informar dados de filtro
#    E clicar botão Informações Adicionais
#    E informar dados adicionais
#    E clicar botão Gravar Adicionais
#    Então esperar para reconhecer a gravação MKT002
#
#    Quando acessa o programa "MKT002"
#    Então informar dados de filtro
#
#    Quando clicar botão Informações Adicionais
#    E remover dados adicionados
#    Então clicar botão Gravar Adicionais


#  @test @Pricing @MKT @MKT002
#  Cenario: Ofertas Originação - Validação Contrato
#    Então acessa o programa "MKT002"

#    Quando informar dados de filtro
#    Então clicar botão Abrir Contrato