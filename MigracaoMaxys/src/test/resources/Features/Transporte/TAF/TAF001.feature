 #language: pt
 @test @TTB163 @dt_TTB163 @chrome
 Funcionalidade: TTB163 - Cadastro Alçada de Cadastro de Frete

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do TTB163
     E acessar o programa "TTB163" pela empresa "84" feature TTB163

   @102V1
   Cenário: Emissão de frete com carta frete avulsa

   @338v1
   Cenário: Emissão de CT-e com contrato de frete TTB121 com pedágio

   @434v1
   Cenário: Emissão de CT-e com contrato de frete COM seguradora

   @434v2
   Cenário: Emissão de CT-e com contrato de frete SEM seguradora

   @437v1
   Cenário: Emissão de CT-e com ordem de coleta contrato frete TTB121

   @843v1
   Cenário: Lançamento de pré conhecimento préCT-e

   @843v2
   Cenário: Lançamento de pré conhecimento ACT

   @1309v1
   Cenário: Emissão de CT-e com pauta fiscal

   @1578v1
   Cenário: Emissão de CT-e informando mais de uma NF

   @1807v1
   Cenário: Emissão de CT-e com placas de terceiros, sem junção

   @1807v2
   Cenário: Emissão de CT-e com placas de terceiros, com junção

   @1808v1
   Cenário: Lançamento de CT-e com veículo próprio

   @1885v1
   Cenário: Emissão de NF de Serviço

   @2009v1
   Cenário: Emissão de CT-e com Cliente Pagador Outros

   @2013v1
   Cenário: Emissão de CT-e com contrato de frete TTB111

   @2013v2
   Cenário: Emissão de CT-e com contrato de frete TTB121

   @2056v1
   Cenário: Emissão de CT-e com adicionais de frete(POSITIVO)

   @2056v2
   Cenário: Emissão de CT-e com adicionais de frete(NEGATIVO)

   @2330v1
   Cenário: Emissão de CT-e com pagamento a vista

   @2693v1
   Cenário: Emissão de CT-e com contrato do TTB111 e pagador com mais de um endereço

   @2693v2
   Cenário: Emissão de CT-e com contrato do TTB121 e pagador com mais de um endereço

   @2696v1
   Cenário: Emissão de CT-e com várias notas fiscais

   @2817v1
   Cenário: Lançamento de frete gerencial

   @2860v1
   Cenário: Emissão de CT-e obrigando e informando prazo de entrega/descarga

   @2860v2
   Cenário: Emissão de CT-e obrigando e NÃO informando prazo de entrega/descarga

   @2860v3
   Cenário: Emissão de CT-e SEM obrigar prazo de entrega/descarga

   @2927v1
   Cenário: Emissão de CT-e com consulta gestão de risco (Sotran)

   @2927v2
   Cenário: Emissão de CT-e com consulta gestão de risco (Sotran) - Mais de um lançamento

   @3159v1
   Cenário: Emissão de CTRC(1)+Complemento: Valor(2), ICMS(3), Peso e Valor (4)

   @3587v1
   Cenário: Emissão de NF de Serviço com contrato de frete TTB111

   @3587v2
   Cenário: Emissão de NF de Serviço com contrato de frete TTB121

   @3590v1
   Cenário: Emissão de CT-e informando mais de uma NF com contrato de frete TTB111

   @3590v1
   Cenário: Emissão de CT-e informando mais de uma NF com contrato de frete TTB121

   @3580v1
   Cenário: Emissão de CT-e com forma de pagamento CC

   @4101v1
   Cenário: Emissão de CT-e com viagem

   @4446v1
   Cenário: Emissão de CT-e Globalizado Remetente

   @4446v2
   Cenário: Emissão de CT-e Globalizado Destinatário

   @4446v3
   Cenário: Emissão de CT-e Globalizado Outro - Inválido

   @4446v4
   Cenário: Emissão de CT-e Globalizado Remetente - Inválido

   @4446v5
   Cenário: Emissão de CT-e Globalizado Destinatário - Inválido

   @4455v1
   Cenário: Emissão de CT-e complementar para carga recusada com contrato de frete TTB111

   @4455v2
   Cenário: Emissão de CT-e complementar para carga recusada com contrato de frete TTB111, alterando clifor pagador

   @4455v3
   Cenário: Emissão de CT-e complementar para carga recusada com contrato de frete TTB121

   @4455v4
   Cenário: Emissão de CT-e complementar para carga recusada com contrato de frete TTB121, alterando clifor pagador

   @4456v1
   Cenário: Emissão de CT-e com parâmetro de negócios do TTB018

   @4456v2
   Cenário: Emissão de CT-e sem parâmetro de negócios do TTB018

   @4505v1
   Cenário: NF-e antes da emissão de CT-e - Chave Acesso

   @4505v2
   Cenário: NF-e antes da emissão de CT-e - Chave Acesso CFI013

   @4558v2
   Cenário: CT-e de Crédito de Combustivel + CTe Complementar de peso e valor

   @4558v2
   Cenário: CT-e de Crédito de Combustivel + CTe Complementar de peso e valor

   @4866v1
   Cenário: Lançamento de CT-e com desconto de seguro de carga

   @4907v1
   Cenário: Emissão de CT-e com pedágio Cartão (Terceiros)

   @5019v1
   Cenário: Emissão de CT-e com ordem de coleta - 1 Agendamento

   @5019v2
   Cenário: Emissão de CT-e com ordem de coleta - 2 Agendamento

   @5091v1
   Cenário: Emissão de NF de Serviço sem contrato de frete TTB111 + Consulta VFT003

   @5092v1
   Cenário: Cancelamento de NF de Serviço sem contrato de frete TTB111 + Consulta VFT003

   @5597v1
   Cenário: Lançamento de CT-e com seguro de carga
