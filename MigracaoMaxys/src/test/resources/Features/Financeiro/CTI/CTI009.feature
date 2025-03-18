 #language: pt
 @test @CTI009 @dt_CTI009 @chrome
 Funcionalidade: CTI009 - Cálculo da Variação Cambial

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do CTI009
     E acessar o programa "CTI009" pela empresa "84" feature CTI009

   Cenário: Cálculo da Variação Cambial - Fechar/Reabrir Financeiro

     #Filtros
     Quando preencher Empresa feature CTI009
     E selecionar Ordem feature CTI009
     Então realizar a Consulta feature CTI009

     # Alteração
     Quando selecionar Variação Financeira na feature CTI009
     E preencher a Empresa feature CTI009
     Então preencher Mês feature CTI009

     Quando apresentar o modal H5 "modal-basic-title" feature CTI009
     E apresentar a mensagem parcial "Deseja realmente realizar o fechamento Financeiro do período?" feature CTI009
     E clicar botão "sim" do modal feature CTI009
     Então apresentar a mensagem parcial "Fechamento realizado com sucesso." feature CTI009
#     E clicar botão "ok" do modal feature CTI009


   Cenário: Cálculo da Variação Cambial - Fechar/Reabrir Financeiro | Teclas Atalho

   Cenário: Cálculo da Variação Cambial - Fechar/Reabrir Contábil

   Cenário: Cálculo da Variação Cambial - Fechar/Reabrir Contábil | Teclas Atalho

   Cenário: Cálculo da Variação Cambial - Campos Obrigatórios | Negativo
#
#     # Filtros
#     Quando preencher Clifor feature CTI009
#     E preencher Endereço feature CTI009
#     E preencher Empresa feature CTI009
#     E preencher Item feature CTI009
#     E preencher Pré-Contrato feature CTI009
#     E preencher Data de Emissão feature CTI009
#     E preencher Até feature CTI009
#     Então realizar a Consulta feature CTI009
#
#     Quando selecionar no grid Pré-Contrato feature CTI009
#     E preencher Motivo feature CTI009
#     Então realizar Liberação feature CTI009
#
#     Quando apresentar o modal H5 "modal-basic-title" feature CTI009
#     E apresentar a mensagem parcial "liberado com sucesso." feature CTI009
#     Então clicar botão "ok" do modal feature CTI009
#
#     Quando selecionar no grid Pré-Contrato feature CTI009
#     E preencher Motivo feature CTI009
#     Então realizar Recusa feature CTI009
#
#     Quando apresentar o modal H5 "modal-basic-title" feature CTI009
#     E apresentar a mensagem parcial "recusada com sucesso." feature CTI009
#     Então clicar botão "ok" do modal feature CTI009
#
#   Cenário: Liberação e Recusa de Pré - Contrato| Teclas Atalho
#
#     # Filtros
#     Quando preencher Clifor feature CTI009
#     E preencher Endereço feature CTI009
#     E preencher Empresa feature CTI009
#     E preencher Item feature CTI009
#     E preencher Pré-Contrato feature CTI009
#     E preencher Data de Emissão feature CTI009
#     E preencher Até feature CTI009
#     Então realiza Consulta por "f3" feature CTI009
#
#     Quando selecionar no grid Pré-Contrato feature CTI009
#     E preencher Motivo feature CTI009
#     Então realizar Liberação feature CTI009
#
#     Quando apresentar o modal H5 "modal-basic-title" feature CTI009
#     E apresentar a mensagem parcial "liberado com sucesso." feature CTI009
#     Então clicar botão "ok" do modal feature CTI009
#
#     Quando selecionar no grid Pré-Contrato feature CTI009
#     E preencher Motivo feature CTI009
#     Então realizar Recusa feature CTI009
#
#     Quando apresentar o modal H5 "modal-basic-title" feature CTI009
#     E apresentar a mensagem parcial "recusada com sucesso." feature CTI009
#     Então clicar botão "ok" do modal feature CTI009
#
#   Cenário: Liberação e Recusa de Pré - Contrato| Consultar GPE000
#     Quando preencher Clifor feature CTI009
#     E preencher Endereço feature CTI009
#     E preencher Empresa feature CTI009
#     E preencher Item feature CTI009
#     E preencher Pré-Contrato feature CTI009
#     E preencher Data de Emissão feature CTI009
#     E preencher Até feature CTI009
#     Então realizar a Consulta feature CTI009
#
#     Quando selecionar no grid Pré-Contrato feature CTI009
#     Então preencher Motivo feature CTI009
#
#     Quando consulta GPE000 feature CTI009
##     Então sair da tela GPE000 feature
#     Então apresentar a mensagem no pop-up "Não é possivel acessar a tela GPE000" feature CTI009
#
#   Cenário: Liberação de Pré-Contrato| Negativo - Consulta sem Dados
#     Quando preencher Clifor feature CTI009
#     E preencher Endereço feature CTI009
#     E preencher Empresa feature CTI009
#     E preencher Item feature CTI009
#     E preencher Pré-Contrato feature CTI009
#     E preencher Data de Emissão Atual feature CTI009
#     Então realizar a Consulta feature CTI009
#
#     Quando apresentar o modal H5 "modal-basic-title" feature CTI009
#     E apresentar a mensagem parcial "O relatório não retornou dados." feature CTI009
#     Então clicar botão "ok" do modal feature CTI009