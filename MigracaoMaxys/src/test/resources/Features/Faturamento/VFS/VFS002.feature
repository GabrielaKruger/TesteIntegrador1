 #language: pt
 @wip @VFS002 @dt_VFS002 @chrome
 Funcionalidade: VFS002 - MOVIMENTAÇAO NFE

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do VFS002
     E acessar o programa "VFS002" pela empresa "84" feature VFS002

   # Precisa ajustar bug ja reportado

   @8v1 @wip
   Cenário: Nota fiscal de saída MESTRA com moeda 1

     Quando selecionado tipo de venda "Nenhum" na feature VFS002
     E seleciona a serie da nota fiscal feature VFS002
     E informa data emissao da nota feature VFS002
     E preenche o clifor da nota feature VFS002
     E carrega CNJP feature VFS002
     E fecha sel notas e itens de mestra feature VFS002
     E preenche condicao pagamento feature VFS002
     E preencher forma de pagamento feature VFS002
     E preencher moeda transação feature VFS002
     E clica na page "Itens" feature VFS002


##
##   @8v2
##   Cenário: Nota fiscal de saída MESTRA com moeda 2
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @9v1
##   Cenário: Nota fiscal de saída de REMESSA com moeda 1
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @9v2
##   Cenário: Nota fiscal de saída de REMESSA com moeda 2
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @10v1
##   Cenário: Nota fiscal de saída com tabela de preço
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @580v1
##   Cenário: Nota fiscal de saída com vendedor e subvendedor
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @580v2
##   Cenário: Nota fiscal de saída com vendedor gerando boleto
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @580v3
##   Cenário: Nota fiscal de saída com vendedor
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @580v4
##   Cenário: Nota fiscal de saída gerando boleto
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @580v5
##   Cenário: Nota fiscal de saída simples moeda 1
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @580v6
##   Cenário: Nota fiscal de saída c/ cond pagamento parcelada digitada
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @580v7
##   Cenário: Nota fiscal de saída c/ cond pagamento vencimento digitado
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @580v8
##   Cenário: Nota fiscal de saída simples moeda 2
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @580v9
##   Cenário: Emissão nota fiscal de transferência entre filiais
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @580v10
##   Cenário: Emissão nota fiscal com vendedor e imprimindo a DANFE
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @580v11
##   Cenário: Emissão nota fiscal complemento de ICMS
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @814v1
##   Cenário: Emissão de nota fiscal caindo em bloqueio no VFS008
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @2486v1
##   Cenário: Nota Saída Desoneração - (TIT001)
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @2887v1
##   Cenário: Nota fiscal de saída com tipo de frete CIF
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @2887v2
##   Cenário: Nota fiscal de saída com tipo de frete FOB
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @2887v3
##   Cenário: Nota fiscal de saída com tipo de frete PCT
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @2887v4
##   Cenário: Nota fiscal de saída com tipo de frete SFT
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @3111v1
##   Cenário: Emissão nota fiscal com clifor na lista negra(Negativo)
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @3111v2
##   Cenário: Emissão nota fiscal com clifor na lista negra(Positivo)
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @4110v1
##   Cenário: Emissão de nota fiscal de saída com receituário agronômico usando o layout RAG020
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @4881v1
##   Cenário: Nota Saída Desoneração - (TFI003)
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @5478v1
##   Cenário: Validação de Código de Barra do Item - Código superior a 14 Digitos
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
##
##
##   @5478v2
##   Cenário: Validação de Código de Barra do Item - Código Igual 14 Digitos
##
##     Quando informa data emissao inicial feature VFS002
##     E informa data emissao final feature VFS002
##     Então validar se possui notas fiscais no grid feature VFS002
