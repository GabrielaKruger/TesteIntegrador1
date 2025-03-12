#language: pt
@wip @BAL017 @dt_BAL017 @chrome

Funcionalidade: BAL017 - Pesagens bloqueadas/Peso manual

  Cenário de Fundo:
    Dado inicialize a execução dos cenários do BAL017
    E acessar o programa "BAL017" pela empresa "84" feature BAL017

@wip #não está filtrando
  Cenário: Autorizar pesagens manuais bloqueadas |  Caminho feliz
    Quando preencher Empresa feature BAL017
    E preencher Depósito feature BAL017
    E selecionar status "Bloqueado" feature BAL017
    E selecionar Faturamento "Ambos" feature BAL017
    E preencher Período inicial feature BAL017
    E preencher Período final feature BAL017
    E clicar botão para filtrar "Filtrar" BAL017
    Então clicar botão para autorizar "Autorizar" feature BAL017

    Quando apresentar o modal H5 "modal-basic-title" feature BAL017
    E apresentar a mensagem parcial do botão autorizar "autorizada!" feature BAL017
    Então clicar botão "ok" do modal feature BAL017


  Cenário: Recusar pesagens manuais bloqueadas |  Caminho feliz
    Quando preencher Empresa feature BAL017
    E preencher Depósito feature BAL017
    E selecionar status "Bloqueado" feature BAL017
    E selecionar Faturamento "Ambos" feature BAL017
    E preencher Período inicial feature BAL017
    E preencher Período final feature BAL017
    E clicar botão para filtrar "Filtrar" BAL017
    Então clicar botão de recusa "Recusar" feature BAL017

    Quando apresentar o modal H5 "modal-basic-title" feature BAL017
    E apresentar a mensagem parcial da recusa "recusada!" feature BAL017
    Então clicar botão "ok" do modal feature BAL017

  Cenário: Testar Filtros (Autorizado) |  Negativo
    Quando preencher Empresa feature BAL017
    E preencher Depósito feature BAL017
    E selecionar status "Autorizado" feature BAL017
    E selecionar Faturamento "Ambos" feature BAL017
    E preencher Período inicial feature BAL017
    E preencher Período final feature BAL017
    Então clicar botão para filtrar "Filtrar" BAL017

  Cenário: Testar Filtros (Recusado) |  Negativo
    Quando preencher Empresa feature BAL017
    E preencher Depósito feature BAL017
    E selecionar status "Recusado" feature BAL017
    E selecionar Faturamento "Ambos" feature BAL017
    E preencher Período inicial feature BAL017
    E preencher Período final feature BAL017
    Então clicar botão para filtrar "Filtrar" BAL017