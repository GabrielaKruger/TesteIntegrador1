 #language: pt
 @test @CTI009 @dt_CTI009 @chrome
 Funcionalidade: CTI009 - Cálculo da Variação Cambial

   # Refluxos reportados na solicitação.
   Cenário de Fundo:
     Dado inicialize a execução dos cenários do CTI009
     E acessar o programa "CTI009" pela empresa "84" feature CTI009

   @wip
   Cenário: Cálculo da Variação Cambial - Fechar/Reabrir Financeiro

     #Filtros
     Quando preencher Empresa feature CTI009
     E selecionar Ordem sendo "Data" feature CTI009
     Então realizar a Consulta feature CTI009

     # Alteração - Fechamento Financeiro
     Quando selecionar Variação Financeira na feature CTI009
     E preencher a Empresa feature CTI009
     E preencher Mês feature CTI009
     Então realizar o Fechamento ou Reabertura Financeiro fature CTI009

     Quando apresentar o modal H4 "modal-basic-title" feature CTI009
     E apresentar a mensagem parcial "Deseja realmente realizar o fechamento Financeiro do período?" feature CTI009
     E clicar botão "sim" do modal feature CTI009
#     Então apresentar a mensagem parcial "Fechamento realizado com sucesso." feature CTI009
#     E clicar botão "ok" do modal feature CTI009

     # Alteração - Reabertura Financeira
     Quando selecionar Variação Financeira na feature CTI009
     E preencher a Empresa feature CTI009
     E preencher Mês feature CTI009
     Então realizar o Fechamento ou Reabertura Financeiro fature CTI009

     Quando apresentar o modal H4 "modal-basic-title" feature CTI009
     E apresentar a mensagem parcial "Deseja realmente realizar a reabertura Financeira do período?" feature CTI009
     E clicar botão "sim" do modal feature CTI009
#     Então apresentar a mensagem parcial "Reabertura realizada com sucesso." feature CTI009
#     E clicar botão "ok" do modal feature CTI009

    @wip
   Cenário: Cálculo da Variação Cambial - Fechar/Reabrir Financeiro | Teclas Atalho

     Quando preencher Empresa feature CTI009
     E selecionar Ordem sendo "Data" feature CTI009
     Então realizar a Consulta feature CTI009

     # Alteração
     Quando selecionar Variação Financeira na feature CTI009
     E preencher a Empresa feature CTI009
     E preencher Mês feature CTI009
     Então realizar o Fechamento Financeiro por "F10" fature CTI009

     Quando apresentar o modal H4 "modal-basic-title" feature CTI009
     E apresentar a mensagem parcial "Deseja realmente realizar o fechamento Financeiro do período?" feature CTI009
     E clicar botão "sim" do modal feature CTI009
#     Então apresentar a mensagem parcial "Fechamento realizado com sucesso." feature CTI009
#     E clicar botão "ok" do modal feature CTI009


   Cenário: Cálculo da Variação Cambial - Fechar/Reabrir Contábil | Negativo

     Quando preencher Empresa feature CTI009
     E selecionar Ordem sendo "Data" feature CTI009
     Então realizar a Consulta feature CTI009

     # Alteração
     Quando selecionar Variação Contábil na feature CTI009
     E preencher a Empresa feature CTI009
     E preencher Mês feature CTI009
     Então realizar o Fechamento Financeiro por "F10" fature CTI009

     Quando apresentar o modal H5 "modal-basic-title" feature CTI009
     E apresentar a mensagem parcial "Não é possivel efetuar o Cálculo de Variação Cambial Contábil para a data 31/03/2015" feature CTI009
     E clicar botão "ok" do modal feature CTI009


   Cenário: Cálculo da Variação Cambial - Campos Obrigatórios | Negativo

     E selecionar Ordem sendo "Data" feature CTI009
     Então realizar a Consulta feature CTI009

     # Alteração
     Quando selecionar Variação Contábil na feature CTI009
     E preencher Mês feature CTI009
     Então realizar o Fechamento Financeiro por "F10" fature CTI009

     Quando apresentar o modal H5 "modal-basic-title" feature CTI009
     E apresentar a mensagem parcial "A empresa e o período devem ser informados para realizar o fechamento/reabertura." feature CTI009
     E clicar botão "ok" do modal feature CTI009

     Quando preencher a Empresa feature CTI009
     E remover Mes informado feature CTI009
     Então realizar o Fechamento Financeiro por "F10" fature CTI009

     Quando apresentar o modal H5 "modal-basic-title" feature CTI009
     E apresentar a mensagem parcial "A empresa e o período devem ser informados para realizar o fechamento/reabertura." feature CTI009
     E clicar botão "ok" do modal feature CTI009