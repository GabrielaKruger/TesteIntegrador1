 #language: pt
 @test @VFS014 @dt_VFS014 @chrome
 Funcionalidade: VFS014 - MOVIMENTAÇAO NFE

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do VFS014
     E acessar o programa "VFS014" pela empresa "84" feature VFS014

     # Ao iniciar cenário pela 1º verificar se inicio está apresentando modal de certificado vencido

   Cenário: Movimentacao NFE | Page Notas Fiscais Eletronicas | Caminho feliz

     Quando informa data emissao inicial feature VFS014
     E informa data emissao final feature VFS014
     E seleciona status de envio feature VFS014
     E informa empresa feature VFS014
     E informa usuario feature VFS014
     E seleciona status da impressao feature VFS014
     E seleciona status contigencia feature VFS014
     E seleciona status recolhimento funrural feature VFS014
     E seleciona tipo faturamento feature VFS014
     E seleciona tipo impressao feature VFS014
     E clica em consultar feature VFS014
     Então validar se possui notas fiscais no grid feature VFS014


   Cenário: Movimentacao NFE | Page Inutilizacao | Caminho feliz

     Quando acessar page "Inutilização" feature VFS014
     E seleciona status de inutilizacão feature VFS014
     E informa serie nota feature VFS014
     E informa data inicial feature VFS014
     E informa data final feature VFS014
     E clica em consultar inutilizacao feature VFS014


   Cenário: Movimentacao NFE | Page Informacoes | Caminho feliz

     Quando acessar page "Informações" feature VFS014
     E informa periodo data inicial feature VFS014
     E informa periodo data final feature VFS014
     E informa empresa na page informacoes feature VFS014
     E clica em computar estatistica feature VFS014
