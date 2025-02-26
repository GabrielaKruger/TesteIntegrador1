 #language: pt
 @test @GPE001 @dt_GPE001 @chrome
 Funcionalidade: GPE001 - Pedidos/Contrato de grão

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do GPE001
     E acessar o programa "GPE001" feature GPE001


   @4933v1
   Cenário: Contrato de Expedição - Normal- Fixo - Classificação Origem
     #Pedidos/contratos de grão
     Quando preencher Clifor4 page contratos de grao feature GPE001

     #Page Dados
     Quando seleciona Tipo de Contrato2 feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado2 feature GPE001
     E preencher Preço Unitário2 feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001



   @4933v2
   Cenário: Contrato de Expedição - Normal- A Fixar - Classificação Destino
    #Pedidos/contratos de grão
     Quando preencher Clifor5 page contratos de grao feature GPE001

     #Page Dados
     Quando seleciona Tipo de Contrato2 feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado2 feature GPE001
     E preencher Preço Unitário3 feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @4933v3
   Cenário: Contrato de Expedição - Normal- A Fixar - Classificação Destino
    #Pedidos/contratos de grão
     Quando preencher Clifor6 page contratos de grao feature GPE001
     E selecionar Faturamento "Expedição" feature GPE001
     Então selecionar Operação "Mestra" feature GPE001

     #Page Dados
     Quando seleciona Tipo de Contrato2 feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado2 feature GPE001
     E preencher Preço Unitário4 feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @4933v1

   @5619v1
   Cenário: Contrato Recebimento Normal

     #Pedidos/contratos de grão
     Quando preencher Clifor page contratos de grao feature GPE001

     #Page Dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento feature GPE001
     E preencher Ano safra feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado feature GPE001
     E preencher Preço Unitário feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @5619v1
   Cenário: Contrato - Page Favorecidos/Impressão- Valor pagamento maior [manual]

    #Pedidos/contratos de grão
     Quando preencher Clifor page contratos de grao feature GPE001
     #Page dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento feature GPE001
     E preencher Ano safra feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado feature GPE001
     Então preencher Preço Unitário feature GPE001

     Quando acessar page "Favorecidos/Impressão" feature GPE001
     E preencher Clifor2 page Favorecidos feature GPE001
     E preencher Valor pagamento feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "Favor verificar" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @5619v2
   Cenário: Contrato - Page Favorecidos/Impressão- Valor pagamento Menor [manual]

      #Pedidos/contratos de grão
     Quando preencher Clifor page contratos de grao feature GPE001

     #Page dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento feature GPE001
     E preencher Ano safra feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado feature GPE001
     Então preencher Preço Unitário feature GPE001

     Quando acessar page "Favorecidos/Impressão" feature GPE001
     E preencher Clifor2 page Favorecidos feature GPE001
     E preencher Valor pagamento2 feature GPE001
     E preencher Data pagamento feature GPE001
     Então seleciona Tipo pagamento feature GPE001

     Quando clicar botão ToolBar "salvar" feature GPE001
     E apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "Favor verificar" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @5619v3
   Cenário: Contrato - Page Favorecidos/Impressão- Valor pagamento maior [contrato]
    #Pedidos/contratos de grão
     Quando preencher Clifor page contratos de grao feature GPE001

     #Page dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento feature GPE001
     E preencher Ano safra feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado feature GPE001
     Então preencher Preço Unitário feature GPE001

     Quando acessar page "Favorecidos/Impressão" feature GPE001
     E preencher Clifor2 page Favorecidos feature GPE001
     E preencher Valor pagamento3 feature GPE001
     E preencher Data pagamento feature GPE001
     Então seleciona Tipo pagamento feature GPE001

     Quando clicar botão ToolBar "salvar" feature GPE001
     E apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "Favor verificar" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @5619v4
   Cenário: Contrato - Page Favorecidos/Impressão- Valor pagamento menor [contrato]
    #Pedidos/contratos de grão
     Quando preencher Clifor3 page contratos de grao feature GPE001

     #Page dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento feature GPE001
     E preencher Ano safra feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado feature GPE001
     Então preencher Preço Unitário feature GPE001

     Quando acessar page "Favorecidos/Impressão" feature GPE001
     E preencher Clifor4 page Favorecidos feature GPE001
     E preencher Valor pagamento4 feature GPE001
     E preencher Data pagamento feature GPE001
     E seleciona Tipo pagamento feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @5619v5
   Cenário: Contrato - Page Favorecidos/Impressão- Valor pagamento igual [contrato]
   #Pedidos/contratos de grão
     Quando preencher Clifor page contratos de grao feature GPE001

     #Page dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento feature GPE001
     E preencher Ano safra feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado feature GPE001
     Então preencher Preço Unitário feature GPE001

     Quando acessar page "Favorecidos/Impressão" feature GPE001
     E preencher Clifor2 page Favorecidos feature GPE001
     E preencher Data pagamento feature GPE001
     E seleciona Tipo pagamento feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @5716
   Cenário: Validação de Item sem movimentação cadastrada no TGR007
    #Pedidos/contratos de grão
     Quando preencher Clifor3 page contratos de grao feature GPE001
     Então selecionar Operação "Exportação" feature GPE001

     #Page dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto sem lov feature GPE001
     Então preencher Produto não cadastrado feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "Verifique TGR007" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @5717
   Cenário: Validação de Item sem permissão de utilização na empresa do contrato
     #Pedidos/contratos de grão

     Quando preencher Empr.Origem page contratos de grao feature GPE001
     Então preencher Clifor page contratos de grao feature GPE001

     #Page dados
     Quando seleciona Tipo de Contrato feature GPE001
     Então preencher Produto não cadastrado feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "não está cadastrado" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


