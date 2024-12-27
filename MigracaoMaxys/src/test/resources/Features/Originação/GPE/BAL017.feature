#language: pt
@wip @BAL017 @dt_BAL017 @chrome

Funcionalidade: GPE001 - Pesagens bloqueadas/Peso manual

  Cenário de Fundo:
    Dado inicialize a execução dos cenários do BAL017
    E acessar o programa "BAL017" feature BAL017

  Cenário: Autorizar pesagens manuais bloqueadas |  Caminho feliz
    Quando preencher Empresa feature BAL017
    E preencher Depósito feature BAL017
    E selecionar status Bloqueado feature BAL017
    E selecionar Faturamento Ambos feature BAL017
    E preencher Período feature BAL017
    Então clicar botão "Autorizar" feature BAL017

    Quando apresentar o modal H5 "modal-basic-title" feature FCT007
    E apresentar a mensagem "Pesagem (181525) da empresa (84) autorizada! A mesma foi enviada ao GRE014!" feature FCT007
    Então clicar botão "ok" do modal feature FCT007


  Cenário: Recusar pesagens manuais bloqueadas |  Caminho feliz
    Quando preencher Empresa feature BAL017
    E preencher Depósito feature BAL017
    E selecionar status Bloqueado feature BAL017
    E selecionar Faturamento Ambos feature BAL017
    E preencher Período feature BAL017
    Então clicar botão "Recusar" feature BAL017

    Quando apresentar o modal H5 "modal-basic-title" feature FCT007
    E apresentar a mensagem "Pesagem (181525) da empresa (84) autorizada! A mesma foi enviada ao GRE014!" feature FCT007
    Então clicar botão "ok" do modal feature FCT007


