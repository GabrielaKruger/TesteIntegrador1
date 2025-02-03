 #language: pt
 @wip @GPE044 @dt_GPE044 @chrome
 Funcionalidade: GPE044 - Liberção de Pré - Contrato

   Cenário de Fundo:
     Dado inicialize a execução dos cenários do GPE044
     E acessar o programa "GPE044" feature GPE044

      # Não há lançamentos em nossa base - E processo utiliza telas que não foram migradas.
      # Alinhar com a equipe sobre o caso - Refluxo.
   Cenário: Liberação e Rercusa de Pré - Contrato| Caminho feliz

      #Filtros
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

   Cenário: Liberação e Rercusa de Pré - Contrato| Teclas Atalho

      #Filtros - Alterar para Buscar pelas LOVs
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

   Cenário: Liberação e Rercusa de Pré - Contrato| Consultar GPE000
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
     Então sair da tela GPE000 feature GPE044