 #language: pt
 @test @GPE044 @dt_GPE044 @chrome
 Funcionalidade: GPE044 - Liberção de Pré - Contrato

   # Futuramente validar integração com GPE00
   Cenário de Fundo:
     Dado inicialize a execução dos cenários do GPE044
     E acessar o programa "GPE044" pela empresa "84" feature GPE044

   Cenário: Liberação e Recusa de Pré - Contrato| Caminho feliz

     # Filtros
     Quando preencher Clifor feature GPE044
     E preencher Endereço feature GPE044
     E preencher Empresa feature GPE044
     E preencher Item feature GPE044
     E preencher Pré-Contrato feature GPE044
     E preencher Data de Emissão feature GPE044
     E preencher Até feature GPE044
     Então realizar a Consulta feature GPE044

     Quando selecionar no grid Pré-Contrato feature GPE044
     E preencher Motivo feature GPE044
     Então realizar Liberação feature GPE044

     Quando apresentar o modal H5 "modal-basic-title" feature GPE044
     E apresentar a mensagem parcial "liberado com sucesso." feature GPE044
     Então clicar botão "ok" do modal feature GPE044

     Quando selecionar no grid Pré-Contrato feature GPE044
     E preencher Motivo feature GPE044
     Então realizar Recusa feature GPE044

     Quando apresentar o modal H5 "modal-basic-title" feature GPE044
     E apresentar a mensagem parcial "recusada com sucesso." feature GPE044
     Então clicar botão "ok" do modal feature GPE044

   Cenário: Liberação e Recusa de Pré - Contrato| Teclas Atalho

     # Filtros
     Quando preencher Clifor feature GPE044
     E preencher Endereço feature GPE044
     E preencher Empresa feature GPE044
     E preencher Item feature GPE044
     E preencher Pré-Contrato feature GPE044
     E preencher Data de Emissão feature GPE044
     E preencher Até feature GPE044
     Então realiza Consulta por "f3" feature GPE044

     Quando selecionar no grid Pré-Contrato feature GPE044
     E preencher Motivo feature GPE044
     Então realizar Liberação feature GPE044

     Quando apresentar o modal H5 "modal-basic-title" feature GPE044
     E apresentar a mensagem parcial "liberado com sucesso." feature GPE044
     Então clicar botão "ok" do modal feature GPE044

     Quando selecionar no grid Pré-Contrato feature GPE044
     E preencher Motivo feature GPE044
     Então realizar Recusa feature GPE044

     Quando apresentar o modal H5 "modal-basic-title" feature GPE044
     E apresentar a mensagem parcial "recusada com sucesso." feature GPE044
     Então clicar botão "ok" do modal feature GPE044

   Cenário: Liberação e Recusa de Pré - Contrato| Consultar GPE000
     Quando preencher Clifor feature GPE044
     E preencher Endereço feature GPE044
     E preencher Empresa feature GPE044
     E preencher Item feature GPE044
     E preencher Pré-Contrato feature GPE044
     E preencher Data de Emissão feature GPE044
     E preencher Até feature GPE044
     Então realizar a Consulta feature GPE044

     Quando selecionar no grid Pré-Contrato feature GPE044
     Então preencher Motivo feature GPE044

     Quando consulta GPE000 feature GPE044
     Então apresentar a mensagem no pop-up "Não é possivel acessar a tela GPE000" feature GPE044

   Cenário: Liberação de Pré-Contrato| Negativo - Consulta sem Dados
     Quando preencher Clifor feature GPE044
     E preencher Endereço feature GPE044
     E preencher Empresa feature GPE044
     E preencher Item feature GPE044
     E preencher Pré-Contrato feature GPE044
     E preencher Data de Emissão Atual feature GPE044
     Então realizar a Consulta feature GPE044

     Quando apresentar o modal H5 "modal-basic-title" feature GPE044
     E apresentar a mensagem parcial "O relatório não retornou dados." feature GPE044
     Então clicar botão "ok" do modal feature GPE044