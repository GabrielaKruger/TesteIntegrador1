 #language: pt
 @wip @GPE001 @dt_GPE001 @chrome
 Funcionalidade: GPE001 - Pedidos/Contrato de grão

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do GPE001
     E acessar o programa "GPE001" pela empresa "84" feature GPE001

   @4933v1
   Cenário: Contrato de Expedição - Normal- Fixo - Classificação Origem
     #Pedidos/contratos de grão
     Quando preencher CliforPF page contratos de grao feature GPE001

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
     Quando preencher CliforPF page contratos de grao feature GPE001

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
   Cenário: Contrato de Expedição - Normal- Remessa Formação de Lote
    #Pedidos/contratos de grão
     Quando preencher CliforPJ page contratos de grao feature GPE001
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
     E preencher Preço Unitário5 feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @4934v1
   Cenário: Contrato de Expedição - Mestra- Fixo - Classificação Origem
    #Pedidos/contratos de grão
     Quando preencher CliforPF page contratos de grao feature GPE001
     E selecionar Faturamento "Expedição" feature GPE001
     Então selecionar Operação "Mestra" feature GPE001

     #Page Dados
     Quando seleciona Tipo de Contrato3 feature GPE001
     E preencher Produto3 feature GPE001
     E preencher Tabela de Desconto2 feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo2 feature GPE001
     E preencher PesoEVolume Contratado3 feature GPE001
     E preencher Preço Unitário4 feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @4934v2
   Cenário: Contrato de Expedição - Mestra- Venda Cta e Ordem - Vda e Rem
    #Pedidos/contratos de grão
     Quando preencher CliforPJ page contratos de grao feature GPE001
     E selecionar Faturamento "Expedição" feature GPE001
     Então selecionar Operação "Exportação" feature GPE001

     #Page Dados
     Quando seleciona Tipo de Contrato4 feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo2 feature GPE001
     E preencher PesoEVolume Contratado3 feature GPE001
     E preencher Preço Unitário6 feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @4935v1
   Cenário: Contrato de Expedição - Exportação- Venda Indireta
    #Pedidos/contratos de grão
     Quando preencher CliforPF page contratos de grao feature GPE001

     #Page Dados
     Quando seleciona Tipo de Contrato5 feature GPE001
     E preencher Produto4 feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado2 feature GPE001
     E preencher Preço Unitário7 feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar a mensagem parcial "Vencimento  do ICMS." feature GPE001
     E acessar page "Vencimento ICMS" feature GPE001
     Então clicar botão "ok" do modal feature GPE001

     Quando preencher Dia feature GPE001
     E preencher Condição de pagamento feature GPE001
     Então clicar botão "Repetir Vencimento" page Vencimento ICMS feature GPE001

     Quando clicar botão ToolBar "salvar" feature GPE001
     E apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @4936v1
   Cenário: Contrato de Recebimento - Normal- Fixo - Classificação Origem
    #Pedidos/contratos de grão
     Quando preencher CliforPJ page contratos de grao feature GPE001

     #Page Dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado2 feature GPE001
     E preencher Preço Unitário8 feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @4936v2
   Cenário: Contrato de Recebimento - Normal- A Fixar - Classificação Destino
    #Pedidos/contratos de grão
     Quando preencher CliforPF page contratos de grao feature GPE001

     #Page Dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado4 feature GPE001
     Então preencher Preço Unitário9 feature GPE001

     Quando acessar page "Frete <F5>" feature GPE001
     E preencher Cliente page Frete feature GPE001
     E preencher Rota page Frete feature GPE001
     E preencher Rota page Frete feature GPE001
     E preencher Data de Início page Frete feature GPE001
     E preencher Tipo de Cálculo page Frete feature GPE001
     E preencher Valor Unitário page Frete feature GPE001
     E selecionar Filtro Frete "Ativos" page Frete feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @4936v3
   Cenário: Contrato de Recebimento - Normal- Fixo - Paga Frete
    #Pedidos/contratos de grão
     Quando preencher CliforPJ page contratos de grao feature GPE001

     #Page Dados
     Quando seleciona Tipo de Contrato5 feature GPE001
     E preencher Produto4 feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado2 feature GPE001
     Então preencher Preço Unitário10 feature GPE001

     Quando acessar page "Bonificação" feature GPE001
     E preencher Empresa page Bonificação feature GPE001
     E preencher Qualidade page Bonificação feature GPE001
     E preencher PesoEVolume Bonificado page Bonificação feature GPE001
     E preencher PesoEVolume Já Pago page Bonificação feature GPE001
     E preencher Data Limite page Bonificação feature GPE001
     E preencher %Bonif Comercial page Bonificação feature GPE001
     E preencher %Bonif Familiar page Bonificação feature GPE001

     E preencher Empresa2 page Bonificação feature GPE001
     E preencher Qualidade2 page Bonificação feature GPE001
     E preencher PesoEVolume2 Bonificado page Bonificação feature GPE001
     E preencher PesoEVolume2 Já Pago page Bonificação feature GPE001
     E preencher Data Limite2 page Bonificação feature GPE001
     E preencher %Bonif Comercial2 page Bonificação feature GPE001
     E preencher %Bonif Familiar2 page Bonificação feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar a mensagem parcial "Vencimento  do ICMS." feature GPE001
     E acessar page "Vencimento ICMS" feature GPE001
     Então clicar botão "ok" do modal feature GPE001

     Quando preencher Dia feature GPE001
     E preencher Condição de pagamento feature GPE001
     Então clicar botão "Repetir Vencimento" page Vencimento ICMS feature GPE001

     Quando clicar botão ToolBar "salvar" feature GPE001
     E apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @4936v4
   Cenário: Contrato de Recebimento - Normal- Fixo - Com Bonificação
    #Pedidos/contratos de grão
     Quando preencher CliforPJ page contratos de grao feature GPE001

     #Page Dados
     Quando seleciona Tipo de Contrato5 feature GPE001
     E preencher Produto4 feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado2 feature GPE001
     Então preencher Preço Unitário10 feature GPE001

     Quando acessar page "Frete <F5>" feature GPE001
     E preencher Cliente page Frete feature GPE001
     E preencher Rota page Frete feature GPE001
     E preencher Rota page Frete feature GPE001
     E preencher Data de Início page Frete feature GPE001
     E preencher Tipo de Cálculo page Frete feature GPE001
     E preencher Valor Unitário page Frete feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar a mensagem parcial "Vencimento  do ICMS." feature GPE001
     E acessar page "Vencimento ICMS" feature GPE001
     Então clicar botão "ok" do modal feature GPE001

     Quando preencher Dia feature GPE001
     E preencher Condição de pagamento feature GPE001
     E clicar botão "Repetir Vencimento" page Vencimento ICMS feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @4936v5
   Cenário: Contrato de Recebimento - Normal- Fixo - Com Serviço Vinculado
    #Pedidos/contratos de grão
     Quando preencher CliforPF page contratos de grao feature GPE001

     #Page Dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado2 feature GPE001
     Então preencher Preço Unitário3 feature GPE001

     Quando acessar page "Serviços <Shift + F4>" feature GPE001
     E preencher Serviço page Serviços feature GPE001
     E preencher Tp.Serviço page Serviços feature GPE001
     E preencher Dt.Início page Serviços feature GPE001
     #E preencher Dt.Fim page Serviços feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @4937v1
   Cenário: Contrato de Recebimento - Normal- Fixo -
    #Pedidos/contratos de grão
     Quando preencher CliforPJ page contratos de grao feature GPE001
     E selecionar Operação "Mestra" feature GPE001

     #Page Dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado2 feature GPE001
     E preencher Preço Unitário9 feature GPE001
     E selecionar Classificação "Origem" feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @5014v1
   Cenário: Inclusão de Contrato com vários vencimentos- 2 Cond Pagto p/2 Recebto
       #Pedidos/contratos de grão
     Quando preencher CliforPF page contratos de grao feature GPE001

       #Page Dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto4 feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     Então preencher PesoEVolume Contratado feature GPE001

     Quando acessar page "Vencimentos <F4>" feature GPE001
     E preencher PesoeVolume page Vencimentos feature GPE001
     E preencher Condição de Pagamento page Vencimentos feature GPE001
     E preencher Forma de Pagamento page Vencimentos feature GPE001
     E preencher PesoeVolume2 page Vencimentos feature GPE001
     E preencher Condição de Pagamento2 page Vencimentos feature GPE001
     E preencher Forma de Pagamento2 page Vencimentos feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar a mensagem parcial "Vencimento  do ICMS." feature GPE001
     E acessar page "Vencimento ICMS" feature GPE001
     Então clicar botão "ok" do modal feature GPE001

     Quando preencher Dia feature GPE001
     E preencher Condição de pagamento feature GPE001
     E clicar botão "Repetir Vencimento" page Vencimento ICMS feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @5014v2
   Cenário: Inclusão de Contrato com vários vencimentos- 2 Dt.Pagto p/2 Recebto
     #Pedidos/contratos de grão
     Quando preencher CliforPJ page contratos de grao feature GPE001

     #Page Dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto4 feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado feature GPE001
     E preencher Preço Unitário11 feature GPE001

     Quando acessar page "Vencimentos <F4>" feature GPE001
     E preencher PesoeVolume page Vencimentos feature GPE001
     E preencher Data Condição de Pagamento page Vencimentos feature GPE001
     E preencher Forma de Pagamento page Vencimentos feature GPE001
     E preencher PesoeVolume2 page Vencimentos feature GPE001
     E preencher Data2 Condição de Pagamento page Vencimentos feature GPE001
     E preencher Forma de Pagamento2 page Vencimentos feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar a mensagem parcial "Vencimento  do ICMS." feature GPE001
     E acessar page "Vencimento ICMS" feature GPE001
     Então clicar botão "ok" do modal feature GPE001

     Quando preencher Dia feature GPE001
     E preencher Condição de pagamento feature GPE001
     E clicar botão "Repetir Vencimento" page Vencimento ICMS feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @5014v3
   Cenário: Inclusão de Contrato de com vários vencimentos- 2 Cond Pagto p/ 1 Recebto Total
     #Pedidos/contratos de grão
     Quando preencher CliforPF page contratos de grao feature GPE001

      #Page Dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto4 feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado feature GPE001
     E preencher Preço Unitário11 feature GPE001

     Quando acessar page "Vencimentos <F4>" feature GPE001
     E preencher PesoeVolume page Vencimentos feature GPE001
     E preencher Condição de Pagamento page Vencimentos feature GPE001
     E preencher Forma de Pagamento page Vencimentos feature GPE001
     E preencher PesoeVolume2 page Vencimentos feature GPE001
     E preencher Condição de Pagamento2 page Vencimentos feature GPE001
     E preencher Forma de Pagamento2 page Vencimentos feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001


   @5014v4
   Cenário: Inclusão de Contrato com vários vencimentos- 2 Dt.Pagto p/1 Recebto
     #Pedidos/contratos de grão
     Quando preencher CliforPJ page contratos de grao feature GPE001

      #Page Dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto4 feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado feature GPE001
     Então preencher Preço Unitário11 feature GPE001

     Quando acessar page "Vencimentos <F4>" feature GPE001
     E preencher PesoeVolume page Vencimentos feature GPE001
     E preencher Data Condição de Pagamento page Vencimentos feature GPE001
     E preencher Forma de Pagamento page Vencimentos feature GPE001
     E preencher PesoeVolume2 page Vencimentos feature GPE001
     E preencher Data2 Condição de Pagamento page Vencimentos feature GPE001
     E preencher Forma de Pagamento2 page Vencimentos feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar a mensagem parcial "Vencimento  do ICMS." feature GPE001
     E acessar page "Vencimento ICMS" feature GPE001
     Então clicar botão "ok" do modal feature GPE001

     Quando preencher Dia feature GPE001
     E preencher Condição de pagamento feature GPE001
     E clicar botão "Repetir Vencimento" page Vencimento ICMS feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @5532v1(último)
   Cenário: Lançamento de Pesagem contrato recebimento parâmetro "Monta Processo(Contratos Fixos)"
       #Pedidos/contratos de grão
     Quando preencher CliforPF page contratos de grao feature GPE001
             #Page Dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto4 feature GPE001
     E preencher Tabela de Desconto feature GPE001
     E preencher Negócio feature GPE001
     E preencher Data de Vencimento2 feature GPE001
     E preencher Ano safra2 feature GPE001
     E seleciona Tipos de Cálculo feature GPE001
     E preencher PesoEVolume Contratado3 feature GPE001
     E preencher Preço Unitário11 feature GPE001
     Então selecionar "Monta Processo" Configurações feature GPE001

     E acessar page "Vencimentos <F4>" feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @5619v1
   Cenário: Contrato - Page Favorecidos/Impressão- Valor pagamento maior [manual]

    #Pedidos/contratos de grão
     Quando preencher CliforPJ page contratos de grao feature GPE001
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
     E preencher Clifor1 page Favorecidos feature GPE001
     E preencher Valor pagamento feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "Favor verificar" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @5619v2
   Cenário: Contrato - Page Favorecidos/Impressão- Valor pagamento Menor [manual]

      #Pedidos/contratos de grão
     Quando preencher CliforPF page contratos de grao feature GPE001

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
     Quando preencher CliforPJ page contratos de grao feature GPE001

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
     E preencher Clifor1 page Favorecidos feature GPE001
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
     Quando preencher CliforPF page contratos de grao feature GPE001

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
     Quando preencher CliforPJ page contratos de grao feature GPE001

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
     E preencher Clifor1 page Favorecidos feature GPE001
     E preencher Data pagamento feature GPE001
     E seleciona Tipo pagamento feature GPE001
     Então clicar botão ToolBar "salvar" feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "salvo com sucesso" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @5716v1
   Cenário: Validação de Item sem movimentação cadastrada no TGR007
    #Pedidos/contratos de grão
     Quando preencher CliforPF page contratos de grao feature GPE001
     Então selecionar Operação "Exportação" feature GPE001

     #Page dados
     Quando seleciona Tipo de Contrato feature GPE001
     E preencher Produto sem lov feature GPE001
     Então preencher Produto não cadastrado feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "Verifique TGR007" feature GPE001
     Então clicar botão "ok" do modal feature GPE001


   @5717v1
   Cenário: Validação de Item sem permissão de utilização na empresa do contrato
     #Pedidos/contratos de grão

     Quando preencher Empr.Origem page contratos de grao feature GPE001
     Então preencher CliforPJ page contratos de grao feature GPE001

     #Page dados
     Quando seleciona Tipo de Contrato feature GPE001
     Então preencher Produto não cadastrado feature GPE001

     Quando apresentar o modal H5 "modal-basic-title" feature GPE001
     E apresentar a mensagem parcial "não está cadastrado" feature GPE001
     Então clicar botão "ok" do modal feature GPE001