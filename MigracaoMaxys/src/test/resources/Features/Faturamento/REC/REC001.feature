#language: pt
@wip @REC001 @dt_REC001 @chrome

Funcionalidade: REC001 - Recebimento de Notas Fiscais

  # Refluxo reportados na solicitação.
  # Tem que decidir como será a escrita para mais de um item com massa de teste diferente
  Cenário de Fundo:
    Dado inicialize a execução dos cenários do REC001
    E acessar o programa "REC001" pela empresa "84" feature REC001

  @1v1 # Refluxo - Tela de Centro de Custo não finalizada
  Cenário: Nota de Entrada com Centro de Custo e Moeda 1
    Quando clicar botão ToolBar "novo" feature REC001
    E preenche N CNPJ CPF feature REC001
    Então clicar em Cancelar na tela de Seleção de Notas Mestras feature REC001

    Quando preencher Nota Fiscal feature REC001
    E preencher Série feature REC001
    E preencher Espécie feature REC001
    E preencher Data Emissão feature REC001
    E clicar em Desembarque feature REC001
    E preencher Forma de Pagamento feature REC001
    E preencher Condição Pagamento feature REC001
    E preencher Data Vencimento feature REC001
    E preencher Moeda Transação feature REC001
    E preencher Valor Nota feature REC001
    Então clicar em Departamento feature REC001

    Quando encontrar a page "Itens da Nota Fiscal" feature REC001
    E preencher Item feature REC001
    E preencher Movim. feture REC001
    E preencher Negócio feature GPE001
    E preencher Quantidade  feature GPE001
    Então preencher Valor Unit. feature GPE001

    # Refluxo - Tela de centro de custo não finalizada
    Quando acessar a tela "CENTRO DE CUSTO" feature REC001
    E preencher primeiro item Empresa  feature REC001
    E preencher primeiro item Centro Custo featue REC001
#    E preencher primeiro item Neg. feature REC001
#    E preencher primeiro item feature REC001
#    E preencher segundo item Empresa feature REC001
#    E preencher segundo item Centro Custo featue REC001
#    E preencher segundo item Neg. feature REC001
#    E preencher segundo item feature REC001
#    Então clicar botão Ok em CENTRO DE CUSTO feature REC001

    Quando encontrar a page "Itens da Nota Fiscal" feature REC001
#    E preencher segundo Item feature REC001
#    E preencher Movim. segundo item feture REC001
#    E preencher Negócio segundo item feature GPE001
#    E preencher Quantidade segundo item feature GPE001
#    Então preencher Valor Unit. segundo item feature GPE001

    Quando acessar a tela "CENTRO DE CUSTO" feature REC001
#    E preencher primeiro item Empresa feature REC001
#    E preencher primeiro item Centro Custo featue REC001
#    E preencher primeiro item Neg. feature REC001
#    E preencher primeiro item feature REC001
#    E preencher segundo item Empresa feature REC001
#    E preencher segundo item Centro Custo featue REC001
#    E preencher segundo item Neg. feature REC001
#    E preencher segundo item feature REC001
#    E preencher terceiro item Empresa feature REC001
#    E preencher terceiro item Centro Custo featue REC001
#    E preencher terceiro item Neg. feature REC001
#    E preencher terceiro item  feature REC001
#    Então clicar botão Ok em CENTRO DE CUSTO0 feature REC001

    Quando encontrar a page "Itens da Nota Fiscal" feature REC001
#    E preencher terceiro Item feature REC001
#    E preencher Movim. terceiro item feture REC001
#    E preencher Negócio terceiro item feature GPE001
#    E preencher Quantidade terceiro item feature GPE001
#    Então preencher Valor Unit. terceiro item feature GPE001

    Quando acessar a tela "CENTRO DE CUSTO" feature REC001
#    E preencher primeiro item Empresa feature REC001
#    E preencher primeiro item Centro Custo featue REC001
#    E preencher primeiro item Neg. feature REC001
#    E preencher primeiro item feature REC001
#    Então clicar botão Ok em CENTRO DE CUSTO feature REC001

    Quando clicar botão ToolBar "salvar" feature REC001
    E apresentar o modal H5 "modal-basic-title" feature REC001
    E apresentar a mensagem "gravada com sucesso." feature REC001
    Então clicar botão "ok" do modal feature REC001

  @2v1
  Cenário: Nota de Entrada com Data de Vencimento Digitada (Cond 800)

  @2v2
  Cenário: Nota de Entrada com Vencimento Parcelado (Cond 900)

  @2v3
  Cenário: Nota de Entrada com Pedido de Compra (COM004)

  @2v5
  Cenário: Nota de Entrada com Pedido e alteração de parcelamento digitado

  @3v1
  Cenário: Nota de Entrada Mestra com Moeda 1

  @3v3
  Cenário: Nota de Entrada Mestra com Despesas Acessórias e Frete

  @3v4
  Cenário: Nota de Entrada Mestra com Despesas Acessórias

  @3v5
  Cenário: Nota de Entrada Mestra com Valor de Frete

  @4v1
  Cenário: Nota de Entrada Remessa com Moeda 1

  @4v4
  Cenário: Nota de Entrada Remessa com Despesas de Acessórios

  @4v5
  Cenário: Nota de Entrada Remessa com Valor de Frete

  @13v1
  Cenário: Nota de Entrada com Itens de lote de Semente

  @239v1
  Cenário: Nota Remessa de Entrada com parâmetro "Atualiza o Valor Unitário da Mestra" Desmarcado

  @239v2
  Cenário: Nota Remessa de Entrada com parâmetro "Atualiza o Valor Unitário da Mestra" Marcado

  @571v1
  Cenário: Nota de Entrada com Desconto nos Itens

  @803v1
  Cenário: Nota de Entrada com Adiantamento

  @804v2
  Cenário: Emissão de nota fiscal de CTRC não obrigando informar os estados origem do frete

  @1228v1
  Cenário: Norta normal caindo em bloqueio no REC017 com a emissão no REC019

  @1218v2
  Cenário: Nota mestra caindo em bloqueio no REC017 com a emissão no REC019 e nota de remessa emissão normal

  @1218v3
  Cenário: Nota com itens com centro de custo caindo em bloqueio no REC017 com a emissão no REC019

  @1218v4
  Cenário: Nota com itens de lote caindo em bloqueio no REC017 com a emissão no REC019	REC001

  @1218v5
  Cenário: Nota normal atendendo pedido caindo em bloqueio no REC017 com a emissão no REC019

  @5369v1
  Cenário: Recebimento de pedido com clifor diferente porém com mesma raiz de CNPJ do clifor do pedido

  @6324v1
  Cenário: Não permitir alteração de movimentação atendendo pedido