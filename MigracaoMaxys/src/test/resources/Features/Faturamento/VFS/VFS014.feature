 #language: pt
 @wip @VFS014 @dt_VFS014 @chrome
 Funcionalidade: VFS014 - MOVIMENTAÇAO NFE

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do VFS014
     E acessar o programa "VFS014" feature VFS014

   Cenário: Movimentacao NFE | Page Notas Fiscais Eletronicas | Caminho feliz

     Quando acessar page "Notas Fiscais Eletrônicas" feature VFS014
     E informa data emissao inicial feature VFS014
     E informa data emissao final feature VFS014
     E seleciona status de envio feature VFS014
     E informa empresa feature VFS014
     E informa usuario feature VFS014
#     E selecionar duplicacao de papel feature VFS014
#     Então clicar botao consultar feature VFS014