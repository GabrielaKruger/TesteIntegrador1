 #language: pt
 @test @TGR009 @dt_TGR009 @chrome
 Funcionalidade: TGR009 - Produtos de Balança

   # Exclusão é realizada via banco. - Refluxo Forms - Exclusão está salvando.
   Cenário de Fundo:
     Dado inicialize a execução dos cenários do TGR009
     E acessar o programa "TGR009" pela empresa "84" feature TGR009

   Cenário: Cadastro e Exclusão de Produtos de Balança | Caminho feliz

     Quando clicar botão ToolBar "novo" feature TGR009
     E preencher Produto da balanca feature TGR009
     E preencher Produto feature TGR009
     E seleciona "Sim" para Somente Grãos feature TGR009
     Então preencher Cultura feature TGR009

     Quando clicar botão ToolBar "salvar" feature TGR009
     E apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR009
     Então excluir os registro cadastrados via Banco de Dados feature TGR009


   Cenário: Cadastro e Exclusão de Produtos de Balança | Teclas Atalho

     Quando pressionar tecla "f6" feature TGR009
     E preencher Produto da balanca feature TGR009
     E preencher Produto feature TGR009
     E seleciona "Não" para Somente Grãos feature TGR009
     Então preencher Cultura feature TGR009

     Quando pressionar tecla "f10" feature TGR009
     E apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR009
     Então excluir os registro cadastrados via Banco de Dados feature TGR009


   Cenário: Produtos Similares - Produto da Balança| Campo obrigatório

     Quando clicar botão ToolBar "ultimo registro" feature TGR009
     E clicar botão ToolBar "novo" feature TGR009
     Então preencher Produto feature TGR009

     Quando clicar botão ToolBar "salvar" feature TGR009
     E apresentar o modal H5 "modal-basic-title" feature TGR009
     E apresentar a mensagem "O código do produto de balança deve ser informado." feature TGR009
     Então clicar botão "ok" do modal feature TGR009


   Cenário: Produtos Similares - Produto| Campo obrigatório

     Quando clicar botão ToolBar "ultimo registro" feature TGR009
     E clicar botão ToolBar "novo" feature TGR009
     Então preencher Produto da balanca feature TGR009

     Quando clicar botão ToolBar "salvar" feature TGR009
     E apresentar o modal H5 "modal-basic-title" feature TGR009
     E apresentar a mensagem "O Código do Produtor deve ser informado." feature TGR009
     Então clicar botão "ok" do modal feature TGR009


   Cenário: Produtos Similares - Tipo de Cálculo| Campo obrigatório | Caminho feliz

     Quando clicar botão ToolBar "novo" feature TGR009
     E preencher Produto da balanca feature TGR009
     E preencher Produto feature TGR009
     E seleciona "Sim" para Somente Grãos feature TGR009
     Então preencher Cultura feature TGR009

     Quando clicar botão ToolBar "salvar" feature TGR009
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR009

     Quando selecionar o Produto Similar feature TGR009
     E clicar botão Tipo de Cálculo feature TGR009
     E clicar botão ToolBar "novo" feature TGR009
     Então preencher Tp Cálculo feature TGR009

     Quando clicar botão Salvar Tipo Cálculo feature TGR009
     E apresentar o modal H5 "modal-basic-title" feature TGR009
     E apresentar a mensagem "Registro salvo com sucesso." feature TGR009
     Então clicar botão "ok" do modal feature TGR009

     Quando clicar botão ToolBar "excluir" feature TGR009
     E apresenta o modal H4 "modal-basic-title" feature TGR009
     E clicar botão "sim" do modal feature TGR009
     E clicar botão Fechar feature TGR009
     Então excluir os registro cadastrados via Banco de Dados feature TGR009